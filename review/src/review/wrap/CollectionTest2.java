package review.wrap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

public class CollectionTest2 {
	public static void main(String[] args) {
		ArrayList<MemberVO> list = new ArrayList<>();
		list.add(new MemberVO("100", "홍길동"));
		list.add(new MemberVO("103", "세종대왕"));
		list.add(new MemberVO("102", "제니"));

		// List -> Set
		Set<MemberVO> set;
		set.addAll(list);
		set.add
		
		// Set -> List
		
		// List<VO> 필드로 검색, 정렬
//		Collections.sort(list, new Comparator<MemberVO>() {
//
//			@Override
//			public int compare(MemberVO o1, MemberVO o2) {
//				return o1.getUserid().compareTo(o2.getUserid());
//			}			
//		});
		// id값을 기준으로
		Collections.sort(list, (MemberVO o1, MemberVO o2) -> //
		o1.getUserid().compareTo(o2.getUserid())//
		);

		System.out.println();
		
		//name값을 기준으로
		Collections.sort(list, (MemberVO o1, MemberVO o2) -> //
			o1.getUsername().compareTo(o2.getUsername())//
		);

		// 역순 reverse
		Collections.reverse(list);
		System.out.println(list);
		// 섞기 shuffle
		Collections.shuffle(list);
		System.out.println(list);
		
	}// end of main
}
