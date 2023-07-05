package p08;

public interface Remote {
	// 인터페이스는 body가 없어야됨, static이랑 디폴트는 됨?(자바 8이상부터)
	public void on();
	public void off();
}
