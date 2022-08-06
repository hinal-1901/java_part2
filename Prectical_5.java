import java.util.*;;
	

	public class Prectical_5 {
	    public static void main(String[] args) {
	        Scanner Obj_sc = new Scanner(System.in);
	        String Stu_name, Stu_roll, Stu_branch, Pro_name, Pro_degree;
	        int experience;
	        long salary;
	        System.out.println("Enter Student's Information");
	        System.out.print("Enter Name of student : ");
	        Stu_name = Obj_sc.next();
	

	        System.out.print("Enter Roll no of student : ");
	        Stu_roll = Obj_sc.next();
	

	        System.out.print("Enter Branch student studies in : ");
	        Stu_branch = Obj_sc.next();
	

	        System.out.println("Enter Faculty Information");
	

	        System.out.print("Enter Name of professor : ");
	        Pro_name = Obj_sc.next();
	

	        System.out.print("Enter Degree of professor : ");
	        Pro_degree = Obj_sc.next();
	

	        System.out.print("Enter Experience of teaching : ");
	        experience = Obj_sc.nextInt();
	

	        System.out.print("Enter His/her salary : ");
	        salary = Obj_sc.nextLong();
	

	        System.out.println("**********************************");
	        System.out.println("Information of Student : ");
	

	        Student.information(Stu_roll, Stu_name, Stu_branch);
	        System.out.println("**********************************");
	

	        System.out.println("Information of professor : ");
	        Student.information(Pro_name, Pro_degree, experience, salary);
	    }
	

	    public class Student {
	        public static void information(String roll_no, String name, String branch) {
	            System.out.println("The name of the Student is  :" + name);
	            System.out.println("The roll no of the student is  " + roll_no);
	            System.out.println(name + " studies in " + branch);
	        }
	

	        public static void information(String name, String degree, int experience, long salary) {
	            System.out.println("Name of the professor is  :" + name);
	            System.out.println(name + " has compleated " + degree);
	            System.out.println(name + "have " + experience + " years of teaching");
	            System.out.println(name + " has been given " + salary + " rs of salary per year");
	        }
	

	    }
	}
