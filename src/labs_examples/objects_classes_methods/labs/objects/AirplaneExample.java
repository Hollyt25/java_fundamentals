package labs_examples.objects_classes_methods.labs.objects;


class AirplaneController{
    public static void main(String[] args) {

        Cockpit cockpit = new Cockpit(30000, 2000);
        Passengers passengers = new Passengers(100, 20000);
        FlightPlan flightPlan = new FlightPlan("New York", "07:00", "Chicago", "14:00");
        Airplane airplane = new Airplane(2500.90, 100, flightPlan, passengers, cockpit);

        System.out.println("I took a flight from " +  flightPlan.getDepartureLocation() + " to " + flightPlan.getArrivalLocation());

        System.out.println(airplane.toString());

    }

}

class Cockpit{
    private int elevation;
    private int speed;

    public Cockpit(int elevation, int speed){
        this.elevation = elevation;
        this.speed = speed;
    }

    public int getElevation() {
        return elevation;
    }

    public void setElevation(int elevation) {
        this.elevation = elevation;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Cockpit{" +
                "elevation=" + elevation +
                ", speed=" + speed +
                '}';
    }
}

class Passengers{
    private int maxSeating;
    private int maxWeight;

    public Passengers(int maxSeating, int maxWeight){
        this.maxSeating = maxSeating;
        this.maxWeight = maxWeight;
    }
    public int getMaxSeating(){
        return maxSeating;
    }
    public void setMaxSeating(int maxSeating){
       this.maxSeating = maxSeating;
    }
    public int getMaxWeight(){
        return maxWeight;
    }
    public void setMaxWeight(int maxWeight){
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {
        return "Passengers{" +
                "maxSeating=" + maxSeating +
                ", maxWeight=" + maxWeight +
                '}';
    }
}

class FlightPlan{
    private String departureLocation;
    private String departureTime;
    private String arrivalLocation;
    private String arrivalTime;

    public FlightPlan(String departureLocation, String departureTime, String arrivalLocation, String arrivalTime){
        this.departureLocation = departureLocation;
        this.departureTime = departureTime;
        this.arrivalLocation = arrivalLocation;
        this.arrivalTime = arrivalTime;

    }
    public String getDepartureLocation(){
        return departureLocation;
    }
    public void setDepartureLocation(String departureLocation){
        this.departureLocation = departureLocation;
    }
    public String getDepartureTime(){
        return departureTime;
    }
    public void setDepartureTime(String departureTime){
        this.departureTime = departureTime;
    }
    public String getArrivalLocation(){
        return arrivalLocation;
    }
    public void setArrivalLocation(String arrivalLocation){
        this.arrivalLocation = arrivalLocation;
    }
    public String getArrivalTime(){
        return arrivalLocation;
    }
    public void setArrivalTime(String arrivalTime){
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        return "FlightPlan{" +
                "departureLocation='" + departureLocation + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", arrivalLocation='" + arrivalLocation + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                '}';
    }
}

class Airplane{
    private double fuelCapacity;
    private int currentFuelLevel;

    private FlightPlan flightPlan;
    private Passengers passengers;
    private Cockpit cockpit;

    public Airplane(double fuelCapacity, int currentFuelLevel, FlightPlan flightPlan, Passengers passengers, Cockpit cockpit){
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
        this.flightPlan = flightPlan;
        this.passengers = passengers;
        this.cockpit = cockpit;
    }
    public double getFuelCapacity(){
        return fuelCapacity;
    }
    public void setFuelCapacity(double fuelCapacity){
        this.fuelCapacity = fuelCapacity;
    }
    public int getCurrentFuelLevel(){
        return currentFuelLevel;
    }
    public void setCurrentFuelLevel(int currentFuelLevel){
        this.currentFuelLevel = currentFuelLevel;
    }
    public FlightPlan getFlightPlan(){
        return flightPlan;
    }
    public void setFlightPlan(FlightPlan flightPlan){
        this.flightPlan = flightPlan;
    }
    public Passengers getPassengers(){
        return passengers;
    }
    public void setPassengers(Passengers passengers){
        this.passengers = passengers;
    }
    public Cockpit getCockpit(){
        return cockpit;
    }
    public void setCockpit(Cockpit cockpit){
        this.cockpit = cockpit;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "fuelCapacity=" + fuelCapacity +
                ",\n currentFuelLevel=" + currentFuelLevel +
                ",\n flightPlan=" + flightPlan +
                ",\n passengers=" + passengers +
                ",\n cockpit=" + cockpit +
                '}';
    }
}
