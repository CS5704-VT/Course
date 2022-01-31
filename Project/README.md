# Project

The coronavirus pandemic has had a major impact on the entire world in nearly every area of our lives, including how software is developed and maintained. To that end, the goal for the CS5704 course project this semester will be to develop a project to support software engineering work during a global pandemic. For your project, you should consider the software engineering processes and utilize methods and tools for the software development life cycle phases (`requirements`, `design`, `implementation`, `testing`, and `deployment`) discussed in class.

**Learning Outcomes:**
> * Develop software engineering skills working on a team project
> * Communicate (via demo and writing) details about a developed software application

The goal of this project is to practice software engineering processes, tools, and methods and to gain practical experience working on developing a software project in a team setting.

## Guidelines

The only requirement for the project is that it fit into the high-level goal, supporting software engineering work during COVID-19. Otherwise, you are given the freedom to satisfy this goal however you wish. You must work with a team and complete various deliverables throughout the semester. Your group can decide what type of project you would like to complete, whether it be a _development-based_ (i.e. desktop app, web app, script, bot, etc.) or _research-based_ (i.e. survey, interviews, tool evaluation, etc.) project. Try to be creative when proposing project ideas. **A challenging project with an unknown or negative outcome is more interesting than an easy project with an expected outcome.** If the project doesn't go well, explain why in your report and final presentation. If the project does go well, let's see if we can publish it! Negative results or an incomplete project will not impact your grade, given a valid reason ("_We ran out of time_" is __*not*__ a valid reason). If you have difficulty coming up with ideas for your project, check out [this list](IDEAS.md) of examples or feel free to visit my office hours to discuss.

### Teams

You must work in teams of four students, unless otherwise specified. Work must be equally divided among the team members. 

### Technology

