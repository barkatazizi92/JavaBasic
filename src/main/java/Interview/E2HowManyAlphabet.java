package Interview;

public class E2HowManyAlphabet {
    //Find out how many alpha characters are present in a string

    public void alphabet(String a ){
        int count =0;
        for (int i = 0; i<a.length(); i++){
            if(a.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        E2HowManyAlphabet e2HowManyAlphabet = new E2HowManyAlphabet();
        e2HowManyAlphabet.alphabet("How are you my lovely friend");
    }
    }

