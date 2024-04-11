package class11.Tasks;
/*create a String and if the String is not empty perform the following:
if the String has an odd number of characters and has 3 or more characters,
print the characters in the meddle of the string.
for example: String str= hello=>l
 */

public class Task1 {
    public static void main(String[] args) {
        String str = "Hello";
        if (!str.isEmpty()){
            if (str.length()%2!=0 && str.length()>3){
                int medIndex = str.length()/2;
                System.out.println(str.charAt(medIndex));
            }
        }
    }
}
