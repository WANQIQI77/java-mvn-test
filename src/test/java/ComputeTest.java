import org.example.Compute;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ComputeTest {
	
	private static Compute compute;
	
	@BeforeAll
	public static void setUpBeforeAll() {
		System.out.println("Test cases are starting.");
		compute = new Compute();
	}
	
	@AfterAll
	public static void tearDownAfterAll() {
		System.out.println("Test cases have finished.");
	}
	
	@BeforeEach
	public void setUp() {
		System.out.println("Running a new test case.");
	}
	
	@AfterEach
	public void tearDown() {
		System.out.println("Test case finished.");
	}
	
	@Test
	public void testPower() {
		double base = 2;
		double exponent = 8;
		double expected = 256;
		double result = compute.power(base, exponent);
		assertEquals(expected, result, 0.0001);
	}
	
	@Test
	public void testSquareRoot() {
		double number = 64;
		double expected = 8;
		double result = compute.squareRoot(number);
		assertEquals(expected, result, 0.0001);
	}
	
	@Test
	public void testCubeRoot() {
		double number = 27;
		double expected = 3;
		double result = compute.cubeRoot(number);
		assertEquals(expected, result, 0.0001);
	}
	
	@Test
	public void testNaturalLogarithm() {
		double number = Math.E;
		double expected = 1;
		double result = compute.naturalLogarithm(number);
		assertEquals(expected, result, 0.0001);
	}
	
	@Test
	@Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
	public void testPowerTimeout() {
		// 方法应在100毫秒内完成
		compute.power(2, 10000000);
	}
	
	@Test
	public void testSquareRootException() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			compute.squareRoot(-16);
		});
		// 可以添加对异常消息的断言 if needed
	}
	
	@Disabled("Test is ignored as a demonstration")
	@Test
	public void testIgnored() {
		assertEquals(
						1,
						compute.naturalLogarithm(Math.PI),
						0.0001);
	}
	
	//其他测试方法...
}