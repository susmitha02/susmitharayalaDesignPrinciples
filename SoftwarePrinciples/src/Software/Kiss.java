package Software;
//import java.io.*;
//import java.lang.*;
public class Kiss extends Main {
 public String monthname(int month) throws Exception {
    if ((month < 1) || (month > 12)) throw new Exception("day must be in range 1 to 12");
    String[] months = {
        "January",
        "February",
        "March",
        "April",
        "May",
        "June",
        "July",
        "August",
        "September",
        "October",
        "November",
        "December"
    };
 
   return months[month - 1];
 }
    public String dayname(int day) throws Exception {
    if ((day < 1) || (day > 7)) throw new Exception("day must be in range 1 to 7");
     String[] days = {
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday",
            "Sunday"
        };
    
        return days[day - 1];
    
   // return months[month - 1];
}

}
