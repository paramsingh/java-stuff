public static String sort( String s){
    String sorted = "";
    s=s.toUpperCase();
    for( char ch = 'A',ch<='Z';ch++ ){
        for( int i=0;i<s.length();i++){
            if( ch==s.charAt(i) ){
                sorted += ch;
            }
        }
    }
    return sorted;
}
