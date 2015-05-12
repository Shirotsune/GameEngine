# GameEngine

This Game Engine is a mesh example of how to do a real-time game using java swing utilities.

Overview:

Although it is possible to use Main class for the main game loop I had decided to create a Cardinal class for running the main game loop.

Naming of the functions is irrelevant.


The basic structure is that main calls GUI for rendering the game and then starts the main game loop.

At each frame the following happens:
Wait for 25 milliseconds. (40 FPS)
call function to check, if any keys were pressed and therefore should there be any logic to take care of.
!!! This is for avoiding any type of race conditions.
After checking everything the graphics will render everything again and update the player pos. 
(And any other potential game assets?)


Current keymapping is:
W is jump. 
Hint: - Using W again while in air will double jump.

D is right.
A is left.
