
Part 2

 

OP1
Error: The chacters don't rotate at all.

 

OP2 
Error: When the character rotates by the maximum value, the
result is wrong

 

OP3
Error: When we try to rotate @, it doesnt rotate at all and
stays at @.

 

OP4
Error: When we try to rotate 'space', it returns a 'space'
instead of !.

 

Part 3

1. "Real" runtime 

            StringBuilder

            0m10m.802s

            0m11.518s

            0m10.852s

 

            String Concatenation

            0m43.811s

            0m42.505s

            0m41.188s

 

 

2. StringBuilder is more efficient than String Concatenation
because StringBuilder doesn't create a new string each time it goes through the for loop.

 

3. Writing the code for part A was much easier espcially because I already knew how to use
String Concatenation and didn't know StringBuilder. 

Also, String Concatenation basically only needed += but for StringBuilder we
had to convert it back to string.

 

Summary

 

1. The tests I wrote in part 2 helped me prevent all the
possible errors that could have happend in part 3

 

2. In Caesar Cipher, you type a word and the number of
rotation you on each character(rotating is changing each letter ex. rotating a by 2 will
make it c and rotating e by -3 will be b.) Then the code looks at each letter and rotates
them. Then it prints out the new encrypted word.

 

 

   

 

 
