boolean newRoadSystem(boolean[][] roadRegister) {
    
   for (int i = 0; i < roadRegister.length; i++) {
       if (!scan(roadRegister, i)) {
           return false;
       }
   }
        
    
return true;
    

}
boolean scan(boolean[][] arr, int index) {
    int out = 0;
    int in = 0;
    for (int i = 0; i < arr.length; i++) {
        boolean valOut = arr[index][i];
        boolean valIn = arr[i][index];
        if (valOut) out++;
        if (valIn) in++;
    }
    return out == in;
}
