import java.util.ArrayList;
import java.util.Collection;

public class Main {
    /**
     *  TODO: Доработать приложение, которое разрабатывалось на семинаре,
     *  поработать с шаблоном проектирования Observer, добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например,
     *  добавить тип вакансии (enum),
     *  учитывать тип вакансии при отправке предложения соискателю.
     *  ***. Добавить возможность отписаться от рассылки новых вакансий.
     * @param args
     */
    public static void main(String[] args) {

        Publisher publisher = new JobAgency();
        Company google = new Company("Google", publisher);
//        Company yandex = new Company("Yandex", publisher, 95000);
//        Company geekBrains = new Company("GeekBrains", publisher, 98000);

        Junior student1 = new Junior("Джуниор #1", 12);
        Senior master1 = new Senior("Сеньер #1", 36);
        Middle middle1 = new Middle("Миддл №1", 18);


        Vacancy vacancy1 = new Vacancy("Програмист", "Требуется программист", 6, google.getName(), 4000, VacancyType.SOFTWARE_ENGINEER);
        Vacancy vacancy3 = new Vacancy("Програмист", "Требуется программист", 24, google.getName(), 120000, VacancyType.SOFTWARE_ENGINEER);
        Vacancy vacancy2 = new Vacancy("Програмист", "Требуется программист", 14, google.getName(), 90000, VacancyType.SOFTWARE_ENGINEER);
        Vacancy vacancy4 = new Vacancy("Програмист", "Требуется программист", 11, google.getName(), 40000, VacancyType.SOFTWARE_ENGINEER);

        publisher.registerVacancy(vacancy1);
        publisher.registerVacancy(vacancy2);
        publisher.registerVacancy(vacancy3);
        publisher.registerVacancy(vacancy4);


        publisher.registerObserver(student1);
        publisher.registerObserver(master1);
        publisher.registerObserver(middle1);

        google.needEmployee();

//        for (int i = 0; i < 3; i++) {
//           google.needEmployee();
//            yandex.needEmployee();
//            geekBrains.needEmployee();
//        }

        publisher.removeObserver(student1);
        publisher.removeObserver(master1);
        publisher.removeObserver(middle1);

        System.out.println("--------Попытка №2 нйти работу--------");

        google.needEmployee();

    }
}
