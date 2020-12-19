/*
1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
2. Конструктор класса должен заполнять эти поля при создании объекта.
3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
4. Создать массив из 5 сотрудников.

Пример:
Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
                                                    // потом для каждой ячейки массива задаем объект
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);
5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

 */

public class exercise_5 {

    public static employee [] staffArray = new employee[5];

    public static void main (String [] args){
        employee staffMember = new employee("Default", "Default", "Default",
                                                0, 0, 0);

        staffArray[0] = new employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com",
                892312312, 30000, 30);
        staffArray[1] = new employee("Sikharulidze Archil", "Developer", "info@info.ge",
                995555801,2600,32);
        staffArray[2] = new employee("Lavrov Sergey", "HR", "lavrov@mail.ru",
                815790987,2900,41);
        staffArray[3] = new employee("Putin Vladimir","CEO", "putin@ceo.ge",
                111111111, 5000, 63);
        staffArray[4] = new employee("Surkov Vladimir", "CEO Deputy", "deputy@ceo.ge",
                111111112, 4000, 55);

        staffMember.getObjectInfo();

        System.out.println ("\nStaff members are:\n");

        for (int size = 0; size < staffArray.length; size++)
        {
            getStaffArray(size);
        }

        System.out.println ("\nThe staff members above 40 years old are:\n");

        for (int size = 0; size < staffArray.length; size++)
        {
            if (staffArray[size].getAge() > 40)
            {
                getStaffArray(size);
            }
        }
    }

    static void getStaffArray(int index)
    {
                System.out.print(staffArray[index].getFullName() + "  ");
                System.out.print(staffArray[index].getPosition() + "  ");
                System.out.print(staffArray[index].geteMail() + "  ");
                System.out.print(staffArray[index].getTelephone() + "  ");
                System.out.print(staffArray[index].getSalary() + "  ");
                System.out.println(staffArray[index].getAge() + "  ");
    }
}
