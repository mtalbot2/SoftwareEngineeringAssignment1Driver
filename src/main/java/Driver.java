//import com.sun.tools.javac.code.Attribute;
import org.joda.time.DateTime;
import sun.security.pkcs11.Secmod;
import java.util.ArrayList;

public class Driver {
	
	public static void main(String[] args)
	{
		student s1 = new student("michael", 21, new DateTime(1997, 1, 1),11111);
		student s2 = new student("michael", 21, new DateTime(1999, 2, 2),22222);
		student s3 = new student("michael", 21, new DateTime(1996, 3, 3),33333);
		student s4 = new student("michael", 21, new DateTime(1998, 4, 4),44444);
		
		ArrayList<student> students = new ArrayList<student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		
		module softwareEngineering = new module("Software Engineering", "CT417", new ArrayList<student>());
		softwareEngineering.addStudent(s1);
		softwareEngineering.addStudent(s2);
		
		module telecommunications = new module("Telecommunications", "EE453", new ArrayList<student>());
		telecommunications.addStudent(s3);
		telecommunications.addStudent(s4);			
		
		module dsp = new module("Digital Signal Processing", "EE445", new ArrayList<student>());
		dsp.addStudent(s3);
		dsp.addStudent(s4);	
		
		module databases = new module("Database Systems", "CT230", new ArrayList <student>());
		databases.addStudent(s1);
		databases.addStudent(s2);
		
		course engineering = new course("Engineering", new DateTime(2017, 1, 1, 00, 00), new DateTime(2017, 12, 31, 00, 00), new ArrayList<module>());
		engineering.addModule(telecommunications);
		engineering.addModule(dsp);		
		
		course csit = new course("Computer Science", new DateTime(2018, 2, 2, 00, 00), new DateTime(2018, 2, 1, 00, 00), new ArrayList<module>());
		csit.addModule(softwareEngineering);
		csit.addModule(databases);
		
		for(student student : student)
		{
			System.out.println(student.name());
			System.out.println(student.getCourse().getName());
			for (module module : student.getModules())
			{
				System.out.println(module.getName() + "\t");
			}
			
		}
		
	}

}
