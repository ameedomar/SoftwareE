package test;
import org.junit.Assert;

import software.Calculator;;


public class Test {


	@org.junit.Test
	public void testSum_BothNumbersArePositive_ShouldReturnPositiveNumber() {
	// Arrange
	int a = 10;
	int b = 20;
	Calculator calc = new Calculator();
	// Act
	int result = calc.sum(a, b);
	// Assert
	Assert.assertTrue(result > 0);
	}


}
