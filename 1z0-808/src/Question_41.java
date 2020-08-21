/*
 * NOT COMPLETED
 * Topic :
 * Code: 0
 */

public class Question_41 {
    public static void main(String args[]) {
        String model[] = {"Thomas", "Peter", "Joseph"};
        String sell[] = new String[3];
        int id = 0;
        try {
            for (String n : model) {
                sell[id] = n.substring(2, 6);
                id++;
            }
        } catch (Exception e) {
            System.out.println("Invalid model");
        }
        for (String s : sell) {
            System.out.println(s);
        }
    }
}


/*
 *
 * What is the result of the following code?
 *
 * a)
 * Invalid names
 *
 * b)
 * Invalid names
 * omas
 * null
 * null
 *
 * c)
 * Invalid names
 * omas
 *
 * d)
 * omas
 * ter
 * seph
 *
 * Answer :
 * b)
 * Invalid names
 * omas
 * null
 * null
 *
 * Explanation:
 *
 * Additional Explanation:
 *
 */
