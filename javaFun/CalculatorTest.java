public class CalculatorTest {
	public static void main(String[] args){
		Calculator calc = new Calculator();

		calc.setOperandOne(10.5).setOperation("+").setOperandTwo(5.2);
		System.out.println(calc.performOperation().getResult());
		
	}
}