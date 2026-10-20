const browsers = ["chrome", "firefox", "webkit"];

console.log("Array Length = "+browsers.length);      // 3

console.log("=======================Positive index==========================="); 
console.log(browsers[0]);          // 
console.log(browsers[1]);          // 
console.log(browsers[2]);          // 
console.log(browsers[3]);          // Undefined

console.log("=======================Negative index==========================="); 
//Negative index
console.log(browsers.at(-0));      // chrome (Index= 0)
console.log(browsers.at(-1));      // 
console.log(browsers.at(-2));      // 
console.log(browsers.at(-3));      // 
console.log(browsers.at(-4));      // Undefined
