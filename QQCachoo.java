//Team CodeTillYouDrop: Colin Hosking, Aaron Li, Shruthi Venkata
//APCS02 pd08
//Lab02 -- All Hands on Deque!
//2018-04-20

public class QQCachoo<T> implements Deque<T> {

     private int _size;
     private DLLNode<T> _front; //considered the "first" element
     private DLLNode<T> _end; //considered the "last" element

     public QQCachoo() {
          _size = 0;
          _end = _front = new DLLNode<T>(null, null, null);
     }

     public int size() {
          return _size;
     }

     public boolean isEmpty() {
          return _size == 0;
     }

     public void addFirst(T inp) {
          DLLNode<T> temp = new DLLNode<T>(inp, null, null); //DLLNode to add
          if (this.isEmpty()) { //SPECIAL CASE if empty: _front and _end both point to temp
               _front = temp;
               _end = _front;
          } else {
               temp.setNext(_front); //set both pointers 
               _front.setPrev(temp);
               _front = temp;
          } _size++;//increment size 
     }

     public void addLast(T inp) {
          DLLNode<T> temp = new DLLNode<T>(inp, null, null);
          if (this.isEmpty()) { //SPECIAL CASE if empty: _front and _end both point to temp
               _front = temp;
               _end = _front;
          } else {
               temp.setPrev(_end);
               _end.setNext(temp);
               _end = temp;
          } _size++;//increment size 
     }

     public T removeFirst() {
          T ret = null;
          if (this.isEmpty()) return null; //SPECIAL CASE if empty: return null
          else {
               ret = _front.getCargo();
               _front = _front.getNext();
               _front.setPrev(null);
          } _size--; //decrement size 
          return ret;
     }

     public T removeLast() {
          T ret = null;
          if (this.isEmpty()) return null; //SPECIAL CASE if empty: return null
          else {
               ret = _end.getCargo(); //store cargo
               _end = _end.getPrev(); 
               _end.setNext(null);
          } _size--; //decrement size 
          return ret;
     }



}
