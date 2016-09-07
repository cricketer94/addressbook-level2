package seedu.addressbook.data.person;

public class Contact {
	private boolean isPrivate;
	public final String value;
	public Contact(String contact,boolean isPrivate){
		this.value=contact;
		this.isPrivate=isPrivate;
		
		
	}
	
	public String toString(){
		return this.value;
	}
	
	public int hashCode(){
		return value.hashCode();
	}
	
	public boolean isPrivate(){
		return isPrivate;
	}
	
}
