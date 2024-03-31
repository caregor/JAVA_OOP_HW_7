import java.util.Collection;


public interface Publisher {

    void sendOffer(String companyName, int salary);
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void registerVacancy(Vacancy vacancy);

    void sendAllVacancies();

    void sendSelectedVacancies(VacancyType type);
}
