package com.imooc.product.utils;

import com.imooc.product.vo.ResultVo;

/**
 * @author 汪永晖
 */
public class ResultVoUtil {

    public static ResultVo success(Object object) {
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(0);
        resultVo.setMsg("成功");
        resultVo.setData(object);
        return resultVo;
    }
}
