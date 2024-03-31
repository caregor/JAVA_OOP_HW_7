public class Junior implements Observer{
    private String name;
    private int salary;
    private int experience;

    public boolean isOpenToWork() {
        return openToWork;
    }

    private boolean openToWork;

    public Junior(String name, int experience){
        this.name = name;
        salary = 5000;
        this.experience = experience;
        this.openToWork = true;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (this.salary <= salary){
            System.out.printf("Джун %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
            this.salary = salary;
            this.openToWork = false;
        }
        else {
            System.out.printf("Джун %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
        }
    }

    @Override
    public void reciveVanacy(Vacancy vacancy) {
        if (openToWork) {
            if (this.experience >= vacancy.getRequirements()) {
                System.out.printf("Джун %s: Рассматривает вакансию! компании: %s; заработная плата: %d)\n",
                        name, vacancy.getCompany(), vacancy.getSalary());
                receiveOffer(vacancy.getCompany(), vacancy.getSalary());
            } else {
                System.out.printf("Джун %s: Мне не хватает опыта :( (компания: %s; Требуемый опыт работы: %d)\n",
                        name, vacancy.getCompany(), vacancy.getRequirements());
            }
        }
    }
}
