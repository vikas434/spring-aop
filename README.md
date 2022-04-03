# spring-aop
A simple spring AOP to demo log execution time

## Details
1. It has a dummy controller and dummy service which does some heavy lifting of work for 2 sec.
2. With the use of annotation ```@LogExecutionTime``` we can measure the time taken by any method.
3. It has a simple advice with Join point with ```@Around``` option.

###### _This example is good for any beginner to start with AOP._
