import java.util.Scanner;

class Summation {
    double Sum1(double[] a, int s) {
        double sum = 0;
        for (int i = 0; i < s; i++) {
            sum = sum + a[i];
        }
        return sum;
    }
}
class MeanDeviation {
    MeanDeviation() {
        Scanner sc = new Scanner(System.in);
        Summation obj = new Summation();
        System.out.println("total number of input in mean deviation");
        int s = sc.nextInt();
        double[] a = new double[s];
        double[] b = new double[s];
        System.out.println("Enter the inputs to calculate Mean Deviation ");
        for (int i = 0; i < s; i++) {
            System.out.print("no\t" + (i + 1) + "\tinput\t");
            a[i] = sc.nextDouble();
        }
        double v = obj.Sum1(a, s) / s;
        System.out.println(" value of mod X is:\t" + v);
        for (int i = 0; i < s; i++) {
            b[i] = Math.abs(a[i] - v);
        }
        double v1 = obj.Sum1(b, s) / s;
        System.out.println("\t\t\t Mean Deviation is:\t\t\t" + v1);
    }
}

class StandardDeviation {
    StandardDeviation() {
        Scanner sc = new Scanner(System.in);
        Summation obj = new Summation();
        System.out.println("\n\nStandard Deviation\n\n\ntotal number of input to calculate Standard deviation");
        int s = sc.nextInt();
        double[] a = new double[s];
        double[] b = new double[s];
        double[] c = new double[s];
        System.out.println("Enter the inputs to calculate Standard Deviation ");
        for (int i = 0; i < s; i++) {
            System.out.print((i + 1) + "th Number:\t");
            a[i] = sc.nextDouble();
        }
        double v = obj.Sum1(a, s) / s;
        System.out.println(" value of mod X is:\t" + v);
        System.out.println(" value of mod X is:\t" + v);
        for (int i = 0; i < s; i++) {
            b[i] = (a[i] - v);
        }
        for (int i = 0; i < s; i++) {
            c[i] = Math.pow(b[i], 2);
        }
        double v1 = obj.Sum1(c, s) / s;
        System.out.println("\n\n The Standard Deviation is:\n\n\t\t s.d=" + Math.sqrt(v1));
    }
}

