let temp = 35;
let feel  = (temp > 40) ? "Very Hot" :
            (temp >= 30) ? "Hot" :
            (temp >= 10) ? "Cool" : "Cold";

console.log(`Temperature : ${temp} - Feel : ${feel}`);