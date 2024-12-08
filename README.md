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

UPDATE 8 Dec 2024:
I managed to make the gittering stop for some heights, however I would like to find a permanent solution.
I think i should try and make a more realistic model that calculates forces, maybe that would solve the problem.
I also made the bounce function more general by moving the if statement in the actionPerformed function so that later
when i add more balls I can use it for ball-to-ball bounces.