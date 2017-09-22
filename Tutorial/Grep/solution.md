For the files challendge you need to let the machine and parse through zip file for the flag

On Linux, a command line utility allows you to do that, you can combine strings and grep to achieve your solution.

code:
strings files.zip | grep flag

![grep_solution](https://github.com/VBQL/HSF-CSAW-2017-Writeup-Th3_bad_b0yz/Writeups/Tutorial/Grep/solution.png)

The flag is:
