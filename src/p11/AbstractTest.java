package p11;

class Son extends AbstractTest {

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}
	
}

public abstract class AbstractTest {
	public AbstractTest() {
		
	}
	public void test() {
		
	}
	
	public abstract void test2();
	
	public static void main(String[] args) {
		AbstractTest at = new Son();
		at.test2();
	}
}
