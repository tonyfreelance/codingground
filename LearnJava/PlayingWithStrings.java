public class PlayingWithStrings {
    public static void main(String[] args) {
        
        String hello = "Hello, World";
        System.out.println(hello);
        
        // Add an ! to the end
        hello = hello + "!";
        System.out.println(hello);
        
        // Extract the word "Hello" from the String
        // i.e. starting at the beginning (0) for 5 characters
        String justHello = hello.substring(0,5);
        System.out.println(justHello);
        
        // Add some trailing spaces and then remove them with trim()
        hello = hello + "     ";
        hello = hello.trim();
        
        // Now output the string all in UPPERCASE and lowercase
        System.out.println(hello.toUpperCase());
        System.out.println(hello.toLowerCase());
    }
}