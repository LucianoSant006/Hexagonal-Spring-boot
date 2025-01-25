package Dev_Luciano.hexagonal.application.core.domain;

public class Customer {

    private String id;
    private String name;
    private String cpf;
    private Address address;
    private Boolean isValid;

    public Customer(){
        this.isValid = false;

    }

    public Customer(String id, String name, String cpf, Address address, Boolean isValid) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.address = address;
        this.isValid = isValid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Boolean getValid() {
        return isValid;
    }

    public void setValid(Boolean valid) {
        isValid = valid;
    }
}
