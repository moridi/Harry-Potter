package service;

import entities.Course;

public class CourseService {
		private Course course;

		public CourseService(Course course) {
			this.course = course;
		}

		public Course getCourse() {
			return course;
		}

		public void setCourse(Course _course) {
			course = _course;
		}
		
		
}
