import java.util.*;
import java.util.jar.Attributes.Name;
public class priorityqueue {
    static class Student implements Comparable<Student>{
        int rank;
        String name;

        public Student(String name, int rank){
            this.name= name;
            this.rank=rank;
        }
    
    @Override
    public int compareTo(Student s2){
        return this.rank - s2.rank;
    }
}
  public static void main(String args[]) {
    PriorityQueue<Student> pq= new PriorityQueue<>();
    pq.add(new Student("A", 3));
    pq.add(new Student("R", 10));
    pq.add(new Student("C", 1));
    pq.add(new Student("D", 6));

     while(!pq.isEmpty()){
        System.out.println(pq.peek().name + " -> " + pq.peek().rank);
        pq.remove();
     }
    
  }  
    
}
