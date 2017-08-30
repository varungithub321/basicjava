
public class Application {

	public static void main(String[] args) {
		int age = 15;
		if(age < 13) {
			System.out.print("You are a kid.");
			
		}
		else if(age >=13 && age <= 19){
			System.out.println("You are a teen.");
			
		}
		else if(age >= 20 && age <= 60) {
			System.out.println("You are an adult.");
		}
		else if(age > 60){
			System.out.println("You are a senior citizen.");
		}
		
		

	}

}
