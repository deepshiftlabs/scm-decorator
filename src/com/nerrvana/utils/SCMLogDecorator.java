package com.nerrvana.utils;

import java.io.*;
import java.util.*;

public class SCMLogDecorator {
    private static void decorateSVN(String[] args, File file) throws Exception{
        try{
            String line = null;
            List<String> list = new ArrayList<String>(); 
            BufferedReader br = new BufferedReader(new FileReader(file));
            try{
                while((line = br.readLine()) != null){
                    list.add(line);
                }
            }
            finally{
                try{br.close();}catch(Exception e){}
            }

            
            String[] info = list.get(1).split("\\|");
            String revision = info[0].trim().substring(1);
            String username = info[1].trim();
            String datetime = info[2].trim();
            
            StringBuilder message = new StringBuilder();
            for(int i = 2; i < list.size() - 1; i++){
                if(message.length() > 0)
                    message.append("\n");
                message.append(list.get(i).trim());
            }

            StringBuilder result = new StringBuilder();
            result.append("Revision: ").append(revision).append("\n");
            result.append("Committer: ").append(username).append("\n");
            result.append("Date: ").append(datetime).append("\n");
            result.append(message);

            FileWriter fstream = new FileWriter(file);
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(result.toString());
            out.close();
        }
        catch(Exception e){
            //not a SVN log file
        }
    }
    
    /**
     * @param args
     * index 0 - SCM type (currently supports SVN only)
     * index 1 - file to decorate
     */
    public static void main(String[] args) throws Exception{
        if(args.length == 2){
            File file = new File(args[1]);
            if(file.exists() && file.isFile()){
                if(args[0].equalsIgnoreCase("SVN"))
                    decorateSVN(args,file);
                else
                    throw new Exception("Format "+args[0]+" not supported");
            }
        }
        else{
            throw new Exception("Invalid number of arguments: "+args.length);
        }
    }

}
