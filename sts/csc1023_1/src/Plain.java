class Plane {
    String airPlaneName;
    String airPlaneType;
    double maximumSpeed;

    public Plane(String airPlaneName,String airPlaneType,double maximumSpeed){
        this.airPlaneName=airPlaneName;
        this.airPlaneType=airPlaneType;
        this.maximumSpeed=maximumSpeed;
    }

    public void printPlaneDetails(){
        System.out.println();
        System.out.println("Plane Details");
        System.out.println("AirplaneName = "+this.airPlaneName+
                            "\nAirplaneType = "+this.airPlaneType+
                            "\nMaximumSpeed = "+this.maximumSpeed);

    }

}

class Flight{
    int flightNumber;
    String departingAirport;
    String arrivingAirport;
    double routeDistance;
    Plane assignedPlane;
    double minimumHours;
    boolean isDelayed;

    public Flight(int flightNumber,String departingAirport,String arrivingAirport,double routeDistance){
        this.flightNumber=flightNumber;
        this.departingAirport=departingAirport;
        this.arrivingAirport=arrivingAirport;
        this.routeDistance=routeDistance;
        this.minimumHours=0;
        this.isDelayed=false;
    }

    public void assignPlane(Plane plane){
        this.assignedPlane=plane;
        this.minimumHours=this.routeDistance/plane.maximumSpeed;
    }

    public void delayFlight(double delayedHours){
        this.minimumHours+=delayedHours;
        this.isDelayed=true;
    }

    public void printFlightDetails(){
        System.out.println("flightNumber = "+this.flightNumber+
                            "\ndepartingAirport = "+this.departingAirport+
                            "\narrivingAirport = "+this.arrivingAirport+
                            "\nrouteDistance = "+this.routeDistance+
                            "\nMinimum Hours : "+this.minimumHours);

    }

}
class Drive{
    public static void main(String[] args) {
        Flight f1=new Flight(123,"Colombo","Paris",8495.72);
        Plane p1=new Plane("Airbus A300B4","Airbus A300",876);
        f1.assignPlane(p1);
        f1.printFlightDetails();

        f1.delayFlight(2);
        p1.printPlaneDetails();
    }
}