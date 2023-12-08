import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner getData = new Scanner(System.in);
        String[] lines = MorseCodeHashMap.mrs.split("\n");
        for (String line : lines) {
            char key = line.charAt(0);
            String value = line.substring(1);
            MorseCodeHashMap.morseCodeMap.put(key, value);
        }
        System.out.println("Enter message to see its morse Code");
        String message = getData.nextLine();
        message=message.toUpperCase();
        String res="";
        for(int i=0;i<message.length();i++)
        {
            try {
                if(message.charAt(i)==' '){
                    res=res.concat("     ");
                    continue;
                }
                String tmp= MorseCodeHashMap.morseCodeMap.get(message.charAt(i));
                res+=tmp.substring(0,tmp.length()-1)+" ";
            } catch (Exception e) {
                res=" unable to find morse code for "+message.charAt(i);
                break;
            }
        }
        System.out.println("Morse codes are taken from external site it might be wrong");
        System.out.println(res);
        getData.close();
    }
}