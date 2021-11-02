import java.util.Calendar;
import java.util.Date;

public
class Task08 {

    public static void main(String[] args){



        Date date= new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int month = cal.get(Calendar.MONTH) + 1 ;
        int day = cal.get(Calendar.DAY_OF_MONTH) ;
        System.out.println(month);
        System.out.println(day);
//aaa
        int dayCounter = 0;
        for (int i = 0; i < month -1; i++){
            dayCounter += switch(i){
                case 0, 2, 4, 6, 7, 9 ,11 -> 31;
                case 3, 5, 8, 10 -> 30;
                case 1 -> 29;
                default -> 0;
            };
        }
        System.out.println(dayCounter);

}}
