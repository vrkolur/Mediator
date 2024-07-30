package RoadTraffic;

public class Main {

    public static void main(String[] args) {
        Mediator roadTrafficController = new RoadTrafficController();
        Vehicle vehicle1 = new Vehicle(roadTrafficController);
        Road road1 = new Road(roadTrafficController);
        roadTrafficController.registerVehicle(vehicle1);
        roadTrafficController.registerRoad(road1);
        vehicle1.getReady();
        road1.start();
        vehicle1.start();
        vehicle1.stop();
    }
}
