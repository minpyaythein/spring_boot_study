package com.luv2code.cruddemo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			// createStudent(studentDAO);
			createMultipleStudents(studentDAO);
			// readStudent(studentDAO);
			// queryForStudents(studentDAO);
			// queryForStudentsByLastName(studentDAO);
			// updateStudent(studentDAO);
			// deleteStudent(studentDAO);
			// deleteAllStudents(studentDAO);
		};
	}

	// private void deleteAllStudents(StudentDAO studentDAO) {
	// System.out.println("Deleting all students");
	// int numRowsDeleted = studentDAO.deleteAll();
	// System.out.println("Number of Rows Deleted: " + numRowsDeleted);
	// }

	// private void deleteStudent(StudentDAO studentDAO) {
	// int studentId = 8;
	// System.out.println("Deleting student id: " + studentId);
	// studentDAO.delete(studentId);
	// }

	// private void updateStudent(StudentDAO studentDAO) {
	// // retrieve student based on the id: primary key
	// int studentId = 1;
	// System.out.println("Getting student with id: " + studentId);
	// Student myStudent = studentDAO.findById(studentId);

	// // change first name
	// System.out.println("Updating student...");
	// myStudent.setFirstName("Pauk");

	// // update the student
	// studentDAO.update(myStudent);

	// // display the updated student
	// System.out.println("Updated Student: " + myStudent);
	// }

	// private void queryForStudentsByLastName(StudentDAO studentDAO) {
	// // get a list of students
	// List<Student> theStudents = studentDAO.findByLastName("Thein");

	// // display list of students
	// for (Student tempStudent : theStudents) {
	// System.out.println(tempStudent);
	// }
	// }

	// private void queryForStudents(StudentDAO studentDAO) {
	// // get a list of students
	// List<Student> theStudents = studentDAO.findAll();

	// // display list of students
	// for (Student tempStudent : theStudents) {
	// System.out.println(tempStudent);
	// }
	// }

	// private void readStudent(StudentDAO studentDAO) {
	// // create a student
	// System.out.println("Creating new student object ...");
	// Student tempStudent = new Student("Thandar", "Nway",
	// "thandarnway@email.com");

	// // save the student
	// System.out.println("Creating new student object ...");
	// studentDAO.save(tempStudent);

	// // display id of the saved student
	// System.out.println("ID of the saved student: " + tempStudent.getId());

	// // retrieve student based on the id: primary key
	// Student myStudent = studentDAO.findById(tempStudent.getId());

	// // display student
	// System.out.println(myStudent);
	// }

	private void createMultipleStudents(StudentDAO studentDAO) {
		// create multiple students
		System.out.println("Creating new student object ...");
		Student tempStudent = new Student("Pauk", "Pauk", "paukpauk@email.com");
		Student tempStudent2 = new Student("MP", "Theinss", "mptheinss@email.com");
		Student tempStudent3 = new Student("Pauk", "Theinss", "pauktheinss@email.com");

		// save the student objects
		System.out.println("Saving the student ...");
		studentDAO.save(tempStudent);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
	}

	// private void createStudent(StudentDAO studentDAO) {
	// // create the student object
	// System.out.println("Creating new student object ...");
	// Student tempStudent = new Student("Pauk", "Pauk", "paukpauk@email.com");

	// // save the student object
	// System.out.println("Saving the student ...");
	// studentDAO.save(tempStudent);

	// // display id of the saved student
	// System.out.println("Saved student. Generated id: " + tempStudent.getId());
	// }

}