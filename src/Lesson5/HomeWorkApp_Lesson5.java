package Lesson5;

public class HomeWorkApp_Lesson5 {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Ivanov Pavel", "QA-Engineer", "ivivan1@mailbox.com", "892312312", 35000, 24);
        persArray[2] = new Person("Sidorova Vika", "Supervisor", "ivivan2@mailbox.com", "892312312", 50000, 41);
        persArray[3] = new Person("Prozorlevich Deonis", "Tester", "ivivan3@mailbox.com", "892312312", 15000, 19);
        persArray[4] = new Person("Kretnov Vadim", "SEO", "ivivan4@mailbox.com", "892312312", 100000, 56);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                persArray[i].print();
            }

        }


    }
}
