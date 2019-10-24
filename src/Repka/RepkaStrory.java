package Repka;

public class RepkaStrory {

        static void tell(Person[] items)
        {
            for(int i=items.length-1;i>0;i--)
                items[i].pull(items[i-1]);
        }
        public static void main (String[] args) throws java.lang.Exception
        {
            Person[] items={new Person("Репка","репку"),
                    new Person("Дедка","дедку"),
                    new Person("Бабка","бабку"),
                    new Person("Внучка","внучку"),
                    new Person("Жучка","Жучку"),
                    new Person("Кошка","кошку"),
                    new Person("Мышка","мышку"), };
            tell(items);

        }

    }
