package com.iluwatar.chain.v3;

public class SecondPassHandler extends AbstractHandler {
    // 也可以接口约定
    private int play(){
        return 80;
    }

    @Override
    public int handler(){
        System.out.println("第二关-->SecondPassHandler");
        int score = play();
        if(score >= 80){
            //分数>=80 并且存在下一关才进入下一关
            if(this.next != null){
                return this.next.handler();
            }
        }
        return score;
    }

}
