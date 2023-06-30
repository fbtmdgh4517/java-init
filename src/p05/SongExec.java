package p05;

public class SongExec {
	
	public static void printSong(Song[] songs) {
		for(int i=0; i<songs.length; i++) {
			System.out.println(songs[i].name);
			System.out.println(songs[i].singer);
			System.out.println(songs[i].rank);
		}
	}

	public static void main(String[] args) {
		Song[] songs = new Song[5];		
		// [null, null, null, null, null], Song 배열이어도 null이면 name, singer, rank가 없음. 
		// 그래서 빈 song 배열 상태에서 name, singer, rank를 사용하면 널포인터익셉션 오류가 남
		// songs[0].name = "김"; (오류)
		
		// 이렇게 하면 빈 song 배열에 song을 넣어서 null이 없어지니까 name, singer, rank 사용 가능
		songs[0] = new Song();
		songs[0].name = "노래이름";
		songs[0].singer = "가수이름";
		songs[0].rank = 22;
		
		songs[1] = new Song();
		songs[1].name = "노래이름";
		songs[1].singer = "가수이름";
		songs[1].rank = 2;
		
		songs[2] = new Song();
		songs[2].name = "노래이름";
		songs[2].singer = "가수이름";
		songs[2].rank = 34;
		
		songs[3] = new Song();
		songs[3].name = "노래이름";
		songs[3].singer = "가수이름";
		songs[3].rank = 14;
		
		songs[4] = new Song();
		songs[4].name = "노래이름";
		songs[4].singer = "가수이름";
		songs[4].rank = 54;
		
//		printSong(songs);
		
		Song firstRankSong = songs[0];
		Song lastRankSong = songs[0];
		
		for(int i=1; i<songs.length; i++) {
			if(firstRankSong.rank > songs[i].rank) {
				firstRankSong = songs[i];
			} else if(lastRankSong.rank < songs[i].rank) {
				lastRankSong = songs[i];
			}
		}
		
		System.out.println("가장 높은 등 : " + firstRankSong.name + ", " + firstRankSong.singer + ", " + firstRankSong.rank + "위");
		System.out.println("가장 낮은 등 : " + lastRankSong.name + ", " + lastRankSong.singer + ", " + lastRankSong.rank + "위");
	}

}
