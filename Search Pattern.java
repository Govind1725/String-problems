   // your code here
        ArrayList list = new ArrayList();
        String w= "";
        int flage=0;
        int n=S.length();
        for (int i=0; i<n; i++){
            for(int j=i; j<n;j++){
                  char ch = S.charAt(j);
                w = w + ch;
                if (w .equals(pat)) {
                    flage=1;
                    list.add(i+1);
                }
            }
                w="";
            }
            if(flage !=1){
                list.add(-1);
            }
            return list;
        }