class Covariance {
    Covariance() {
        Scanner sc = new Scanner(System.in);
        Summation obj = new Summation();
        System.out.println("\n\n\t\tMeasures of Central Tendency\t\n\nTopic:\tCalculate Covariance\n\n");
        System.out.println("Total number of class interval present in the equation:");
        int s = sc.nextInt();
        double[] a = new double[s];
        double[] b = new double[s];
        double[] c = new double[s];
        double[] d = new double[s];
        double[] e = new double[s];
        double[] f = new double[s];
        double[] g = new double[s];
        double[] h = new double[s];
        System.out.println("Enter the Class Interval :one by one ");
        for (int i = 0; i < s; i++) {
            System.out.println("The value of Class interval for column no." + (i + 1));
            a[i] = sc.nextDouble();
            b[i] = sc.nextDouble();
            System.out.println("The frequency of The :" + a[i] + "-" + b[i] + " interval class is");
            f[i] = sc.nextDouble();
        }
        System.out.println("\n\nlet's find out the minvalue");
        for (int i = 0; i < s; i++) {
            System.out.println(
                    " in column no." + (i + 1) + "The mid value (X)of " + a[i] + "-" + b[i] + " interval class is");
            c[i] = (b[i] + a[i]) / 2;
            System.out.println(c[i]);
        }
        double cc = c[s / 2];
        double dd = b[1] - a[1];
        System.out.println("Calculate the y for the table \t∵y=(x-c)/d\t");
        for (int i = 0; i < s; i++) {
            System.out.println(
                    " in column no." + (i + 1) + "The  value y in " + a[i] + "-" + b[i] + " interval class is");
            d[i] = (c[i] - cc) / dd;
            System.out.println(d[i]);
        }
        for (int i = 0; i < s; i++) {
            System.out.println(
                    " in column no." + (i + 1) + "Fy=frequency*y in " + a[i] + "-" + b[i] + " interval class is");
            e[i] = d[i] * f[i];
            System.out.println(e[i]);
        }
        for (int i = 0; i < s; i++) {
            System.out.println(" in column no." + (i + 1) + "F(y)^2=frequency*(y)^2 in " + a[i] + "-" + b[i]
                    + " interval class is");
            g[i] = f[i] * Math.pow(d[i], 2);
            System.out.println(e[i]);
            h[i] = f[i] * c[i];
        }
        System.out.println("\n\n\nso the table is:\n\n\n");
        System.out.println("\t\t\t\t\t x\t\ty\t\tfrequency\t\tMid value\t\ty=(x" + cc + ")/" + dd
                + "\t\tFrequency*y\t\tfrequency*y^2");
        for (int i = 0; i < s; i++) {
            System.out.println(" in column no." + (i + 1) + "\t\t" + a[i] + "\t-\t" + b[i] + "\t\t" + f[i] + "\t\t"
                    + c[i] + "\t\t" + d[i] + "\t\t" + e[i] + "\t\t" + g[i] + "\t\t\n\n");
        }
        double aa = obj.Sum1(f, s);
        System.out.println("\n\nThe mean is:\t" + obj.Sum1(h, s) / obj.Sum1(f, s));
        double var = (obj.Sum1(g, s) / aa) - Math.pow(obj.Sum1(e, s) / aa, 2);
        System.out.println("\n\n Standard Deviation :\t\t" + Math.sqrt(var));
        System.out.println("\n\n σx(sigma x)=\t" + dd + "X" + Math.sqrt(var) + "\t=\t" + dd * Math.sqrt(var));
        System.out.println("\n\nnow Let's calculate covariance!\n\n covariance(C.V)=\t"
                + 100 * (dd * Math.sqrt(var)) / (obj.Sum1(h, s) / obj.Sum1(f, s)));
    }
}
class CorrelationCoefficient {
    CorrelationCoefficient() {
        Scanner sc = new Scanner(System.in);
        Summation obj = new Summation();
        System.out.println("\n\n\t\tCorrelation and Regression\t\n\nTopic:\tCalculate Correlation Coefficient\n\n");
        System.out.println("Total number of X,Y present in the equation:");
        int s = sc.nextInt();
        double[] a = new double[s];
        double[] b = new double[s];
        double[] c = new double[s];
        double[] d = new double[s];
        double[] e = new double[s];
        double[] f = new double[s];
        double[] g = new double[s];
        for (int i = 0; i < s; i++) {
            System.out.println("The value of  x for column no." + (i + 1));
            a[i] = sc.nextDouble();
        }
        for (int i = 0; i < s; i++) {
            System.out.println("The value of y for column no." + (i + 1));
            b[i] = sc.nextDouble();
        }
        for (int i = 0; i < s; i++) {
            c[i] = (a[i] - Math.round(obj.Sum1(a, s)));
            d[i] = (b[i] - Math.round(obj.Sum1(b, s)));
            e[i] = Math.pow(c[i], 2);
            f[i] = Math.pow(d[i], 2);
            g[i] = c[i] * d[i];
        }
        System.out.println("\n\n\nso the table is:\n\n\n");
        System.out.println("\t\t\t\t\t\tX\t\tY\t\tx=X-" + Math.round(obj.Sum1(a, s)) + "\t\ty=Y-"
                + Math.round(obj.Sum1(b, s)) + "\t\tx^2\t\ty^2\t\txy");
        for (int i = 0; i < s; i++) {
            System.out.println(" in column no." + (i + 1) + "\t" + a[i] + "\t\t" + b[i] + "\t\t" + c[i] + "\t\t" + d[i]
                    + "\t\t" + e[i] + "\t\t" + f[i] + "\t\t" + g[i] + "\t\n\n");
        }
        System.out.println(
                "___________________________________________________________________________________________________________________________________________");
        System.out.println("\t\t\t\t\t\t\t\t∑X=" + obj.Sum1(a, s) + "\t\t∑Y=\t" + obj.Sum1(b, s) + "∑x=\t"
                + obj.Sum1(c, s) + "\t∑y=" + obj.Sum1(d, s) + "\t∑x^2=" + obj.Sum1(e, s) + "∑y^2=" + obj.Sum1(f, s)
                + "\t∑xy=" + obj.Sum1(g, s));
        System.out.println("\n\nthe all sum in the table is:\n");
        System.out.println("\t∑X=" + obj.Sum1(a, s) + "\n∑Y=\t" + obj.Sum1(b, s) + "\n∑x=\t" + obj.Sum1(c, s) + "\n∑y="
                + obj.Sum1(d, s) + "\n∑x^2=" + obj.Sum1(e, s) + "\n∑y^2=" + obj.Sum1(f, s) + "\n∑xy=" + obj.Sum1(g, s));
        System.out.println(
                "Standard deviation for x is:\t" + Math.sqrt((obj.Sum1(e, s) / s) - (Math.pow(obj.Sum1(c, s) / s, 2))));
        System.out.println(
                "Standard deviation for y is:\t" + Math.sqrt((obj.Sum1(f, s) / s) - (Math.pow(obj.Sum1(d, s) / s, 2))));
        double ff1 = Math.sqrt((obj.Sum1(e, s) / s) - (Math.pow(obj.Sum1(c, s) / s, 2)));
        double ff2 = Math.sqrt((obj.Sum1(f, s) / s) - (Math.pow(obj.Sum1(d, s) / s, 2)));
        double cov = ((obj.Sum1(g, s) / s) - ((obj.Sum1(c, s) / s) * (obj.Sum1(d, s) / s)));
        System.out.println("Covariance of x and y is \t cov(x,y):\t" + cov);
        System.out.println(
                "\n\n\n The correlation coefficient is...\n\n r=cov(x,y)/s.d(x)*s.d(y)=\t" + ((cov) / (ff1 * ff2)));
    }
}

