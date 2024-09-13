package controller;

import model.Contact;
import model.Node;

public class ContactList {
    private Node head;


    public void addContact(Contact contact) {
        Node newNode = new Node(contact);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }


    public Contact searchContact(String query) {
        Node current = head;
        while (current != null) {
            Contact contact = current.getContact();
            if (contact.getName().equalsIgnoreCase(query) || contact.getPhoneNumber().equals(query)) {
                return contact;
            }
            current = current.getNext();
        }
        return null;
    }


    public boolean removeContact(String query) {
        if (head == null) {
            return false;
        }


        if (head.getContact().getName().equalsIgnoreCase(query) || head.getContact().getPhoneNumber().equals(query)) {
            head = head.getNext();
            return true;
        }

        Node current = head;
        Node previous = null;

        while (current != null) {
            if (current.getContact().getName().equalsIgnoreCase(query) || current.getContact().getPhoneNumber().equals(query)) {
                if (previous != null) {
                    previous.setNext(current.getNext());
                }
                return true;
            }
            previous = current;
            current = current.getNext();
        }
        return false;
    }


    public void listContacts() {
        Node current = head;
        if (current == null) {
            System.out.println("Nenhum contato na lista.");
        } else {
            while (current != null) {
                System.out.println(current.getContact());
                current = current.getNext();
            }
        }
    }
}
