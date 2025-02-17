public class towersOfHamol {
    /* tour are given a three rods and n number of disks are given
        or stacked in one rod in a nincresaong order.
        order of size from top to bottom
        * only one disk can be moved at a time
        * a arger dosk can;t be placed on a smaller disc
        * you can only use three rods.
     */
    //Recurrsive formula T(N)=2T(N-1)+1; t(1)=1
    //TC=I(2^n) ; SC=O(n)

    /* Algorithum
     * move N-1 disks from source to Auxillary()
     * move the Nth disk directly from source to destination
     * move n-1 disk from auxillary to Destination(source helper)
     */

     public static void sH(int n,char sou,char aux ,char dest){
        if(n==1){
            System.out.println("Move disk 1 from"+" "+sou+""+" to "+dest);
            return;
        }
        sH(n-1,sou,dest,aux);
        System.out.println("Move disk"+" "+n+"" +" from "+sou+" to "+dest);
        sH(n-1,aux,sou,dest);
     }
     public static void main(String[] args) {
        int n=3;
        sH(n,'A','B','C');
     }
}
