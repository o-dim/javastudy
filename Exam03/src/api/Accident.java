package api;


public class Accident {
	String occrrncDt;
	String occrncDayCd;
	int dthDnvCnt;
	int injpsnCnt;
	
	public Accident(String occrrncDt, String occrncDayCd, int dthDnvCnt, int injpsnCnt) {
		
		this.occrrncDt = occrrncDt;
		this.occrncDayCd = occrncDayCd;
		this.dthDnvCnt = dthDnvCnt;
		this.injpsnCnt = injpsnCnt;		
	}

	public String getOccrrncDt() {
		return occrrncDt;
	}

	public void setOccrrncDt(String occrrncDt) {
		this.occrrncDt = occrrncDt;
	}

	public String getOccrncDayCd() {
		return occrncDayCd;
	}

	public void setOccrncDayCd(String occrncDayCd) {
		this.occrncDayCd = occrncDayCd;
	}

	public int getDthDnvCnt() {
		return dthDnvCnt;
	}

	public void setDthDnvCnt(int dthDnvCnt) {
		this.dthDnvCnt = dthDnvCnt;
	}

	public int getInjpsnCnt() {
		return injpsnCnt;
	}

	public void setInjpsnCnt(int injpsnCnt) {
		this.injpsnCnt = injpsnCnt;
	}

	@Override
	public String toString() {
		String[] dayCd = {"월", "화", "수", "목", "금", "토", "일"};
		return "발생일자" + occrrncDt + dayCd[Integer.parseInt(occrncDayCd)] + "요일, 사망자수 " + dthDnvCnt + "명, 부상자수 " + injpsnCnt + "명";
	}

	
	
}
