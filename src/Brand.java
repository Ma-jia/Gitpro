public class Brand {
    private int id               ;
    // 品牌名称
    private String brand_name       ;
    // 企业名称
    private String company_name     ;
    // 排序字段
    private int ordered          ;
    // 描述信息
    private String description      ;
    // 状态：0：禁;
    private String status           ;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public int getOrdered() {
        return ordered;
    }

    public void setOrdered(int ordered) {
        this.ordered = ordered;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        Status = status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private Integer Status=null;

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", brand_name='" + brand_name + '\'' +
                ", company_name='" + company_name + '\'' +
                ", ordered='" + ordered + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", Status=" + Status +
                '}';
    }
}
