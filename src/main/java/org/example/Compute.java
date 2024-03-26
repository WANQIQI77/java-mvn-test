package org.example;

/**
 * @author One77
 */
public class Compute {
	
	// 函数1: 使用Math.pow()计算给定数值的指定次幂
	public double power(double base, double exponent) {
		return Math.pow(base, exponent);
	}
	
	// 函数2: 使用Math.sqrt()计算给定数值的平方根
	public double squareRoot(double number) {
		if (number < 0) {
			throw new IllegalArgumentException("Cannot take the square root of a negative number.");
		}
		return Math.sqrt(number);
	}
	
	// 函数3: 使用Math.cbrt()计算给定数值的立方根
	public double cubeRoot(double number) {
		return Math.cbrt(number);
	}
	
	// 函数4: 使用Math.log()计算给定数值的自然对数
	public double naturalLogarithm(double number) {
		return Math.log(number);
	}
	
	// 示例用法
	public static void main(String[] args) {
		Compute operations = new Compute();
		
		System.err.println("2 to the power of 8: " + operations.power(2, 8));
		System.err.println("Square root of 64: " + operations.squareRoot(64));
		System.err.println("Cube root of 27: " + operations.cubeRoot(27));
		System.err.println("Natural logarithm of e: " + operations.naturalLogarithm(Math.E));
	}
}