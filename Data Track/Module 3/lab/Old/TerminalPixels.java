public class TerminalPixels {

  ScreenTransformation screen;
  private int[][] pixels;
  private int xResolution;
  private int yResolution;

  public TermTransformation ( ScreenTransformation s, int x, int y ) {
    xResolution = x;
    yResolution = y;
    screen = s;
    pixels = new int[xResolution][yResolution];

  }



}
