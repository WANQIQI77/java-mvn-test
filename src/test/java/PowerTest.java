import org.example.Compute;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;


public class PowerTest {
	
	private Compute compute;
	
	// 在每个测试之前初始化Compute对象
	@BeforeEach
	public void initialize() {
		compute = new Compute();
	}
	
	// 使用注解提供一个数据生成方法的名称
	static Stream<Arguments> data() {
		return Stream.of(
						Arguments.of(2, 8, 256),
						Arguments.of(3, 2, 9),
						Arguments.of(4, 3, 64)
						// 可以添加更多的参数组合...
		);
	}
	
	// 使用ParameterizedTest注解运行参数化测试，并指定数据来源
	@ParameterizedTest
	@MethodSource("data")
	public void testPower(double base, double exponent, double expected) {
		assertEquals(expected, compute.power(base, exponent), 0.0001);
	}
}