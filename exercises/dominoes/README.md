# Dominoes

Make a chain of dominoes.

Compute a way to order a given set of dominoes in such a way that they form a
correct domino chain (the dots on one half of a stone match the dots on the
neighbouring half of an adjacent stone) and that dots on the halfs of the stones
which don't have a neighbour (the first and last stone) match each other.

For example given the stones `21`, `23` and `13` you should compute something
like `12 23 31` or `32 21 13` or `13 32 21` etc, where the first and last numbers are the same.

For stones 12, 41 and 23 the resulting chain is not valid: 41 12 23's first and last numbers are not the same. 4 != 3

Some test cases may use duplicate stones in a chain solution, assume that multiple Domino sets are being used.

The Scala exercises assume an SBT project scheme. The exercise solution source
should be placed within the exercise directory/src/main/scala. The exercise
unit tests can be found within the exercise directory/src/test/scala.

To run the tests simply run the command `sbt test` in the exercise directory.

For more detailed info about the Scala track see the [help
page](http://exercism.io/languages/scala).



## Submitting Incomplete Solutions
It's possible to submit an incomplete solution so you can see how others have completed the exercise.
