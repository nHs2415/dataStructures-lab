public class TaxiCompany {
    double locationDistance;
    String locationName;
    int numberOfPassengers;
    String taxiID;

    TaxiCompany(double locationDistance, String locationName,int numberOfPassengers,String taxiID) {
        this.locationDistance = locationDistance;
        this.locationName = locationName;
        this.numberOfPassengers=numberOfPassengers;
        this.taxiID=taxiID;
    }

    String searchByDistance(double value) {
        try {
            if (locationDistance < value) {
                return locationName;
            }
        } catch (NullPointerException e) {
            System.out.println("The location Distance is null");
            return null;
        }
        return null;
    }

    String getTwoMaxPassengerTaxis(int numberOfPassengers){
        if (numberOfPassengers==2){
            return taxiID;
        }
        return null;
    }

    void taxiDetails(){

        System.out.println(this.taxiID+"\t\t"+this.numberOfPassengers);
    }

    void locationDetails(){

        System.out.println(this.locationName+ "\t\t\t\t"+this.locationDistance);
    }

    public static void main(String[] args) {
        TaxiCompany taxiCompany=new TaxiCompany(250.0,"Texas",3,"Taxi_001");
        TaxiCompany taxiCompany1=new TaxiCompany(65.0,"Boston",4,"Taxi_002");
        TaxiCompany taxiCompany2=new TaxiCompany(80.5,"New York",6,"Taxi_003");
        TaxiCompany taxiCompany3=new TaxiCompany(15.8,"San Diego",2,"Taxi_004");
        TaxiCompany taxiCompany4=new TaxiCompany(160.0,"Houston",5,"Taxi_005");
        System.out.println("Taxi ID \t Number of Passengers");
        taxiCompany.taxiDetails();
        taxiCompany1.taxiDetails();
        taxiCompany2.taxiDetails();
        taxiCompany3.taxiDetails();
        taxiCompany4.taxiDetails();
        System.out.println();
        System.out.println("Location Name \t Location Distance ");
        taxiCompany.locationDetails();
        taxiCompany1.locationDetails();
        taxiCompany2.locationDetails();
        taxiCompany3.locationDetails();
        taxiCompany4.locationDetails();
    }
}
