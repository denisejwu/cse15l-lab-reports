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
   T
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
   find /-perm /u=r
   ./government/Media
    ./government/Media/5_Legal_Groups.txt
    ./government/Media/Abuse_penalties.txt
    ./government/Media/Advocate_for_Poor.txt
    ./government/Media/agency_expands.txt
    ./government/Media/Aid_Gets_7_Million.txt
    ./government/Media/All_May_Have_Justice.txt
    ./government/Media/Annual_Fee.txt
    ./government/Media/Anthem_Payout.txt
    ./government/Media/AP_LawSchoolDebts.txt
    ./government/Media/Assuring_Underprivileged.txt
    ./government/Media/Attorney_gives_his_time.txt
    ./government/Media/Avoids_Budget_Cut.txt
    ./government/Media/A_helping_hand.txt
    ./government/Media/A_Perk_of_Age.txt
    ./government/Media/balance_scales_of_justice.txt
  ~~~
5. kahfud
6. hdfuhd

Soureces that were use based on the link
