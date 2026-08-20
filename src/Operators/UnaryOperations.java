
static void main(){

    int activeusers = 10;

    int preffix = ++activeusers;
    // first increment -> 101 then copy in prefix again then sp prefix ki value: 101
    int postfix =  activeusers++;
    //activeUser = 101
    //phele use krte h, postfix me copy hoke, postfix -> 101
    //uske baad increment krdia, activeUsers -> 102

    System.out.println(preffix);
    System.out.println(postfix);
    System.out.println(activeusers);

}