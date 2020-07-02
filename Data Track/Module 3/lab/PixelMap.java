import java.util.*;
import shapes.*;

public interface PixelMap {

  public void setLines ( List<Line> l );

  public void setSize ( int x, int y );

  public void repaint ();

}
