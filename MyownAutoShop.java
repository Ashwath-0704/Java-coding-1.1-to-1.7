/*

Create a super class called Car. The Car class has the following fields and methods.
*int speed;
* double regularPrice;
* String color;
* double getSalePrice();

*/ 
class car {
    int Speed;
    double RegularPrice;
    String Color;

    public car() {
        super();
    }
    public car(int speed,double regularPrice, String color) {
        super();
        this.Speed=speed;
        this.RegularPrice=regularPrice;
        this.Color=color;
    }
    double getsalePrice(){
        return RegularPrice;
        }
}

/*

Create a sub class of Car class and name it as Truck. 
The Truck class has the following
fields and methods.
* int weight;
* double getSalePrice(); //If weight>2000,10%discount. Otherwise, 20% discount.

*/
class Truck extends car  {
    int Weight;
    
    public Truck(int speed,double regularPrice, String color,int weight) {
        super(speed, regularPrice, color);
        this.Weight=weight;
    }

    double getsalePrice(){
        int discount=1;
        double saleprice = 0;

        if (Weight>2000){
            discount=10;
            saleprice =this.RegularPrice-(discount*this.RegularPrice/100); 
        } else {
            discount=20;
            saleprice =this.RegularPrice-(discount*this.RegularPrice/100);    
        }
        return saleprice;
    }
}
/*

Create a subclass of Car class and name it as Ford.
The Ford class has the following
fields and methods
* int year;
* int manufacturerDiscount;
* double getSalePrice(); //From the sale price computed from Car class,subtract
the manufacturer Discount.

*/

class Ford extends car {
    private int year;
    private int manufacturerDiscount;
    
    public Ford(int speed,double regularPrice, String color,int year,int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year=year;
        this.manufacturerDiscount=manufacturerDiscount;
    }

    public double getSalePrice() {
    	return super.getsalePrice() - manufacturerDiscount;
        }
    }

/*

Create a subclass of Car class and name it as Sedan. 
The Sedan class has the following
fields and methods.
* int length;
* double getSalePrice(); //If length>20 feet, 5% discount, Otherwise, 10% discount.

*/

class sedan extends car {
    private int length;

        public sedan (int Speed,double regularPrice,String color, int length) {
        super (Speed,regularPrice,color);
        this.length = length;
    }
    double getSalesPrice(){
               int discount = 1;
               double salesprice = 0;
            if(length>20){	
                    discount = 5;	
                    salesprice = this.RegularPrice-(discount * this.RegularPrice/100);
               }
            else{
                    discount = 10;
                    salesprice = this.RegularPrice-(discount * this.RegularPrice/100); 	
               }
        return salesprice;
       }
    }

/*

Create MyOwnAutoShop class which contains the main() method. Perform the following
within the main() method.

* Create an instance of Sedan class and initialize all the fields with appropriate
values. Use super(...) method in the constructor for initializing the fields of the
superclass.

* Create two instances of the Ford class and initialize all the fields with appropriate
values. Use super(...) method in the constructor for initializing the fields of the
super class.

* Create an instance of Car class and initialize all the fields with appropriate
values. Display the sale prices of all instance.

*/
public class MyownAutoShop{
    public static void main(String[] args) {
        //car
        car s1 = new car(120, 120000, "red");
        System.out.printf("This car sale price is s1=%.2f \n",s1.getsalePrice());
        
        //Truck
        // Truck s2 = new Truck(100,50000, "red", 1000);
        // System.out.printf("This Truck sale price is s1=%.2f \n",s2.getsalePrice());
        
        // ford
        // 1st input
            Ford f1 = new Ford(100, 500, "black", 2021, 10);
            System.out.printf("This 2nd Ford sale price is s1=%.2f \n",f1.getsalePrice());
        // 2nd input
            Ford f2 = new Ford(120, 400, "red", 2021, 25);
            System.out.printf("This 2nd Ford sale price is s1=%.2f \n",f2.getsalePrice());
        
            // sedan
        sedan e1= new sedan(150, 100, "black", 50);
        System.out.printf("This Sedan sale price is s1=%.2f \n",e1.getsalePrice());
    }
}