package the2ndCourse;

public class Task2_Bekkai {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int sum = 0;
		
		//コマンドライン引数10受け取る
		int receiveNumber = Integer.parseInt(args[0]);
		for(int i = 1; i <= receiveNumber; i++) {
			sum += 1;
	    } 
		System.out.println("1から" + receiveNumber + "の和" + sum);
	}
}
