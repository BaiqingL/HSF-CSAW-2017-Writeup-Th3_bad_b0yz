Since in this challenge we knew that there would be delted data that we need to recover, lets find some good data recovery software.

Now a little bit of a lesson, when your computer "deletes" a file, it doesn't actually delete the file rather it just marks the file as "deleted".

This is both to save time and resources as overwriting the data everytime you delete them takes a long time.

So lets again use a good Linux framework called SleuthKit (TSK) to find out what's going on.

First let's scan the fat.fs filesystem

fls -r fat.fs

The results given to us is:
ctf@ubuntu:~$ fls -r fat.fs 
r/r 5:	fk1onhl4.default.zip
r/r * 7:	flag2.png
r/r 9:	flag.txt
r/r 12:	mypasswords.pdf
v/v 163523:	$MBR
v/v 163524:	$FAT1
v/v 163525:	$FAT2
d/d 163526:	$OrphanFiles

Good! There is a flag2.png which is deleted, let's recover that.

icat -r fat.fs 7 > flag.png

The number 7 represents the location of the file, and we are extracting it out of the file system.

The flag is:
![Mount_Image](/Herbert/Mount_Image/solution.png?raw=true)
