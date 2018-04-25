public class DequeTester2 {

    public static void main (String[] args) {

	QQCachoo<String> test = new QQCachoo<String>();

	System.out.println( "empty?: " + test.isEmpty() );
	
	test.addFirst("a");
	test.addLast("b");
	test.addLast("c");

	System.out.println( "empty?: " + test.isEmpty() );
	System.out.println("test: " + test);

	System.out.println( test.peekFront() + " str expected" );
	System.out.println( test.peekLast() + " str expected" );

	test.removeFirst();
	test.removeLast();

	System.out.println("test: " + test);
	test.removeFirst();
	System.out.println( "empty?: " + test.isEmpty() );
	    
    }

}
