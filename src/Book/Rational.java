import acm.util.*;
import java.math.BigInteger;

/**
* The Rational class is used to represent rational numbers, which
* are defined to be the quotient of two integers.
*/
public class Rational {

    /**
     * Creates a new Rational initialized to zero.
     */
    public Rational() {
        this(BigInteger.ZERO);
    }

    /**
     * Creates a new Rational from the integer argument.
     * @param n The initial value
     */
    public Rational(BigInteger n) {
        this(n, BigInteger.ONE);
    }

    /**
     * Creates a new Rational with the value x / y.
     * @param x The numerator of the rational number
     * @param y The denominator of the rational number
     */
    public Rational(BigInteger x, BigInteger y) {
        if (y == BigInteger.ZERO) throw new ErrorException("Division by 0");
        BigInteger g = gcd(x.abs(), y.abs());
        num = x.divide(g);
        den = y.abs().divide(g);
        if (y.compareTo(BigInteger.ZERO) < 0) num = num.negate();
    }

    /**
     * Adds the rational number r to this one and returns the sum.
     * @param r The rational number to be added
     * @return The sum of the current number and r
     */
    public Rational add(Rational r) {
        return new Rational(this.num.multiply(r.den).add(r.num.multiply(this.den)),
                this.den.multiply(r.den));
    }

    /**
     * Subtracts the rational number r from this one.
     * @param r The rational number to be subtracted
     * @return The result of subtracting r from the current number
     */
    public Rational subtract(Rational r) {
        return new Rational(this.num.multiply(r.den).subtract(r.num.multiply(this.den)), this.den.multiply(r.den));
    }

    /**
     * Multiplies this number by the rational number r.
     * @param r The rational number used as a multiplier
     * @return The result of multiplying the current number by r
     */
    public Rational multiply(Rational r) {
        return new Rational(this.num.multiply(r.num), this.den.multiply(r.den));
    }

    /**
     * Divides this number by the rational number r.
     * @param r The rational number used as a divisor
     * @return The result of dividing the current number by r
     */
    public Rational divide(Rational r) {
        return new Rational(this.num.multiply(r.den), this.den.multiply(r.num));
    }

    /**
     * Creates a string representation of this rational number.
     * @return The string representation of this rational number
     */
    public String toString() {
        if (den.equals(BigInteger.ONE)) {
            return "" + num;
        } else {
            return num + "/" + den;
        }
    }

    /**
     * Calculates the greatest common divisor using Euclid's algorithm.
     * @param x First integer
     * @param y Second integer
     * @return The greatest common divisor of x and y
     */
    private BigInteger gcd(BigInteger x, BigInteger y) {
        BigInteger r = x.mod(y);
        while (!r.equals(BigInteger.ZERO)) {
            x = y;
            y = r;
            r = x.mod(y);
        }
        return y;
    }

    /* Private instance variables */
    private BigInteger num;   /* The numerator of this Rational   */
    private BigInteger den;   /* The denominator of this Rational */
}