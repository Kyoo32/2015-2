package student;

import java.util.HashSet;

public class StudentTest {
	public static void main(String[] args) {

		HashSet<Student> set = new HashSet<Student>();
		set.add(new Student("100", "이규원"));
		set.add(new Student("200", "신윤서"));
		set.add(new Student("300", "황종성"));
		set.add(new Student("400", "김봉근"));
		set.add(new Student("100", "임동준"));
		
		System.out.println(set);
	}

}
