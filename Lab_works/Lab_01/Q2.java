import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your course name: ");
		String course_name = obj.nextLine();
		getDisplay();
	}
	class GradeCourse{
		String course_name;
		public void setCourseName(String course_name) {
			this.course_name = course_name;  
		}
		public void getCourseName(String course_name) {
			this.course_name = course_name;
		}
		static void getDisplay() {
			System.out.println("Welcome to " +course_name);
		}
		
	}

}
