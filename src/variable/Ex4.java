package variable;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();  //줄바뀜
		System.out.print(" "); //줄 안바뀜
		System.out.printf("%d\n", 12345);
		
		String s1 = "JAVA";
		String s2 = "프로그래밍";
		System.out.println(s1+" "+s2);
		System.out.printf("%s %s\n",s1,s2);
		
		String name = "손정민";
		int age = 25;
		System.out.printf("안녕하세요 제 이름은 %s 입니다.\n제 나이는 %d입니다",name, age);
		System.out.println();
		System.out.println("=====================================================");
		
		System.out.println("안녕하세요 제 이름은 " + name +" 입니다.");
		System.out.println("제 나이는 " +age+"입니다");
		System.out.println("=====================================================");
		
		System.out.println("안녕하세요 제 이름은 " + name +" 입니다.\n제 나이는 "+age+"입니다");
	
		
	}

}
