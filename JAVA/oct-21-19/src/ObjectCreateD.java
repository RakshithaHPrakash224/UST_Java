
public class ObjectCreateD {
public static void main(String[] args) {
	BTM b = new BTM();
	b.swipe();
	int count = b.getCount();
	System.out.println("Count is " +count);
	int totalcount = b.getTotalCount();
	System.out.println("Total Count is " + totalcount);
}
}
