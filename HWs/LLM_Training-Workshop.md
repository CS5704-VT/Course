# LLM Training

In this workshop, you will explore leveraging infrastruture (Ollama) to deploy and customize local large language models (LLMs). Participants will gain hands-on experience in executing and post-training open-source models, customizing LLMs to tackle a variety of tasks and meet specific needs.

## Introduction

[Software 2.0](https://karpathy.medium.com/software-2-0-a64152b37c35) is increasingly integrating machine learning (ML) models that assist in solving a variety of problems, requiring developers to interact with ML systems beyond the “classical stack” of Software 1.0---which uses programming languages to provide explicit instructions to the computer written by a programmer for desirable behaviors. This rise of AI-enabled systems introduces significant challenges to traditional software engineering processes. For example, AI-based systems have non-deterministic behavior that is diffiuclt to assess and requires new non-functional architectures and system requirements.

## Initial Activity
_Reflection:_ With a partner or small group, discuss your experiences with training, deploying, and/or maintaining LLMs and LLM-enabled systems (Software 2.0). In particular, focus on specific challenges you encountered (or if you do not have any experience, what challenges you anticipate facing) during each phase of the software development lifecycle (SDLC): requirements, design, implementation, testing, maintenance, and deployment.

## Ollama Drama 🦙
Complete the [Ollama Drama](https://github.com/omaciel/ollama-drama) workshop.[^1] This activity will require Python 3.10+ and ollama installed. Check out the workshop [README](https://github.com/omaciel/ollama-drama/blob/main/README.md) to get started and follow the instructions in the [presentation slides](https://github.com/omaciel/ollama-drama/blob/main/slides/Ollama%20Drama%20Workshop.pdf) to complete the full workshop activity. By the end of this activity, you should have:

* a simple customized chatbot (via system prompting and Modelfile)
* a forked version of the Ollama Drama repository with your completed code
* (optional) publish the model to your Ollama account
* (optional) submit the pull request to get the certification

## CS5704 Ollama Drama 🦙🦙

For the final activity, you will use what you learned in the Ollama Drama workshop to create a customized study chatbot that incorporates the content from this course (i.e., to help review and prepare for the final exam).

1. With your partner/small group, identify essential topics that should be included in the chatbot’s knowledge base.
2. Based on your discussion, find the corresponding markdown file for the essential lecture content [here](https://drive.google.com/drive/folders/1-GvaEgLt-5s7aUk5nhSCRUmaibrO5PYR?usp=drive_link).
3. Load the relevant lecture materials into the system and customize the chatbots responses to help users study course concepts.
4. Swap chatbots with another group to take turns interacting with the chatbots, testing various questions based on the lecture materials.
5. _Reflection:_ Discuss the overall performance of the chatbot and identify areas for improvement.

**Submission**: The workshop submission (upload on Canvas) should include: (1) a reflection on experiences and challenges developing and maintaining AI-enabled system within traditional SDLC phases; (2) a link to your forked GitHub repository for the Ollama Drama workshop; (3) a summary of the provided feedback on your implemented CS5704 study chatbot an a reflection with _individual insights_ on the chatbot performance, challenges, and key takeaways from this activity.

**Due:** Tuesday, April 28 at 11:59pm

[^1]: The content of this workshop is based on the [Ollama Drama](https://github.com/omaciel/ollama-drama) workshop by Og Maciel.
