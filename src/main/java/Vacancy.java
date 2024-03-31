public class Vacancy {
    private String title;
    private String description;
    private int requirements;
    private String company;
    private int salary;
    private VacancyType type;

    public Vacancy(String title, String description, int requirements, String company, int salary, VacancyType type) {
        this.title = title;
        this.description = description;
        this.requirements = requirements;
        this.company = company;
        this.salary = salary;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }


    public int getRequirements() {
        return requirements;
    }


    public String getCompany() {
        return company;
    }

    public int getSalary() {
        return salary;
    }

    // Переопределяем метод toString() для удобного вывода информации о вакансии
    @Override
    public String toString() {
        return "Title: " + title +
                "\nОписание: " + description +
                "\nТребования: мин." + requirements + "мес." +
                "\nКомпания: " + company +
                "\nЗарплата: " + salary;
    }
}

