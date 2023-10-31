package test01.board;

public class BoardDTO {
	private String title, writer, content;
	private int numId;
	public BoardDTO(String title, String writer, String content, int numId) {
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.numId = numId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getNumId() {
		return numId;
	}
	public void setNumId(int numId) {
		this.numId = numId;
	}
	
}
