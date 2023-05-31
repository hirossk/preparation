package preparation2;

public class MainCalc {
	private static double calculation(Calc c) {
		return c.calc(3);
	}

	private class InnerClass implements Calc{

		@Override
		public double calc(double d1) {
			// TODO 自動生成されたメソッド・スタブ
			return d1 * 10;
		}
		
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		MainCalc mc = new MainCalc();
		InnerClass in = mc.new InnerClass();
		System.out.println(in.calc(3));
		Calc c = num1-> num1 * 10;
		c.calc(3);
	}

}
