public class PayRoleRunner{
public static void main(String[] args){
	System.out.println(Onedrive.storage());
	System.out.println(Onedrive.storage("TAUFIQ"));
	System.out.println(Onedrive.storage(64000,"TAUFIQ"));
	System.out.println(Onedrive.storage("Taufiq@gmail.com",64000,"Microsoft cloud"));
	System.out.println(Onedrive.storage(93568688363L,"Taufiq@gmail.com",64,"Microsoft cloud"));
	System.out.println(Onedrive.storage(20,93568688363L,"Taufiq@gmail.com",64,"Microsoft cloud"));
	System.out.println(Onedrive.storage(24,20,93568688363L,"Taufiq@gmail.com",64,"Microsoft cloud"));
	System.out.println(Onedrive.storage(35.0f,24,20,93568688363L,"Taufiq@gmail.com",64,"Microsoft cloud"));
	System.out.println(Onedrive.storage("Monday",35.0f,24,20,93568688363L,"Taufiq@gmail.com",64,"Microsoft cloud"));
	System.out.println(Onedrive.storage(10.0f,"Monday",35.0f,24,20,93568688363L,"Taufiq@gmail.com",64,"Microsoft cloud"));
	System.out.println(Onedrive.storage("PDF",10.0f,"Monday",35.0f,24,20,93568688363L,"Taufiq@gmail.com",64,"Microsoft cloud"));
}
}
