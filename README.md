# Java-8 note:
### Stream
>stream is not storing value but it convey,it lazy load and iterate all value once  <br />
>it doesn't modify it's source  <br />
***function**
```
allMatch(n->n/3==0)-it will return true if all conditon is true
count()- it return the count
distinct()-it return unqu value from stream
max(Compatetor.compare(Emplyoee:getAge));
limit(5) -makes sure use  Stream.iterate(0, n -> n + 2); Stream.limit(3).collect(Collectors.toList())
sorted()


```


### StringJoiner
> it have StringJoiner class where u join multiple string using , - and other option also provided <br />
 ***function:-***
```
          add(null(bydefault)
          merge(new StringJoiner(,));-make sure create stringJoiner to store new string joiner
          length();
          setEmptyValue("default value if string is null");
```
> StringJoiner str=new StringJoiner(",","[","]");- here firts one one diveed and second is prefix,3rd one is suffix <br />
> str.toString()-to make stringJoiner to string  <br />
>  example 
[ java8Note/StringJoiner.java ]  <br />
### Normal Colleaction
> Arrays.parallelSort(referance of an arrays,first index,last index)-it will sort based on index
> Character.isUpperCase(str.charAt(1))-it have character class


