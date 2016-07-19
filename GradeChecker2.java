//544926 辻 凌大
import java.io.*;
import java.util.*;
public class GradeChecker2{
	void run(String[] args)throws IOException{
		List<File> fileList=new ArrayList<File>();

		List<Double> testScoreList=new ArrayList<Double>();
		List<Integer> totalScoreList=new ArrayList<Integer>();
		List<Double> attendRateList=new ArrayList<Double>();

		for(String file :args){
			File afile = new File(file);
			fileList.add(afile);
		}
		//Map<Integer,Double> gradeMap = new HashMap<Integer,Double>();
		File testfile=fileList.get(0);
		BufferedReader intest = new BufferedReader(new FileReader(testfile));
		File taskfile=fileList.get(1);
		BufferedReader intask = new BufferedReader(new FileReader(taskfile));
		File minifile=fileList.get(2);
		BufferedReader inmini = new BufferedReader(new FileReader(minifile));

		String testline,taskline,miniline;
		Integer number=0;
		Double score=0.0;
		Integer count=1;
		Integer testCount=1;
		Integer miniCount=1;
		

		while((testline = intest.readLine()) != null){
			String[] testitem = testline.split(",");
			number = new Integer(testitem[0]);//IDの取得
			score = new Double(testitem[1]);//テストの点数の取得
			//gradeMap.put(number,score);
			if(Objects.equals(testCount,number)){
				testScoreList.add(score);
				testCount+=1;
			}
			else{
				testScoreList.add(0.0);
				testScoreList.add(score);
				testCount+=2;
			}
			while((taskline = intask.readLine()) != null){
				Integer totalScore=0;
				String[] taskitem = taskline.split(",");
				for(Integer i=1;i<=taskitem.length-1;i++){
					if(!Objects.equals(taskitem[i],"")){
						totalScore += new Integer(taskitem[i]);
					}
					else{
						totalScore += 0;
					}
				}
				totalScoreList.add(totalScore);

				while((miniline = inmini.readLine()) != null){
					Double attendRate=0.0;
					String[] miniitem = miniline.split(",");
					Integer studentNumber = new Integer(miniitem[0]);//IDの取得
					if(Objects.equals(miniCount,studentNumber)){
						//count+=1;
						for(Integer i=1;i<=miniitem.length-1;i++){
							
							if(!Objects.equals(miniitem[i],"")){
								attendRate += 1.0;
							}

							else{
								attendRate += 0.0;
							}
						}
						attendRateList.add(attendRate);
						miniCount+=1;
					}
					else{
						for(Integer i=1;i<=miniitem.length-1;i++){
							
							if(!Objects.equals(miniitem[i],"")){
								attendRate += 1.0;
							}

							else{
								attendRate += 0.0;
							}
						}
						attendRateList.add(0.0);
						attendRateList.add(attendRate);
						miniCount+=2;
					}
				}
			}
			
		}
		

		for(Integer i=0;i<testCount;i++){
			Double resultTest = testScoreList.get(i);
			Integer resultTotal = totalScoreList.get(i);
			Double resultAttend = attendRateList.get(i);
			System.out.println(i+1 +","+resultTest+","+resultTotal+","+resultAttend);
		}
	}

/*
			for(Integer i=1;i<=count;i++){
				String rating=new String();
				if(gradeMap.get(i)==null){
					gradeMap.put(i,0.00000);
					rating="K";
				}
				else{
					gradeMap.put(number,score);
				}
				System.out.println(i+","+gradeMap.get(i)+","+rating);
			}
			*/

			public static void main(String args[])throws IOException{
				GradeChecker2 application = new GradeChecker2();
				application.run(args);
			}
		}
