package the2ndCourse;

public class Task4 {

	public static void main(String[] args) {
		
			// コマンドライン引数を数値に変換
		int num = Integer.parseInt(args[0]);
			//コマンライン０を入力
		if(num == 0) {
			System.out.println("偽");
			
			//コマンライン1を入力
		}else if(num == 1) {
			System.out.println("真");
			
			//コマンライン０,1を入力
		}else{
			System.out.println("想定外の数値です");
		}
	}
}
