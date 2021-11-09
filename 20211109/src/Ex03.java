
public class Ex03 {
	int first;
	int second;
	int result;
	public void setData(int first, int second) {
		this.first = first; //this가 붙으면 멤버필드, 안붙으면 매개변수
		this.second = second;
	}
	
	public void setFrist(int first) {
		this.first = first;
	}
	
	public void setSecond(int second) {
		this.second = second;
	}//setter
	
	public int getFrist() {
		return this.first;
	}//getter
	
	public int getSecond() {
		return this.second;
	}
	
	public void add() {
		this.result = this.first + this.second;
	}
	
	public void sub() {
		this.result = this.first - this.second;
	}
}