class MeanValueCalculatorClassInterval {
    MeanValueCalculatorClassInterval() {
        Scanner sc = new Scanner(System.in);
        Summation obj = new Summation();
        System.out.println(
                "\n\n\t\tMeasures of Central Tendency\t\n\nTopic:\tClass interval and Mean Value calculation\n\n");

        System.out.println("Total number of class interval present in the equation:");
        int s = sc.nextInt();
        double[] a = new double[s];
        double[] b = new double[s];
        double[] c = new double[s];
        double[] d = new double[s];
        double[] e = new double[s];
        double[] f = new double[s];
        System.out.println("Enter the Class Interval :one by one ");
        for (int i = 0; i < s; i++) {
            System.out.println("The value of Class interval for column no." + (i + 1));
            a[i] = sc.nextDouble();
            b[i] = sc.nextDouble();
            System.out.println("The frequency of The :" + a[i] + "-" + b[i] + " interval class is");
            f[i] = sc.nextDouble();
        }
        System.out.println("\n\nlet's find out the minvalue");
        for (int i = 0; i < s; i++) {
            System.out.println(
                    " in column no." + (i + 1) + "The mid value (X)of " + a[i] + "-" + b[i] + " interval class is");
            c[i] = (b[i] + a[i]) / 2;
            System.out.println(c[i]);
        }
        double cc = c[s / 2];
        double dd = b[1] - a[1];
        System.out.println("Calculate the y for the table \t∵y=(x-c)/d\t");
        for (int i = 0; i < s; i++) {
            System.out.println(
                    " in column no." + (i + 1) + "The  value y in " + a[i] + "-" + b[i] + " interval class is");
            d[i] = (c[i] - cc) / dd;
            System.out.println(d[i]);
        }
        for (int i = 0; i < s; i++) {
            System.out.println(
                    " in column no." + (i + 1) + "Fy=frequency*y in " + a[i] + "-" + b[i] + " interval class is");
            e[i] = d[i] * f[i];
            System.out.println(e[i]);
        }
        System.out.println("\n\n\nso the table is:\n\n\n");
        System.out.println("\t\t\t\tclass interval\t\t\tfrequency\t\tmid value\t\ty\t\tfrequency*y\t\t");
        for (int i = 0; i < s; i++) {
            System.out.println(" in column no." + (i + 1) + "\t" + a[i] + "\t-\t" + b[i] + "\t\t" + f[i] + "\t\t" + c[i]
                    + "\t\t" + d[i] + "\t\t" + e[i] + "\t\t\t\n\n");
        }
        System.out.println(
                "___________________________________________________________________________________________________________________________________________");
        System.out.println("\t\t\t\t\t\t\t\t∑f=" + obj.Sum1(f, s) + "\t\t\t∑Fy=\t" + obj.Sum1(e, s));
        System.out.println("\n\nsum of frequency is ∑f=\t" + obj.Sum1(f, s));
        System.out.println("\n\nsum of x is frequency*y=\t∑Fy=\t" + obj.Sum1(e, s));
        System.out.println("\n\ncalculation\n\n x bar =" + cc + "\t+" + dd + "*y bar");
        System.out.println("the value of y bar is:" + obj.Sum1(e, s) / obj.Sum1(f, s));
        System.out.println("x bar=" + cc + "+\t" + dd + "(" + obj.Sum1(e, s) / obj.Sum1(f, s) + ")");
        double x = cc + dd * obj.Sum1(e, s) / obj.Sum1(f, s);
        System.out.println("\n\n The answer is:\n\t\t\t" + x);
    }

}

class SimpleArithmeticMean {
    SimpleArithmeticMean() {
        Scanner sc = new Scanner(System.in);
        Summation obj = new Summation();
        System.out.println("\n\nTotal number of class  present in the Arithmetic Mean equation:");
        int s = sc.nextInt();
        double[] a = new double[s];
        double[] b = new double[s];
        double[] f = new double[s];
        for (int i = 0; i < s; i++) {
            System.out.println("The  input value for Class  for column no." + (i + 1));
            a[i] = sc.nextDouble();
            System.out.println("The frequency of The :" + a[i] + " interval class is");
            f[i] = sc.nextDouble();
        }
        System.out.println("\n\n\n\t\t\t X \t\t\t\tfrequency");
        for (int i = 0; i < s; i++) {
            System.out.println("\t\t\t" + a[i] + "\t\t\t" + f[i]);
        }
        for (int i = 0; i < s; i++) {
            b[i] = a[i] * f[i];
        }
        System.out.println("\t\t\t\tN=∑Fi=\t" + obj.Sum1(f, s));
        System.out.println("The Arithmetic Mean is:  X bar=\t" + obj.Sum1(b, s) / obj.Sum1(f, s));
    }
}

