public interface Observer {

    void receiveOffer(String nameCompany, int salary);

    void reciveVanacy(Vacancy vacancy);

    boolean isOpenToWork();

}
