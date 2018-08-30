package ch11;

import java.util.*;
import java.util.Map.Entry;

public class HashMap3 {
	static HashMap<String, HashMap<String, String>> phoneBook = 
					new HashMap<String, HashMap<String, String>>();
	public static void main(String[] args) {
		/* Map: HashMap, TreeMap */
		/* <key, value> pair 저장.
		 * HashMap 타입의 phoneBook을 생성한다.
		 * <group name, HashMap 객체>
		 * 이 group name과 쌍으로 저장되는 HashMap 객체에는
		 * <전화번호, 이름>의 쌍이 저장된다. 
		 */
		/*
		 * 1. HashMap phoneBook = new HashMap();
		 * phoneBook.get("친구");
		 * 첫 번째 요청의 경우, 얘가 리턴하는 값은 null이다. 
		 * 그 때는 phoneBook.put("친구", new HashMap());
		 * 두 번째 phoneBoo.get("친구") 부터는
		 * 첫 번째에서 넣어준 HashMap 객체가 반환될거다. 
		 * 그 객체에 <전화번호, 이름> 쌍을 put 해주면 된다. 
		 */
		addPhoneNo("친구", "이자바", "010-111-1111");
		addPhoneNo("친구", "김자바", "010-222-2222");
		addPhoneNo("친구", "김자바", "010-333-3333");
		addPhoneNo("회사", "김자바", "010-444-4444");
		addPhoneNo("회사", "김대리", "010-555-5555");
		addPhoneNo("회사", "박대리", "010-666-6666");
		addPhoneNo("회사", "이과장", "010-777-7777");
		addPhoneNo("세탁", "010-888-8888");
		printList();
		updatePhoneNo("친구", 
				"010-333-3333", "010-322-3232");
		// 도전과제: printPhoneNo("친구", "김자바");
		     // 010=2221=21
		     // 010 23443 4553
		
		// 도전과제: printPhoneNo("김자바");
			// 그룹이름  0101
			// 그룹이름2  000232ㄱ3
			// 그룹이름3  010212
		
		System.out.println("After update!!!");
		printList("친구");
//		removePhoneNo("회사", "010-444-4444");
		System.out.println("After remove!!!!");
		printList("회사");
		
		
		//printGroups();
		
		 printPhoneNo("친구", "김자바");
		 printPhoneNo("김자바");
		
	}
	
