package inflearn.recursive;

import java.util.LinkedList;
import java.util.Queue;

class Node1 {
    int data;
    Node1 lt, rt;

    public Node1(int val) {
        data = val;
        lt = rt = null;
    }
}

class Main0707 {
    Node1 root;

    public void BFS(Node1 root) {
        Queue<Node1> q = new LinkedList<>();
        q.offer(root);

        int L = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            System.out.print(L + " : ");

            for (int i = 0; i < len; i++) {
                Node1 cur = q.poll();
                System.out.print(cur.data + " ");

                if (cur.lt != null) {
                    q.offer(cur.lt);
                }
                if (cur.rt != null) {
                    q.offer(cur.rt);
                }
            }
            L++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Main0707 tree = new Main0707();
        tree.root = new Node1(1);
        tree.root.lt = new Node1(2);
        tree.root.rt = new Node1(3);
        tree.root.lt.lt = new Node1(4);
        tree.root.lt.rt = new Node1(5);
        tree.root.rt.lt = new Node1(6);
        tree.root.rt.rt = new Node1(7);

        tree.BFS(tree.root);
    }
}