class FittingGeometricCurve {
    FittingGeometricCurve() {
        Scanner sc = new Scanner(System.in);
        Summation obj = new Summation();
        System.out.println("\n\n\n\t\t\tFitting Geometric Curve Table\n\n\n");
        System.out.println("Total number of x and y present in the equation:");
        int s = sc.nextInt();
        double[] a = new double[s];
        double[] b = new double[s];
        double[] c = new double[s];
        double[] d = new double[s];
        double[] e = new double[s];
        double[] f = new double[s];
        System.out.println("\n\nValues of x are in the given equation:");
        for (int i = 0; i < s; i++) {
            System.out.println("The value of x for column no." + (i + 1));
            a[i] = sc.nextDouble();
        }
        System.out.println("\n\nValues of y are in the given equation:");
        for (int i = 0; i < s; i++) {
            System.out.println("value of y for column no." + (i + 1));
            b[i] = sc.nextDouble();
        }
        System.out.println("\n\n value of  x, y,X=log x ,Y=log y, X^2=(log x)^2; and x*y is :");
        for (int i = 0; i < s; i++) {
            d[i] = Math.log10(a[i]);
            c[i] = Math.log10(b[i]);
            e[i] = Math.pow(d[i], 2);
            f[i] = d[i] * Math.log10(b[i]);
        }
        System.out.println("\n\n\nso the table is:\n\n\n");
        System.out.println("\t\t\tx\t\ty\t\tlog x\t\tlog y\t\t(log x)^2\t\tlog x *log y\t\t");
        for (int i = 0; i < s; i++) {
            System.out.print("\n\tcolumn no." + (i + 1) + "\t\t" + a[i] + "\t\t" + b[i] + "\t\t" + Math.log10(a[i])
                    + "\t\t" + Math.log10(b[i]) + "\t\t" + Math.pow(d[i], 2) + "\t\t" + d[i] * Math.log10(b[i])
                    + "\t\t\n\n");
        }
        System.out.println(
                "______________________________________________________________________________________________________________________________________________");
        System.out.println("\t\t\t\t∑x=" + obj.Sum1(a, s) + "\t∑y=" + obj.Sum1(b, s) + "\t∑X=" + obj.Sum1(d, s)
                + "\t∑Y=" + obj.Sum1(c, s) + "\t∑X^2=" + obj.Sum1(e, s) + "\tXY=" + obj.Sum1(f, s));
        System.out.println("\n\nsum of x is ∑x=\t" + obj.Sum1(a, s));
        System.out.println("\n\nsum of y is ∑y=\t" + obj.Sum1(b, s));
        System.out.println("\n\nsum of X=log x is ∑X=\t" + obj.Sum1(d, s));
        System.out.println("\n\nsum of Y=log y is ∑Y=\t" + obj.Sum1(c, s));
        System.out.println("\n\nsum of X^2=(log x)^2 is ∑X^2=\t" + obj.Sum1(e, s));
        System.out.println("\n\nsum of XY is :\t" + obj.Sum1(f, s));
        double[][] g = { { s, obj.Sum1(d, s) }, { obj.Sum1(d, s), obj.Sum1(e, s) } };
        double cc = (g[0][0] * g[1][1]) - (g[0][1] * g[1][0]);
        double cc1 = 1 / cc;
        double[][] h = { { (g[1][1] * cc1), (-g[0][1] * cc1) }, { (-g[1][0] * cc1), (g[0][0] * cc1) } };
        double h1 = (h[0][0] * obj.Sum1(c, s)) + (h[0][1] * obj.Sum1(f, s));
        double h2 = (h[1][0] * obj.Sum1(c, s)) + (h[1][1] * obj.Sum1(f, s));
        System.out.println("here \t\tA:\t" + h1 + "\t\t\tB:\t" + h2);
        System.out.println("anti log of A is:\t" + Math.pow(10, h1) + "\tAnti log of B is:\t" + Math.pow(10, h2));
        System.out.println(
                "\t \n\n \t\t The Fitting Geometric curve equation is:\n\n\t\t\ty=\t" + Math.pow(10, h1) + "(x)^" + h2);

    }
}

class FittingStraightLine {
    FittingStraightLine() {
        Scanner sc = new Scanner(System.in);
        Summation obj = new Summation();
        System.out.println("\n\n\n\t\t\tFitting Straight Line Table\n\n\n");
        System.out.println("Total number of x and y present in the equation:");
        int s = sc.nextInt();
        double[] a = new double[s];
        double[] b = new double[s];
        double[] c = new double[s];
        double[] d = new double[s];
        System.out.println("\n\nValues of x and y  in the given equation is:");
        for (int i = 0; i < s; i++) {
            System.out.println("The value of x for column no." + (i + 1));
            a[i] = sc.nextDouble();
            System.out.println(" the value of y for column no." + (i + 1));
            b[i] = sc.nextDouble();
        }
        for (int i = 0; i < s; i++) {
            c[i] = Math.pow(a[i], 2);
            d[i] = a[i] * b[i];
        }
        System.out.println("\n\n\nso the table is:\n\n\n");
        System.out.println("\t\t\t\t\t\tx\t\ty\t\tx^2\t\tx*y\t\t\t");
        for (int i = 0; i < s; i++) {
            System.out.println(" in column no." + (i + 1) + "\t\t" + a[i] + "\t-\t" + b[i] + "\t\t" + c[i] + "\t\t"
                    + d[i] + "\t\t\n\n");
        }
        System.out.println(
                "_________________________________________________________________________________________________________________");
        System.out.println("\t\t\t∑x=" + obj.Sum1(a, s) + "\t∑y=" + obj.Sum1(b, s) + "\t∑X^2=" + obj.Sum1(c, s)
                + "\t∑Y=" + obj.Sum1(d, s));
        System.out.println("\n\nsum of x is ∑x=\t" + obj.Sum1(a, s));
        System.out.println("\n\nsum of y is ∑y=\t" + obj.Sum1(b, s));
        System.out.println("\n\nsum of X^2 is ∑X^2=\t" + obj.Sum1(c, s));
        System.out.println("\n\nsum of Y=log y is ∑XY=\t" + obj.Sum1(d, s));
        double[][] g = { { s, obj.Sum1(a, s) }, { obj.Sum1(a, s), obj.Sum1(c, s) } };
        double cc = (g[0][0] * g[1][1]) - (g[0][1] * g[1][0]);
        double cc1 = 1 / cc;
        double[][] h = { { (g[1][1] * cc1), (-g[0][1] * cc1) }, { (-g[1][0] * cc1), (g[0][0] * cc1) } };
        double h1 = (h[0][0] * obj.Sum1(b, s)) + (h[0][1] * obj.Sum1(d, s));
        double h2 = (h[1][0] * obj.Sum1(b, s)) + (h[1][1] * obj.Sum1(d, s));
        System.out.println("here \t\ta:\t" + h1 + "\t\t\tb:\t" + h2);
        System.out.println("\t \n\n \t\t The Fitting Straight Line equation is:\n\n\t\t\ty=\t" + h1 + "\t+\t" + h2 + "x");
    }
}

