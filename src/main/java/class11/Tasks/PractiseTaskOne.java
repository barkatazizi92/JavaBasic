package class11.Tasks;
/*
/*create a String and if the String is not empty perform the following:
if the String has an odd number of characters and has 4 or more characters,
print the characters in the meddle of the string.
for example: String str= getAJob=>l
 */
public class PractiseTaskOne {
    public static void main(String[] args) {
        String job="getAJob";
        if(!job.isEmpty()){
            if(job.length()%2!=0 && job.length()>4){
                int medIndex= job.length()/2;
                System.out.println(job.charAt(medIndex));
            }
        }
    }
}
