//문제 : 아래가 실행되도록 해주세요.
//조건 : 배열을 사용할 수 없습니다.

class Main {
	public static void main(String[] args) {
		사람인력관리소 a사람인력관리소 = new 사람인력관리소();
		
		a사람인력관리소.add사람("홍길순", 33);
		// 나이가 33살인 1번째 사람(홍길순)이 추가되었습니다.
		a사람인력관리소.add사람("홍길동", 20);
		// 나이가 20살인 2번째 사람(홍길동)이 추가되었습니다.
		a사람인력관리소.add사람("임꺽정", 30);
		// 나이가 30살인 3번째 사람(임꺽정)이 추가되었습니다.
		
		사람 a사람1 = a사람인력관리소.get사람(1);
		a사람1.자기소개();
		// 저는 1번, 홍길순, 33살 입니다.
		
		사람 a사람2 = a사람인력관리소.get사람(2);
		a사람2.자기소개();
		// 저는 2번, 홍길동, 20살 입니다.
		
		사람 a사람3 = a사람인력관리소.get사람(3);
		a사람3.자기소개();
		// 저는 3번, 임꺽정, 30살 입니다.
	}
}
class 사람인력관리소{

	void add사람(String s, int n) {
    사람 a사람= new 사람();
		int a사람 = 0;
		System.out.printf("나이가 %s살인 %s번째 사람(%s)이 추가되었습니다.",n, a사람 ,s );
	}

	사람 get사람(int i) {
		
		return new 사람;
	}
}
class 사람{
	void 자기소개() {
		System.out.println("저는 %s번, %s, %s살 입니다.");
	}
}