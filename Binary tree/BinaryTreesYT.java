import java.util.*;

public class BinaryTreesYT{
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }

    ///PREORDER
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    //// INORDER 
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    ////POSTORDER
    public static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }



    ////LEVELORDER
    public static void levelorder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int countofNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftNodes = countofNodes(root.left);
        int rightNodes = countofNodes(root.right);

        return leftNodes + rightNodes + 1;
    }

    public static int sumofNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftsum = sumofNodes(root.left);
        int rightsum = sumofNodes(root.right);
        return leftsum+rightsum+root.data;
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftheight=height(root.left);
        int rightheight=height(root.right);

        int myheight=Math.max(leftheight,rightheight)+1;
        return myheight;
    }

    public static int diameter(Node root){
       
        if(root == null){
            return 0;
        }
        int dim1=diameter(root.left);
        int dim2=diameter(root.right);
        int dim3=height(root.left)+height(root.right)+1;

        return Math.max(dim3,Math.max(dim1,dim2));
    }


    static class TreeInfo{
        int ht;
        int diam;
        TreeInfo(int ht, int diam){
            this.ht=ht;
            this.diam=diam;
        }
    }
    public static TreeInfo diameter2(Node root){
        if(root == null){
            return new TreeInfo(0, 0);
        }

        TreeInfo left=diameter2(root.left);
        TreeInfo right =diameter2(root.right);

        int myheight = Math.max(left.ht,right.ht)+1;

        int diam1=left.diam;
        int diam2=right.diam;
        int diam3=left.ht+right.ht +1;
        
        int mydiam = Math.max(diam3,Math.max(diam1,diam2));

        TreeInfo myInfo = new TreeInfo(myheight, mydiam);
        return myInfo;
    }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        // System.out.println(root.data);
        //preorder(root);
        //inorder(root);
        //postorder(root);
        //levelorder(root);

        //System.out.println(countofNodes(root));
        //System.out.println(sumofNodes(root));
        // System.out.println(height(root));
        // System.out.println(diameter(root));
        System.out.println(diameter2(root).diam);
    }
}