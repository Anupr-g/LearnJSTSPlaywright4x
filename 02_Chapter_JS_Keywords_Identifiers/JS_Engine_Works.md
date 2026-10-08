How JavaScript Engine Works

A JavaScript engine is a program that reads, parses, compiles, and executes JavaScript code.

1. Tokenization / Lexical Analysis

The JavaScript engine first reads the source code and breaks it into smaller meaningful units called tokens.

This process is called tokenization or lexical analysis.

Example:

let age = 25;

The engine identifies tokens such as:

let → keyword
age → identifier
=   → operator
25  → numeric literal
;   → punctuation

2. Parsing and AST Creation

The engine takes these tokens and organizes them into a tree-like structure called an Abstract Syntax Tree (AST).

The AST represents the structure and meaning of the JavaScript code.

So:

Source Code
     ↓
Tokens
     ↓
AST

3. Interpreter and Bytecode

The JavaScript engine uses the AST to generate an intermediate representation, commonly called bytecode, which the interpreter executes.

The interpreter starts executing the code relatively quickly without waiting for the entire program to be compiled into highly optimized machine code.

AST
 ↓
Bytecode
 ↓
Interpreter
 ↓
Execution

Important correction: The AST itself does not directly "pass the code to the interpreter." The engine uses the AST to produce an executable intermediate representation such as bytecode.

4. JIT Compilation

While the JavaScript code is running, the engine monitors which parts of the code are executed frequently.

These frequently executed parts are called hot code or hot paths.

The JIT (Just-In-Time) compiler can compile this hot code into optimized machine code, allowing it to execute faster.

Frequently executed code
        ↓
     Hot code
        ↓
    JIT Compiler
        ↓
Optimized Machine Code
        ↓
      Faster Execution

5. Deoptimization

The JIT compiler makes certain assumptions while optimizing the code.

If one of those assumptions becomes invalid, the engine can deoptimize the optimized code and fall back to a less optimized execution path.

For example, if the engine observes that a variable consistently contains numbers:

let value = 10;
value = 20;
value = 30;

it may optimize operations based on that observed behavior.

If the code later changes:

value = "Hello";

the previous optimization may no longer be valid, so the engine can deoptimize and adjust its execution strategy.

Simple Overall Flow
JavaScript Source Code
          ↓
    Tokenization
          ↓
         AST
          ↓
      Bytecode
          ↓
     Interpreter
          ↓
       Execution
          ↓
   Monitor Hot Code
          ↓
    JIT Compiler
          ↓
 Optimized Machine Code
          ↓
    Faster Execution
          ↓
   Deoptimization
   (if required)
   
One-line interview definition

A JavaScript engine tokenizes and parses source code into an AST, generates executable intermediate code such as bytecode, executes it through an interpreter, and uses JIT compilation to optimize frequently executed code into machine code for better performance.