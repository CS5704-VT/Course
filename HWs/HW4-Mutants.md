# Advanced Testing

As software projects become more complex, testing has also become more complex. A large number of white box test cases is great for assessing the application code and validating the program behavior, however can provide some disadvantages such as being more difficult to maintain and update---and more tests take longer to run which takes up more time. Thus, more recently advanced testing techniques have been introduced to ease the detriments of adding more tests. One example of a modern advanced testing technique is _mutation testing_.

## Mutation Testing

Mutation testing is a form of whitebox testing that involves modifying the program in small ways. Each changed version of the code is called a _mutant_, which causes the behavior of the original version to differ from the mutant version, and tests should be able to detect and reject mutants.

**Mutant operators** are classes of mutations for automatically edit programs. These can differ based on the difficulty of the tests, etc. Examples of mutation operators include:
* Statement deletion (removing line(s) of code)
* Statement duplication or insertion (adding line(s) of code)
* Replacement of boolean expressions (switching True and False values)
* Replacement of arithmetic operators (i.e. +, -, *, /, %)
* Replacement of boolean operators (i.e. >, <, >=, <=, ==, !=)
* Replacement of variables within the same scope
* and more!

Occasionally, mutations may not actually change the behavior of the program, which is known as _equivalent mutants_. An example of a mutant replacing a boolean operator is below:

![mutations](https://github.com/CS5704-VT/Workshops/blob/8c0d244a9f63104b23ce225da039c68814beb4cb/Testing/resources/imgs/mutant.png?raw=true)

This process is also useful for evaluating tests, as existing test cases should fail when mutants are introduced into the program. This is called _killing_ the mutant. Test suites are measured by the percentage of mutants that they kill. _Strong_ mutation coverage ensures that: 1) the mutant is reached; 2) the program state has changed; and 3) the incorrect program state causes tests to fail. Mutation testing requires much more computing power, however strong mutation coverage is a powerful metric for ensuring your program works properly and is well tested. 

**Why Mutation Testing?**

Mutation testing is growing in popularity and has been adopted in the software engineering industry, most notably at companies such as [Facebook/Meta](https://arxiv.org/pdf/2010.13464.pdf)<sup>1</sup>,[Google](https://dl.acm.org/doi/pdf/10.1145/3183519.3183521)<sup>2</sup>, and [Netflix](https://netflix.github.io/dgs/mutations/)<sup>3</sup>.

## 📝 Activity

To practice mutation testing, we will look at an application of this process in game form. For this activity, you will play the mutation testing online game [_Code Defenders_](https://code-defenders.org/)<sup>4</sup>. Follow the instructions below to get started and complete the basic puzzle tutorials for the game:

**Note:** This game will require knowledge of Java and the JUnit testing framework.

* Create an account for the Code Defenders game by logging into [https://code-defenders.org/](https://code-defenders.org/). You can also run this application locally through Docker following [these instructions](https://github.com/CodeDefenders/CodeDefenders/blob/master/docker/README.md).
* There are two roles in the game" `Attackers` modify the code to create mutants while `Defenders` update the tests to catch the mutants. More details about the gameplay are available [here](https://code-defenders.org/help).
* Next, you will try to play the game based on the details below for your method of playing:
  * **code-defenders.org**: Begin with the Puzzles tab at the top of the screen (Beginner -> Puzzle 1). Complete at least four puzzles.
  * **Docker**: For the docker installation, you will need to supply your own Java file (a sample one is [here](https://gist.github.com/chbrown13/fea3ce81aae9f11a9f8fe11c7100122c)). Go to Create a battleground and create a new game with your Java class. When starting the game, make sure to change your role to attacker/defender (at least one game per role).
   

> [1] Moritz Beller et al. _"What It Would Take to Use Mutation Testing in Industry—A Study at Facebook"_. 2021 \
> [2] Goran Petrovic and Marko Ivankovic. _"State of Mutation Testing at Google"_. 2018 \
> [3] https://netflix.github.io/dgs/mutations/ \
> [4] Code Defenders was introduced by Jose Miguel Rojas et al. More information is available in [_"Code Defenders: A Mutation Testing Game"_](https://ieeexplore.ieee.org/stamp/stamp.jsp?arnumber=7528958&casa_token=WSVK-2KwDDMAAAAA:8PqV15WVt7ZHSyXR-G7hgTu2IDi2PY2LErCpKSX-1wTx6AuYMHQVp71p8knHZy3oNoGqsUFIuA&tag=1)
