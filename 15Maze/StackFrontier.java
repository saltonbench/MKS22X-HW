import java.util.Stack;
public class StackFrontier implements Frontier{
    private Stack<Location> front;
    public StackFrontier(){
	front = new Stack<Location>();
    }
    public void add(Location x){
	front.push(x);
    }
    public Location next(){
	return front.pop();
    }
    public int size(){
	return front.size();
    }
    /* public static void main(String[]a){
	Location x = new Location(0,0,null,0,5,false);
	Location y = new Location(1,1,x,4,0,false);
	StackFrontier z = new StackFrontier();
	z.add(x);
	z.add(y);
	System.out.println(z.size());
	System.out.println(z.next());
	System.out.println(z.next());
	}*/
}
