import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.apache.commons.math3.analysis.function.Add;
import org.apache.commons.math3.analysis.function.Multiply;

class math3Test {

	/*
	 * �����߲���(2) 2 
	 * �������
	 */	
	
	@Test
	void test_error1() {
		math3Use.div(0, 2);
	}
	
	@Test
	void test_error2() {
		try {
			math3Use.div(0, 2);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	/*
	 * �����߲���(2) 3
	 * ������Ԫ����
	 */	
	
	// ���� commons.math3 ���� Add
	@Test
	void test_math3_add() {
		Add add = new Add();
		assertEquals(3, add.value(1, 2));
	}
		
	// ���� commons.math3 ���� Multiply
	@Test
	void test_math3_mul() {
		Multiply mul = new Multiply();
		assertEquals(2, mul.value(1, 2));
	}
	
	// ����С���򷽷� sub
	@Test
	void test_math3_sub() {
		assertEquals(2, sub(3, 1));
	}
	
	// ����С���򷽷� div
	@Test
	void test_math3_div() {
		assertEquals(2, div(6, 3));
	}
	
	
	/*
	 * �����߲���(2) 4 
	 * ����ģ�顢׮ģ�����
	 */	
	
	// �� abs ������������ģ��
	double driver_abs(double x) {
		x = abs(x);
		return x + 1;
	}
	
	@Test
	void test_abs() {
		assertEquals(3, driver_abs(2));
	}
	
	
	// �� calculate ��������׮ģ��
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
