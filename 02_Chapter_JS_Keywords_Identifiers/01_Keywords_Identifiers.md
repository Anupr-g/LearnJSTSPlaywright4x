1. What are Keywords?

Keywords are reserved words in JavaScript that have a predefined meaning. They are part of the JavaScript language syntax and cannot normally be used as names for variables, functions, classes, etc.

List of Rules for Keywords
1) Keywords have a predefined meaning in JavaScript.
2) Keywords cannot be used as identifiers.
3) Keywords are generally written in lowercase.
4) Keywords cannot be used as variable, function, or class names.
5) JavaScript keywords are case-sensitive.
6) A keyword must be used according to its defined purpose.
Examples
let age = 25;
const name = "Rahul";

if (age > 18) {
    console.log(name);
}

Here:

let → Keyword
const → Keyword
if → Keyword
age → Identifier
name → Identifier

2. What are Identifiers?

Identifiers are the names given by programmers to variables, functions, classes, objects, and other elements in JavaScript.

List of Rules for Identifiers
1) An identifier can contain letters (A-Z, a-z).
2) An identifier can contain numbers (0-9), but it cannot start with a number.
3) An identifier can contain underscore (_).
4) An identifier can contain dollar sign ($).
5) An identifier cannot contain spaces.
6) An identifier cannot normally contain special characters such as @, #, %, -, &, etc.
7) An identifier cannot be a JavaScript keyword.
8) Identifiers are case-sensitive.
9) Identifiers should use meaningful names for better readability.
10) JavaScript also allows certain Unicode characters in identifiers, but standard English letters, _, and $ are most commonly used.
Examples
let studentName = "Rahul";
let studentAge = 25;
let _address = "Nagpur";
let $salary = 50000;

All of these are valid identifiers.

Invalid Examples
let 123name = "Rahul";     // ❌ Cannot start with number
let student name = "Rahul"; // ❌ Cannot contain spaces
let student-name = "Rahul"; // ❌ Hyphen is not allowed
let class = "JavaScript";   // ❌ Keyword cannot be used

Easy Way to Remember

- Keyword → Reserved by JavaScript

- Identifier → Name created by the programmer