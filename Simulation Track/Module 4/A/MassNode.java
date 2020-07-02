class MassNode extends FreeBody {

  private Vector forceVector = new Vector();

  public MassNode ( double mass, Vector initLocation ) {
    // initialize a FreeBody with no initial velocity and 0 gravity
    super( mass, initLocation, new Vector(), new Vector() );
  }

  public void addForceVector ( Vector anotherVector ) {
    forceVector = forceVector.vectorAddition( anotherVector );
  }

  @Override
  public void nextInterval ( double t ) {
    super.nextInterval( t, forceVector );
  }

}
