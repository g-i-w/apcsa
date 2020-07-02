class SpringMassSystem {

  private ArrayList<Spring> springs = new ArrayList<>();
  private ArrayList<MassNode> masses = new ArrayList<>();
  private double defaultL;
  private double defaultK;

  public SpringMassSystem ( double l, double k ) {
    defaultL = l;
    defaultK = k;
  }

  public Spring connectMass ( MassNode newMass, int existingMass ) {
    if (existingMass >= masses.size()) return null;
    Spring newSpring = Spring( defaultL, defaultK, newMass, masses.get(existingMass) );
    masses.add( newMass );
  }

  public void

}
