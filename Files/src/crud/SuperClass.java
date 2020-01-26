package crud;

class SuperClass 
{ 
    int maxSpeed = 120; 
    public static void main(String[] args) 
    { 
        Car small = new Car(); 
        small.display(); 
    } 
} 
  
/* sub class Car extending vehicle */
class Car extends SuperClass 
{ 
    int maxSpeed = 180; 
    void display() 
    { 
        /* print maxSpeed of base class (vehicle) */
        System.out.println("Maximum Speed: " + super.maxSpeed); 
    } 
} 
  
/* Driver program to test */
class Test 
{ 
    public static void main(String[] args) 
    { 
        Car small = new Car(); 
        small.display(); 
    } 
} 
