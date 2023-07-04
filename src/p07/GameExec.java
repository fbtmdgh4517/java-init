package p07;

public class GameExec {

	public static void runGame(Game game) {		// 선언
		game.start();
		game.playing();
		game.stop();
	}
	
	public static void main(String[] args) {
		Game starCraft = new StarCraft();		
		starCraft.name = "스타크래프트";
		starCraft.price = 15000;
		starCraft.genre = "game";
		
		Game tekken = new Tekken();
		tekken.name = "철권";
		tekken.price = 20000;
		tekken.genre = "game";
		
		runGame(starCraft);		// 호출
		runGame(tekken);
	}
}
