
public class usernamegenerator {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,0};
        String firstName = "Sushanth";
        String lastName = "kumar";
        String username = firstName.toLowerCase() + "." + lastName.toLowerCase();
        java.util.Random r = new java.util.Random();
        int randomIndex = r.nextInt(a.length);
        
        System.out.println("Generated Username is   ---->   " + username.replaceAll("[aeiouAEIOU]", "" ) + a[randomIndex]);
    }
    
}
