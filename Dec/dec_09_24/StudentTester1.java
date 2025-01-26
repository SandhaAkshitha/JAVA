package dec_09_24;

abstract class Student1{
	protected String studentName;
	protected String studentClass;
	protected static int totalNoOfStudents;
	public Student1()
	{	
	}
	public Student1(String studentName, String studentClass) {
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
		totalNoOfStudents++;
	}
	public abstract int getPercentage();
	public static int getTotalNoStudents()
	{
		return totalNoOfStudents;
	}
}
class ScienceStudent1 extends Student1{
	private int physicsMarks;
	private int chemistryMarks;
	private int mathsMarks;
	
	public ScienceStudent1(String studentName, String studentClass, int physicsMarks, int chemistryMarks,
			int mathsMarks) {
		super(studentName, studentClass);
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}
				@Override
	public int getPercentage()
	{
		 int  percentage =(physicsMarks+chemistryMarks+mathsMarks)/3; 
		 return percentage;
	}
		@Override
		public String toString() {
			return "ScienceStudent [physicsMarks=" + physicsMarks + ", chemistryMarks=" + chemistryMarks
					+ ", mathsMarks=" + mathsMarks + "]";
		}	
}
class HistoryStudent1 extends Student1{
	 private int historyMarks;
	 private int civicsMarks;
	
	 public HistoryStudent1(String studentName, String studentClass, int historyMarks, int civicsMarks)
	 {
		super(studentName, studentClass);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}
	@Override
	 public int getPercentage()
	 {
		 int percentage = (historyMarks+civicsMarks)/2;
		 return percentage;
	 }
	@Override
	public String toString() {
		return "HistoryStudent [studentName=" + studentName + ", studentClass=" + studentClass + ", historyMarks="
				+ historyMarks + ", civicsMarks=" + civicsMarks + "]";
	}
}
public class StudentTester1{
	public static void main(String[] args)
	{
		ScienceStudent1 ss = new ScienceStudent1("Nirosha", "Btech", 20, 30, 40);
		System.out.println(ss);
		System.out.println(+ss.getPercentage()+"%");
		System.out.println("............................");
		HistoryStudent1 hs = new HistoryStudent1("Nirosha", "Btech", 50, 60);
		System.out.println(hs);
		System.out.println(hs.getPercentage()+"%");
		System.out.println("Total No of Student :"+Student1.totalNoOfStudents);
		
	}
}


//ScienceStudent [physicsMarks=20, chemistryMarks=30, mathsMarks=40]
//ScienceStudent percentage :30%
//............................
//HistoryStudent [studentName=Nirosha, studentClass=Btech, historyMarks=50, civicsMarks=60]
//HistoryStudent :55%
//Total No of Student :2
