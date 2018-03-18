

public class TestMutable {
	public static void main(String[] args) {
		int mark = 100;
		int[] marks = {10,30,40};
		changeMarkToZero(mark);
		System.out.println(mark);
		changeMarksToZero(marks);
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);	
		}
		
		
	}
	
	public static void changeMarkToZero(int m){
		m=0;
	}
	public static void changeMarksToZero(int[] marks){
		for (int i = 0; i < marks.length; i++) {
			marks[i] = 0;
		}
	}
}
