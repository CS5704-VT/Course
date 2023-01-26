# Requirements

In this milestone, you will present a lightning talk to introduce your project with a problem statement and requirements for your course project. Part of your evaluation for this milestone will be your ability to define a problem statement and develop your own project requirements.

## Problem Statement

Remember, we are solving problems with teamwork and collaboration within the software engineering domain. This does not include any general teamwork problem, but it must focus on problems with communication, SE processes, remote work meetings, etc. for programmers. A good problem statement describes:

* What is the problem? 
* _Why_ is it a problem?

This content should be included at the very beginning of your lightning talk _and_ in the introduction of your design proposal document. Additionally, you should focus provide answers to _What does your project do?_ and _Why is your proposed work a good solution for the problem?_

## Use Cases

A use case is a way to describe a task that a user wants to perform and the required sequence of steps needed to accomplish that task. It also includes possible error states. For more information about use cases, [see slides](https://canvas.vt.edu/courses/145256/files/21812034?module_item_id=1825038).

In your lightning talk, you must present **at least three use cases** that describe requirements for the primary functionality of your bot from a user's perspective.

For instance, this is an example use case for a bot to automatically schedule a meeting between developers:
```
Use Case: Create a meeting
1 Preconditions
   User must have google calendar api tokens in system.
2 Main Flow
   User will request meeting and provide list of attendees [S1]. Bot will provide  possible meeting times and user confirms [S2]. Bot creates meeting and posts link [S3].
3 Subflows
  [S1] User provides /meeting command with @username,@username list.
  [S2] Bot will return list of meeting times. User will confirm time.
  [S3] Bot will create meeting and post link to google calendar event.
4 Alternative Flows
  [E1] No team members are available.
```

You can think of this as a set of interactions you want to be able to support with your project.

#### Deliverable: _Lightning Talk_
* Your group must complete an oral proposal presentation during class provding an overview of the project you wish to complete for the semester. This talk must include a problem statement, your proposed solution, how your proposed work relates to the overall project goal, and **at least three** example `requirements` [use cases](REQUIREMENTS.md#use-cases). You may divide the presenting duties among your team however you wish, but the talk must be **_no more than 5 minutes_**. There will also be a brief time of Q&A from students after each presentation on your proposed work. The proposal oral presentation will be graded according to [this rubric](https://docs.google.com/spreadsheets/d/11xcUHQSFY8ux6Uu5WFnAOOUkZMLuNnf71mxmHcMmo8c/edit?usp=sharing). 

 **Due:** Thursday February 9 at 5:00pm _in class_
