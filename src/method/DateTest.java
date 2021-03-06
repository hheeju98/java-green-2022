package method;

class Date {
    private int year;
    private String month;
    private int day;

    public void setDate(int y, String m, int d) {
        month = m;
        day = d;
        year = y;
    }

    public void printDate() {
        System.out.println(year + "년" + month + " " + day + "일");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int y) {
        year = y;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String m) {
        month = m;
    }
}

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        date.setDate(2009, "3월", 2);
        date.printDate();
        date.setYear(2010);
        date.printDate();
    }

}
