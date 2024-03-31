public class Middle implements Observer{
    private String name;
    private int salary;

    private int experience;
    private boolean openToWork;

    public Middle(String name, int experience){
        this.name = name;
        this.experience = experience;
        salary = 50000;
        openToWork = true;
    }
    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (this.salary <= salary){
            System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
            this.salary = salary;
            this.openToWork = false;
        }
        else {
            System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
        }
    }

    @Override
    public void reciveVanacy(Vacancy vacancy) {
        if (openToWork) {
            if (this.experience >= vacancy.getRequirements()) {
                System.out.printf("Мидл %s: Рассматривает вакансию! компании: %s; заработная плата: %d)\n",
                        name, vacancy.getCompany(), vacancy.getSalary());
                receiveOffer(vacancy.getCompany(), vacancy.getSalary());
            } else {
                System.out.printf("Мидл %s: Мне не хватает опыта :( (компания: %s; Требуемый опыт работы: %d)\n",
                        name, vacancy.getCompany(), vacancy.getRequirements());
            }
        }
    }

    @Override
    public boolean isOpenToWork() {
        return this.openToWork;
    }
}
