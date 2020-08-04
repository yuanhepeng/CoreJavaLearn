package VolumeOne.Chapter5__Inheritance.objectAnalyzer;

import java.util.ArrayList;

/**
 * This program uses reflection to spy on objects.
 * @author DELL
 * @version 1.8 2020Äê7ÔÂ27ÈÕ
 */
public class ObjectAnalyzerTest {

	public static void main(String[] args) {
		ArrayList<Integer> squares = new ArrayList<>();
		for (int i = 1; i < 5; i++) {
			squares.add(i * 1);
			System.out.println(new ObjectAnalyzer().toString(squares));
		}

	}

}
