class GfG
{
    void deleteNode(Node node)
    {
         
         node.data=node.next.data;
         node.next=node.next.next;
         // Your code here
    }
}
