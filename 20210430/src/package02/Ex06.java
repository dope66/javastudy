package package02;

public class Ex06 {
	private String company;
	private String os;

	public Ex06(String company, String os) {
		this.company = company;
		this.os = os;
	}
	

	public String getOs() {
		return os;
	}


	@Override
	public String toString() {
		return company+","+os;
	}
	@Override
	public boolean equals(Object obj) {
		//obj와 현 클래스가 같은 지를 확인하는것 
		if (obj instanceof Ex06) {
			return true;
		} else {
			return false;
		}
	}

}
