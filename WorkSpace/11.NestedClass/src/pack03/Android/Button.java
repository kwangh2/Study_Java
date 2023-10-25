package pack03.Android;

public class Button {
	
	public OnClickListner listner; //null
	
	
//	public OnClickListner getListner() {
//		return listner;
//	} 자주사용 x
	
	
	//os가 해줌 
	void click() {
		listner.onClick();
	}


	public void setListner(OnClickListner listner) {
		this.listner = listner;
		// ↓ 밑 코드는 안드로이드가 감지해서 실행함
		this.click();
	}


	static interface OnClickListner{
		void onClick();
//		OnClickListner 라는 인터페이스 형태를 사용하기 위해서 onClick이라는 메소드는 반드시 있어야함.
		
	}
	
}
