package model;

public class Contact {
    private String name;
    private String phoneNumber;
    private String email;

    // Construtor
    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Getters e Setters
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Nome: " + name + ", Telefone: " + phoneNumber + ", Email: " + email;
    }
}
