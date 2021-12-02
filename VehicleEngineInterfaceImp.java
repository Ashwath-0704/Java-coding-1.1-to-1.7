/**
 * VehicleEngineInterfaceImp
 */
 interface Vehicle {
    String licensePlate = "";
    void start();
    void stop();
    void model();
}

class VehicleEngineInterfaceImp implements Vehicle {

         public void start() {
            System.out.println("starting engine..."+"\n");
            System.out.println("Ready to drive...");
            
        }
        public void stop() {
            System.out.println("stopping engine...");
        }
        public void model(){
            System.out.println("Tesla Brand New Model no-1");
        }
    public static void main(String[] args) {
        
        Vehicle tesla = new VehicleEngineInterfaceImp();
        System.out.println(" ");
        tesla.model(); // starting engine ...
        tesla.start(); // starting engine ...
        // tesla.stop(); // starting engine ...
        System.out.println(" ");

    }
}
