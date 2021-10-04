package the2ndCourse;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Period;

public class Task3 {

	public static void main(String[] args) {
		//現在日付※自主的
		LocalDateTime date1 = LocalDateTime.now();
		System.out.println("date1 : "+ date1);

		//３年後の現在時間※自主的
		System.out.println(date1 + "の３年後:"+ date1.plus(Period.ofYears(3)));


		//３年後の曜日
		LocalDateTime date2 = LocalDateTime.now();
		System.out.println("date2 : "+date2);


		DayOfWeek  dayofweek = date2.getDayOfWeek();
		System.out.println("曜日：" + dayofweek);

		DayOfWeek  dayofweek3 = date2.plusYears(3).getDayOfWeek();
		System.out.println("3年後の今日は"+date2.plusYears(3));
		System.out.println("3年後の曜日：" + dayofweek3);


		}
}
