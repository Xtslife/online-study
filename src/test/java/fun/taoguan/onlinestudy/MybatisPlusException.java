package fun.taoguan.onlinestudy;

/**
 * @创建人：关涛
 * @创建时间: 2020/8/5
 * @描述：
 */
public class MybatisPlusException extends RuntimeException {
    /**
     * 错误码
     */
    private String code;




    public MybatisPlusException(String message) {
        super(message);
    }




    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