class FittingParaBola {
    FittingParaBola() {
        Scanner sc = new Scanner(System.in);
        Summation obj = new Summation();
        System.out.println("\n\n\n\t\t\tFitting ParaBola\n\n\n");
        System.out.println("Total number of x and y present in the equation:");
        int s = sc.nextInt();
        double[] a = new double[s];
        double[] b = new double[s];
        double[] c = new double[s];
        double[] d = new double[s];
        double[] e = new double[s];
        double[] f = new double[s];
        double[] g = new double[s];
        System.out.println("\n\nValues of x and y  in the given equation is:");
        for (int i = 0; i < s; i++) {
            System.out.println("The value of x for column no." + (i + 1));
            a[i] = sc.nextDouble();
            System.out.println(" the value of y for column no." + (i + 1));
            b[i] = sc.nextDouble();
        }
        for (int i = 0; i < s; i++) {
            c[i] = Math.pow(a[i], 2);
            d[i] = Math.pow(a[i], 3);
            e[i] = Math.pow(a[i], 4);
            f[i] = a[i] * b[i];
            g[i] = Math.pow(a[i], 2) * b[i];
        }
        System.out.println("\n\n\nso the table is:\n\n\n");
        System.out.println("\t\t\t\tx\t\t\ty\t\t\tx^2\t\t\tx^3\t\t\tx^4\t\t\tx*y\t\tx^2*y\t\t");
        for (int i = 0; i < s; i++) {
            System.out.println(" in column no." + (i + 1) + "\t" + a[i] + "\t-\t" + b[i] + "\t\t" + c[i] + "\t\t" + d[i]
                    + "\t\t" + e[i] + "\t\t" + f[i] + "\t\t" + g[i] + "\t\t\n\n");
        }
        System.out.println(
                "____________________________________________________________________________________________________________________________________________________");
        System.out.println("\t\t\t\t∑x=" + obj.Sum1(a, s) + "\t∑y=" + obj.Sum1(b, s) + "\t∑X^2=" + obj.Sum1(c, s)
                + "\t∑X^3=" + obj.Sum1(d, s) + "\t∑X^4=" + obj.Sum1(e, s) + "\t∑X*Y=\t" + obj.Sum1(f, s) + "\t∑X*Y="
                + obj.Sum1(f, s));
        System.out.println("\n\nsum of x is ∑x=\t" + obj.Sum1(a, s));
        System.out.println("\n\nsum of y is ∑y=\t" + obj.Sum1(b, s));
        System.out.println("\n\nsum of  ∑X^2=\t" + obj.Sum1(c, s));
        System.out.println("\n\nsum of  ∑X^3=\t" + obj.Sum1(d, s));
        System.out.println("\n\nsum of  ∑X^4=\t" + obj.Sum1(e, s));
        System.out.println("\n\nsum of  ∑X*Y=\t" + obj.Sum1(f, s));
        System.out.println("\n\nsum of  ∑X2*Y=\t" + obj.Sum1(g, s));
        double[][] i = { { s, obj.Sum1(a, s), obj.Sum1(c, s) }, { obj.Sum1(a, s), obj.Sum1(c, s), obj.Sum1(d, s) },
                { obj.Sum1(c, s), obj.Sum1(d, s), obj.Sum1(e, s) } };
        double m = ((i[0][0]) * ((i[1][1] * i[2][2]) - (i[1][2] * i[2][1]))
                - ((i[0][1]) * ((i[1][0] * i[2][2]) - (i[1][2] * i[2][0])))
                + ((i[0][2]) * ((i[1][0] * i[2][1]) - (i[1][1] * i[2][0]))));
        double[][] j = { { obj.Sum1(b, s), obj.Sum1(a, s), obj.Sum1(c, s) },
                { obj.Sum1(f, s), obj.Sum1(c, s), obj.Sum1(d, s) },
                { obj.Sum1(g, s), obj.Sum1(d, s), obj.Sum1(e, s) } };
        double n = ((j[0][0]) * ((j[1][1] * j[2][2]) - (j[1][2] * j[2][1]))
                - ((j[0][1]) * ((j[1][0] * j[2][2]) - (j[1][2] * j[2][0])))
                + ((j[0][2]) * ((j[1][0] * j[2][1]) - (j[1][1] * j[2][0]))));
        double[][] k = { { s, obj.Sum1(b, s), obj.Sum1(c, s) }, { obj.Sum1(a, s), obj.Sum1(f, s), obj.Sum1(d, s) },
                { obj.Sum1(c, s), obj.Sum1(g, s), obj.Sum1(e, s) } };
        double o = ((k[0][0]) * ((k[1][1] * k[2][2]) - (k[1][2] * k[2][1]))
                - ((k[0][1]) * ((k[1][0] * k[2][2]) - (k[1][2] * k[2][0])))
                + ((k[0][2]) * ((k[1][0] * k[2][1]) - (k[1][1] * k[2][0]))));
        double[][] l = { { s, obj.Sum1(a, s), obj.Sum1(b, s) }, { obj.Sum1(a, s), obj.Sum1(c, s), obj.Sum1(f, s) },
                { obj.Sum1(c, s), obj.Sum1(d, s), obj.Sum1(g, s) } };
        double p = ((l[0][0]) * ((l[1][1] * l[2][2]) - (l[1][2] * l[2][1]))
                - ((l[0][1]) * ((l[1][0] * l[2][2]) - (l[1][2] * l[2][0])))
                + ((l[0][2]) * ((l[1][0] * l[2][1]) - (l[1][1] * l[2][0]))));
        System.out.println("The equation of Fitting ParaBola is: \n\t\t\t y=\t" + (n / m) + "\t+\t" + (o / m) + "x\t+"
                + (p / m) + "x^2");
    }
}

