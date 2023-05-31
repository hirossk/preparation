package preparation1;

class Impl implements FITest{
	@Override
	public void foo() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("test");
	}
	
}

public class FITestMain {
	
	private static void foo(FITest test) {
		test.foo();
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Impl impl = new Impl();
		
		impl.foo();
		
		FITest foo1 = new Impl();
		
		foo1.foo();
		
		FITest foo2 = () -> {System.out.println("test2");};
		
		foo2.foo();

		FITest foo3 = () -> System.out.println("test3");
		
		foo3.foo();
		
		foo(() -> System.out.println("test4"));
	}

}
