# GameEngine

With this release the game engines functionality compiles 100% and should run smoothly. 
The whole creation history of this engine can be found under CV_PeliJavalla however some of the commentary can be in finnish because I never realised that the game engine would run this smoothly.

I will add up on the engine section, if I would add up something really interesting to the basic engine mechanics. However the main purpose of this engine is to show one way how to do it. And that it could be used for learning purposes. This is not meant to be a game. Or used as a direct copy-paste.

It's best that the code is analysed with the question: Why? was this done. Not ctrl+c and ctrl+v because it works. But rather ask why it works.


# This Game Engine is a mesh example of how to do a real-time game using java swing utilities.

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
