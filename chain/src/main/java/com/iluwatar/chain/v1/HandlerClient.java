package com.iluwatar.chain.v1;

//第一关
 class FirstPassHandler {
    public int handler(){
        System.out.println("第一关-->FirstPassHandler");
        return 80;
    }
}

//第二关
 class SecondPassHandler {
    public int handler(){
        System.out.println("第二关-->SecondPassHandler");
        return 90;
    }
}


//第三关
 class ThirdPassHandler {
    public int handler(){
        System.out.println("第三关-->ThirdPassHandler，这是最后一关啦");
        return 95;
    }
}

/**
 * 假设现在有一个闯关游戏，进入下一关的条件是上一关的分数要高于 xx：
 *
 * 游戏一共 3 个关卡
 * 进入第二关需要第一关的游戏得分大于等于 80
 * 进入第三关需要第二关的游戏得分大于等于 90
 *
 * 变化点：关卡的数量是可以动态增加的，并且之间有先后关系。
 * 可前可后
 */

public class HandlerClient {

    public static void main(String[] args) {

        FirstPassHandler firstPassHandler = new FirstPassHandler();//第一关
        SecondPassHandler secondPassHandler = new SecondPassHandler();//第二关
        ThirdPassHandler thirdPassHandler = new ThirdPassHandler();//第三关

        int firstScore = firstPassHandler.handler();
        //第一关的分数大于等于80则进入第二关
        if(firstScore >= 80){
            int secondScore = secondPassHandler.handler();
            //第二关的分数大于等于90则进入第二关
            if(secondScore >= 90){
                thirdPassHandler.handler();
            }
        }
    }

}