	static void printPhoneNo(String grpName, String name) {
		HashMap<String, String> hm = phoneBook.get(grpName);
		Set<Entry<String, String>> set = hm.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry<String, String> map = it.next();
			if (map.getValue().equals(name)) {
				System.out.println(name + " : " + map.getKey());
			}
		}
	}
	
	static void printPhoneNo(String name) {
		/*
		Set<Entry<String, HashMap<String, String>>> set = phoneBook.entrySet();
		Iterator<Entry<String, HashMap<String, String>>> it1 = set.iterator();
		
		while(it1.hasNext()) {
			Entry<String, HashMap<String, String>> entry = it1.next();
			
			String grpName = entry.getKey();
			
			HashMap<String, String> hm1 = entry.getValue();
			Set<Entry<String, String>> set1 = hm1.entrySet();
			Iterator<Entry<String, String>> it2 = set1.iterator();
			
			while (it2.hasNext()) {
				Entry<String, String> ent2 = it2.next();
				if(ent2.getValue().equals(name)) {
					System.out.println("[" + grpName + "] " + name + " : " + ent2.getKey());
					
				}
			}
			
		}*/
		Set<String> set = phoneBook.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String grpName = it.next();
			System.out.println("\n그룹:"+grpName);
			printPhoneNo(grpName, name);
		}
	}
	
	static void printGroups() {
		System.out.println("Group names.....");
		Set<String> set = phoneBook.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
	/*
	 * HashMap<String, String> h 
	 * 			= new HashMap<String, String>();
	 * HashMap에 저장되는 객체의 타입은 Map.Entry 이다. 
	 * 그런데, <key, value> 쌍의 타입이 <String, String>
	 * Generic을 사용해서 타입을 명시한다면
	 * HashMap에 저장되는 객체(h라 하면)의 타입은 
	 * Map.Entry<String, String>
	 * Set<Map.Entry<String, String>> s =  h.entrySet();
	 * Iterator<Map.Entry<String, String>> it = s.iterator();
	 * Map.Entry<String, String> e = it.next();
	 * e.getKey(); e.getValue();
	 * 
	 * HashSet set = new HashSet();
	 * Generic을 이용해서 표현하면, 
	 * 그리고 만약에 이 set에 저장되는 객체의 타입이 String 이라면
	 * HashSet<String> set = new HashSet<String>();
	 * Iterator<String> it = set.iterator();
	 * String s = it.next();
	 * 
	 */
	
	static void printList(String groupName) {
		/*
		 * groupName을 키로 phoneBook에서 
		 * HashMap 객체를 찾는다. 
		 * 그 객체의 entry를 다 찍어준다. 
		 */
		HashMap<String, String> group 
			= phoneBook.get(groupName);
		
		if(group==null) {
			System.out.println("그런 그룹은 없음!!!!");
			return;
		}
		Set<Map.Entry<String, String >> es 
					= group.entrySet();
		Iterator<Map.Entry<String, String>> it =
				es.iterator();
		while(it.hasNext()) {
			Map.Entry<String, String> e =
					it.next();
			System.out.println("name:"+e.getValue()
				+", poneNo:"+e.getKey());
		}
		System.out.println("################\n");
	}
	static void updatePhoneNo(String groupName, 
			 String oldTel, String newTel) {
		// groupName을 key 값으로 해서 그 group의 
		/* 전화번호를 저장하고 있는 HashMap 객체를 찾고
		 * 그 HashMap 객체에서 oldTel을 키값으로
		 * 그 대응되는 값을 가져온다(이름).
		 * oldTel을 키값으로 가지는 엔트리를 삭제한다. 
		 * <newTel, 이름>쌍을 HashMap에 put
		 */
		HashMap<String, String> phones 
					= phoneBook.get(groupName);
		String name = phones.get(oldTel);
		if(name == null) {
			System.out.println("그런 번호 없어!~");
			return;
		}
		phones.remove(oldTel);
		phones.put(newTel, name);
		
	}
	static void removePhoneNo(String groupName, String tel) {
		HashMap<String, String> h = phoneBook.get(groupName);
		//String name = h.get(tel);
		if(h.containsKey(tel) == false) {
			System.out.println("그런 번호 없어요!!!");
			return;
		}
		h.remove(tel);		
	}
	
	static void addGroup(String groupName) {
		if (phoneBook.containsKey(groupName)==false) {
		//if(phoneBook.get(groupName) == null) {
			phoneBook.put(groupName, new HashMap<String, String>());
		}
	}
	
	static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap<String, String> group =
				phoneBook.get(groupName);
		group.put(tel, name); 		
	}
	static void addPhoneNo(String name, String tel) {
		addPhoneNo("기타", name, tel); 		
	}
	
	static void printList() {
		Set<Map.Entry<String, HashMap<String, String>>> set 
						= phoneBook.entrySet();
		Iterator<Map.Entry<String, HashMap<String, String>>> it 
					= set.iterator();
		while(it.hasNext()) {
			Map.Entry<String, HashMap<String, String>> e 
						= it.next();
			HashMap<String, String> group = e.getValue();
			Set<Map.Entry<String, String>> phoneSet = group.entrySet();
			Iterator<Map.Entry<String, String>> phoneIt 
							= phoneSet.iterator();
			System.out.println(e.getKey()+"["+ phoneSet.size()+"]");
			while(phoneIt.hasNext()) {
				Map.Entry<String, String> p = phoneIt.next();
				String tel = p.getKey();
				String name = p.getValue();
				System.out.println(name+", "+tel);
			}
			System.out.println("\n");
		}
	}
}
