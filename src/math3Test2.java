import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class math3Test2 {

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