import java.util.*;
import java.io.*;
public class RandomMonster{
  void run(String[] args){
    Map<String, List<String>> characterMap = new HashMap<String, List<String>>();
    characterMap=this.createMap();
    List<String> abilityList = new ArrayList<String>();
    
    System.out.println("***モンスト自動編成マシン***");
    System.out.println("[挑戦するクエストのアビリティを教えてね]");
    System.out.println("使用できるアビリティ");
    System.out.println("重力、壁、マイン、ワープ");
    
    Integer i=1;
    String candidate
      for(String ability:args){
        if(ability==Mapkey){//書き方がわからない
          candidate=mapkey.value;//書き方がわからない
        }
        i+=1;
      }
      for(String target:candidate){
        if(Object.equals(target,candidate)){
        
        }
      }
  }
  Map<String,List<String>> createMap(){
    Map<String, List<String>> characterMap = new HashMap<String, List<String>>();
    List<String> AttributeAndAbility=new ArrayList<String>();
    characterMap.put();
    return characterMap;
  }
  public static void main(String[] args){
    RandomMonster RM=new RandomMonster();
    RM.run(args);
  }
}
