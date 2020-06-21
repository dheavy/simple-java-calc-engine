package com.davybraun.learningjava.calcengine;

/** Hello world! */
public class App {
  public static void main(String... args) {
    // double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
    // double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
    // char[] opCodes = {'d', 'a', 's', 'm'};
    // double[] results = new double[opCodes.length];
    MathEquation[] equations = new MathEquation[4];
    equations[0] = create(100.0d, 50.0d, 'd');
    equations[1] = create(25.0d, 92.0d, 'a');
    equations[2] = create(255.0d, 17.0d, 's');
    equations[3] = create(11.0d, 3.0d, 'm');

    for (MathEquation eq : equations) {
      eq.execute();
      System.out.print("result = ");
      System.out.println(eq.getResult());
    }

    System.out.println();
    System.out.print("Using Inheritance:");
    System.out.println();

    CalculateBase[] calculators = {
      new Divider(100.0d, 50.0d),
      new Adder(25.0d, 92.0d),
      new Substracter(255.0d, 17.0d),
      new Multiplier(11.0d, 3.0d)
    };

    for (CalculateBase calc : calculators) {
      calc.calculate();
      System.out.print("result=");
      System.out.println(calc.getResult());
    }
  }

  public static MathEquation create(double leftVal, double rightVal, char opCode) {
    MathEquation equation = new MathEquation();
    equation.setLeftVal(leftVal);
    equation.setRightVal(rightVal);
    equation.setOpCode(opCode);
    return equation;
  }
}
