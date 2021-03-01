/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblem2;

/**
 *
 * @author jonat
 */
public class Rental {
    public final static int MIN_HOUR=60;
    public final static int HOUR_RATE =40;
    private String conract_n;
    private int num_hours;
    private int num_min;
    private int equi_type;
    private String equi_type_s;
    private String phone_number;
    private double price;
    
    public Rental(int num_mins, String con_n){
        this.equi_type = 0;
        setHoursAndMinutes(num_mins);
        setContractNumber(con_n);
    }
    
    public Rental(){
        this.equi_type = 0;
        setHoursAndMinutes(0);
        setContractNumber("A000");
    }

    public void getEqui_type() {
        switch (this.equi_type) {
            case 1:
                this.equi_type_s = "Jet ski";
            case 2:
                this.equi_type_s = "Poonton boat";
            case 3:
                this.equi_type_s = "rowboat";
            case 4:
                this.equi_type_s = "Caone";
            case 5: 
                this.equi_type_s = "Beach chair";
            case 6:
                this.equi_type_s = "Umbrella";
            default:
                this.equi_type_s = "other";                   
        }        
    }

    public void setEqui_type(int equi_type) {
        this.equi_type = equi_type;  
        this.getEqui_type();
    }
    
    
    
    public void setPhoneNumber(String num){
        num = num.replace('(', '\0');
        num = num.replace(')', '\0');
        num = num.replace('-', '\0');
        num = num.replace(' ', '\0');
        num = num.replaceAll("\0", "");
        if (num.length()!=10) {
            num = "0000000000";
        }
        this.phone_number = num;
    }
    
    public String getPhoneNumber(){
        StringBuilder s = new StringBuilder(this.phone_number);
        s.insert(0, "(");                    
        s.insert(4, ")");
        s.insert(5, " ");        
        s.insert(9, "-");                
        
        this.phone_number = s.toString();
        return this.phone_number;
    }
    
    public void setContractNumber(String c_n){
        this.conract_n=c_n;
    }
    
    public void setHoursAndMinutes(int mins){
        this.num_hours = mins/MIN_HOUR;
        this.num_min = mins%MIN_HOUR;
        this.price = this.num_hours*40+num_min*1;
    }

    public String getConract_n() {
        return conract_n;
    }

    public int getNum_hours() {
        return num_hours;
    }

    public int getNum_min() {
        return num_min;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Rental{" + "conract_n=" + conract_n + ", num_hours=" + num_hours + ", equi_type_s=" + equi_type_s + ", phone_number=" + phone_number + ", price=" + price + '}';
    }
}
