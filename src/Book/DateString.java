import acm.program.ConsoleProgram;

public class DateString extends ConsoleProgram {

    public void run() {
        println(dateString(7, 11, 1987));
        println(dateString(23, 8, 1981));
        println(dateString(12, 5, 2012));
    }

    /* Returns date string. Does not check if date is valid. */
    private String dateString(int day, int month, int year) {
        String monthStr;
        switch (month) {
            case 1:  monthStr = "Jan";
                break;
            case 2:  monthStr = "Feb";
                break;
            case 3:  monthStr = "Mar";
                break;
            case 4:  monthStr = "Apr";
                break;
            case 5:  monthStr = "May";
                break;
            case 6:  monthStr = "Jun";
                break;
            case 7:  monthStr = "Jul";
                break;
            case 8:  monthStr = "Aug";
                break;
            case 9:  monthStr = "Sep";
                break;
            case 10: monthStr = "Oct";
                break;
            case 11: monthStr = "Nov";
                break;
            case 12: monthStr = "Dec";
                break;
            default: return "Invalid month";
        }
        return day + "-" + monthStr + "-" + (year % 100);
    }

}
