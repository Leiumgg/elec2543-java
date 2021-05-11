import java.text.spi.NumberFormatProvider;
import java.util.Scanner;
public class Fraction2 {
  public double output;
  public int divisor;
  private int numerator;
  private int denominator;

  //constructor
  Fraction2(int num, int den) {
    numerator = num;
    denominator = den;
    if (numerator == 0) {
      denominator = 1;
    }
    else {
      if (denominator == 0) {
        numerator = 1;
        denominator = 2;
      }
    } 
    if (denominator < 0) {
      if (numerator > 0) {
        denominator = denominator * -1;
        numerator = numerator * -1;
      }
    }
    divisor = gcd(numerator, denominator);
    numerator = numerator / divisor;
    denominator = denominator / divisor;
  }

  private static int gcd(int a, int b) {

    if(a == 0 || b == 0) return a+b; // base case

    return gcd(b,a%b);
  }

  //value()
  public double value() {
    output = (double) numerator/ (double) denominator;
    return output;
  }

  //toString()
  public String toString() {
    return numerator+"/"+denominator;
  }

  //square()
  public void square() {
    numerator = numerator * numerator;
    denominator = denominator * denominator;
  }

  //copy()
  public Fraction2 copy() {
    return new Fraction2(this.numerator, this.denominator);
  }

  //inverse()
  public Fraction2 inverse() {
    return new Fraction2(this.denominator, this.numerator);
  }
}
