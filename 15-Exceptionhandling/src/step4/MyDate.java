package step4;

public class MyDate {
	private int day;

	public int getDay() {
		return day;
	}
/**
 * 전달되는 day값이 1이상 31 이하이면 할당하고
 * 1미만 또는 31 초과이면 DayException발생 후 
 * 호출한 곳으로 전달한다 (day instance veriable은 할당시키지 않는다)
 * @param day
 * @throws DayException 
 */
	public void setDay(int day) throws DayException {
		if(day< 1 || day>31) {
			throw new DayException("1일 이상 31일 이하의 값만 할당 가능");
		}
		this.day = day;
	}
	
}
