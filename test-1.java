public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Jenkins and SonarQube!");
        
        // Simulate a change
        int a = 5;
        int b = 0; // Introducing division by zero vulnerability
        int divisionResult = 0;
        
        if (b != 0) {
            divisionResult = a / b;
        }
        
        System.out.println("Division Result: " + divisionResult);
    }
}

