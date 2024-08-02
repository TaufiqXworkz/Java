public class FacebookRunner{

	public static void main(String args[]){
	
		Facebook fb1= new Facebook();
		
		Facebook fb2 = new Facebook("Taufiq_Raza",1234,8,500,10);
		
		fb1.setUserName("RAZA");
		System.out.println("User Name is:"+fb1.getUserName());
		
		fb1.setPassword(7676);
		System.out.println("Password is:"+fb1.getPassword());
		
		fb1.setNoOfPost(10);
		System.out.println("Post:"+fb1.getNoOfPost());
		
		fb1.setNoOfFriends(100);
		System.out.println("Friends:"+fb1.getNoOfFriends());
		
		fb1.setNoOfLikes(55);
		if(fb1.getNoOfLikes()>50 && fb1.getNoOfLikes()<200){
		System.out.println("User Name:"+fb1.getUserName());
		}else{
			System.out.println("No User Found");
			}
		
		if(fb1.getUserName() == "RAZA" && fb1.getPassword()==7676){
			System.out.println("User Name:"+fb1.getUserName());
			System.out.println("Password is:"+fb1.getPassword());
			System.out.println("Post:"+fb1.getNoOfPost());
			System.out.println("Friends:"+fb1.getNoOfFriends());
			System.out.println("Likes:"+fb1.getNoOfLikes());
		}else{
			System.out.println("User Not Found");
		}
		
	
	}

}