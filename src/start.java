import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class start {

	public static void main(String[] args)throws IOException {
		System.out.println("welcome to student management");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	while(true)
	{
		System.out.println("press 1 to ADD student");
		System.out.println("press 2 to DELETE student");
		System.out.println("press 3 to DISPLAY student");
		System.out.println("press 4 to EXIT APP");
		int c=Integer.parseInt(br.readLine());
		if (c==1)
		{
			System.out.println("enter student name");
			String name=br.readLine();
			System.out.println("enter student phone no");
			String phone=br.readLine();
			System.out.println("enter student city");
			String city=br.readLine();
			Student st =new Student(name,phone,city);
			boolean ans=StudentDao.insertStudentToDB(st);
			if (ans) {
				System.out.println("inserted successfully...");
			}else {
				System.out.println("Somethng went wrong....");
			}
			System.out.println(st.toString());
		}
		else if(c==2)
		{
			System.out.println("enter student id to delete student: ");
			int studid=Integer.parseInt(br.readLine());
			boolean ans=StudentDao.deleteStudentFromDB(studid);
			if (ans) {
				System.out.println("student deleted successfully..");
				}
			else {
				System.out.println("Something went wrong..");
			}
		}
		else if(c==3)
		{
			StudentDao.showAllStudents();
		}
		else if(c==4)
		{
			//exit
			break;
		}
		else
		{
			
		}
	}
	System.out.println("thank you for using my app\nsee you soon...");
	}

}
