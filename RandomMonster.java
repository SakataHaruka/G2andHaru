import java.util.*;
import java.io.*;
public class RandomMonster{
  void run(String[] args){
    Map<String, List<String>> characterMap = new HashMap<String, List<String>>();
    characterMap=this.createMap();
    List<String> abilityList = new ArrayList<String>();
    List<String> member=new ArrayList<String>();
    
    System.out.println("***モンスト自動編成マシン***");
    System.out.println("[挑戦するクエストのアビリティを教えてね]");
    System.out.println("使用できるアビリティ");
    System.out.println("重力、壁、マイン、ワープ");
    
    Integer abilityCount=0;//クエストのギミック数のカウント変数
    List<String> candidate=new ArrayList<String>();//候補のリストの作成
      for(String ability:args){//コマンドラインのギミックを取り出してabilityに代入
         List<String> monsterList=new ArrayList<String>();//
            monsterList=characterMap.get(ability);//コマンドライン引数で受け取ったギミックをcharacterMapからキャラ名を受け取る
            for(String characterName:monsterList){//アビリティに対応したキャラをcharacterNameに代入
                candidate.add(characterName);//候補のリストにキャラ名を代入
            }
            abilitycount+=1;
        }
     
      Integer count=0;
      for(String checkObject:candidate){
        for(String target:candidate){
          if(Object.equals(target,checkObject)){
          count+=1;
          }
          if(count==abilityCount){
          //リスト型に渡す
          member.add(target);
          break;
          }
        }
      count++;
      }
    System.out.println("そのクエストに対応したキャラは")
    for(String printmember:member){
      System.out.println(printmember);
      }
  }
  Map<String,List<String>> createMap(){
    Map<String, List<String>> characterMap = new HashMap<String, List<String>>();
        
        //重力                                                                         
        List<String> AG=new ArrayList<String>();
        AG.add("イザナミ");
        AG.add("毘沙門天");
        AG.add("阿修羅");
        AG.add("不動明王");
        characterMap.put("重力",AG);

        //壁                                                                           
        List<String> Wall=new ArrayList<String>();
        Wall.add("ヤマトタケル");
        Wall.add("不動明王");
        Wall.add("イザナギ");
        Wall.add("大黒天");
        Wall.add("クシナダ");
        characterMap.put("壁",Wall);

        //ワープ                                                                       
        List<String> Warp=new ArrayList<String>();
        Warp.add("イザナミ");
        Warp.add("毘沙門天");
        Warp.add("ヤマトタケル");
        Warp.add("ツクヨミ");
        Warp.add("大黒天");
        Warp.add("摩利支天");
        characterMap.put("ワープ",Warp);
        
        //マイン                                                                       
        List<String> Mine=new ArrayList<String>();
        Mine.add("ツクヨミ");
        Mine.add("クシナダ");
        Mine.add("摩利支天");
        Mine.add("阿修羅");
        characterMap.put("マイン",Mine);

    return characterMap;
  }
  public static void main(String[] args){
    RandomMonster RM=new RandomMonster();
    RM.run(args);
  }
}
