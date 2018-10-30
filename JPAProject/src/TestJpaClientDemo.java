import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.cg.bean.Student;
import com.cg.dao.StudentDaoImpl;


public class TestJpaClientDemo {

	public static void main(String[] args)
	{
		StudentDaoImpl stoDao = new StudentDaoImpl();
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter roll No. : ");
		//int rn = sc.nextInt();
		System.out.println("Enter name: ");
		String nm = sc.next();
		
		Student st = new Student();
		//st.setRollNo(rn);
		st.setStuName(nm);
		Student stu = stoDao.addStudent(st);
		System.out.println("Data Inserted in the Table "+ stu);
		System.out.println("*****Reterive student base on roll no.*******");
		
		Student student=stoDao.getStuByRollNo(1);
		System.out.println(student);
		
		
		
		System.out.println("*****reterive all data*******");
		List<Student> stList=stoDao.getAllStudent();
		Iterator<Student> it = stList.iterator();
		System.out.println("RollNo\t\t\t STUNAME");
		System.out.println("____________________________________");
		
		while (it.hasNext()) {
			Student tempStu=it.next();
			System.out.println(tempStu.getRollNo() +"\t\t" + tempStu.getStuName());
			}
		
		/*System.out.println("**************Deleting the Data************");
		System.out.println(" delete 1 Roll No.");
		System.out.println("RecordDeleted for : " +stoDao.deleteStudent(1));
		*/
		System.out.println("*************Update Name *******************");
		Student st3=stoDao.updateStudentName(10, "Mahesh");
		System.out.println(" Updated :"+st3);
		
		
		
		
		
		
		
		
	}

}
