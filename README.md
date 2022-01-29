# Lines
A game from the 90's written by Core Java. On each game step, 3 random balls appear on the empty cells of the game board. The positions and colors of random balls are distributed uniformly. On each game step, a ball can be moved from its current position to an empty position (if there is a path) and if 5 or more balls of the same color are aligned in a horizontal, vertical, or diagonal manner all the balls disappear from the board.

## Adjsuting the game
From the assets folder, you can configure the game by putting corresponding assets.
- **leftpanel** and **rightpanel** folders store left and right images (left.png and right.png) of the game windows. The sizes of images are recommended to be 119 x 453.
- **audio** folder stores the background song (fonSong.au) of the game which repeats continuously.
- **static** folder's content is used for building static views to the game board, it holds the following list of images all with size 50 x 50 and format gif:
  - empty.gif - representing an empty cell
  - blue.gif - representing a blue ball
  - darkblue.gif - representing a dark blue ball
  - green.gif - representing a green ball
  - magenta.gif - representing a magenta ball
  - red.gif - representing a red ball
  - yellow.gif - representing a yellow ball
- **clickmotion** folder stores gif images for animating a ball when a player clicks on the ball. All the images have size 50 x 50 and named as follows:
  - mblue.gif - representing a blue ball animation on a user click on it
  - mdarkblue.gif - representing a dark blue ball animation on a user click on it
  - mgreen.gif - representing a green ball animation on a user click on it
  - mmagenta.gif - representing a magenta ball animation on a user click on it
  - mred.gif - representing a red ball animation on a user click on it
  - myellow.gif - representing a yellow ball animation on a user click on it
- **path** folder stores images with size 50 x 50 and format gif which are used for path painting during a ball movement.
- 