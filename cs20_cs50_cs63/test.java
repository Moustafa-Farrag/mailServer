package eg.edu.alexu.csd.datastructure.mailServer.cs20_cs50_cs63;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue s = new PriorityQueue();
		s.insert(10, 3);
		s.insert(9, 2);
		s.insert(8, 1);
		s.insert(7, 1);
		s.insert(6, 1);
         System.out.println(s.size());
		for (int i = 0; i < s.size()+10; i++) {
			System.out.println(s.min());
			s.removeMin();
		}
	}

}
