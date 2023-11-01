
package controller;

import common.Algorithm;
import view.Menu;


public class CopyFileProgram extends Menu{
    Algorithm ar;
    public CopyFileProgram() {
        super("========== COPY PROGRAM ==========");
        ar = new Algorithm();
    }

    @Override
    public void execute() {
        ar.readFileConfig();
    }
    
}