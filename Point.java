import java.util.Comparator;
import edu.princeton.cs.algs4.StdDraw;

public class Point implements Comparable<Point>{
    
    private final int x; 
    private final int y; 


    public Point(int x, int y){

        this.x = x; 
        this.y = y; 
    }

    public void draw(){

        StdDraw.point(x,y); 
    }

    public void drawTo(Point that){

        StdDraw.line(this.x, this.y, that.x, that.y)
    }

    public double slopeTo(Point that){
if(x == that.x && y ==- that.y) return Double.NEGATIVE_INFINITY;
if(x == that.x) return Double.POSITIVE_INFINITY; 
if(y == that.y) return + 0.0; 
return (double) (that.y - y) / (that.x -x );  

    }
    public int compareTo(Point that) {
        if (y < that.y) return -1;
        if (y > that.y) return +1;
        if (x < that.x) return -1;
        if (x > that.x) return +1;
        return 0;
    }

    public Comparator<Point> slopeOrder() {
        return new Comparator<Point>() {

            @Override
            public int compare(Point o1, Point o2) {
                if (slopeTo(o1) < slopeTo(o2)) return -1;
                if (slopeTo(o1) > slopeTo(o2)) return +1;
                return 0;
            }
            
        };
    }
    public String toString() {
        /* DO NOT MODIFY */
        return "(" + x + ", " + y + ")";
    }   

    public static void main(String[] args) {
        /* YOUR CODE HERE */
    }
}
