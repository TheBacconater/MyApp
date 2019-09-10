package com.example.myapp;

public interface vocabClass {



    String[] vocabArr = {"Blame","Branch","Clone","Collaborator","Commit","Diff","Fetch","Fork","Issue","Merge","Private Repository"
            ,"Pull","Pull Request","Push","Repository"};

    String[] lastVocab = {"Repository"};

    String[] LastDef = {"A __________ is the most basic element of GitHub. They're easiest to imagine as a project's folder. A __________ contains all of the project files (including documentation), and stores each file's revision history. __________ can have multiple collaborators and can be either public or private."};

    String[] Definitions = {"The _____ feature in Git describes the last modification to each line of a file, which generally displays the revision, author and time. This is helpful, for example, in tracking down when a feature was added, or which commit led to a particular bug.",
            "A ______ is a parallel version of a repository. It is contained within the repository, but does not affect the primary or master ______ allowing you to work freely without disrupting the live version. When you've made the changes you want to make, you can merge your ______ back into the master ______ to publish your changes. For more information",
            "A _____ is a copy of a repository that lives on your computer instead of on a website's server somewhere, or the act of making that copy. With your _____ you can edit the files in your preferred editor and use Git to keep track of your changes without having to be online. It is, however, connected to the remote version so that changes can be synced between the two. You can push your local changes to the remote to keep them synced when you're online.",
            "A ___________ is a person with read and write access to a repository who has been invited to contribute by the repository owner.", "A ______, or revision, is an individual change to a file (or set of files). It's like when you save a file, except with Git, every time you save it creates a unique ID (a.k.a. the SHA or hash) that allows you to keep record of what changes were made when and by who. _______ usually contain a ______ message which is a brief description of what changes were made.",
            "A ____ is the difference in changes between two commits, or saved changes. The ____ will visually describe what was added or removed from a file since its last commit.","_______ refers to getting the latest changes from an online repository without merging them in. Once these changes are fetched you can compare them to your local branches (the code residing on your local machine).", "A ____ is a personal copy of another user's repository that lives on your account. ____ allow you to freely make changes to a project without affecting the original. _____ remain attached to the original, allowing you to submit a pull request to the original's author to update with your changes. You can also keep your ____ up to date by pulling in updates from the original.",
            "_____ are suggested improvements, tasks or questions related to the repository. _____ can be created by anyone (for public repositories), and are moderated by repository collaborators. Each issue contains its own discussion forum, can be labeled and assigned to a user.",
            "_______ takes the changes from one branch (in the same repository or from a fork), and applies them into another. This often happens as a pull request (which can be thought of as a request to merge), or via the command line. A merge can be done automatically via a pull request via the GitHub web interface if there are no conflicting changes, or can always be done via the command line.",
            "_______ __________ are repositories that can only be viewed or contributed to by their creator and collaborators the creator specified.",
            "____ refers to when you are fetching in changes and merging them. For instance, if someone has edited the remote file you're both working on, you'll want to pull in those changes to your local copy so that it's up to date.",
            "____ _______ are proposed changes to a repository submitted by a user and accepted or rejected by a repository's collaborators.",
            "_____ refers to sending your committed changes to a remote repository, such as a repository hosted on GitHub. For instance, if you change something locally, you'd want to then push those changes so that others may access them.",
            "A __________ is the most basic element of GitHub. They're easiest to imagine as a project's folder. A __________ contains all of the project files (including documentation), and stores each file's revision history. Repositories can have multiple collaborators and can be either public or private."};

    String[] Answer1 = {"Blame","Leaf","Collab","Writer","Commit","Dunk","Throw","Spoon","Issue","Marry","Private Website","Push","Pull Request","Toss","Repository"};

    String[] Answer2 = {"Bolognese","Twig","Clone","Sorter","Comment","Riff","Stick","Fork","Tissue","Crash","Private Desktop","Pull","Blueberry Muffins","Hand","Folder"};

    String[] Answer3 = {"Bat","Branch","Merge","Helper","Kermit","Diff","Bark","Knife","Discussion","Merge","Private Lounge","Throw","Orange Juice","Push","Tile"};

    String[] Answer4 = {"Brunch","Bird","Sort","Collaborator","Candela","Dark","Fetch","Spike","Arguement","Meniscus","Private Repository","Catch","Push Request","Swing","Letter"};



    String getDefinition(int x);

     String getVocab(int x);






}
