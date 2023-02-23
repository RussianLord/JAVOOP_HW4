public class Main {
    /*
    С учетом информации полученной ранее знакомимся с параметрическим полиморфизмом и продолжаем погружаться в ООП.
Спроектировать и реализовать планировщик дел для работы с задачами разных приоритетов.

Например:
Должен быть класс Задачи (общий/родительский и подтипы)
У задачи должно быть длительность, дедлайн, приоритет, тема, ответсвенный... - параметры на Ваше усмотрение
**У задачи должна быть возможность включить или выключить нотификацию на разные события, например, приближение дедлайна.

Должен быть класс Календарь, в который можно добавлять Задачи.
*** При пересечении задач по времени - выводить сообщение пользователю.

**** Должна быть возможность выгрузки Календаря в файл (тип на Ваше усмотрение)
**** Файл должен содержать следующие данные: id, дату добавления записи, время добавления записи, дедлай задачи, ФИО автора и др
     */
    public static void main(String[] args) {
        Task salary = new DirectorTask("Бухгалтерия","Поднять зарплаты",1,20,3,2,30);
        Task check = new OfficeTask("Старший бухгалтер","Проверить зарплату",2,15,1,3,30);
        Task install = new EngineerTask("Механик Олег","Установить двигатель",3,20,2,4,30);
        Task pack = new StorageTask("Команда склада","Упаковать коробки",4,30,1,5,30);
        System.out.println(salary.getTask());
        System.out.println(check.getTask());
        System.out.println(install.getTask());
        System.out.println(pack.getTask());
        Calendar.addCalendar(salary);
        Calendar.addCalendar(check);
        Calendar.addCalendar(install);
        Calendar.addCalendar(pack);
//        System.out.println(Calendar.getListTaksk());
        Calendar.fileWriter();
        TimeChecker.checkerTime(salary);

    }
}