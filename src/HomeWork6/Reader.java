package HomeWork6;

public class Reader {
    String fio;
    Integer readerTicketNumber;
    String faculty;
    String dateOfBirth;
    String phone;



    @Override
    public String toString() {
        return "Reader{" +
                "fio='" + fio + '\'' +
                ", readerTicketNumber=" + readerTicketNumber +
                ", faculty='" + faculty + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public Reader (String fio, Integer readerTicketNumber,  String faculty, String dateOfBirth, String phone){
        this.fio = fio;
        this.readerTicketNumber = readerTicketNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;

    }
    public void takeBook( ){

    }
    public void takeBook( String ...  books){
        System.out.println(fio + " взял: " + String.join(",", books));
    }

    public void takeBook( int number){
        System.out.println(fio + " взял: " + number + " книги.");
    }

    public void takeBook( String name1, String name2, String name3){
        System.out.println(fio + " взял: " + name1 + " " + name2 + " " + name3);
    }

    public void returnBook(){

    }
    public void returnBook( String ...  books){
        System.out.println(fio + " вернул: " + String.join(",", books));
    }

    public void returnBook( int number){
        System.out.println(fio + " вернул: " + number + " книги.");
    }

    public void returnBook( String name1, String name2, String name3){
        System.out.println(fio + " вернул: " + name1 + " " + name2 + " " + name3);
    }

    public static void main(String[] args){

        Reader human1 = new Reader("Иванов И.И.", 123, "Исторический", "31.12.1993", "7861121245");
        System.out.println(human1);
        human1.takeBook( 3);
        String[] book = {"Приключения", "Словарь", "Энциклопедия"};
        human1.takeBook("Приключения", "Словарь", "Энциклопедия");
        human1.takeBook(book);
       // System.out.println( String.join(",", book));

        Reader human2 = new Reader("Петров В.В.", 785, "Технический", "01.05.1996", "4325665");
        System.out.println(human1);
        human2.returnBook( 3);
        human2.returnBook("Приключения", "Словарь", "Энциклопедия");
        //String[] book2 = {"Приключения", "Словарь", "Энциклопедия"};
        human2.returnBook(book);


    }
}
