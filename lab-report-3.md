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

1. command -type f gets all the files from the current directory. In the code block below that is only a portion of the output there was a lot more files that I can't really fit on here.
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
  the other example is to find the second is finding the directories

  ~~~
find . -type d
~~~
   
3. comand -perm /u=r are the only read only files
   ~~~
   find /-perm /u=r
   ~~~
5. kahfud
6. hdfuhd

Soureces that were use based on the link
