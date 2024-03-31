

public class Company {

    private String name;

    private Publisher jobAgency;

    public String getName() {
        return name;
    }


    public Company(String name, Publisher jobAgency) {
        this.name = name;
        this.jobAgency = jobAgency;
    }

    public void needEmployee(){
        jobAgency.sendAllVacancies();

    }
}
