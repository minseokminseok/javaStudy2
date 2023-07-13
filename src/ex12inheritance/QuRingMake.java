package ex12inheritance;

class Point{
	//맴버변수 : 중심점 표현을 위해 x,y 좌표값 설정
	int xDot, yDot;
	//생성자
	public Point(int x, int y) {
		xDot = x;
		yDot = y;
	}
	//맴버변수인 좌표값을 출력
	public void showPointInfo() {
		System.out.println(" [x좌표: "+xDot+" ,y좌표"+yDot+ "  ]");
	}
}

//Point 클래스를 기반으로 원(Circle)클래스 표현하기
class Circle{
	//맴버변수 
	int radian; //반지름
	Point center;
	
}
