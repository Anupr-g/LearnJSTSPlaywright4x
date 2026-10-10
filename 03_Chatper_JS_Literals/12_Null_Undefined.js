// ============================================================
// Topic: null vs undefined in JavaScript
// ============================================================

/*
  SIMPLE DEFINITIONS:

  undefined  =>  A variable exists, but it has not been assigned any value yet.
                 JavaScript itself sets this automatically.

  null       =>  A variable exists, but the developer explicitly assigns 
                "no value" or "empty".
                 It is intentional absence of any value.
*/

// var x;
// console.log(x);

// var audi = null;
// console.log(audi);

// --------------------------------------------------------
// 1. undefined
// --------------------------------------------------------
let userName;// This variable is declared but not assigned any value, so it is undefined.
console.log("User Name = "+userName); //Output: undefined
console.log(typeof userName);


function greet(){
    //not return statement, so it will return undefined
};
console.log("Greet = "+greet()); //Output: undefined


// --------------------------------------------------------
// 2. null
// --------------------------------------------------------
let userAge = null; // This variable is explicitly assigned a null value, indicating that is has no value.
console.log("Age = "+userAge); //Output: null
console.log(typeof userAge); //Output: object (this is a known quirk in JavaScript, where null is considered an object type)




/*
  | Feature              | undefined                     | null                           |
  |----------------------|-------------------------------|--------------------------------|
  | Meaning              | Not assigned yet              | Intentionally empty            |
  | Who sets it?         | JavaScript automatically      | Developer manually             |
  | Type                 | undefined                     | object (historical bug in JS)  |
  | ==  comparison       | null == undefined  -> true    |                                |
  | === comparison       | null === undefined -> false   |                                |
*/