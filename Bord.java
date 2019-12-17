/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;

/**
 *
 * @author dell
 */
public class Bord {
    
    private int [][]bord=new int [3][3];
    
    public void initializeBord()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                bord[i][j]=2;
            }
        }
    }
    public int getBordValue(int i,int j)
    {
        return bord[i][j];
    }
    public void getBordValue(int i,int j, int value)
    {
        bord[i][j]=value;
    }
    
    private int checkProbability(int prime)
    {
        prime=prime*prime*2;
        // bord[i][j]
        // i=row (horizantal) 
        for(int i=0;i<3;i++)
        {
            if(bord[i][0]*bord[i][1]*bord[i][2]==prime)
            {
                if(bord[i][0]==2)
                {
                    return 3*i+1;
                }
                else if(bord[i][1]==2)
                {
                    return 3*i+2;
                }
                else 
                {
                    return 3*i+3;
                }
            }
        }
        //j=colume(vertical)
        for(int j=0;j<3;j++)
        {
            if(bord[0][j]*bord[1][j]*bord[2][j]==prime)
            {
                if(bord[0][j]==2)
                {
                    return j+1;
                }
                else if(bord[0][j]==2){
                    return j+4;
                }
                else 
                {
                    return j+7;
                }
            }
        }
        //diagonal
        if(bord[0][0]*bord[1][1]*bord[2][2]==prime)
        {
            if(bord[0][0]==2)
            {
                return 1;
            }
            else if(bord[1][1]==2)
            {
                return 5;
            }
            else 
            {
                return 9;
            }
        }
        if(bord[0][2]*bord[1][1]*bord[2][0]==prime)
        {
            if(bord[0][2]==2)
            {
                return 3;
            }
            else if(bord[1][1]==2)
            {
                return 5;
            }
            else 
            {
                return 7;
            }
        }
        return 0;
    }
    
    public int possibleWin(int player)
    {
        if(player==1)
        {
            checkProbability(3);
        }
        else 
        {
            checkProbability(5);
        }
        return 0;
    }
    
    
    
}
