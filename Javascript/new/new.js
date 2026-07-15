function createBankAccount(AccountHolder , Mobile , Email , Balance =0 ){
    let balance = Number(Balance);
    function deposit(amount){
        if(amount>0){
            balance+=amount;
            sendMail.call(this, "deposit", amount, balance);
            return `Balance is ${balance}`;
        }
        return "Invaild deposit amount";
    }
    function withdraw(amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            sendMail.call(this, "withdraw", amount, balance); // for apply add ["withdraw", amount, balance]
            return `Balance is ${balance}`;
        }else{
            InsufficientBalance.call(this,"withdraw",amount,balance);
        }

        return "Withdraw Failed";
    }
    function checkBalance(){
        return `Current Balance is ${balance}`;
    }
    return {
        AccountHolder,
        Mobile,
        Email,
        deposit,
        withdraw,
        checkBalance,
    };
}

function sendMail(transaction, amount, balance) {
    console.log(`

To: ${this.Email}

Hello ${this.AccountHolder},

This is to inform you that an amount of ₹${amount} has been successfully ${transaction}ed.

Available Balance: ₹${balance}

`);
}
function InsufficientBalance(transaction,amount,balance){
    console.log(`
To: ${this.Email}

Hello ${this.AccountHolder},

This is infrom you that u dont have sufficent balance;
        `)
}

const account  = createBankAccount(
    "Jil",
    "9638527411",
    "qwerty@gmail.com",
    10000,
)

console.log(account.checkBalance());
console.log(account.withdraw(10500));
console.log(account.deposit(5000));
console.log(account.checkBalance());



//  13. Secure Bank Account (Factory Function + Closures)
// ∙ Create a Factory Function named createBankAccount().
// ∙ Properties:
// ∙ Account Holder
// ∙ Mobile
// ∙ Email
// ∙ Balance should remain private using closures.
// ∙ Methods:
// ∙ I
// ∙ deposit(amount)
// ∙ withdraw (amount)
// ∙ checkBalance()


// function createBankAccount(accountHolder, mobile, email, balance) {
    
//     let currentBalance = balance;

//     return {
//         deposit(amount) {
//             if (amount > 0) {
//                 currentBalance += amount;
//                 console.log(`₹${amount} deposited successfully.`);
//             } else {
//                 console.log("Invalid deposit amount.");
//             }
//         },

//         withdraw(amount) {
//             if (amount <= 0) {
//                 console.log("Invalid withdrawal amount.");
//             } else if (amount > currentBalance) {
//                 console.log("Insufficient balance.");
//             } else {
//                 currentBalance -= amount;
//                 console.log(`rs${amount} withdrawn successfully.`);
//             }
//         },

//         checkBalance() {
//             console.log(`Current Balance: rs${currentBalance}`);
//         },

//         checkBankProfile() {
//             console.log("----- Bank Profile -----");
//             console.log("Account Holder:", accountHolder);
//             console.log("Mobile:", mobile);
//             console.log("Email:", email);
//             console.log("Balance: rs" + currentBalance);
//         }
//     };
// }

// // Create Account
// const account = createBankAccount("Arpita Pandey","9876543210","arpita@example.com",10000);

// account.checkBankProfile();

// account.deposit(5000);
// account.checkBalance();

// account.withdraw(3000);
// account.checkBalance();

// account.withdraw(15000); 

// console.log(account.currentBalance);
