package javaBeans;

public class UserDetails {
public String FirstName,LastName,DateOfBirth;int UserId;

//public UserDetails(String FirstName, String LastName,String DateOfBirth)
//{
//   this.FirstName = FirstName;
//   this.LastName = LastName;
//   this.DateOfBirth = DateOfBirth;
//}

public int getUserId() {
	return UserId;
}

public void setUserId(int userId) {
	UserId = userId;
}

public String getFirstName() {
	return FirstName;
}

public void setFirstName(String firstName) {
	FirstName = firstName;
}

public String getLastName() {
	return LastName;
}

public void setLastName(String lastName) {
	LastName = lastName;
}

public String getDateOfBirth() {
	return DateOfBirth;
}

public void setDateOfBirth(String dateOfBirth) {
	DateOfBirth = dateOfBirth;
}
}