class FittingExponentialCurve {
    FittingExponentialCurve() {
        Scanner sc = new Scanner(System.in);
        Summation obj = new Summation();
        System.out.println("\n\n\n\t\t\tFitting Exponential curve\n\n\n");
        System.out.println("Total number of x and y present in the equation:");
        int s = sc.nextInt();
        double[] a = new double[s];
        double[] b = new double[s];
        double[] c = new double[s];
        double[] d = new double[s];
        double[] e = new double[s];
        System.out.println("\n\nValues of x and y  in the given equation is:");
        for (int i = 0; i < s; i++) {
            System.out.println("The value of x for column no." + (i + 1));
            a[i] = sc.nextDouble();
            System.out.println(" the value of y for column no." + (i + 1));
            b[i] = sc.nextDouble();
        }
        for (int i = 0; i < s; i++) {
            c[i] = Math.log10(b[i]);
            d[i] = Math.pow(a[i], 2);
            e[i] = Math.log10(b[i]) * a[i];
        }
        System.out.println("\n\n\nso the table is:\n\n\n");
        System.out.println("\t\t\t\t\tx\t\t\ty\t\t\tlog y\t\t\tx^2\t\t\tx*y");
        for (int i = 0; i < s; i++) {
            System.out.println(" in column no." + (i + 1) + "\t\t" + a[i] + "\t-\t" + b[i] + "\t\t" + c[i] + "\t\t"
                    + d[i] + "\t\t" + e[i] + "\t\t\t\n\n");
        }
        System.out.println(
                "_______________________________________________________________________________________________________________________________");
        System.out.println("\t\t\t\t∑x=" + obj.Sum1(a, s) + "\t∑y=" + obj.Sum1(b, s) + "\t ∑Y=log y=" + obj.Sum1(c, s)
                + "\t∑(X)^2=" + obj.Sum1(d, s) + "\t∑X*log y=" + obj.Sum1(e, s));
        System.out.println("\n\nsum of x is ∑x=\t" + obj.Sum1(a, s));
        System.out.println("\n\nsum of y is ∑y=\t" + obj.Sum1(b, s));
        System.out.println("\n\nsum of  ∑Y=log y=\t" + obj.Sum1(c, s));
        System.out.println("\n\nsum of  ∑(X)^2=\t" + obj.Sum1(d, s));
        System.out.println("\n\nsum of  ∑X*log y=\t" + obj.Sum1(e, s));
        double[][] g = { { s, obj.Sum1(a, s) }, { obj.Sum1(a, s), obj.Sum1(d, s) } };
        double cc = (g[0][0] * g[1][1]) - (g[0][1] * g[1][0]);
        double cc1 = 1 / cc;
        double[][] h = { { (g[1][1] * cc1), (-g[0][1] * cc1) }, { (-g[1][0] * cc1), (g[0][0] * cc1) } };
        double h1 = (h[0][0] * obj.Sum1(c, s)) + (h[0][1] * obj.Sum1(e, s));
        double h2 = (h[1][0] * obj.Sum1(c, s)) + (h[1][1] * obj.Sum1(e, s));
        System.out.println("here \t\tA:\t" + h1 + "\t\t\tB:\t" + h2);
        System.out.println("anti log of A is:\t" + Math.pow(10, h1) + "\tAnti log of B is:\t" + Math.pow(10, h2));
        System.out.println("\t \n\n \t\t The Fitting Exponential  curve equation is:\n\n\t\t\ty=\t" + Math.pow(10, h1)
                + "(" + Math.pow(10, h2) + ")^x");
    }
}

