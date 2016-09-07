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
	
	public boolean equals(Object other){
	    return other == this // short circuit if same object
                || (other instanceof Contact // instanceof handles nulls
                && this.value.equals(((Contact) other).value)); // state check
		
	}
	
}
