public class ConvertCSVtoHTML {

  // simple method of enumeration
  private static final int FILE_START = 0;
  private static final int NEW_LINE = 1;
  private static final int DATA_START = 2;
  private static final int DATA = 3;
  private static final int DATA_END = 4;
  private static final int BLANK_DATA = 5;
  private static final int FILE_END = 6;

  // ASCII character definitions
  private static final int comma = 44;
  private static final int newLine = 10;

  // FSM input logic
  public static byte input () {
    try {
      if (System.in.available()) return System.in.read();
      else return -1;
    } catch (Exception e) {
      return -1;
    }

  }

  // FSM transition logic
  public static int state (int currentState, byte input) {
    if (currentState == FILE_START)
    {
      return NEW_LINE;
    }
    else if (currentState == NEW_LINE)
    {
      if (input == newLine) return NEW_LINE;
      if (input == comma) return BLANK_DATA;
      return DATA_START; // default
    }
    else if (currentState == DATA_START)
    {
      if (input == newLine) return NEW_LINE;
      if (input == comma) return DATA_END;
      return DATA; // default
    }
    else if (currentState == DATA)
    {
      if (input == newLine) return NEW_LINE;
      if (input == comma) return DATA_END;
      return DATA; // default
    }
    else if (currentState == BLANK_DATA)
    {
      if (input == newLine) return NEW_LINE;
      if (input == comma) return BLANK_DATA;
      return DATA; // default
    }
    else if (currentState == DATA_END) {
      if (input == newLine) return NEW_LINE;
      if (input == comma) return BLANK_DATA;
      return DATA; // default
    }
    else if (currentState == FILE_END)
    {

    }
    else
    {
      return NEW_LINE;
    }
  }

  // FSM output logic
  public static String output (int state) {
    if
    if (state == BLANK_DATA) return "\n\t<td></td>";
    if (state == DATA_START) return "\n\t<td>"+((char)input);
    if (state == DATA) return ((char)input);
    if (state == DATA_END) return "</td>";
    if (state == NEW_LINE) return "\n</tr>\n<tr>";
  }

  // Read in bytes from the standard input and convert to HTML
  public static void main (String[] args) {
    // String to hold the HTML
    String html = "";
    // FSM state
    int currentState = NEW_LINE;

    // FSM loop
    while (currentState != FILE_END) {
      // next-state logic
      state = state( currentState, input() );
      // output logic
      System.out.print( output( currentState ) );
    }

    // output the HTML
    System.out.println(
      "<html><head>" +
      "<style>td{border:solid blue 1px;}</style>" +
      "</head><body><table><tr>" +
      html +
      "</tr></table></body></html>"
    );

  }

}
