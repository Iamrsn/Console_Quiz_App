
import java.util.Scanner;

public class questionService {
    question[] questions = new question[5];
    String selection[]=new String[5];

    public questionService(){
        questions[0]=new question(1,"size of int","2","6","4","8","4");
        questions[1]=new question(2,"size of char","2","6","4","8","2");
        questions[2]=new question(3,"size of double","2","6","4","8","8");
        questions[3]=new question(4,"size of long","2","6","4","8","8");
        questions[4]=new question(5,"size of boolean","2","1","4","8","1");
    }

    public void playquiz(){
        int i=0;
        for(question q:questions){
            System.out.println("question number :" +q.getId() );
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            System.out.print("what is ur answer =>");
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }
        for(String s:selection){
            System.out.println(s);
        }
    }

    public void printscore(){
        int score=0;
        for(int i=0;i<questions.length;i++){
            question que=questions[i];
            String actualanswer= que.getAnswer();
            String useranswer=selection[i];
            if(actualanswer.equals(useranswer)){
                score++;
            }
        }
        System.out.println("your score is :" +score);
    }
}
