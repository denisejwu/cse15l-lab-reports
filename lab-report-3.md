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

1. command -i meanns it -i
   ~~~
    find . 

   
   ~~~
3. hjfdk
4. kahfud
5. hdfuhd

Soureces that were use based on the link
