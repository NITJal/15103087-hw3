import java.util.Scanner;

public class PGAdmission {
	
	public static void main(String[] args) {
	PGAdmission p=new PGAdmission();
	Details d= p.new Details();
	d.getDetails();
	}
	
class Details{
	
String name,email,address,rollno;
double HSCmarks,UGmarks;
public void getDetails(){
Scanner sc=new Scanner(System.in);
try{
System.out.println("Enter name");

name=sc.nextLine();
for (int i = 0; i < name.length(); i++) {
    char charAt2 = name.charAt(i);
    if (!Character.isLetter(charAt2)) {
     throw new Exception("Invalid name");   
    }
}}
catch (Exception e1){
	System.out.println("Enter valid name ");
	System.exit(-1);
}

System.out.println("Enter email ID: ");
email=sc.nextLine();
System.out.println("Enter address: ");
address=sc.nextLine();

     try {
          System.out.println("Enter 5-digit roll no.: ");
          int inputInt = 0;
          rollno=sc.nextLine();
             inputInt = Integer.parseInt(rollno);
             if(String.valueOf(inputInt).length()!=5)
            	 throw new Exception("Invalid roll no.");
          } catch (Exception e)
          {
             System.out.println("Wrong input. Enter valid roll no. ");
             System.exit(-1);
          }
   

try{
	System.out.println("Enter HSC%: ");
	HSCmarks=sc.nextDouble();
    if(HSCmarks <= 0.0 || HSCmarks >= 100.0){
        throw new NumberFormatException("Not a valid Percentage");
    }
}
catch(Exception e11){
System.out.println("Enter valid percentage ");
System.exit(-1);
}
try{
	System.out.println("Enter UG%: ");
	UGmarks=sc.nextDouble();

    //This is required to check that number is a valid Percentage value
    if(UGmarks <= 0.0 || UGmarks >= 100.0){
        //You will have to create this custom exception or throw a simple exception
        throw new NumberFormatException("Not a valid Percentage");
    }
}
catch(Exception e){
System.out.println("Enter valid percentage ");
System.exit(-1);
}
checkEligibility();
}

private void checkEligibility(){
if(0.6*HSCmarks+0.7*UGmarks>=65)
	System.out.println("Your agreggate marks are greater than 65. Admission granted!");
else
	System.out.println("Aggregate marks less than 65.Admission denied");
}
}
}




