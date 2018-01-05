import java.util.Scanner;
public class CoolLogo2635 {
    public static void main(String args[]) {
         recurse();
    }
    
    
    public static void recurse() {
    Scanner sc = new Scanner(System.in);
         System.out.println("Please enter confirmation code to start the CoolLogo graphical system.");
         int i = sc.nextInt();
         if (i == 2635){
           int r;
           System.out.println("How many times do you want the logo displayed?");
            Scanner d = new Scanner(System.in);
            r = d.nextInt();
            logo(r);
         }
         else{
          recurse();
         }  
    }
    
     public static void logo(int r) {
       if (r > 0){
         System.out.println("      /-----\\     /-----\\     /-----\\     |------ ");
         System.out.println("     /       \\   /       \\           \\    |       ");
         System.out.println("              / /-----\\              /    \\       ");
         System.out.println("             / |       |      ------/      \\___   ");
         System.out.println("        ____/  |       |            \\           \\ ");
         System.out.println("       /       \\       /            /    |      / ");
         System.out.println("      /______   \\_____/     \\------/      \\____/  ");
         System.out.println("    Go Lake Monsters Robotics of Lake Oswego, Oregon");
         r = r - 1;
         logo(r);
       }
       else {
         System.out.println("Requested number of outputs reached. Resetting program.");
         recurse();
       }
     }
}
