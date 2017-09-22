This challendge requires you to mount the filesystem fat.fs to your computer in order to analyze the internals, well lets do that.

Again, Linux has the command line utility mount to mount things. Let's do that shall we?
Run the command "mkdir CTF && mount fat.fs CTF/"
There we go! Let's go in and see what we find.

![examine](/Herbert/File Carve/examine.png)

Woah the flag.txt is right there, let's open it up now. The flag is:
flag{m4ybe_file_carve_next}
