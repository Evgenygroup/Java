package webinar.date ;
public class MyDate {
    int day=0;
    int month=0;
    int year=0;

    public MyDate(int day, int month, int year) {
        if (checkDate(day, month,year)) {
            this.day=day;
            this.month=month;
            this.year = year;
        }
    }

    boolean checkDate(int day, int month, int year) {

        return ((day>0)&&(month>0)&&(month<=12)&&(year>=0)&&(day<=dayByMonth(month, year)));
    }

    int dayByMonth(int month, int year) {
        int[] dayMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        if ((month<1)||(month>12)) return -1;
        if (month==2) return 28+ (isLeap(year)?1:0);
        return dayMonth[month-1];
    }


    boolean isLeap(int year) {
        if(year%4==0) {
            return !((year%100==0) &&(year%400 !=0));
        }
        return false;
    }

    void print() {
        System.out.println(day+"-"+month+"-"+year);
    }








    public static void main(String[] args) {
        MyDate d1= new MyDate(10, 12, 2018);
        MyDate d2= new MyDate(29, 2, 2019);
        d1.print();
        d2.print();
    }


}