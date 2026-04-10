In modern fast-paced software development, automation plays a crucial role in enhancing team collaboration and efficiency. Development bots, particularly those integrated within communication platforms like Slack and Mattermost, facilitate real-time updates, notifications, and interactions that streamline workflows. For instance, prior work shows the primary reason developers use Slack is for development and deployment support.[^1] By automating routine tasks and sharing critical information seamlessly, these bots enable teams to focus on higher priority tasks and reduce manual efforts. For this assignment, you will create your own Mattermost bot that integrates with your Project 2 Continuous Integration/Continuous Deployment (CI/CD) pipeline.

## Overview

To kick off this project, write a brief reflection on your experiences and the potential impact of bots within your development workflow. Discuss which bots and tools you have experience with, and how bots in general might improve development practices.

## Mattermost Bot Setup

First, follow the steps to create an **[Incoming Web Hook](https://developers.mattermost.com/integrate/webhooks/incoming/)** for Mattermost. Incoming webhooks post messages to Mattermost based on an external trigger, while _outgoing webhooks_ use Mattermost content to trigger external applications. You should have access in the class Mattermost instance to create a webhook for the Town Square channel. You may customize the message if desired.

After you follow the initial instructions, modify the initial template text to include your response to the discussion question above. Then run the generated `curl` command to post a message in our Mattermost channel. **Each student must post a message answering the overview question in the Town Square channel from your profile as a `BOT` account to receive full credit!**

## CI/CD Integration

Using what you learned from the initial incoming webhook creation, create a Mattermost Bot that reports project build results when the CI/CD pipeline is run for your project. If you haven't already, you will first need to create a separate channel for your Project 2 team. Then, add an incoming webhook into your GitHub Actions workflow. Potential information your bot could report includes testing outcomes, commit messages and details, build status, etc. You can also feel free to enhance your bot or add other features and ideas.

After completing the Mattermost Bot, as a group discuss the advantages and disadvantages of this type of bot and whether or not it would benefit your development workflow.

**Submission**: The workshop submission should include: (1) an individual reflection as a Mattermost bot message from each student (this will be checked in Mattermost); (2) a webhook to in your project team GitHub repository for Project 2 (this will be checked on GitHub); (3) a team reflection on the implemented bot with _insights from each team member_ and including a screenshot of the bot providing the relevant information in your team Mattermost channel (upload on Canvas). Based on this discussion, you can decide whether or not to keep the bot or not.
**Due:** Friday, April 17 at 11:59pm

[^1]: Bin Lin, Alexey Zagalsky, Margaret-Anne Storey, and Alexander Serebrenik. 2016. Why Developers Are Slacking Off: Understanding How Software Teams Use Slack. In Proceedings of the 19th ACM Conference on Computer Supported Cooperative Work and Social Computing Companion (CSCW '16 Companion). Association for Computing Machinery, New York, NY, USA, 333–336. https://doi.org/10.1145/2818052.2869117
