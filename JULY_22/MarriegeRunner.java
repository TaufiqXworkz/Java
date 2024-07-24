public class MarriegeRunner{
	public static void main(String args[]){
		
		Marriege taufiq= new Marriege("TAUFIQ",23,"CS",5.5f);
		taufiq.getProfileDetails("TAUFIQ");
		taufiq.getProfileDetails("TAUFIQ",23);
		taufiq.getProfileDetails("Ganesh",23,"CS");
		taufiq.getProfileDetails("TAUFIQ",23,"CS",5.5f);
		
	}

}