package pl.teamxd.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.teamxd.model.TestEntity;
import pl.teamxd.repository.TestRepository;

import javax.annotation.PostConstruct;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/")
public class HelloController {
    private final TestRepository testRepository;

    @GetMapping
    public ResponseEntity<?> getHello(){
        return ResponseEntity.ok(testRepository.findAll());
    }

    @PostConstruct
    public void generate(){
        for (int i = 0; i < 10; i++){
            var test = new TestEntity();
            test.setName("Ala " + i );
            testRepository.save(test);
        }
    }
}
