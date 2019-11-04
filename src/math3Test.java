import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.apache.commons.math3.analysis.function.Add;
import org.apache.commons.math3.analysis.function.Multiply;

class math3Test {

	/*
	 * 开发者测试(2) 2 
	 * 错误测试
	 */	
	
	@Test
	void test_error1() {
		div(0, 2);
	}
	
	@Test
	void test_error2() {
		try {
			div(0, 2);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	/*
	 * 开发者测试(2) 3
	 * 基本单元测试
	 */	
	
	// 测试 commons.math3 库类 Add
	@Test
	void test_math3_add() {
		Add add = new Add();
		assertEquals(3, add.value(1, 2));
	}
		
	// 测试 commons.math3 库类 Multiply
	@Test
	void test_math3_mul() {
		Multiply mul = new Multiply();
		assertEquals(2, mul.value(1, 2));
	}
	
	// 测试小程序方法 sub
	@Test
	void test_math3_sub() {
		assertEquals(2, sub(3, 1));
	}
	
	// 测试小程序方法 div
	@Test
	void test_math3_div() {
		assertEquals(2, div(6, 3));
	}
	
	
	/*
	 * 开发者测试(2) 4 
	 * 驱动模块、桩模块测试
	 */	
	
	// 对 abs 方法设置驱动模块
	double driver_abs(double x) {
		x = abs(x);
		return x + 1;
	}
	
	@Test
	void test_abs() {
		assertEquals(3, driver_abs(2));
	}
	
	
	// 对 calculate 方法设置桩模块
	public static double abs(double x) {
		return x;
	}
	
	public static double add(double x, double y) {
		return x;
	}
	
	public static double sub(double x, double y) {
		return x;
	}
	
	public static double mul(double x, double y) {
		return x;
	}
	
	public static double div(double x, double y) {
		return x;
	}

	@Test
	void test_calculate() {
		math3Use.calculate(1, 2);
	}
	
}