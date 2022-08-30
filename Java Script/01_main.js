//alert('Hello from JavaScript!!')
//document.getElementById("message").innerHTML="This is from JavaScript!!";
//function greet() 
//{
//    document.getElementById("message").innerHTML="Happy Ganesh Chaturti";    
//}

//  a=10;
//  b=20;
//  c = a+b;

// document.getElementById("message").innerHTML= "Addition of "+ a + " and " + b + " is "+ c; 

//  x =10;
// let y =10;
// console.log(" value of x = " + x);
// console.log(" value of y = " + y);
// {
//  x=20;
//  let y = 20;
// console.log(" value of x = " + x);
// console.log(" value of y = " + y);
// }
// console.log(" value of x = " + x);
// console.log(" value of y = " + y);


// function greetuser() 
// {
//     let username = document.getElementById("username").value;
//     document.getElementById("message").innerHTML = " Hello "  + username;    
// }

// function minus() 
// {
//     let num1 = document.getElementById("num1").value;
//     let num2 = document.getElementById("num2").value;
//     let minus = num1-num2;
//     document.getElementById("message").innerHTML="substraction is "+minus;
// }


// function mult() 
// {
//     let num1 = document.getElementById("num1").value;
//     let num2 = document.getElementById("num2").value;
//     let mult = num1*num2;
//     document.getElementById("message").innerHTML="multiplication is "+mult;
// }


// function div() 
// {
//     let num1 = document.getElementById("num1").value;
//     let num2 = document.getElementById("num2").value;
//     let minus = num1/num2;
//     document.getElementById("message").innerHTML="division is "+minus;
// }

// function add() 
// {
//     let num1 = parseInt(document.getElementById("num1").value);
//     let num2 = parseInt(document.getElementById("num2").value);
//     let add = num1 +num2
//     document.getElementById("message").innerHTML = "addition is " + add;
// }



// const cars = ['Getz Prime', ' Honda Amaze', ' i20', ' sBreeza'];
// document.getElementById('message').innerHTML = cars;


// var date = new Date();
// document.getElementById("fulldate").innerHTML=date;

// switch(date.getDay())
// {

// case 1:
//     document.getElementById("day").innerHTML='Monday';
//     break;

// case 2:
//         document.getElementById("day").innerHTML='Tuesday';
//         break;

// case 3:
//             document.getElementById("day").innerHTML='Wednesday';
//             break;
            
// case 4:
//                 document.getElementById("day").innerHTML='Thursday';
//                 break;

// case 5:
//                     document.getElementById("day").innerHTML='Friday';
//                     break;  
                    
// case 6:
//                         document.getElementById("day").innerHTML='Saturday';
//                         break;

// case 7:
//     document.getElementById("day").innerHTML='Sunday';
//     break;
// }


// switch(date.getMonth())
// {

// case 0:
//     document.getElementById("month").innerHTML='Jan';
//     break;

// case 1:
//         document.getElementById("month").innerHTML='Feb';
//         break;

// case 2:
//             document.getElementById("month").innerHTML='Mar';
//             break;
            
// case 3:
//                 document.getElementById("month").innerHTML='Apr';
//                 break;

// case 4:
//                     document.getElementById("month").innerHTML='May';
//                     break;  
                    
// case 5:
//                         document.getElementById("month").innerHTML='Jun';
//                         break;

// case 6:
//     document.getElementById("month").innerHTML='July';
//     break;

// case 7:
//     document.getElementById("month").innerHTML='Aug';
//     break;

// case 8:
//     document.getElementById("month").innerHTML='Sept';
//     break;

// case 9:
//     document.getElementById("month").innerHTML='Oct';
//     break;

// case 10:
//     document.getElementById("month").innerHTML='Nov';
//     break;

// case 11:
//     document.getElementById("month").innerHTML='Dec';
//     break;
// }



// document.getElementById("day").innerHTML=date.getDate();
// document.getElementById("month").innerHTML=date.getMonth()+1;
// document.getElementById("year").innerHTML=date.getFullYear();
// document.getElementById("hours").innerHTML=date.getHours();
// document.getElementById("minutes").innerHTML=date.getMinutes();
// document.getElementById("seconds").innerHTML=date.getSeconds();


// simple for loop
// const cars = ['Getz Prime', ' Honda Amaze', ' i20', ' sBreeza'];
// let text ="";
// let length = cars.length
// for(let i=0;i<length;i++)
// {
//     text = text +" Car is " + cars[i] + "<br>";
// }
// document.getElementById("message").innerHTML = text;

//for in

// const cars = ['Getz Prime','Honda Amaze', 'i20','Breeza'];
// let text="";
// for(let i in cars)
// {
//     text = text + "cars is" + cars[i] + "<br>";
// }
// document.getElementById("message").innerHTML = text;


//for of

// const cars = ['Getz Prime','Honda Amaze', 'i20','Breeza'];
// let text = "";
// for(let car of cars)
// {
//     text = text + "car is "+car +"<br>"
// }
// document.getElementById("message").innerHTML=text;



function validate()
{
    alert("validate method is called");
    if(document.userdetails.username.value=="")
    {
        alert("please provide user name!")
        document.userdetails.username.focus();
        return false;
    }
    if(document.userdetails.email.value=="")
    {
        alert("please provide email!")
        document.userdetails.email.focus();
        return false;
    }
    if(document.userdetails.zipcode.value=="")
    {
        alert("please provide zipcode!")
        document.userdetails.zipcode.focus();
        return false;
    }
    if(document.userdetails.country.value==-1)
    {
        alert("please select country!")
        document.userdetails.country.focus();
        return false;
    }
    return true;
}




