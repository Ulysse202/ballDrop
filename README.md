6 Dec 2024
This is a very basic project that allows me to have fun with basic physic simulations.
One ball is dropped and bounces on the floor, you can click anywhere on the window to make the ball drop from somewhere else.

Few bugs:
The ball never stops bouncing.
The ball clips into the ground.
(if you have a solution I am open to suggestions.)

UPDATE 7 Dec 2024:
I managed to fix the clipping by checking if the ball will go through 
the ground before returning it's next position.
However, I want to be able to change the damping factor, and right now the 
only damping factor that doesn't make the ball bounce infinitely is 3.  