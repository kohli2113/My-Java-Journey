package Feb05;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class DateAndTime {
    void oldDate(){ //older method to use date class
        Date d=new Date();
        System.out.println(d);
    }

    static void oldData(){}

    void newData(){ //we have localDate and LocalDateTime in newer versions of java and for that we import Java.time.LocalDate
        LocalDate ld=LocalDate.now();
        System.out.println("Current date:"+ld); //prints the current date only
//        usually displays in yyy-mm-dd
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println("Current date and time:"+ldt); //prints the current date and time

        System.out.println("Current year:"+ld.getYear()+"\nDay of month:"+ld.getDayOfMonth());
        System.out.println("plus:"+ld.plusDays(7));
        System.out.println("minus:"+ld.minusDays(450));

        LocalDate ldd=LocalDate.parse("2024-12-12");
        System.out.println(ldd);
        System.out.println("plusss:"+ldd.plusDays(17));

        //epoch time: when internet was created (01-01-1970)
        DateTimeFormatter dft= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String ldformat=ld.format(dft);
        System.out.println("formatted date:"+ldformat);
    }

    public static void main(String[] args) {
        DateAndTime obj=new DateAndTime();
        obj.oldDate();
        obj.newData();
//        DateAndTime.oldData();
    }
}
// there are limited features with date and time