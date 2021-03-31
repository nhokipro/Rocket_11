
public class DienThoaiCoDien extends dienThoaiDiDong implements VuKhi{

	@Override
	public void nghe() {
		// TODO Auto-generated method stub
		System.out.println(" nghe điện thoại");
	}

	@Override
	public void goi() {
		// TODO Auto-generated method stub
		System.out.println(" gọi điện thoại");
	}

	@Override
	public void guiTinNhan() {
		// TODO Auto-generated method stub
		System.out.println("gửi tin nhắn");
	}
	@Override
	public void nhanTinNhan() {
		// TODO Auto-generated method stub
		System.out.println(" nhận tin nhắn");
	}
	public void ngheRadio() {
		System.out.println("nghe radio");
	}

	@Override
	public void tanCongKeXau() {
		// TODO Auto-generated method stub
		System.out.println("tấn cong kẻ xấu");
	}

}
