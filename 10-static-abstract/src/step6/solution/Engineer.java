package step6.solution;

public class Engineer extends Employee {
	private String skill;

	public Engineer(String empNo, String name, int salary, String skill) {
		super(empNo, name, salary);
		this.skill = skill;
	}

	@Override
	public String toString() {
		return super.toString() + " skill:" + skill;
	}

}
