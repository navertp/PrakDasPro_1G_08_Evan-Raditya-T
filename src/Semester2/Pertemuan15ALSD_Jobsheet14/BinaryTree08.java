package Semester2.Pertemuan15ALSD_Jobsheet14;

public class BinaryTree08 {
    Node08 root;
    public BinaryTree08() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Mahasiswa08 mahasiswa) {
        Node08 newNode08 = new Node08(mahasiswa);
        if (isEmpty()) {
            root = newNode08;
        } else {
            Node08 current = root;
            Node08 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode08;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode08;
                        return;
                    }
                }
            }
        }
    }

    boolean find(double ipk) {
        boolean result = false;
        Node08 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node08 node) {
        if (node != null) {
            node.mahasiswa.tampilkanInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node08 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilkanInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node08 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilkanInformasi();
        }
    }

    Node08 getSuccessor(Node08 del) {
        Node08 successor = del.right;
        Node08 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }
    
    void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree Kosong");
            return;
        }
        Node08 parent = root;
        Node08 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if(current.right == null){
                if(current == root){
                    root = current.left;
                }else{
                    if(isLeftChild){
                        parent.left = current.left;
                    }else{
                        parent.right = current.left;
                    }
                }
            } else {
                Node08 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilkanInformasi();
                if(current == root){
                    root = successor;
                }else{
                    if(isLeftChild){
                        parent.left = successor;
                    }else{
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    public void addRekursif(Mahasiswa08 mhs) {
        root = addRekursif(root, mhs);
    }

    public Node08 addRekursif(Node08 current, Mahasiswa08 mhs) {
        if (current == null) {
            return new Node08(mhs);
    }

    if (mhs.ipk < current.mahasiswa.ipk) {
        current.left = addRekursif(current.left, mhs);
    } else {
        current.right = addRekursif(current.right, mhs);
    }

    return current;
    }

    public void cariMinIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong.");
        } else {
            Node08 current = root;
            while (current.left != null) {
                current = current.left;
            }
            System.out.println("Mahasiswa dengan IPK terkecil:");
            current.mahasiswa.tampilkanInformasi();
        }
    }

    public void cariMaxIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong.");
        } else {
            Node08 current = root;
            while (current.right != null) {
                current = current.right;
            }
            System.out.println("Mahasiswa dengan IPK terbesar:");
            current.mahasiswa.tampilkanInformasi();
        }
    }

    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        System.out.println("Mahasiswa dengan IPK di atas " + ipkBatas + ":");
        tampilMahasiswaIPKdiAtas(root, ipkBatas);
    }

    public void tampilMahasiswaIPKdiAtas(Node08 node, double ipkBatas) {
        if (node != null) {
            if (node.mahasiswa.ipk > ipkBatas) {
                tampilMahasiswaIPKdiAtas(node.left, ipkBatas);
            }
            
            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilkanInformasi();
            }
            tampilMahasiswaIPKdiAtas(node.right, ipkBatas);
        }
    }
}
