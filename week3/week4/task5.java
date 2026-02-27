import java.util.*;

class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        String period = s.substring(8);
        int hour = Integer.parseInt(s.substring(0,2));
        
        if(period.equals("AM")){
            if(hour == 12) hour = 0;
        } else {
            if(hour != 12) hour += 12;
        }
        
        System.out.printf("%02d%s\n", hour, s.substring(2,8));
    }
}