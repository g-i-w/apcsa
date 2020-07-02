import java.awt.geom.*;
import javax.swing.*;
import java.awt.*;

class GraphViewGUI extends JPanel implements GraphView {

  private GraphModel model;
  private ScreenTransformation screen;
  private JFrame window;
  private double scaleFactor;
  private int xResolution;
  private int yResolution;

  GraphViewGUI ( GraphModel m ) {
    // reference to the model
    model = m;
    // setBackground() is inherited from JPanel
    this.setBackground(Color.black);
    // create a JFrame object (window in the OS)
    window = new JFrame( "GraphViewGUI" );
    // set default resolution
    setResolution ( 400, 400 );
    // set initial window settings
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.getContentPane().add( this ); // add a reference to "this" in the window's content
    window.setLocation( 100, 100 ); // start position on screen
    window.setVisible( true ); // show the window
  }

  public void setResolution ( int x, int y ) {
    xResolution = x;
    yResolution = y;
    // set window size in pixels
    window.setSize( xResolution , yResolution + 22 ); // add 22 pixels to account for the top bar
    refresh();
  }

  public void refresh () {
    // repaint() is inherited from JPanel
    this.repaint();
  }

  // we are overriding this method in JPanel
  // this method gets called by the operating system whenever the window is resized
  protected void paintComponent(Graphics g){
    // the Graphics object is passed to this object by the operating system

    // these are special JPanel and Graphics2D operations:
      // call the paintComponent() method in the parent class (JPanel)
      super.paintComponent(g);
      // treat the Graphics object like a Graphics2D object
      Graphics2D g2 = (Graphics2D) g;
      // turn on antialiasing to make the lines look better
      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);


    // create a new ScreenTransformation object from the GraphModel object
    screen = new ScreenTransformation( model, xResolution, yResolution );

    // draw axes
    g2.setColor(Color.blue);
    g2.draw( convertLine(screen.getAxisX()) );
    g2.draw( convertLine(screen.getAxisY()) );

    // draw lines
    g2.setColor(Color.yellow);
    for ( Line l : screen.getLines() ) {
      g2.draw( convertLine(l) );
    }

  }

  // create a Line2D.Double from a Line
  Line2D.Double convertLine ( Line l ) {
    Line2D.Double specialLine = new Line2D.Double(
      new Point2D.Double( l.firstPoint().getX(), l.firstPoint().getY() ),
      new Point2D.Double( l.secondPoint().getX(), l.secondPoint().getY() )
    );
    return specialLine;
  }

}
