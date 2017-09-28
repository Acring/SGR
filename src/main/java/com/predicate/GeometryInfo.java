package com.predicate;

import org.json.simple.JSONObject;

import java.util.ArrayList;

/**
 * Created by Acring on 2017/9/27.
 * 几何基类，所有几何类都继承该类
 */
public abstract class GeometryInfo {
    protected JSONObject jsonObject; // JSON对象表示

    protected boolean available;  // 是否是可用的几何信息

    protected ArrayList<GeometryInfo> geometryInfoArrayList;  // 包含的集合对象列表

    protected ArrayList<AlgebraExpr> algebraExprArrayList;  // 包含的代数表达式列表

    protected ArrayList<GeometryInfo> reasonGeometryArrayList;  // 推出该信息的其他几何信息

    protected String ruleInfo; // 推出该信息的规则

    protected int InfoIndex = 0;  // 当前信息序号, 从1开始

    protected int classIndex = 0;  // 类序号

    protected int categoryIndex = 0;  // 每个类的实体序号

    protected int hashCode = 0;




}
