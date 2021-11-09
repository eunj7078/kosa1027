
public class Board {
	//번호, 제목, 글쓴이, 내용, 글쓴이의 ip주소, 방문자 수
	//멤버 필드
	int num;
	String subject;
	String writer;
	String content;
	String ip;
	int readCount;
	//생성자
	public Board() {}
	public Board(int num, String subject, String writer, String content, String ip, int readCount) {
		this.num = num;
		this.subject = subject;
		this.content = content;
		this.writer = writer;
		this.ip = ip;
		this.readCount = readCount;
	}
	//setter
	public void setWriter(String writer){
		this.writer = writer;
	}
	public void setIp(String ip){
		this.ip = ip;
	}
	public void setContent(String content){
		this.content = content;
	}
	public void setnum(int num){
		this.num = num;
	}
	public void setReadCount(int readCount){
		this.readCount = readCount;
	}
	public void setSubject(String subject){
		this.subject = subject;
	}
	
	public String getIp() {
		return ip;
	}
	public int getReadCount() {
		return readCount;
	}
	public String getSubject() {
		return subject;
	}
	public int getNum() {
		return num;
	}
	public String getContent() {
		return content;
	}
	public String getWriter() {
		return writer;
	}
}
