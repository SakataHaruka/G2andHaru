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
    
      for(String ability:args){
        abilityList.add(ability);
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
