/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarireport;

/**
 *
 * @author MIKO
 */
class User {
    private int id, stok, harga;
    private String nama_barang;
    
    public User(int id, String nama_barang, int stok, int harga){
        this.id = id;
        this.nama_barang = nama_barang;
        this.stok = stok;
        this.harga = harga;
    }

    User() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getid(){
        return id;
    }
    
    public String getnama(){
        return nama_barang;
    }
    
    public int getstok(){
        return stok;
    }
    
    public int getharga(){
        return harga;
    }
}