You may use any programming language or tech stack you are comfortable with, as long as it is freely accessible to your teammates and the teaching staff. All projects should be maintained on a version control platform, either [GitHub](https://github.com) or [GitLab](https://about.gitlab.com/). Please add the teaching staff to your repository in order to facilitate reviews, analyze progress, and perform grading activities. To track work, all teams must utilize a task management (i.e. GitHub projects) or issue tracking (i.e. GitHub issues) system.

## Deliverables

You will submit your project in multiple milestones throughout the semester that broadly follow the software development life cycle. More details about the specific deliverables for your project are available below.

|  Milestone  | Deliverables (Project Grade %)    |  Deadline       |
|---------|----------------------------------|-----------------|
| [Requirements](REQUIREMENTS.md)   | __Lightning Talk (15%)__     | Feb 24 **[_In Class_]** |
| [Design](DESIGN.md)         | __Proposal Document (15%)__  | Mar 1 |
| [Implementation](IMPLEMENTATION.md) | __Project Check-In (5%)__    | Apr 8 |
|                | __Report Abstract (5%)__     | Apr 22 |
| [Testing](TESTING.md)        | __Project Repository (15%)__ | May 6 |
|                | __Final Report (15%)__       | May 6 |
| [Deployment](DEPLOY.md)     | __Project Demo (25%)__       | May 6 **[_In Class_]** |
|                | __Retrospective (5%)__       | May 9 |

__Late Policy:__ No late work will be accepted unless there are extreme circumstances approved by the instructor. All deliverables must be turned in by 11:59pm on the given due date unless otherwise specified.

#### __Lightning Talk__
* Your group must complete an oral proposal presentation during class provding an overview of the project you wish to complete for the semester. This talk must include a problem statement, your proposed solution, how your proposed work relates to the overall project goal, and **at least three** example `requirements` [use cases](REQUIREMENTS.md#use-cases). You may divide the presenting duties among your team however you wish, but the talk must be **_no more than 5 minutes_**. There will also be a brief time of Q&A from students after each presentation on your proposed work. The proposal oral presentation will be graded according to [this rubric](https://docs.google.com/spreadsheets/d/11xcUHQSFY8ux6Uu5WFnAOOUkZMLuNnf71mxmHcMmo8c/edit?usp=sharing). 

#### __Proposal Document__
* Your project team must also submit a design proposal document. The proposal must conform to the International Conference on Software Engineering (ICSE) formatting guidelines (see the [MS Word](https://www.acm.org/binaries/content/assets/publications/word_style/interim-template-style/interim-layout.docx), [Latex](https://www.acm.org/binaries/content/assets/publications/consolidated-tex-template/acmart-primary.zip), and [Overleaf](https://www.overleaf.com/gallery/tagged/acm-official#.WOuOk2e1taQ) templates). The proposal must introduce your project and provide an overview of the high-level design. Your document should be no more than 2-pages (excluding references and [design sketches](DESIGN.md#design-sketches)). Please check your document for typos and spelling or grammar errors. The proposal must contain:
    * a relevant _title_ and all group members listed as _authors_;
    * an _abstract_ briefly describing the problem and proposed solution;
    * an _introduction_ that further explains the problem and motivates the need for the proposed solution;
    * _related work_ presenting relevant software engineering studies or tools; 
    * a brief description of the [high-level architectural](DESIGN.md) `design` of the proposed work (how different parts of the system work together);
    * and _references_ to any appropriate citations. 

 * You will receive feedback from the teaching staff on the document and presentation for your proposal to approve of your course project for the semester.

#### __Project Check-In__ 
  * This will be a chance for you to provide the teaching staff with an update on your project. You will be asked to provide documentation on the `implementation` of your project and provide an overview of project progress and the software processes your team has been following.

#### __Report Abstract__ 
  * The project report abstract will be due one week before your final report. This will provide an overview of your final report by explaining the problem you addressed and your proposed solution. While you may modify the abstract in the final report after this deadline, this is a checkpoint to ensure you are making progress on your project and have at least started on your report. For details on how to write a good abstract, check out these tips from Kent Beck [here](https://twitter.com/kentbeck/status/974359988352110592?lang=fr) and [here](https://plg.uwaterloo.ca/~migod/research/beckOOPSLA.html).

#### __Project Repository__
* Your team repository will be used for `testing` to verify that your project meets the given requirements. This deliverable will include various [testing](TESTING.md) practices that will be evaluated and performed by the teaching staff for grading.

#### __Project Demo__
  * Instead of a final exam, your group must give a 10 minute [oral presentation and demonstration](DEPLOY.md) of a `deployed` version of your project. The presentation must include the original problem statement, an explanation and rationale for the proposed solution, a visual demonstration of your project, and a discussion on limitations, future work or things you didn't have time to implement, processes and tools used, and things you learned. All project team members must participate in the final presentation for the project.

#### __Final Report__
* The final report must be no more than 10 pages (not including references) and follow the same ICSE formatting guidelines as the Proposal Document. The final project report must contain the following:
    * a relevant _title_ and all group members listed as _authors_;
    *  the _abstract_ with feedback addressed;
    *  an updated _introduction_ incorporating proposal feedback to define the problem and motivate the project solution;
    *  a _motivating example_ to provide a scenario of how your project would be used and why it is relevant to software engineering during COVID;
    *  a _background_ to define any key terms or concepts related to your work (if applicable);
    *  an updated _related work_ citing relevant work and the novelty of your project; 
    *  a description of the _implementation_ explaining design decisions that went into your project and your testing approach **or** the _methodology_ of the expiriment you completed, (if research)
    *  a _deployment plan_ section explaining how you would `deploy` and `maintain` your project for users **or** _results_ to present your study findings;
    *  a _discussion_ explaining possible opportunities for future extensions and limitations of your project;  
    *  a _conclusion_ revisiting the problem statement and project work completed;
    *  and _references_ for any works that you cite.

#### __Retrospective__ 
  * At the conclusion of the project, you will asked to complete a brief group and individual retrospective about the team project. This will allow you to reflect on what went well, what didn't go well, and what you learned in addition to determining your contributions and the effort of your teammates towards the project. The overall grade will be impacted by reported group dynamics that cannot be determined through analyzing contributions to your repository.
