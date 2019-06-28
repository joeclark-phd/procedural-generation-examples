# procedural-generation-examples

This repo contains a simple Java program to run some examples of procedural generation from my `net.joeclark.proceduralgeneration` package:

- Currently there's only one artifact, **MarkovTextGenerator**, found in [joeclark-phd/random-text-generators](https://github.com/joeclark-phd/random-text-generators).  This reads text strings from a training data set (i.e. a file of real-world names) and generates original random text that should be similar-sounding to the training data. 


## To run
First, clone or download the **random-text-generators** project, `cd` into that directory, and use Maven to install it locally: `mvn install`

Next, clone or download this repo to your system,
and open and run it in IntelliJ or something because I sure can't figure out how to run it from the command line!

## Training data
Training data files are stored in the `src/main/resources` directory if you'd like to add some of your own.