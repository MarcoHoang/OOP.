public class DateTest {
    public static void main(String[] args) {
        MyDate date = new MyDate();
        date = new MyDate(14, 03, 2000);
        date = new MyDate("15-03-2000");
        date = new MyDate("16/03/2000");
        date = new MyDate("17.03.2000");
        date = new MyDate("18 03 2000");

        date = new MyDate("first", "March", "twenty twenty-nine");
        date.print();
        MyDate date1 = new MyDate(1, 1, 2000);
        MyDate date2 = new MyDate(30, 12, 2000);
        // System.out.println(DateUtils.compare(date1, date2));

        MyDate[] dates = new MyDate[3];
        dates[0] = new MyDate(14, 03, 2000);
        dates[1] = new MyDate(16, 03, 2000);
        dates[2] = new MyDate(15, 03, 2000);

        DateUtils.sort(dates);
        DateUtils.print_arr(dates);

    }
}
