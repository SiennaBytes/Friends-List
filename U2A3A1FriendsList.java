
package u2a3a1friendslist.u2a3a1friendslist;

// @author Sienna

import java.util.Scanner;


public class U2A3A1FriendsList {
    public static void main(String[] args) {
        
        // allows the user to enter names
        Scanner keyedInput = new Scanner (System.in);
        
        // required variable
        String [] friends = new String [5];
        
        // User enters five names
        System.out.println("Enter the names of five friends:");
        for (int i = 0; i <= 4; i = i + 1)
        {
            friends[i] = keyedInput.nextLine();
        }
        // outputs the second, third and fourth name entered by the user
        System.out.println("The second, third and fourth names listed were:");
        System.out.println("Second: " + friends[1]);
        System.out.println("Third: " + friends[2]);  
        System.out.println("Fourth: " + friends[3]);  
    }
}
