import org.apache.commons.math3.analysis.function.Abs;
import org.apache.commons.math3.analysis.function.Add;
import org.apache.commons.math3.analysis.function.Divide;
import org.apache.commons.math3.analysis.function.Multiply;
import org.apache.commons.math3.analysis.function.Subtract;

public class math3Use {
	
	public static double abs(double x) {
//		Abs abs = new Abs();
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
		} else if (x < 2 && y < 0) {
			// 0 < x < 2 && y < 0
			y = abs(y);
			z = add(z, x);
			z = mul(z, y);
		} else {
			// x >= 2 || 0 <= y <= 3
			z = add(z, x);
			z = div(z, y);
		}		
		return z;
	}
	
	public static void main(String[] args) { 
		double x = 2, y = 1;
		double z = calculate(x, y);
		System.out.println("the result is：" + z);
	}
	
}