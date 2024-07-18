/* 6 classes, in each class
-> Declare 10 instance variables
-> Achieve constructor overloading
ex: need to write a constructor with
0 argument,1 argument, 2 argument till 10 argument
*/

public class School{

	public String name;
	public int teacher;
	public int classes;
	public long students;
	public float percentage;// overall percentage
	public boolean isGood ;
	public char grade;
	public double salary;
	public int schoolBuses;
	public String headMaster;
	
	public School(String name){
		this.name = name;
		System.out.println(name);
	}
	
	public School(String name, int teacher ){
		this.name = name;
		this.teacher= teacher;
		System.out.println(name+" "+teacher);
	}
	
	public School(String name, int teacher,int classes ){
		this.name = name;
		this.teacher= teacher;
		this.classes=classes;
		System.out.println(name+" "+teacher+" "+classes);
	}
	
	public School(String name, int teacher,int classes,long students ){
		this.name = name;
		this.teacher= teacher;
		this.classes=classes;
		this.students=students;
		System.out.println(name+" "+teacher+" "+classes+" "+students);
	}
	
	public School(String name, int teacher,int classes,long students,float percentage ){
		this.name = name;
		this.teacher= teacher;
		this.classes=classes;
		this.students=students;
		this.percentage =percentage;
		System.out.println(name+" "+teacher+" "+classes+" "+students+" "+percentage);
	}
	
	public School(String name, int teacher,int classes,long students,float percentage,boolean isGood ){
		this.name = name;
		this.teacher= teacher;
		this.classes=classes;
		this.students=students;
		this.percentage =percentage;
		this.isGood=isGood;
		System.out.println(name+" "+teacher+" "+classes+" "+students+" "+percentage+" "+isGood);
	}
	
	public School(String name, int teacher,int classes,long students,float percentage,boolean isGood,char grade){
		this.name = name;
		this.teacher= teacher;
		this.classes=classes;
		this.students=students;
		this.percentage =percentage;
		this.isGood=isGood;
		this.grade=grade;
		System.out.println(name+" "+teacher+" "+classes+" "+students+" "+percentage+" "+isGood+" "+grade);
	}
	
	public School(String name, int teacher,int classes,long students,float percentage,boolean isGood,char grade,double salary){
		this.name = name;
		this.teacher= teacher;
		this.classes=classes;
		this.students=students;
		this.percentage =percentage;
		this.isGood=isGood;
		this.grade=grade;
		this.salary=salary;
		System.out.println(name+" "+teacher+" "+classes+" "+students+" "+percentage+" "+isGood+" "+grade+" "+salary);
	}
	
	public School(String name, int teacher,int classes,long students,float percentage,boolean isGood,char grade,double salary,int schoolBuses){
		this.name = name;
		this.teacher= teacher;
		this.classes=classes;
		this.students=students;
		this.percentage =percentage;
		this.isGood=isGood;
		this.grade=grade;
		this.salary=salary;
		this.schoolBuses=schoolBuses;
		System.out.println(name+" "+teacher+" "+classes+" "+students+" "+percentage+" "+isGood+" "+grade+" "+salary+ " "+schoolBuses);
	}
	
	public School(String name, int teacher,int classes,long students,float percentage,boolean isGood,char grade,double salary,int schoolBuses,String headMaster){
		this.name = name;
		this.teacher= teacher;
		this.classes=classes;
		this.students=students;
		this.percentage =percentage;
		this.isGood=isGood;
		this.grade=grade;
		this.salary=salary;
		this.schoolBuses=schoolBuses;
		this.headMaster=headMaster;
		System.out.println(name+" "+teacher+" "+classes+" "+students+" "+percentage+" "+isGood+" "+grade+" "+salary+ " "+schoolBuses+" "+headMaster );
	}
	
}