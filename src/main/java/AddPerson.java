import proto.generated_proto_classes.AddressBook;
import proto.generated_proto_classes.Person;

import java.io.*;

public class AddPerson {
    static Person PromptForAddress(BufferedReader stdin,
                                   PrintStream stdout) throws IOException {
        Person.Builder person = Person.newBuilder();

        stdout.print("Enter person ID: ");
        person.setId(Integer.valueOf(stdin.readLine()));

        stdout.print("Enter name: ");
        person.setName(stdin.readLine());

        stdout.print("Enter email address (blank for none): ");
        String email = stdin.readLine();
        if (email.length() > 0) {
            person.setEmail(email);
        }

        while (true) {
            stdout.print("Enter a phone number (or leave blank to finish): ");
            String number = stdin.readLine();
            if (number.length() == 0) {
                break;
            }

            Person.PhoneNumber.Builder phoneNumber =
                    Person.PhoneNumber.newBuilder().setNumber(number);

            stdout.print("Is this a mobile, home, or work phone? ");
            String type = stdin.readLine();
            if (type.equals("mobile")) {
                phoneNumber.setType(Person.PhoneType.PHONE_TYPE_MOBILE);
            } else if (type.equals("home")) {
                phoneNumber.setType(Person.PhoneType.PHONE_TYPE_HOME);
            } else if (type.equals("work")) {
                phoneNumber.setType(Person.PhoneType.PHONE_TYPE_WORK);
            } else {
                stdout.println("Unknown phone type.  Using default.");
            }

            person.addPhones(phoneNumber);
        }

        return person.build();
    }

    // Main function:  Reads the entire address book from a file,
    //   adds one person based on user input, then writes it back out to the same
    //   file.
    public static void main(String[] args) throws Exception {
        /*if (args.length != 1) {
            System.err.println("Usage:  AddPerson ADDRESS_BOOK_FILE");
            System.exit(-1);
        }*/

        String outputFile = "D:\\Projects\\protocolBuffer\\src\\main\\java\\proto\\files\\addressbook.txt";

        AddressBook.Builder addressBook = AddressBook.newBuilder();

        // Read the existing address book.
        try {
            addressBook.mergeFrom(new FileInputStream(outputFile));
        } catch (FileNotFoundException e) {
            System.out.println(outputFile + ": File not found.  Creating a new file.");
        }

        // Add an address.
        addressBook.addPeople(
                PromptForAddress(new BufferedReader(new InputStreamReader(System.in)),
                        System.out));

        // Write the new address book back to disk.
        FileOutputStream output = new FileOutputStream(outputFile);
        addressBook.build().writeTo(output);
        output.close();
    }

}
