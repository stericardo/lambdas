# Author

Steven Ricardo Mendez Brenes
ricardostev@gmail.com

## Summary

The idea is to provide a repo with several functionalities about lambdas

## Clone repository
> git clone https://github.com/stericardo/lambdas.git
> Generate eclipse
> gradle eclipse

## Run configurations

### Build

• Name: lambdas-build

• gradle clean build

• ${workspace_loc:/lambdas}


### Run
• Name: lambdas-run

• gradle clean build

• ${workspace_loc:/lambdas}

### Functional paradigm
1. Create concise programs
2. Easy to parallelize
3. External interaction (What do I need to do, but not as I can achieve it)

## Dive into
The first thing that you need to know is about syntax of lambda expression:

> (parameter list) -> {instructions}

Example:
> (int x, int y) -> {return x + y;}

You can do as well: 
> (x, y) -> {return x + y;} the compiler determines the type of parameter

When the expression only has one instruction we can skip write return word and we can skip enter {}
> (x, y) -> x + y

Then for recap we have:
> (listaParámetros) -> {instructions}
> (int x, int y) -> {return x + y;}
> (x, y) -> {return x + y;}
> (x, y) -> x + y

## Streams
Similar to a Iterators, Streams implements java.util.stream, along with Lambdas they allow several tasks on collection elements


