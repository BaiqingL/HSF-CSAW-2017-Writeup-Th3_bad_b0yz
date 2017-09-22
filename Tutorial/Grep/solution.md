For the files challendge you need to let the machine and parse through zip file for the flag

On Linux, a command line utility allows you to do that, you can combine strings and grep to achieve your solution.

code:
strings files.zip | grep flag

![grep_solution](/Writeups/Tutorial/Grep/solution.png?raw=true)

The flag is:
flag{its_gnu_linux_to_y0u}