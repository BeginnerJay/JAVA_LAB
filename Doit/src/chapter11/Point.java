package chapter11;
// 원점을 의믜하는 Point 클래스
public class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x = " + x + "," + "y = " + y;
    }
}
