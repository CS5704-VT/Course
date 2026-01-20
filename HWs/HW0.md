# HW0

This homework will help you with setup and preparation for the course this semester.

## Course Overview

**TODO:** Review the [course syllabus](https://docs.google.com/document/d/18-5J8LIHu3SDDkfEbWogdbA4_fRtXECs4-hp-Ox0MT4/edit?usp=sharing).

- [ ] Based on the syllabus and first lecture, fill out this [syllabus survey](https://docs.google.com/forms/d/e/1FAIpQLSe21UdpR4YSbNzI1rKE9_5aa7WF_2NlBK0PLTorHGw2atlb4A/viewform?usp=sf_link) with any questions, confusions, or concerns you still have about the course this semester. **Even if you do not have questions about the course, you must still complete the survey to receive full credit!**

## Mattermost

The primary mode of communication for the course this semester will be [Mattermost]. Communication is essential in software engineering and the majority of development teams use some form of IM or messaging system. Mattermost is one example of these types of platforms, and we will use it in class to provide course updates, answer questions, form project groups, and other course activities. For your profile, please include set your Full Name to be your first and last name (or name you prefer to go by), your Username to be your VT PID, and your Email to be your VT email address. 

You may download the free version of the Mattermost desktop application at [https://mattermost.com/apps/](https://mattermost.com/apps/) or use it online from your preferred web browser [https://meet.cs.vt.edu/cs-5704](https://meet.cs.vt.edu/cs-5704). To sign up for the workspace for this course, visit the invite link [here](https://meet.cs.vt.edu/signup_user_complete/?id=zyk6ur3yg3n1fxmqe6fru8t35r). This platform is hosted on a server through the CS department, and will require your CS@VT login credentials if you use the Sign-In with GitLab option. If you have problems or are unable to join via the link, please contact the instructor.

### Introduction

**TODO:** To further help us all get to know each other, please introduce yourself. Write a brief paragraph in the #Town Square channel of the CS5704 Mattermost that contains the following information:
- [ ] Name
- [ ] Where are you from?
- [ ] Do you have any previous software engineering experience? If so, where did you work and for how long?
- [ ] What do you hope to get out of this course?

## Software Configuration

opunit is a simple tool to verify your machine is correctly setup for a course, workshop, or homework assignment. More details are available [here](https://github.com/ottomatica/opunit). You can install opunit using the following command:

```npm install ottomatica/opunit -g```

For this course, you are required to install the following software on your system. These tools will be used throughout the semester for assignments, workshops, and team projects.

* [Git](https://git-scm.com/) is the version control system we will be using in this course for class activities and collaborating on your team project. You may download the git client to your system [here](https://git-scm.com/downloads). Additionally, you will need a [GitHub](https://github.com/) account. After installation, [configure git](https://git-scm.com/book/ms/v2/Getting-Started-First-Time-Git-Setup) with the email address associated with your GitHub account.
* [Docker](https://www.docker.com/) provides containerized environments to accelerate development and deployment of software systems. Several class activities will leverage Docker, including the in-class workshop on 1/27. You will also need [Docker Compose](https://docs.docker.com/compose/) and the [Docker Labspaces extension](https://hub.docker.com/extensions/dockersamples/labspace-extension).

Additional software that will be used in class later this semester but are not included in this check are below:

* [Python](https://www.python.org/) is a modern programming language commonly used in software engineering workflows. While many assignments allow you to choose your preferred language, at least one workshop will require Python.
* [ollama](https://ollama.com/) is a platform that allows users to run and configure LLMs on their machine. We will use this for several activities toward the end of the semseter.

This list represents the baseline software required for the course. Additional tools may be rrequired, and will be introduced as needed and communicated in advance.

**TODO:** Run the following command below to verify the configuration of your laptop for this course. Upload a screenshot of the resulting output. All checks should pass.

```opunit profile chbrown13/profile:5704.yml```

- [ ] Upload screenshot of successful configuration to [Canvas](https://canvas.vt.edu/courses/224123/assignments/2638906)

**Due:** Friday (1/30) at 11:59pm