class RegressionYx {
    RegressionYx() {
        System.out.println("for regression  equation y on x");
        Scanner sc = new Scanner(System.in);
        Summation obj = new Summation();
        System.out.println("\n\n\t\tCorrelation and Regression\t\n\nTopic:\tCalculate Correlation Coefficient\n\n");
        System.out.println("Total number of X,Y present in the equation:");
        int s = sc.nextInt();
        double[] a = new double[s];
        double[] b = new double[s];
        double[] c = new double[s];
        double[] d = new double[s];
        double[] e = new double[s];
        double[] f = new double[s];
        double[] g = new double[s];
        for (int i = 0; i < s; i++) {
            System.out.println("The value of  x for column no." + (i + 1));
            a[i] = sc.nextDouble();
        }
        for (int i = 0; i < s; i++) {
            System.out.println("The value of y for column no." + (i + 1));
            b[i] = sc.nextDouble();
        }
        for (int i = 0; i < s; i++) {
            c[i] = (a[i] - Math.round(obj.Sum1(a, s)));
            d[i] = (b[i] - Math.round(obj.Sum1(b, s)));
            e[i] = Math.pow(c[i], 2);
            f[i] = Math.pow(d[i], 2);
            g[i] = c[i] * d[i];
        }
        System.out.println("\n\n\nso the table is:\n\n\n");
        System.out.println("\t\t\t\t\t\tX\t\tY\t\tx=X-" + Math.round(obj.Sum1(a, s)) + "\t\ty=Y-"
                + Math.round(obj.Sum1(b, s)) + "\t\tx^2\t\ty^2\t\txy");
        for (int i = 0; i < s; i++) {
            System.out.println(" in column no." + (i + 1) + "\t" + a[i] + "\t\t" + b[i] + "\t\t" + c[i] + "\t\t" + d[i]
                    + "\t\t" + e[i] + "\t\t" + f[i] + "\t\t" + g[i] + "\t\n\n");
        }
        System.out.println(
                "___________________________________________________________________________________________________________________________________________");
        System.out.println("\t\t\t\t\t\t\t\t∑X=" + obj.Sum1(a, s) + "\t\t∑Y=\t" + obj.Sum1(b, s) + "∑x=\t"
                + obj.Sum1(c, s) + "\t∑y=" + obj.Sum1(d, s) + "\t∑x^2=" + obj.Sum1(e, s) + "∑y^2=" + obj.Sum1(f, s)
                + "\t∑xy=" + obj.Sum1(g, s));
        System.out.println("\n\nthe all sum in the table is:\n");
        System.out.println("\t∑X=" + obj.Sum1(a, s) + "\n∑Y=\t" + obj.Sum1(b, s) + "\n∑x=\t" + obj.Sum1(c, s) + "\n∑y="
                + obj.Sum1(d, s) + "\n∑x^2=" + obj.Sum1(e, s) + "\n∑y^2=" + obj.Sum1(f, s) + "\n∑xy=" + obj.Sum1(g, s));
        System.out.println(
                "Standard deviation for x is:\t" + Math.sqrt((obj.Sum1(e, s) / s) - (Math.pow(obj.Sum1(c, s) / s, 2))));
        System.out.println(
                "Standard deviation for y is:\t" + Math.sqrt((obj.Sum1(f, s) / s) - (Math.pow(obj.Sum1(d, s) / s, 2))));
        double ff1 = Math.sqrt((obj.Sum1(e, s) / s) - (Math.pow(obj.Sum1(c, s) / s, 2)));
        double ff2 = Math.sqrt((obj.Sum1(f, s) / s) - (Math.pow(obj.Sum1(d, s) / s, 2)));
        double cov = ((obj.Sum1(g, s) / s) - ((obj.Sum1(c, s) / s) * (obj.Sum1(d, s) / s)));
        System.out.println("Covariance of x and y is \t cov(x,y):\t" + cov);
        System.out.println(
                "\n\n\n The correlation coefficient is...\n\n r=cov(x,y)/s.d(x)*s.d(y)=\t" + ((cov) / (ff1 * ff2)));
        double byx = cov / Math.pow(ff1, 2);
        System.out.println("\n\n\t\t\there bxy=\t" + byx);
        System.out.println("\n\n\n\t\t\tthe regression equation is:\n\t\t(y\t-\t" + obj.Sum1(b, s) / s + ")\t=\t" + byx
                + "(x-" + obj.Sum1(a, s) / s + ")");
    }
}

class RegressionXy {
    RegressionXy() {
        System.out.println("\t\t\tRegression equation of x on y\t\n");
        Scanner sc = new Scanner(System.in);
        Summation obj = new Summation();
        System.out.println("\n\n\t\tCorrelation and Regression\t\n\nTopic:\tCalculate Correlation Coefficient\n\n");
        System.out.println("Total number of X,Y present in the equation:");
        int s = sc.nextInt();
        double[] a = new double[s];
        double[] b = new double[s];
        double[] c = new double[s];
        double[] d = new double[s];
        double[] e = new double[s];
        double[] f = new double[s];
        double[] g = new double[s];
        for (int i = 0; i < s; i++) {
            System.out.println("The value of  x for column no." + (i + 1));
            a[i] = sc.nextDouble();
        }
        for (int i = 0; i < s; i++) {
            System.out.println("The value of y for column no." + (i + 1));
            b[i] = sc.nextDouble();
        }
        for (int i = 0; i < s; i++) {
            c[i] = (a[i] - Math.round(obj.Sum1(a, s)));
            d[i] = (b[i] - Math.round(obj.Sum1(b, s)));
            e[i] = Math.pow(c[i], 2);
            f[i] = Math.pow(d[i], 2);
            g[i] = c[i] * d[i];
        }
        System.out.println("\n\n\nso the table is:\n\n\n");
        System.out.println("\t\t\t\t\t\tX\t\tY\t\tx=X-" + Math.round(obj.Sum1(a, s)) + "\t\ty=Y-"
                + Math.round(obj.Sum1(b, s)) + "\t\tx^2\t\ty^2\t\txy");
        for (int i = 0; i < s; i++) {
            System.out.println(" in column no." + (i + 1) + "\t" + a[i] + "\t\t" + b[i] + "\t\t" + c[i] + "\t\t" + d[i]
                    + "\t\t" + e[i] + "\t\t" + f[i] + "\t\t" + g[i] + "\t\n\n");
        }
        System.out.println(
                "___________________________________________________________________________________________________________________________________________");
        System.out.println("\t\t\t\t\t\t\t\t∑X=" + obj.Sum1(a, s) + "\t\t∑Y=\t" + obj.Sum1(b, s) + "∑x=\t"
                + obj.Sum1(c, s) + "\t∑y=" + obj.Sum1(d, s) + "\t∑x^2=" + obj.Sum1(e, s) + "∑y^2=" + obj.Sum1(f, s)
                + "\t∑xy=" + obj.Sum1(g, s));
        System.out.println("\n\nthe all sum in the table is:\n");
        System.out.println("\t∑X=" + obj.Sum1(a, s) + "\n∑Y=\t" + obj.Sum1(b, s) + "\n∑x=\t" + obj.Sum1(c, s) + "\n∑y="
                + obj.Sum1(d, s) + "\n∑x^2=" + obj.Sum1(e, s) + "\n∑y^2=" + obj.Sum1(f, s) + "\n∑xy=" + obj.Sum1(g, s));
        System.out.println(
                "Standard deviation for x is:\t" + Math.sqrt((obj.Sum1(e, s) / s) - (Math.pow(obj.Sum1(c, s) / s, 2))));
        System.out.println(
                "Standard deviation for y is:\t" + Math.sqrt((obj.Sum1(f, s) / s) - (Math.pow(obj.Sum1(d, s) / s, 2))));
        double ff1 = Math.sqrt((obj.Sum1(e, s) / s) - (Math.pow(obj.Sum1(c, s) / s, 2)));
        double ff2 = Math.sqrt((obj.Sum1(f, s) / s) - (Math.pow(obj.Sum1(d, s) / s, 2)));
        double cov = ((obj.Sum1(g, s) / s) - ((obj.Sum1(c, s) / s) * (obj.Sum1(d, s) / s)));
        System.out.println("Covariance of x and y is \t cov(x,y):\t" + cov);
        System.out.println(
                "\n\n\n The correlation coefficient is...\n\n r=cov(x,y)/s.d(x)*s.d(y)=\t" + ((cov) / (ff1 * ff2)));
        double bxy = cov / Math.pow(ff2, 2);
        System.out.println("\n\n\t\t\there bxy=\t" + bxy);
        System.out.println("\n\n\n\t\t\tthe regression equation is:\n\t\t(x\t-\t" + obj.Sum1(a, s) / s + ")\t=\t" + bxy
                + "(y-" + obj.Sum1(b, s) / s + ")");
    }
}

