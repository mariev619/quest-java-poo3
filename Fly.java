public interface Fly {
    void takeOff();

    int ascend (int meters);
        /*@return*/
    
    int descend (int meters);
        /*@return*/
    
    void land();

    default void glide(){
        System.out.printf("It glides into the air.%n");

    }
}