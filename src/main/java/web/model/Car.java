package web.model;

public class Car {
    private int id;
    private String mark;
    private int series;

    public Car() {

    }
    public Car(int id, String mark, int series) {
        this.id = id;
        this.mark = mark;
        this.series = series;
    }

    public String getMark() {
        return mark;
    }
    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car Info: " +
                "id = " + id +
                ", mark = " + mark +
                ", series = " + series;
    }
}
