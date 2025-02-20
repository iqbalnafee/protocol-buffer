package proto;

import proto.generated_proto_classes.AddressBook;
import proto.generated_proto_classes.Person;

import java.io.FileInputStream;

public class ListPeople_ {
    static void Print(AddressBook addressBook) {
        for (Person person: addressBook.getPeopleList()) {
            System.out.println("Person ID: " + person.getId());
            System.out.println("  Name: " + person.getName());
            if (person.hasEmail()) {
                System.out.println("  E-mail address: " + person.getEmail());
            }

            for (Person.PhoneNumber phoneNumber : person.getPhonesList()) {
                switch (phoneNumber.getType()) {
                    case PHONE_TYPE_MOBILE:
                        System.out.print("  Mobile phone #: ");
                        break;
                    case PHONE_TYPE_HOME:
                        System.out.print("  Home phone #: ");
                        break;
                    case PHONE_TYPE_WORK:
                        System.out.print("  Work phone #: ");
                        break;
                }
                System.out.println(phoneNumber.getNumber());
            }
        }
    }

    // Main function:  Reads the entire address book from a file and prints all
    //   the information inside.
    public static void main(String[] args) throws Exception {
        /*if (args.length != 1) {
            System.err.println("Usage:  ListPeople ADDRESS_BOOK_FILE");
            System.exit(-1);
        }*/

        String inputFile = "D:\\Projects\\protocolBuffer\\src\\main\\java\\proto\\files\\addressbook.txt";

        // Read the existing address book.
        AddressBook addressBook =
                AddressBook.parseFrom(new FileInputStream(inputFile));

        Print(addressBook);
    }
}
