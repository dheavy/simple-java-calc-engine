package com.davybraun.learningjava.calcengine;

public abstract class CalculateBase {
  public double leftVal;
  public double rightVal;
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

  public void setResult(double result) {
    this.result = result;
  }

  public double getResult() {
    return result;
  }

  public abstract void calculate();

  public CalculateBase() {}

  public CalculateBase(double leftVal, double rightVal) {
    this.setLeftVal(leftVal);
    this.setRightVal(rightVal);
  }
}
