package com.jfree.framework.mvc.mongo.codec;

import org.bson.Document;

/**
 * @Title: JCodec
 * @Description: 装箱、拆箱接口,实体类必须实现该接口,用于BaseDao中调用
 * @CreateTime：Mar 25, 20164:28:53 PM
 * @author leizhenyang
 */
public interface JCodec<M>{
	/**
	 * 
	  * <p> Description(方法描述): TODO 将<b>Document</b>装箱为<b>泛型实体</b>的接口方法</p>
	  * <p> Param: @param doc
	  * <p> Param: @return </p>
	  * <p> Return: M </p>
	  * <p> CreateTime(生成日期)：Mar 24, 2016 4:26:37 PM </p>
	  * @author leizhenyang
	 */
	M enJCodec(Document doc);
	/**
	 * 
	  * <p> Description(方法描述): TODO 将<b>泛型实体</b>拆箱为<b>Document</b>的接口方法</p>
	  * <p> Param: @param doc
	  * <p> Param: @return </p>
	  * <p> Return: M </p>
	  * <p> CreateTime(生成日期)：Mar 25, 2016 4:06:55 PM </p>
	  * @author leizhenyang
	 */
	Document deJCodec(M entity);
}
