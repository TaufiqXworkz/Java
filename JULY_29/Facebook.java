public class Facebook{

	private String userName;
	private int password;
	private int noOfPost;
	private int noOfLike;
	private int noOfFriends;
	
	public Facebook(){
		System.out.println("The Facebook Details Are:");	
	}
	
	public Facebook(String userName,int password,int noOfPost,
					int noOfLike,int noOfFriends){
		this.userName=userName;
		this.password=password;
		this.noOfPost=noOfPost;
		this.noOfLike=noOfLike;
		this.noOfFriends=noOfFriends;	
	}
	
	public void setUserName(String userName){
		this.userName=userName;
	}
	
	public String getUserName(){
		return this.userName;
	}
	
	public void setPassword(int password){
		this.password=password;
	}
	
	public int getPassword(){
		return this.password;
	}
	
	public void setNoOfPost(int noOfPost){
		this.noOfPost=noOfPost;
	}
	
	public int getNoOfPost(){
		return this.noOfPost;
	}
	
	public void setNoOfLikes(int noOfLike){
		this.noOfLike=noOfLike;
	}
	
	public int getNoOfLikes(){
		return this.noOfLike;
	}
	
	public void setNoOfFriends(int noOfFriends){
		this.noOfFriends=noOfFriends;
	}
	
	public int getNoOfFriends(){
		return this.noOfFriends;
	}
}