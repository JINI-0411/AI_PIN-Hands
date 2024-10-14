package exam02;

public class Schedule {

    private int year;
    private int month;
    private int day;
// 통제가 안되면 무조건 막아야함

    public void setYear(int _year) {
        year = _year;
    }

    public int getYear() {
        return year;
    }


    public void setMonth(int _month) {
        month = _month;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int _day) {
        if (month == 2 && _day > 28) { // 통제가능
            _day = 28;
        }

        day = _day; // day 위아래로 코드를 넣어서 통제를 할 수 가 있음
    }

    public int getDay() {

        return day;
    }

    void showDate() {
        System.out.printf("year=%d, month=%d, day=%d%n", year, month, day);

    }
}
