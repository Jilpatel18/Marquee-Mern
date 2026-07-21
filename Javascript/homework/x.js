class Payment{
    constructor(order){
        this.order = order;
    }

    getTotalAmout(){

        //cart mathi iterate karse

        let total = 0;
        for(let p of this.order.products){
            total+=p.price;
        }
        return total;
    }
    checkoutForPayment(orderId){
        console.log("\n===Payment===");
        //apde intially ene 1 rakhi jyare bijo objext bnse tyare echange thy ne 2 thy jase 

        console.log("Order Id :", orderId);

        console.log("Total amount :",this.getTotalAmout());
        // console.log("Payment is successful")
        let paymentstatus = true;
        if(paymentstatus){
            console.log("payment is success");
            return true;
            
        }else{
            console.log("payment is failed");
            return false;
        }
    }

}

//order mate class
class Order{
    constructor(){
        this.products = [];
        this.cartItems = [];
        this.orderId = 1;
    }
    createProduct(...products){
        this.products.push(...products);
        console.log("Product Added");
        
    }
    getProDetail(productId){
        const product = this.products.find(p=>p.productId=productId);
        if(product){
            console.log(product);
            
        }else{
            console.log("Not Found");
            
        }
    }

    addToCart(productId){
        const index = this.products.findIndex(p=>p.productId === productId);
        if(index === -1){
            console.log("Not Availble");
            return;
        }
        const product = this.products.splice(index,1)[0];
        this.cartItems.push(product);
        console.log(product.description+"added");
        
    }
    remove(productId){
        const index = this.cartItems.findIndex(p=>p.productId===productId);
        if(index === -1){
            console.log("Not found");
            return;
        }
        const product = this.cartItems.splice(index,1)[0];
        this.products.push(product);
        console.log(product.description + "removed");
        
    }
    makeOrder(products){
        if(this.cartItems.length===0){
            console.log("cart empty");
            return null;
        }
        console.log("Order created");
        return{
            orderId : this.orderId++,
            products : this.cartItems
        };
    }
}

//notification calss 
class Notification{
    notification(type){
        if(type==="success"){
            console.log("order success");
            
        }else{
            console.log("order cancel");
            
        }
    }
}

const order = new Order();

order.createProduct(
    {
        productId:1,
        description:"laptop",
        price:85999
    },
    {
        productId:2,
        description:"Mouse",
        price:1299
    },
    {
        productId:3,
        description:"keyborad",
        price:3500
    },
    {
        productId:4,
        description:"RTX 5090",
        price:250000
    },
    {
        productId:5,
        description:"airphone",
        price:10000
    },
    {
        productId:6,
        description:"asus rog phone 6",
        price:59999
    }
);


console.log("Products");
console.log(order.products);

//order kari have
order.addToCart(1);
order.addToCart(4);
order.addToCart(3);

console.log(order.cartItems);

console.log(order.products);

//aya order id 2 thy jase agad jyare payment karusu 
// order.makeOrder(order.cartItems);
//elte apde navo object banvse
const newOrder = order.makeOrder();
const pay = new Payment(newOrder);
const payment = pay.checkoutForPayment(newOrder.orderId);

const notification = new Notification()
if(payment){
    notification.notification('success');
}else{
    notification.notification('failed');
}