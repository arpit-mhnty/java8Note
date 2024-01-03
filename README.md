Java-8 note:
it have StringJoiner class where u join multiple string using , - and other option also provided
function:- add(null(bydefault)
          merge(new StringJoiner(,));
          length();
          setEmptyValue("default value if string is null");
StringJoiner str=new StringJoiner(",",[,]);- here firts one one diveed and second is prefix,3rd one is suffix
str.toString()-to make stringJoiner to string


