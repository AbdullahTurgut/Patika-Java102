package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkList {
    public static void main(String[] args) {
        // FIFO -> ilk giren ilk çıkar
        /*
        element() : Kuyruğun başındaki öğeyi verir, ama onu kuyruktan atmaz.
        add(eleman): Parametrede verilen elemanı kuyruğa ekler. İşlemin başarısız olması durumunda hata fırlatır.
        offer(eleman): Parametrede verilen elemanı kuyruğa ekler. İşlemin başarısız olması durumunda null döner.
        poll(): Kuyruğun başındaki elemanı kuyruktan çıkartır.
        peek(): Kuyrukta sıradaki elemana ulaşmak için kullanılır.
        */

        // polymorphism
        Queue<String> q = new LinkedList<>();
        q.add("Mustafa");
        q.add("Çetindag");
        q.offer("Patika");

        q.remove("Çetindag");// default olarak kuyruk başındaki elemanı siler (Mustafa bu örnekte)

        Iterator<String> itr = q.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
