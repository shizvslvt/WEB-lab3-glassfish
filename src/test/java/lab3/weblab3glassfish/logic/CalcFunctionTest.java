package lab3.weblab3glassfish.logic;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcFunctionTest {
    double start = 0.5;
    double end = 2;
    double step = 0.005;
    private static final double a = 20.3;
    public static double eps = 1e-6;
    CalcFunction cf = new CalcFunction(start,end,step);


    //2.1
    @Test
    public void testF1() {
        double x = 0.5;
        double y = Math.sin(Math.sqrt(a * x));
        double fx = CalcFunction.f(x);
        Assertions.assertEquals(y*y, fx, eps);
        Assertions.assertEquals(0.00196243, fx, eps);
    }
    @Test
    public void testF2() {
        double x = 1.2;
        double y = Math.sin(Math.sqrt(a * x));
        double fx = CalcFunction.f(x);
        Assertions.assertEquals(y*y, fx, eps);
        Assertions.assertEquals(0.951005, fx, eps);
    }
    @Test
    public void testF3() {
        double x = 2.0;
        double y = Math.log10(x + 1);
        double fx = CalcFunction.f(x);
        Assertions.assertEquals(y, fx, eps);
        Assertions.assertEquals(0.477121255, fx, eps);
    }

    //3.1
    @Test
    void testCountStep1() {
        double start = 1;
        double end = 2;
        double step = 0.25;
        Assertions.assertEquals(5, CalcFunction.countStep(start, end, step));
    }
    @Test
    void testCountStep2() {
        Assertions.assertEquals(301, CalcFunction.countStep(start, end, step));
    }


    //4.1
    @Test
    void testFillArraysX() {
        cf.fillArrays(start, end, step);
        Assertions.assertEquals(0.5, cf.getX(0),eps);
        Assertions.assertEquals(1.2, cf.getX(140),eps);
        Assertions.assertEquals(2.0, cf.getX(300),eps);
    }
    @Test
    void testFillArraysY() {
        cf.fillArrays(start, end, step);
        Assertions.assertEquals(0.00196243, cf.getY(0),eps);
        Assertions.assertEquals(0.9510052574, cf.getY(140),eps);
        Assertions.assertEquals(0.477121255, cf.getY(300),eps);
    }

    //5.1
    @Test
    void testGetMaxIbyValue() {
        cf.fillArrays(start, end, step);
        Assertions.assertEquals(119, cf.getMaxI(),eps);
    }
    @Test
    void testGetMinIbyValue() {
        cf.fillArrays(start, end, step);
        Assertions.assertEquals(0, cf.getMinI(),eps);
    }

    //7.1
    @Test
    void testGetSum() {
        cf.fillArrays(1, 5, 1);
        Assertions.assertEquals(3.514127633, cf.getSum(),eps);
    }
    @Test
    void testGetAverage() {
        cf.fillArrays(1, 5, 1);
        Assertions.assertEquals(0.7028255266, cf.getAverage(),eps);
    }
}