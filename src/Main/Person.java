package Main;

public class Person {
    private Itransport itransport;
    public Person(){}
    public Person(Itransport transport) {
        itransport = transport;
    }
    public void SetTransport(Itransport transport){
        itransport=transport;
    }
    public void ExecuteTransport(){
        itransport.Drive();
    }

}