class NormalRank {
    NormalRank() {
        Scanner sc = new Scanner(System.in);
        Summation obj = new Summation();
        System.out.println("\n\n\t\tCorrelation and Regression\t\n\nTopic:\tRank\n\n");
        System.out.println("Total number of x,y present in the question?:");
        int s = sc.nextInt();
        double[] a = new double[s];
        double[] b = new double[s];
        double[] c = new double[s];
        double[] d = new double[s];
        for (int i = 0; i < s; i++) {
            System.out.println("The value of  x for column no." + (i + 1));
            a[i] = sc.nextDouble();
        }
        for (int i = 0; i < s; i++) {
            System.out.println("The value of y for column no." + (i + 1));
            b[i] = sc.nextDouble();
        }
        for (int i = 0; i < s; i++) {
            d[i] = a[i] - b[i];
            c[i] = Math.pow(d[i], 2);
        }
        System.out.println("\n\n\nso the table is:\n\n\n");
        System.out.println("\t\t\t\t\t\t\t\tX\t\t\tY\t\t\td=x-y\t\t\td^2xy");
        for (int i = 0; i < s; i++) {
            System.out.println(
                    " in column no." + (i + 1) + "\t" + a[i] + "\t\t" + b[i] + "\t\t" + d[i] + "\t\t" + c[i] + "\n\n");
        }
        System.out.println(
                "___________________________________________________________________________________________________________________________________________");
        System.out.println("\t\t\t\t\t\t\t\t∑X=" + obj.Sum1(a, s) + "\t\t∑Y=\t" + obj.Sum1(b, s) + "∑d=\t"
                + obj.Sum1(d, s) + "\t∑d^2=" + obj.Sum1(c, s));
        double r = 1 - ((6 * obj.Sum1(c, s)) / ((Math.pow(s, 3) - s)));
        System.out.println("\n\n\n\t\t\tThe rank is\n\t\t\t\t R=\t" + r);
    }
}

public class MathAllinOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                " 1.For Mean Deviation Calculator Press : 1(one)\n2.For Standard Deviation Calculation press : 2(two)");
        System.out.println(
                "\n3.For Covariance calculation press :3(three)\n4.For Mean Value calculation in Tabular From and Class Interval press:4(Four) ");
        System.out.println(
                "\n5.For Normal or simple Arithmetic Mean press: 5(five)\n6.For Fitting Geometric Curve Table press: 6(six)");
        System.out.println(
                "\n7.For Fitting Straight Line press :7(seven)\n8.For Fitting ParaBola press: 8(Eight)\n9.For Fitting Exponential curve press: 9(Nine) ");
        System.out.println(
                "\n10.For Correlation coefficient press:10(Ten)\n11.For regression y on x press 11(Eleven)\n 12.For regression x on y press 12(Twelve)");
        System.out.println("13.For rank press 13 or >13");
        System.out.println("\nplease enter a number to continue....");
        int s1 = sc.nextInt();
        if (s1 == 1) {
            MeanDeviation obj = new MeanDeviation();
        } else if (s1 == 2) {
            StandardDeviation obj = new StandardDeviation();
        } else if (s1 == 3) {
            Covariance obj = new Covariance();
        } else if (s1 == 4) {
            MeanValueCalculatorClassInterval obj = new MeanValueCalculatorClassInterval();
        } else if (s1 == 5) {
            SimpleArithmeticMean obj = new SimpleArithmeticMean();
        } else if (s1 == 6) {
            FittingGeometricCurve obj = new FittingGeometricCurve();
        } else if (s1 == 7) {
            FittingStraightLine obj = new FittingStraightLine();
        } else if (s1 == 8) {
            FittingParaBola obj = new FittingParaBola();
        } else if (s1 == 9) {
            FittingExponentialCurve obj = new FittingExponentialCurve();
        } else if (s1 == 10) {
            CorrelationCoefficient obj = new CorrelationCoefficient();
        } else if (s1 == 11) {
            RegressionYx obj = new RegressionYx();
        } else if (s1 == 12) {
            RegressionXy obj = new RegressionXy();
        } else {
            NormalRank obj = new NormalRank();
        }
        System.out.println("\n\n\n\n\n\t\t\t\tThank You\t\t\t\t\n\n\n");
    }
}
