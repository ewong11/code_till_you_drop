
public class QQCachoo<T> implements Deque<T> {

     private int _size;
     private DLLNode<T> _front;
     private DLLNode<T> _end;

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
          DLLNode<T> temp = new DLLNode<T>(inp, null, null);
          if (this.isEmpty()) {
               _front = temp;
               _end = _front;
          } else {
               temp.setNext(_front);
               _front.setPrev(temp);
               _front = temp;
          } _size++;
     }

     public void addLast(T inp) {
          DLLNode<T> temp = new DLLNode<T>(inp, null, null);
          if (this.isEmpty()) {
               _front = temp;
               _end = _front;
          } else {
               temp.setPrev(_end);
               _end.setNext(temp);
               _end = temp;
          } _size++;
     }

     public T removeFirst() {
          T ret = null;
          if (this.isEmpty()) return null;
          else {
               ret = _front.getCargo();
               _front = _front.getNext();
               _front.setPrev(null);
          } _size--;
          return ret;
     }

     public T removeLast() {
          T ret = null;
          if (this.isEmpty()) return null;
          else {
               ret = _end.getCargo();
               _end = _end.getPrev();
               _end.setNext(null);
          } _size--;
          return ret;
     }



}
