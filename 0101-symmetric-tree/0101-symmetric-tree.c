/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
 bool Symmetric(struct TreeNode* left,struct TreeNode* right){
    if(left==NULL && right==NULL){
        return true;
    }
    else if(left==NULL || right==NULL){
        return false;
    }
    return (left->val==right->val)&& Symmetric(left->left,right->right) && Symmetric(left->right,right->left);
 }
bool isSymmetric(struct TreeNode* root) {
    if(root==NULL){
        return 0;
    }
       return Symmetric(root->left,root->right);
}