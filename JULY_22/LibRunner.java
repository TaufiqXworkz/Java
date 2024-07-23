public class LibRunner{

public static void main(String args[]){

Lib lib_info = new Lib();

lib_info.info();
lib_info.info(850,"Thermodynamics");
lib_info.info(15000L,850,"Thermodynamics");
lib_info.info(15000L,850,"Thermodynamics",true);



}


}