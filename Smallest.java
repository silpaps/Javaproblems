class Smallest {
  public static void main(String[] args){
    int[] a={1,3,5,7,8};
    int smallest=a[0];
    for(int i=0;i<a.length;i++){
      if(a[i]<smallest){
        smallest=a[i];
      }
  
    }
    System.out.println(smallest);
  }
}
