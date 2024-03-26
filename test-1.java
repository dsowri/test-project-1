public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Jenkins and SonarQube!");
        
        // Simulate a change
        int a = 5;
        int b = 0; // Introducing division by zero vulnerability
        
        // Division operation without checking for division by zero
        int divisionResult = a / b;
        
        System.out.println("Division Result: " + divisionResult);
    }
}


