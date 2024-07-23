public class SubjectsRunner{

public static void main(String args[]){

Subjects subjects_info = new Subjects();

subjects_info.sub();
subjects_info.sub(850,"Thermodynamics");
subjects_info.sub(15000L,850,"DesignOfMechanics");
subjects_info.sub(15000L,850,"Java",true);



}


}