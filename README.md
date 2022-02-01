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
- The folders **bboom**, **dbboom**, **gboom**, **mboom**, **rboom**, **yboom** store png images with size 50 x 50 (20 images oer folder) which are used for balls disappearing animation correspondingly for blue, dark blue, green, magenta, red and yellow balls.

The background song of the game can be disabled by commenting out the "Starts the song" code section in the constructor of the class LFrame (lines 394 - 401).

The rules of the game (balls behavior) can be controlled from the main method of the class LInes by adjusting parameters of the constructor of the class LFrame:
- **colors** - the count of ball colors presented in the game (default 6).
- **dissballs** - the minimum number of balls of the same color which should be aligned in a horizontal, vertical, or diagonal manner in order to make the balls disappear from the board (default 5).
- **appballs** - the count of random balls which appear on the empty cells of the game board on each game step (default 3).


## Setup
(1) Change directory into the root of the project:
```sh
cd lines
```

(2) Compile the source code and keep the bytecode in the **target** folder:
```sh
javac -d target src/lines/*.java
```

(3) Create jar artifact:
```sh
cp -r src/META-INF/ target/
cd target
mkdir artifact
jar cfvm artifact/lines.jar META-INF/MANIFEST.MF lines/*.class
```

(4) Copy assets to the jar's directory:
```sh
cp -r ../assets/ ./artifact/
```

(5) Run the game:
```sh
cd artifact
java -jar lines.jar
```

## Contribution
A lot of improvements can be done to make the code less rigid, less fragile, and mobile. The current code is more likely the container of algorithms that are needed for the game, i.e. code organization is not done following the best practices of OOP design. So reorganization of the classes and applying design patterns to the code architecture will allow managing the game more flexibly as well as reuse the components for creating similar games.

## License
Copyright © 2015, [Ara Gasparyan](https://aragasparyan.com).
Released under the [MIT License](https://opensource.org/licenses/MIT).