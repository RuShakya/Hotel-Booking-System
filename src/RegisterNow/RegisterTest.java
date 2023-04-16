package RegisterNow;

public class RegisterTest {

    int ID;
    String Name;
    String Address;
    String Gender;
    String Phone;
    String Email;
    String Username;
    String Password;
    String Role;
    String CreditCardInfo;

    public RegisterTest() {
        this.ID = 0;
        this.Name = "";
        this.Address = "";
        this.Gender = "";
        this.Phone = "";
        this.Email = "";
        this.Username = "";
        this.Password = "";
        this.Role = "";
        this.CreditCardInfo = "";
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    public String getCreditCardInfo() {
        return CreditCardInfo;
    }

    public void setCreditCardInfo(String CreditCardInfo) {
        this.CreditCardInfo = CreditCardInfo;
    }

    
    
    @Override
    public String toString() {
        return "User{" + "ID=" + ID + ", Name=" + Name + ", Address=" + Address + ", Gender=" + Gender + ", Phone=" + Phone + ", Email=" + Email + ", Username=" + Username + ", Password=" + Password + ", Role=" + Role + ", CreditCardInfo=" + CreditCardInfo + '}';
    }
    
    

}
