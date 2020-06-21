package com.davybraun.learningjava.calcengine;

public class MathEquation {
  public double leftVal;
  public double rightVal;
  public char opCode;
  public double result;

  public double getLeftVal() {
    return leftVal;
  }

  public void setLeftVal(double leftVal) {
    this.leftVal = leftVal;
  }

  public double getRightVal() {
    return rightVal;
  }

  public void setRightVal(double rightVal) {
    this.rightVal = rightVal;
  }

  public char getOpCode() {
    return opCode;
  }

  public void setOpCode(char opCode) {
    this.opCode = opCode;
  }

  public double getResult() {
    return result;
  }

  public MathEquation() {}

  public MathEquation(char opCode) {
    this.opCode = opCode;
  }

  public MathEquation(char opCode, double leftVal, double rightVal) {
    this(opCode);
    this.setLeftVal(leftVal);
    this.setRightVal(rightVal);
  }

  public void execute() {
    switch (opCode) {
      case 'a':
        result = leftVal + rightVal;
        break;
      case 's':
        result = leftVal - rightVal;
        break;
      case 'd':
        result = rightVal != 0.0d ? leftVal / rightVal : 0.0;
        break;
      case 'm':
        result = leftVal * rightVal;
        break;
      default:
        System.out.println("Error - invalid opCode");
        result = 0.0d;
    }
  }

  public void execute(double leftVal, double rightVal) {
    this.setLeftVal(leftVal);
    this.setRightVal(rightVal);
    execute();
  }

  public void execute(int leftVal, int rightVal) {
    execute(leftVal, rightVal);
    result = (int) result;
  }
}
