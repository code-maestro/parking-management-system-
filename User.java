package packingms;

/**
 * @author AJUNA  MICHAEL
 */
class User {
    
    private String username, phoneNo, numberPlate, carName;
    
    // Constructor for the user class..
    public User(String names, String phonenum, String noPlate, String carname){
        this.username=names;
        this.phoneNo=phonenum;
        this.numberPlate = noPlate;
        this.carName = carname; 
    }
    
    public String getUsername(){
    return username;
            }
    
    public String getPhoneNo(){
    return phoneNo;
            }

    
    public String getNumberPlate(){
        return numberPlate;
            }
    
     public String getCarName(){
        return carName;
            }  
}
