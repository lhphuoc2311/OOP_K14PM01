/*
*  created date: Mar 08, 2022
*  author: cgm
*/
package oo.tuan4.buoi7.testprotected;

public class Person {

    private String name;
     private String birthday;

     public Person(String name, String birday){
         this.name = name;
         this.birthday = birday;
     }


     /**
      * @param birthday the birthday to set
      */
     public void setBirthday(String birthday) {
         this.birthday = birthday;
     }

     /**
      * @return the birthday
      */
     public String getBirthday() {
         return birthday;
     }

     /**
      * @param name the name to set
      */
     public void setName(String name) {
         this.name = name;
     }

     /**
      * @return the name
      */
     public String getName() {
         return name;
     }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "Person [birthday=" + birthday + ", name=" + name + "]";
    }

     

    
}
