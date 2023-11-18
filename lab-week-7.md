lab Report 7 
================
Step 4: log in ieng

![Image](labReport7/step4.png)

keys pressed: 

~~~
<ssh cs15lfa23br@ieng6.ucsd.edu><enter>
~~~

The keys pressed is my username to ssh into my remote server

Step 5: clone your for the repository from your github account

![Image](labReport7/step5.png)

~~~
<git clone ctrl + v><enter> //I have already copied the linked of the repository already so I just pasted in
~~~

Step6: run test, and show that it failed

![Image](labReport7/step6.png)

~~~
<cd lab7><enter><bash test.sh><enter>
~~~

Here I went into the lab7 directory and to run it I ran bash test.sh since it already had the junit command already in the file

Step7: edit code file

![Image](labReport7/step7.png)

~~~
<vim ListExamples.java><enter><x><i><2><esc><:wq><enter>
~~~

The keys here that I pressed was to take me to vim editor with the specific file I had to edit from was ListExamples.java. When entering vim editor of this file I was already at the indicated place to make changes so I pressed 'x' which would delete the character I wanted. Pressed 'i' to be in insert mode to make the changes neccessary, in this case it was '2'. 'esc' was to get out of insert mode into normal mode. ':wq' is to save and quit all the changes that have been made. 

Step8: run to show that it works

![Image](labReport7/step8.png)

~~~
<up><up><enter>//since my history to run the program was up 2 times
~~~

Step9:commit and push into github account

![Image](labReport7/step9p1.png)

![Image](labReport7/step9p2.png)

~~~
<git commit><enter><git add ListExamples.java><enter>
<git commit -m lab7><enter><git push><[myusername]><enter><password><enter>
~~~

git commit is to commit the files that have been changed. git add is to add the files that I want to push into my remote server which the one I modified in this case is ListExamples.java. git commit -m lab7 is to commit the added file I want to commit with the message of what I have changed, in this case I just put lab7. Then git push is to send it to my github which asked for my username and password to confirm who i am.
