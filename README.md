# Moped
Overview

This program  allows a user to drive a virtual Moped around the virtual streets of Manhattan.

The program accepts the following commands from the user:

"go left"
"go right"
"straight on"
"back up"
"how we doin'?"
"fill 'er up"
"park"
"go to Petite Abeille"
"help"
See below for details.

Driving

The user simply instructs the Moped to "go left", "go right", "straight on", or "back up", and Moped moves one block in the chosen direction.
The Moped always starts out its life at 10th St. and 5th Ave., facing South.
The program must announce the Moped's current location, when it starts, and with every move.
If the user commands the Moped to "park", then the program outputs a message indicating the Moped has been parked on the sidewalk, and quits.
Turning left while going forwards is a different thing from turning left while in reverse, hence your moped must keep track of its orientation.

Gas

The moped's gas tank stores up to 1 gallon. It comes pre-filled.
Driving the moped burns 1/20th of gallon per city block.
If the user enters the command, "how we doin'?", the program outputs the current level of gasoline in the tank, as a percentage.
If the Moped runs out of gas, the user is notified that the Moped has run out of gas and no longer drives, and the program should quit.
To refill the gas tank, the user simply instructs the program to "fill 'er up".

Homing

The Moped has a special "go to Petite Abeille" command that automatically drives the Moped from wherever it happens to be to Petite Abeille restaurant at 17th St. and 6th Ave.
The Moped auto-drives itself one block at a time to the address of Petite Abeille, outputting its location with each block.
Location-based advertising

The Moped outputs ads when it reaches the locations of certain landmarks:

at 79th St. and 8th Ave., the Moped should output an ad for the American Museum of Natural History.
at 74th St. and 1st Ave., the Moped should output an ad for Memorial Sloan Kettering.
at 12th St. and 4th Ave., the Moped should output an ad for The Strand book shop.
at 3rd St. and 6th Ave., the Moped should output an ad for Fayda Coffee Tea Cookies Cake shop.

Help

If the user enters the command, "help", the program should display a list of commands that the program understands.


Assumptions

The program follows a few key assumptions:

Geography:

Assume that Manhattan is just a simple 200x10 grid of numbered city streets, thus ignoring real-world irregularities in geography and street names.

Users must not be allowed to drive their Moped off the grid... sorry :(

Street naming:

Assume that Streets are named 1st St, 2nd St, 3rd St, and so on up to 200th St.
Assume that Avenues are named 1st Ave, 2nd Ave, 3rd Ave, 4th Ave and so on up to 10th Ave.

Street directions:

Assume that Street numbers increase as you go North.
Assume that Avenue numbers increase as you go West.
