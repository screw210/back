package test1;

public class Person {
	private String FirestName;
	private String lastName;
	public String getFirestName() {
		return FirestName;
	}
	public void setFirestName(String firestName) {
		FirestName = firestName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getLength(String FirestName, String lastName) {
		int length = FirestName.length() + lastName.length();
		return length;
	}
	@Override
	public String toString() {
		return "총수 [성=" + FirestName + ", 이름=" + lastName + "]";
	}
	
}
