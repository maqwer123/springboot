package com.example.springbootdemo.bean;

public class Goods {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.gname
     *
     * @mbg.generated
     */
    private String gname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.gprice
     *
     * @mbg.generated
     */
    private String gprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.gnumber
     *
     * @mbg.generated
     */
    private String gnumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.guser
     *
     * @mbg.generated
     */
    private String guser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.gphoto
     *
     * @mbg.generated
     */
    private String gphoto;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated
     */
    public Goods(Integer id, String gname, String gprice, String gnumber, String guser, String gphoto) {
        this.id = id;
        this.gname = gname;
        this.gprice = gprice;
        this.gnumber = gnumber;
        this.guser = guser;
        this.gphoto = gphoto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.id
     *
     * @return the value of goods.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.gname
     *
     * @return the value of goods.gname
     *
     * @mbg.generated
     */
    public String getGname() {
        return gname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.gprice
     *
     * @return the value of goods.gprice
     *
     * @mbg.generated
     */
    public String getGprice() {
        return gprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.gnumber
     *
     * @return the value of goods.gnumber
     *
     * @mbg.generated
     */
    public String getGnumber() {
        return gnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.guser
     *
     * @return the value of goods.guser
     *
     * @mbg.generated
     */
    public String getGuser() {
        return guser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.gphoto
     *
     * @return the value of goods.gphoto
     *
     * @mbg.generated
     */
    public String getGphoto() {
        return gphoto;
    }
}