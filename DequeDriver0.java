public class DequeDriver0{

    //main method
    public static void main( String[] args ){
	Deque<String> d = new QQCachoo<String>();
	d.addFirst("first"); //first
	d.addFirst("second"); //second -> first
	d.addFirst("third"); //third -> second -> first
	d.addLast("fourth"); //third -> second -> first -> fourth
	d.addLast("fifth"); //third -> second -> first -> fourth -> fifth
	System.out.println(d);
	
	d.removeFirst();
	System.out.println(d); //second -> first -> fourth -> fifth
	d.removeLast();
	System.out.println(d); //second -> first -> fourth
	d.removeFirst();
	System.out.println(d); //first -> fourth
	d.removeLast();
	System.out.println(d); //first

	/*
	Deque<Integer> a = new QQCachoo<Integer>();
	Deque<Integer> b = new QQCachoo<Integer>();
	for (int i = 0; i < 10; i++) {
	    a.addFirst(i);
	    b.addFirst(i);
	}

	Integer valA = 1;
	Integer valB = 1;

	while (!a.isEmpty()) {
	    valA *= a.removeFirst();
	    System.out.println(valA);
	}
	while (!b.isEmpty()) {
	    valB *= b.removeFirst();
	    System.out.println(valB);
	}
	*/
    }
}
