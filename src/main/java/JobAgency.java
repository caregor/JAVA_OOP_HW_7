import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class JobAgency implements Publisher{

    private Collection<Observer> observers = new ArrayList<>();
    private Collection<Vacancy> vacancies = new ArrayList<>();

    public void sendOffer(String companyName, int salary) {
        for (Observer observer : observers){
            observer.receiveOffer(companyName, salary);
        }
    }
    public void sendAllVacancies(){
        for (Observer observer : observers){
            for (Vacancy vacancy: vacancies){
                observer.reciveVanacy(vacancy);
            }
        }
    }

    public Collection<Vacancy> filterVacanciesByType(VacancyType vacancyType) {
        Collection<Vacancy> filteredVacancies = new ArrayList<>();
        for (Vacancy vacancy : vacancies) {
            if (vacancy.getType() == vacancyType) {
                filteredVacancies.add(vacancy);
            }
        }
        return filteredVacancies;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (!observer.isOpenToWork()) {
            observers.remove(observer);
        }
    }

    @Override
    public void registerVacancy(Vacancy vacancy) {
        vacancies.add(vacancy);
    }
}
