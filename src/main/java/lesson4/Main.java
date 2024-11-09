package lesson4;

public class Main {
    public static void main(String[] args) {
        // Tasks 1-2;

        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Gandalf", "Mage", "youshallnotpass@mail.com", "89123", 100000, 24000);
        employees[1] = new Employee("Frodo", "Hobbit", "petrov@mail.com", "89124", 50, 50);
        employees[2] = new Employee("Bilbo", "Hobbit", "sidorov@mail.com", "89125", 14, 132);
        employees[3] = new Employee("Legolas", "Archer", "bowbow@mail.com", "89126", 35000, 2500);
        employees[4] = new Employee("Gimli", "Warrior", "beerclub@mail.com", "89127", 30000, 62);

        for (Employee employee : employees) {
            employee.printEmployeeInfo();
        }

        // Task 3;
        Park park = new Park();

        Park.Attraction quantumLeap = park.new Attraction("Quantum Leap", "10:00-23:00", 1000);
        Park.Attraction firebird = park.new Attraction("Firebird", "11:00-20:00", 850);

        quantumLeap.printAttractionInfo();
        firebird.printAttractionInfo();
    }
}
