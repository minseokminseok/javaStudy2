package ex12inheritance;

//직사각형을 표현한 클래스
class Rectangle
{
	//맴버변수 : 가로, 세로길이
	private int width;
	private int height;
	
	//getter public 그리고 가지고 있는 type으로 반환된다.
	//private 맴버변수를 외부에서 반환받기 위한 getter선언
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	//생성자
     public Rectangle(int width, int height) {
    	 this.width = width;
    	 this.height = height;
     }
     
     /*부모클래스 */
     public void showAreaInfo() {
    	 System.out.println("직사각형 면적:"+width*height);
     }
} 
//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square extends Rectangle
{
	/* 정사각형은 밑변과 높이의 길이가 같으므로 하나의 
	 값으로 두개의 길이를 대체할 수 있다. */
	
	//맴버변수 : 여기서는 확장이 필요없다. 
	
	//생성자 : 하나의 값으로 2개를 초기화한다.
	public Square(int w) {
		super(w, w);
	}
	
	@Override //오버라이딩
	public void showAreaInfo() {//private라서 width나 super.width써도 안됨
		System.out.println("정사각형의면적:"+(getWidth()*super.getHeight()) );
	}
} 
class QuRectangleMain {
	public static void main(String[] args) {
	       	Rectangle rec = new Rectangle(4, 3);
	       	rec.showAreaInfo(); //출력문 일부아니고 좌측항 없음 

     		Square sqr = new Square(7);
	       	sqr.showAreaInfo();
 	}
}
