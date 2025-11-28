private int height(TNode<T> root) {
  if (root == null)
    return 0;
  else
    return 1 + Math.max(height(root.left), height(root.right));
}

public int balance() {
  return balance(root);
}
public int balance(TNode<T> root) {
  return height(root.right) - height(root.left);
}

public void AVLInsert(T val) throws Exception {
  insert(val);
  TNode<T> inserted = findNode(val);
  TNode<T> parent = findParent(val);
  TNode<T> grandparent = null;
  while (true) {
    if (parent != null)
      grandparent = findParent(parent.value);
    else
      return;
    if (grandparent != null) {
      if (balance(grandparent) > 1) {
        if (grandparent.right == parent && inserted == parent.right) {
          // single rotation rotate left
          TNode<T> parentOfGrandparent = findParent(grandparent.value);
          if (parentOfGrandparent != null
              && parentOfGrandparent.left == grandparent) {
            parentOfGrandparent.left = parent;
          } else if (parentOfGrandparent != null)
            parentOfGrandparent.right = parent;
          TNode<T> temp = parent.left;
          parent.left = grandparent;
          grandparent.right = temp;
          if (root == grandparent)
            root = parent;
          return;

        } else if (grandparent.right == parent && inserted == parent.left) {
          // double rotation right and left.
          // rotate right
          grandparent.right = parent.left;
          TNode<T> temp = inserted.right;
          inserted.right = parent;
          parent.left = temp;
          // rotate left
          if (root == grandparent)
            root = inserted;
          temp = inserted.left;
          inserted.left = grandparent;
          grandparent.right = temp;
          return;
        }
      } else if (balance(grandparent) < -1) {
        if (grandparent.left == parent && inserted == parent.left) {
          // sigle rotation rotate right
          TNode<T> parentOfGrandparent = findParent(grandparent.value);
          if (parentOfGrandparent != null
              && parentOfGrandparent.left == grandparent) {
            parentOfGrandparent.left = parent;
          } else if (parentOfGrandparent != null)
            parentOfGrandparent.right = parent;
          TNode<T> temp = parent.right;
          parent.right = grandparent;
          grandparent.left = temp;
          if (root == grandparent)
            root = parent;
          return;
        } else if (grandparent.left == parent && inserted == parent.right) {
          // double rotation right and left.
          // rotate right
          grandparent.left = parent.right;
          TNode<T> temp = inserted.left;
          inserted.left = parent;
          parent.right = temp;
          // rotate left
          if (root == grandparent)
            root = inserted;
          temp = inserted.right;
          inserted.right = grandparent;
          grandparent.left = temp;
          return;
        }
      }
    }

    inserted = parent;
    parent = grandparent;
  }
}