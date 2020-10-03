package es.upm.miw.iwvg_devops.practice;

public class Fraction {

    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public boolean isProper() {
        return this.numerator < this.denominator;
    }

    public boolean isImproper() {
        return this.numerator > this.denominator;
    }

    public boolean isEquivalent(Fraction fraction) {
        int extrems = this.numerator * fraction.getDenominator();
        int mediums = this.denominator * fraction.getNumerator();
        return extrems == mediums;
    }

    public Fraction add(Fraction fraction) {
        int endNumerator = (this.numerator * fraction.getDenominator()) + (fraction.getNumerator() * this.denominator);
        int endDenominator = 0;
        return new Fraction(endNumerator, endDenominator);
    }


    add,multiply &divide .


    @Override

    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
