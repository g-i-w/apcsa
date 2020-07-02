public class PixelMap {

  private String[][] pixels;

  public PixelMap ( int x, int y ) {
    // Row-major order
    pixels = new String[y][x];
  }

  public PixelMap blank ( String pixel ) {
    for (int y=0; y<pixels.length; y++) {
      for (int x=0; x<pixels[0].length; x++) {
        pixels[y][x] = pixel;
      }
    }
  }

  public PixelMap drawLine ( Line line, String pixel ) {
    double x0 = line.firstPoint().getX();
    double y0 = line.firstPoint().getY();
    double x1 = line.secondPoint().getX();
    double y1 = line.secondPoint().getY();
    double deltaX = x1-x0;
    double deltaY = y1-y0;
    int xSign = (int) Math.signum(deltaX);
    int ySign = (int) Math.signum(deltaY);
    // plot the line
    if (Math.abs(deltaX) > Math.abs(deltaY)) {
      for ( int x=(int)Math.round(x0); x!=(int)Math.round(x1); x+=xSign ) {
        int y = (int)Math.round( deltaY/deltaX * (x-x0) + y0 );
        if (x<pixels[0].length && y<pixels.length) pixels[y][x] = pixel;
      }
    } else {
      for ( int y=(int)Math.round(y0); y!=(int)Math.round(y1); y+=ySign ) {
        int x = (int)Math.round( deltaX/deltaY * (y-y0) + x0 );
        if (x<pixels[0].length && y<pixels.length) pixels[y][x] = pixel;
      }
    }
  }

  public String[][] getPixels () {
    return pixels;
  }

}
