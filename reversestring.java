function reverseString(inputString) 
{
   if (inputString.length <= 1) {
    return inputString;
  }
  return inputString.charAt(inputString.length - 1) + reverseString(inputString.slice(0, -1));
}
console.log(reverseString("hello"));      
console.log(reverseString("recursion"));  
console.log(reverseString("a"));          
console.log(reverseString(""));           
