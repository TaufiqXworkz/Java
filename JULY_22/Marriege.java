public class Marriege{

	public String name;
	public int age;
	public String qualification;
	public float height;
	
	public Marriege(String name,int age,String qualification,float height){
		this.name = name ;
		this.age =age;
		this.qualification=qualification;
		this.height=height;
	}
	
	public String getProfileDetails(String name){
		if(this.name==name){
			System.out.println("Name:"+name);
			return "Profile Found";
		}else{
			return "Profile not found";
		}
	}
	
	public String getProfileDetails(String name,int age){
		if(this.name==name && this.age==age){
			System.out.println("Name:"+name);
			System.out.println("Age:"+age);
			return "Profile Found";
		}else{
			return "Profile not found";
		}
		//
	}
	
	public String getProfileDetails(String name,int age,String qualification){
		if(this.age==age && this.qualification==qualification){
			System.out.println("Name:"+name);
			System.out.println("Age:"+age);
			System.out.println("qualification:"+qualification);
			return "Profile Found";
		}else{
			return "Profile not found";
		}
	}
	
	public String getProfileDetails(String name,int age,String qualification,float height){
		if(this.qualification==qualification && this.height==height){
			System.out.println("Name:"+name);
			System.out.println("Age:"+age);
			System.out.println("qualification:"+qualification);
			System.out.println("Height:"+height);
			return "Profile Found";
		}else{
			return "Profile not found";
		}
	}

}