# procedural-generation-examples

This repo contains a simple Java program to run some examples of procedural generation from my `net.joeclark.proceduralgeneration` package:

- Currently there's only one artifact, **MarkovTextGenerator**, found in [joeclark-phd/random-text-generators](https://github.com/joeclark-phd/random-text-generators).  This reads text strings from a training data set (i.e. a file of real-world names) and generates original random text that should be similar-sounding to the training data. 


## To run
First, clone or download the **random-text-generators** project, `cd` into that directory, and use Maven to install it to your local Maven repository: 

    mvn install

Next, clone or download this repo to your system, open and run it in IntelliJ or something.

If you insist on running it from the command line, add the dependency to your classpath like so:

    mvn compile
    java -cp ".\target\classes\;C:\Users\<you>\.m2\repository\net\joeclark\proceduralgeneration\randomtextgenerators\1.0-SNAPSHOT\randomtextgenerators-1.0-SNAPSHOT.jar" Main

## Training data
Training data files are stored in the `src/main/resources` directory if you'd like to add some of your own.

## Example output

    ROMAN NAMES (using MarkovTextGenerator):
    trebonius
    cumanlistine
    tronius
    castumus
    capinius
    uticus
    callas
    papinius
    lentius
    colius
    
    ROMAN NAMES ENDING IN -ia:
    decia
    duria
    marcia
    vetilia
    famia
    laecinicia
    bucilia
    pria
    micia
    luccia
    
    VIKING MALE NAMES:
    lecnut
    guthun
    thorgræsi
    audgisil
    kollsvein
    vifil
    amund
    varhall
    svaldun
    atli
    
    VIKING FEMALE NAMES:
    thorbjorgunn
    asgöta
    maria
    steinvor
    klint
    runa
    spui
    skuld
    fastvi
    ingith
    
    VIKING + ROMAN NAMES (using DoubleTextGenerator):
    slode krystyn
    hallagrim frumellius
    thri surio
    æskia sperto
    bevil aurellus
    asgzorfinn oratial
    erpkell congrippus
    horlabanke pomptljanus
    thorfinn viburtius
    osvipdløg nolquinus