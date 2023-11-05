Lab Reports 3
===========
Part1

Buggy code before

~~~
static void reverseInPlace(int[] arr){
  for(int i = 0; i < arr.length; i+=1){
    arr[i] = arr[arr.length-i-1];
  }
}
~~~

after code fixed
~~~
static void reverseInPlace(int[] arr){
  for(int i = 0; i < arr.length/2; i+=1){
    int temp = arr[i];
    arr[i] = arr[arr.length-i-1];
    arr[arr.length - i - 1] = temp;
  }
}
~~~

The reason being why the code wasn't working because it wasn't getting the expected output in other words it wasn't revsering the array at all. For example, if I were to test this code previously, and input the array {1,2,3} as the input it should return {3,2,1} instead it return {1,2,3} therefore it isn't doing what it was supposed to do which was reversing the array.

Part 2
The command I will be using is find.

1. command -type f gets all the files from the current directory. In the code block below that is only a portion of the output there was a lot more files that I can't really fit on here. This is really helpful because it finds text files that you need or if there was a specific file that you need to find is really helpful with this command.
   ~~~
    find . -type f
   ./biomed/1475-925X-2-6.txt
    ./biomed/1475-9268-1-1.txt
    ./biomed/1475-9268-1-2.txt
    ./biomed/1475-9276-1-3.txt
    ./biomed/1476-069X-1-3.txt
    ./biomed/1476-069X-2-2.txt
    ./biomed/1476-069X-2-4.txt
    ./biomed/1476-069X-2-7.txt
    ./biomed/1476-069X-2-9.txt
    ./biomed/1476-0711-2-3.txt
   ~~~
  the other example is to find the second is finding the directories. So this is really helpful to find what the directories are which is really helpful to see where else you can go in to the or if you can't remember what directory you put a file and seeing the directories possible helped trigger your meemory

  ~~~
find . -type d
$ find -type d
.
./911report
./biomed
./government
./government/About_LSC
./government/Alcohol_Problems
./government/Env_Prot_Agen
./government/Gen_Account_Office
./government/Media
./government/Post_Rate_Comm
./plos
  ~~~
   
2. comand -perm /u=r are the only read only files. So it won't work on directories because that is just the location in which where the file are placed. Also the code block below doesn't cover all of the files that I printed as an output I only copyed a couple of them over.
   ~~~
   find . -perm /u=r
   ./government/Media/Legal_system_fails_poor.txt
    ./government/Media/less_legal_aid.txt
    ./government/Media/Library_Lawyers.txt
   ./government/Media/Lindsays_legacy.txt
   ./government/Media/Local_Attorneys.txt
   ./government/Media/Lockyer_Warns.txt
    ./government/Media/Low-income_children.txt
    ./government/Media/Major_Changes.txt
    ./government/Media/Making_a_case.txt
    ./government/Media/man_on_national_team.txt
    ./government/Media/Marylands_Legal_Aid.txt
    ./government/Media/New_funding_sources.txt
    ./government/Media/New_Online_Resources.txt
    ./government/Media/NJ_Legal_Services.txt
   ~~~
3. the third command is -empty to check the files and the directories this allows you either find files that need to be filled or they were unneccessay files taking place or adding things in or checking if the directories needed files to be added or anything of that sort. In the code below doesn't print anything because there is no empty file or empty directories. 
   ~~~
   find -type f -empty
   ~~~

   this is for checking if the directories are empty
   ~~~
   find -type d -empty
   ~~~
4. the fourth command is finding any executable files -perm /a=x
   ~~~
   $ find -perm /a=x
    .
    ./911report
    ./biomed
    ./government
    ./government/About_LSC
    ./government/Alcohol_Problems
    ./government/Env_Prot_Agen
    ./government/Gen_Account_Office
    ./government/Media
    ./government/Post_Rate_Comm
    ./plos
   ~~~

Source of files use 
https://www.tecmint.com/35-practical-examples-of-linux-find-command/
