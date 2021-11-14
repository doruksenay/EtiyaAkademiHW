package homework3;

public class Main {

	public static void main(String[] args) {
		MyHashMap<Integer, String> friends = new MyHashMap<Integer, String>();

		String[] values = {"doruk", "ali", "veli"};
		Integer[] keys = {26, 27, 35};

		friends.put(26, "doruk");
		friends.put(27, "ali");
		friends.put(35, "veli");
		System.out.println(friends.size());
		
		friends.print();
		
//		friends.clear();
		
//		System.out.println(friends.get(26));
//		System.out.println(friends.getIndex(35));
//		friends.remove(35);
//		friends.print();
//		friends.remove(27);
		friends.print();
		friends.remove(26);
		
		System.out.println(friends.size());
		
		friends.print();
		
		
		
		


	}

}
