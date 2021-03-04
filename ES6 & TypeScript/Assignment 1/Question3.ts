class Order{
    constructor(id, name, price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    getPrice(){
        console.log("Price: "+this.price); 
    }
    printOrder(){
        console.log("Id: "+this.id "\nName: "+this.name"\nPrice:"+this.price);
    }
}

var object = new Order(1, "Chicken Biryani", 120);
object.getPrice();
object.printOrder();

var object1 = new Order(2, "Mutton Biryani", 180);
object1.getPrice();
object1.printOrder();
