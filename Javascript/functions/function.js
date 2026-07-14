function getGrade(Marks){
   if(Marks > 100){
    return "You enter invalid marks"
   }
   if(Marks < 0 ){
    return "You enter invalid marks"
   }
   if(Marks>90 && Marks<=100){
    return "A+"
   }
   else if(Marks>80 && Marks<90){
    return "A"
   }
   else if(Marks>70 && Marks<80){
    return "B"
   }
   else if(Marks>60 && Marks<70){
    return "C"
   }
   else if(Marks>33 && Marks<60){
    return "D"
   }
   else{
    return "F"
   }
}

console.log(getGrade(95))


function RockPaperScissor(User , Computer){

    switch (User) {
        case User === Computer:
            return "Tie"
        case User === "Rock" && Computer === "Scissor":
            return "User Win"
        case User === "Paper" && Computer === "Rock":
            return "User Win"
        case User === "Scissor" && Computer === "Paper":
            return "User Win"
        default:
            return "Computer Win"
    }
    // if(User === Computer){
    //     return "Tie"
    // }
    // if(User === "Rock" && Computer === "Scissor"){
    //     return "User Win"
    // }
    // if(User === "Paper" && Computer === "Rock"){
    //     return "User Win"
    // }
    // if(User === "Scissor" && Computer === "Paper"){
    //     return "User Win"
    // }
    // return "Computer Win"
}


console.log(RockPaperScissor("Rock","Scissor"))

function Weekdays(day){
    switch(day){
        case 1:
            return "Monday"
        case 2:
            return "Tuesday"
        case 3:
            return "Wednesday"
        case 4:
            return "Thursday"
        case 5:
            return "Friday"
        case 6:
            return "Saturday"
        case 7:
            return "Sunday"
        default :
            return "Invalid day"
    }
}
console.log(Weekdays(3))


function MultiplicationTable(num){
    for(let i=1;i<=10;i++){
        console.log(`${num} * ${i} = ${num * i}`)

    }
}
console.log(MultiplicationTable(10))

