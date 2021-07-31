package simulandoUmaBlockChain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	
	public static void main(String[] args) {
		List<Block> blockChainList = new ArrayList<>();
		Block genesis = new Block("MeuPrimeiroBlockChain",0);
		blockChainList.add(genesis);
		
		Block blockX = new Block("HELLO",blockChainList.get(blockChainList.size()-1).hashCode());
		blockChainList.add(blockX);
		
		Block blockY = new Block("WELCOME TO",blockChainList.get(blockChainList.size()-1).hashCode());
		blockChainList.add(blockY);
		
		Block blockZ = new Block("YOUR FIRST",blockChainList.get(blockChainList.size()-1).hashCode());
		blockChainList.add(blockZ);
		
		Block blockA = new Block("BLOCKCHAIN BABY",blockChainList.get(blockChainList.size()-1).hashCode());
		blockChainList.add(blockA);
		
		Block blockB = new Block("BLOCKCHAIN BABY",blockChainList.get(blockChainList.size()-1).hashCode());
		blockChainList.add(blockB);

		Block blockC = new Block("BLOCKCHAIN BABY",blockChainList.get(blockChainList.size()-1).hashCode());
		blockChainList.add(blockC);
		
		Block blockD = new Block("BLOCKCHAIN BABY",blockChainList.get(blockChainList.size()-1).hashCode());
		blockChainList.add(blockD);
		
		Block blockE = new Block("BLOCKCHAIN BABY",blockChainList.get(blockChainList.size()-1).hashCode());
		blockChainList.add(blockE);
		
		
		
		
		System.out.println("#########################################################");
		System.out.println("Creating the BlockChain");
		System.out.println("#########################################################");
		
		blockChainList.forEach(System.out::println);
		
		System.out.println("#########################################################");
		
		
	}
	
}

class Block{
	
	private int previousHash;
	private String data;
	private int hash;
	
	public Block(String data, int previousHash){
		this.data=data;
		this.previousHash=previousHash;
		
		//CREATE THE BLOCK-CHAIN
		
		this.hash = Arrays.hashCode(new Integer []{data.hashCode(), previousHash});
		
		
	}
	
}