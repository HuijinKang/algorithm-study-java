package study;

import java.util.*;

public class Collection {
    public static void main(String[] args) {

        Set hashSet = new HashSet();
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(2);
        hashSet.add(1);
        hashSet.add(5);
        hashSet.add(15);
        hashSet.add(8);
        System.out.println("HashSet : " + hashSet);

        Set treeSet = new TreeSet();
        TreeSet<Integer> testTreeSet = new TreeSet<>(Arrays.asList(1,2,3)); // 초기값 지정;
        System.out.println(treeSet.add(3));
        System.out.println(treeSet.add(3));
        treeSet.add(4);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(5);
        treeSet.add(15);
        treeSet.add(8);
        System.out.println("TreeSet : " + treeSet);

        Iterator iter = treeSet.iterator();	// Iterator 사용
        while(iter.hasNext()) {//값이 있으면 true 없으면 false
            System.out.println(iter.next());
        }

        List list = new ArrayList();
        list.add("c");
        list.add("a");
        list.add("a"); // 중복 가능
        System.out.println("List : " + list);

        Stack stack = new Stack();
        stack.add("a");
        stack.add("b");
        stack.add("c");
        System.out.println("Stack : " + stack.pop() + stack.pop() + stack.pop()); // LIFO

        Queue queue = new LinkedList();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        System.out.println("Queue : " + queue.peek());
        System.out.println("Queue : " + queue.poll() + queue.poll() + queue.poll()/* + queue.poll()*/); // FIFO

        Map map = new HashMap();
        map.put(1, 1);
        map.put("둘", 2);
        System.out.println("Map : " + map);
    }
}
