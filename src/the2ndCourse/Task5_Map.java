package the2ndCourse;

import java.util.HashMap;
import java.util.Map;

public class Task5_Map {

	public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();        //Map型の初期化
        map.put("Paul", 20);        //キーと値の追加
        map.put("John", 25);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());        //キーと値を表示
        }
	}
}