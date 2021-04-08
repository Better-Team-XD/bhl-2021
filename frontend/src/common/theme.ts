import { createMuiTheme, responsiveFontSizes } from "@material-ui/core/styles";

const theme = createMuiTheme({
  palette: {
    primary: {
      main: "#6b3ffc",
      contrastText: "#fff",
    },
  },
});

const responsiveTheme = responsiveFontSizes(theme);

export default responsiveTheme;
