package inflearn.recursive;

class Node2 {
    int data;
    Node3 lt, rt;

    public Node2(int val) {
        data = val;
        lt = rt = null;
    }
}

class Main0709 {
    Node3 root;

    public int DFS(int L, Node3 root) {
        if (root.lt == null && root.rt == null) {
            return L;
        } else {
            return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt));
        }
    }

    public static void main(String[] args) {
        Main0709 tree = new Main0709();
        tree.root = new Node3(1);
        tree.root.lt = new Node3(2);
        tree.root.rt = new Node3(3);
        tree.root.lt.lt = new Node3(4);
        tree.root.lt.rt = new Node3(5);

        System.out.println(tree.DFS(0, tree.root));
    }
}
