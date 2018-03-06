public class Run implements Comparable<Run>{
  public byte symbol;
  public int runLen;
  public int freq;
  public Run left;
  public Run right;
  public int codeword;
  public int codewordLen;
  public Run(byte s, int r){
    symbol = s; runLen = r; freq = 1;
  }
  public int hashCode(){
    return (int)symbol + runLen;
  }
}
public class HuffmanEncoder{
  
}
public class HuffmanCoding {
  private ArrayList<Run> runs = new ArrayList<Run>();
  private Heap<Run> heap; /* minimun heap*/
  private Run theRoot = null;

  private void collectRuns(RandomAccessFile fIn) throws IOException {
    /**/
  }

  private void createHuffmanTree(){
    heap = new Heap<Run>
  }

  private void printHuffmanTree(){
    preOrderTraverse(theRoot, 0);
  }
  private void preOrderTraverse(Run onde, int depth){
    for (int i = 0, i<depth; i++)
      System.out.println("  ");
    if (node == null){
      System.out.println("null");
    } else {
      System.out.println(node.toString());
      preOrderTraverse(node.left, depth + 1);
      preOrderTraverse(node.right, depth + 1);
    }
  }
  private void assignCodewords(Run p, int codeword, int length){
    if(p.left == null && p.right == null){
      p.codeword = codeword;
      p.codewordLen = codewordLen;
    } else { /*codeword의 뒤에 0 을 추가하고 길이 1증가 */
      assignCodewords(p.left, 0, p.length+1);
      assignCodewords(p.right, 1, p.length+1);
    }
  }
  private HashMap<Run,Run> map = new HashMap<Run,Run>();
  private void storeRunsIntoHashMap(Run p){
    /*huffmantree의 리프노드들을 map에 리커전으로 put
    map.put(p,p);*/
  }
  private void compressFile(RandomAccessFile fIn){
    collectRuns(fIn);
    createHuffmanTree();
    assignCodewords(theRoot, 0, 0);
    storeRunsIntoHashMap(theRoot);
  }

  public void encode(RandomAccessFile fIn, RandomAccessFile fOut){
    while
  }
  public static void main(String[] args) {
    HuffmanCoding app = new HuffmanCoding();
    RandomAccessFile fIn;
    try {
      fIn = new RandomAccessFile("sample.txt","r");
      app.collectRuns(fIn);
      fIn.close();

    } catch (IOException io){
      System.err.println("cannot open" + fileName);

    }
  }
}
