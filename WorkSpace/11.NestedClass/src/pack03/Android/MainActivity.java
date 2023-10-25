package pack03.Android;

public class MainActivity extends AppComPatActivity {
	@Override
	protected void onCreate() {
		super.onCreate();
		//화면을 초기화하는 단계 (무조건 있어야함)
		//Button 사용자와 상호작용을 위한 객체 : 사용자가 눌렀는지가 중요함
		Button btn = new Button();//실제로는 find..디자인과 연결
		
		
		Button.OnClickListner onClickListner = new Button.OnClickListner() {
			
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		btn.setListner(new Button.OnClickListner() {
			
			@Override
			public void onClick() {
				System.out.println("로그인 버튼 눌리면 여기 실행");
			}
		});
	}
	public static void main(String[] args) {
		MainActivity main = new MainActivity();
		main.onCreate();
	}
}
