package Admin;

public class ModelTable {
    String name,password;
    String phone,unicode;

    public ModelTable(String name, String password, String phone, String unicode) {
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.unicode = unicode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUnicode() {
        return unicode;
    }

    public void setUnicode(String unicode) {
        this.unicode = unicode;
    }



}
