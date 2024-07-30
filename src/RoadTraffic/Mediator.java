package RoadTraffic;

interface Statemant{
    void start();
    void stop();

}

interface Mediator{
    public void registerRoad(Road road);
    public void registerVehicle(Vehicle vechile);
    public boolean isStarted();
    public boolean isStopped();
    public void setStartedStatus(boolean status);
    public void setStoppedStatus(boolean status);
}

class Vehicle implements Statemant {
    private Mediator roadTrafficController;

    public Vehicle(Mediator roadTrafficController) {
        this.roadTrafficController = roadTrafficController;
    }

    public void start() {
        if (roadTrafficController.isStopped()) {
            System.out.println("Vehicle started");
            roadTrafficController.setStartedStatus(true);
        } else {
            System.out.println("Vehicle is already started");
        }
    }

    public void stop() {
        if (roadTrafficController.isStarted()) {
            System.out.println("Vehicle stopped");
            roadTrafficController.setStartedStatus(false);
        } else {
            System.out.println("Vehicle is already stopped");
        }
    }

    public void getReady() {
        System.out.println("Vehicle is ready");
    }
}


class Road implements Statemant {
    private Mediator roadTrafficController;

    public Road(Mediator roadTrafficController) {
        this.roadTrafficController = roadTrafficController;
        roadTrafficController.setStartedStatus(true);
    }

    @Override
    public void start(){
        System.out.println("Staring permission granted");
        roadTrafficController.setStartedStatus(true);
    }

    @Override
    public void stop() {
        System.out.println("Stopping permission granted");
        roadTrafficController.setStoppedStatus(true);
    }

}