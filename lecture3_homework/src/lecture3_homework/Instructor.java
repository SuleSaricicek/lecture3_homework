package lecture3_homework;

public class Instructor extends User {
		int instructorId;
		String courseGiven;

		
		public Instructor() {
		}
		
		
		
		public Instructor(int instructorId, String courseGiven) {
			super();
			this.instructorId = instructorId;
			this.courseGiven = courseGiven;
		}
		
		
		public int getInstructorId() {
			return instructorId;
		}
		public void setInstructorId(int instructorId) {
			this.instructorId = instructorId;
		}
		public String getCourseGiven() {
			return courseGiven;
		}
		public void setCourseGiven(String courseGiven) {
			this.courseGiven = courseGiven;
		}
	
}

