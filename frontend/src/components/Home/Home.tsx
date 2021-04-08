import React, { useEffect } from "react";
import { Box, Container, Typography } from "@material-ui/core";

const Home: React.FC = () => {
  useEffect(() => {
    const fetchData = async () => {
      const response = await fetch("http://localhost:8080");
      const data = await response.json();
      console.log(data);
    };
    fetchData();
  });
  return (
    <Container maxWidth="lg">
      <Box my={4}>
        <Typography variant="h3">Alamakota</Typography>
      </Box>
    </Container>
  );
};

export default Home;
