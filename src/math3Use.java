import org.apache.commons.math3.analysis.function.Abs;
import org.apache.commons.math3.analysis.function.Add;
import org.apache.commons.math3.analysis.function.Divide;
import org.apache.commons.math3.analysis.function.Multiply;
import org.apache.commons.math3.analysis.function.Subtract;

public class math3Use {
	
	public static double abs(double x) {
		Abs abs = new Abs();
		return abs.value(x);
	}
	
	public static double add(double x, double y) {
		Add add = new Add();
		return add.value(x, y);
	}
	
	public static double sub(double x, double y) {
		Subtract sub = new Subtract();
		return sub.value(x, y);
	}
	
	public static double mul(double x, double y) {
		Multiply mul = new Multiply();
		return mul.value(x, y);
	}
	
	public static double div(double x, double y) {
		if (x == 0) {
			throw new ArithmeticException("被除数不能为0！");
		}
		Divide div = new Divide();
		return div.value(x, y);
	}
	
	public static double calculate(double x, double y) {
		double z = 0;
		if (x <= 0  || y > 3) {
			z = sub(z, x);
			z = add(z, y);
		} else if (x < 4 && y < 0) {
			// 0 < x < 4 && y < 0
			y = abs(y);
			z = add(z, x);
			z = mul(z, y);
		} else {
			// x >= 4 || 0 <= y <= 3
			z = add(z, x);
			z = div(z, y);
		}		
		return z;
	}
	
	public static void main(String[] args) { 
		//double x1 = 2, y1 = -1;
		double z1 = calculate(x1, y1);
		
		double x2 = -2, y2 = 1;
		double z2 = calculate(x2, y2);
		
		double x3 = 5, y3 = 1;
		double z3 = calculate(x3, y3);
		
		double x4 = 1, y4 = 4;
		double z4 = calculate(x4, y4);
		
		double x5 = 1, y5 = -1;
		double z5 = calculate(x5, y5);
		
		double x6 = 1, y6 = 1;
		double z6 = calculate(x6, y6);
		
		try {
			math3Use.div(0, 2);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("z1 = " + z1);
		System.out.println("z2 = " + z2);
		System.out.println("z3 = " + z3);
		System.out.println("z4 = " + z4);
		System.out.println("z5 = " + z5);
	}
	
}