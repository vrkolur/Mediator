package RoadTraffic;

 class RoadTrafficController implements Mediator{
    private Vehicle vehicle;
    private Road road;
    public boolean start, stop;

    public void registerRoad(Road road){
        this.road = road;
    }

     public void registerVehicle(Vehicle vehicle) {
         this.vehicle = vehicle;
     }

    public boolean isStarted(){
        return start;
    }

    public boolean isStopped(){
        return stop;
    }

    @Override
    public void setStartedStatus(boolean status) {
        this.start = status;
    }

    @Override
    public void setStoppedStatus(boolean status) {
        this.stop = status;
    }
}
