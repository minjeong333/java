package java쪽지시험준비.Object.equals;

public class Member {
	String id;
	
	public Member(String id){
		this.id=id;
	}
	
	@Override
	public boolean equals(Object obj) {
		//1. 들어온 obj가 Member 타입인지 확인(형변환 가능 여부)
		if(obj instanceof Member) {
			Member target = (Member) obj; // 2.Member로 강제 형변환(Casting)

		//3. 내 id와 상대방(target)의 문자열이 같은지 비교
			if(this.id.equals(target.id)) {
				return true; //내용이 같으면 true!
			}
		}
		return false; // 그 외에는 모두 false
	}
}
