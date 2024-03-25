import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertTest {
	
	/**
	 * 判断一个数是否为素数
	 */
	public static Boolean isPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return n > 1; // 确保排除小于2的整数
	}
	
	@Test
	public void testPrime() {
		int n = 7;
		assertTrue(AssertTest.isPrime(n)); // 使用JUnit 5的断言方法
	}
	
}