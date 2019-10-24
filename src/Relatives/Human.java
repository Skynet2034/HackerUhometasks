package Relatives;

public class Human {

        private String name;
        private int age;
        private boolean sex;
        private Human father;
        private Human mother;
        Human (String name, boolean sex, int age)
        {
            this.name=name;
            this.age=age;
            this.sex=sex;
        }
        Human (String name, boolean sex, int age, Human father, Human mother)
        {
            this.name=name;
            this.age=age;
            this.sex=sex;
            if (father.age<=age)
            {
                System.out.println("Возраст отца не может быть меньше возраста ребенка!");
            }
            else this.father=father;
            if (mother.age<=age)
            {
                System.out.println("Возраст матери не может быть меньше возраста ребенка!");
            }
            else this.mother=mother;
        }
        public String toString()
        {
            String res="Имя: "+name+" пол: ";
            res+=sex?"мужской":"женский";
            res+=" возраст: "+age;
            res+=(father!=null)?(" отец: "+father.name):"";
            res+=(mother!=null)?(" мать: "+mother.name):"";
            return res;
        }

    }
