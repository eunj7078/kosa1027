
public class HoClass {
	// 계좌번호, 입금금액, 계좌주
	String owner;
	String num;
	int money;
	
	public void HoClass() {}
	public void HoClass(String num, String owner, int money) {
		this.num = num;
		this.owner = owner;
		this.money = money;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getOwner() {
		return owner;
	}
	public String getNum() {
		return num;
	}
	public int getMoney() {
		return money;
	}
}
