package lab3.weblab3glassfish.logic;

import java.util.Arrays;

public class CalcFunction {
    private static double a = 20.3;

    public CalcFunction(double start, double end, double step) {
        fillArrays(start, end, step);
    }

    //2
    public  double f(double x) {
        if (x > 1.2 + 1e-7) return Math.log10(x + 1);
        else {
            double sin = Math.sin(Math.sqrt(a * x));
            return sin * sin;
        }
    }

    //3
    public  double countStep(double start, double end, double step) {
        if (start==end) return 0;
        return Math.round((end - start) / step + 1);
    }

    //4
    private double[] xValues;
    private double[] yValues;
    public void fillArrays(double start, double end, double step) {
        int n = (int) countStep(start, end, step);
        xValues = new double[n];
        yValues = new double[n];
        int maxLength = Math.max(String.valueOf(start).length(), Math.max(String.valueOf(end).length(), String.valueOf(step).length()));
        int scale = (int) Math.pow(10, maxLength - 1);

        for (int i = 0; i < n; i++) {
            int b = (int) ((start + i * step) * scale);
            xValues[i] = (double) b / scale;
            yValues[i] = Double.parseDouble(String.format("%.9f", f(xValues[i])));
        }
    }

    public double getX(int i) { return xValues[i]; }
    public double getY(int i) { return yValues[i]; }

    //5
    public int getMaxI() {
        int maxI = 0;
        for (int i = 1; i < yValues.length; i++) {
//            System.out.println("max |\t"+ i + " | \t" + xValues[i] + "\t\t" + yValues[i]);
            if (yValues[i] > yValues[maxI]) maxI = i;
        }
        return maxI;
    }
    public int getMinI() {
        int minI = 0;
        for (int i = 1; i < yValues.length; i++) {
//            System.out.println("min |\t"+ i + " | \t" + xValues[i] + " \t\t" + yValues[i]);
            if (yValues[i] < yValues[minI]) minI = i;
        }
        return minI;
    }

    public double getSum() {
        double sum = Arrays.stream(yValues).sum();
        return Double.parseDouble(String.format("%.9f", sum));
    }
    public double getAverage() {
        return Double.parseDouble(String.format("%.9f", getSum()/yValues.length));
    }

    public void print_for_test() {
        System.out.println("i\tx \t\ty");
        for (int i = 0; i < xValues.length; i++) {
            System.out.println(i + "\t" + xValues[i] + " \t" + yValues[i]);}
        System.out.println();
    }
}