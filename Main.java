public class Main {

    //    Написать реализацию классов Person и Company, которые имплементируют интерфейс Printable.
//        Реализация Person должна обеспечивать вывод имени человека и года его рождения через разделитель ':'.
//
//         Пример: "John Matthew:1995"
//
//        Реализация Person должна обеспечивать вывод названия организации и города регистрации через разделитель ". " (точка с пробелом).
//
//        Пример: "Hewlett Packard. Boston"

    public static void main(String[] args) {
        Person person = new Person("John Smith" , 1990);
        Company company = new Company("IBM", "New-York");

        person.print();
        company.print();
    }
}



