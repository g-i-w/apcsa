package shapes;

public class Color {

  private int red;
  private int green;
  private int blue;

  private final String[] colorNames = {
    "red",
    "green",
    "blue",
    "yellow",
    "white"
  };

  private final int[][] colorValues = {
    {255, 0, 0},
    {0, 255, 0},
    {0, 0, 255},
    {255, 255, 0},
    {255, 255, 255}
  };

  public Color ( String colorName ) {
    for (int i=0; i<colorNames.length; i++) {
      if (colorNames[i].equals(colorName)) {
        red = colorValues[i][0];
        green = colorValues[i][1];
        blue = colorValues[i][2];
        break;
      }
    }
  }

  public Color ( int r, int g, int b ) {
    red = r;
    green = g;
    blue = b;
  }

  public int getRed () {
    return red;
  }

  public int getGreen () {
    return green;
  }

  public int getBlue () {
    return blue;
  }

}
