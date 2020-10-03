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
        return this.numerator * fraction.getDenominator() == this.denominator * fraction.getNumerator();
    }

    public Fraction add(Fraction fraction) {
        int mcm = mcm(this.denominator, fraction.getDenominator());
        int endNumerator = mcm / this.denominator * this.numerator +
                mcm / fraction.getDenominator() * fraction.getNumerator();
        return new Fraction(endNumerator, mcm);
    }

    private int mcm(int a, int b){
        return ((a*b) / mcd(a,b));
    }

    private int mcd(int a, int b){
        int min = Math.min(Math.abs(a), Math.abs(b));
        int max = Math.max(Math.abs(a), Math.abs(b));
        int rest;

        while( min != 0 ){
            rest = max % min;
            max = min;
            min = rest;
        }
        return max;
    }

    public Fraction multiply(Fraction fraction){
        return new Fraction(this.numerator*fraction.getNumerator(), this.denominator * fraction.getDenominator());
    }

    public Fraction divide(Fraction fraction){
        return this.multiply(fraction.inverse());
    }

    public Fraction inverse(){
        return new Fraction(this.denominator, this.numerator);
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
