package struct.Sq;

import struct.Link.IList;

/**
 * @Description 线性表
 * @Author ZTwo
 * @Date 2021/3/30 22:53
 */
public class SqList implements IList {
    private Object[] listElm; //存储空间
    private int curLen; //线性表当前长度

    public SqList(int maxSize) {
        //初始化长度为0
        curLen = 0;
        listElm = new Object[maxSize];
    }

    //清空线性表
    @Override
    public void clear() {
        listElm = new Object[0];
        curLen = 0;
    }

    //判断是否为空
    @Override
    public boolean isEmpty() {
        return curLen == 0;
    }

    //线性表长度
    @Override
    public int length() {
        return curLen;
    }

    //获取当前下标的元素
    @Override
    public Object get(int i) throws Exception {
        if (i < 0 || i > curLen - 1) {
            throw new Exception("第" + i + "个元素不存在");
        }
        return listElm[i];
    }

    //插入元素
    @Override
    public void insert(int i,Object o) throws Exception {
        if (curLen == listElm.length) {
            throw new ArrayIndexOutOfBoundsException("顺序表已满");
        }
        if (i < 0 || i > curLen) {
            throw new ArrayIndexOutOfBoundsException("操作不合法");
        }
        for (int j = curLen; j > i; j--) {
            listElm[j] = listElm[j - 1];
        }
        listElm[i] = o;
        curLen++;
    }

    @Override
    public void insert(Object o) throws Exception {
        if (curLen == listElm.length) {
            throw new ArrayIndexOutOfBoundsException("顺序表已满");
        }
        listElm[curLen] = o;
        curLen++;
    }

    //删除元素
    @Override
    public void remove(int i) throws Exception {
        if (i < 0 || i > curLen) {
            throw new ArrayIndexOutOfBoundsException("操作不合法");
        }
        for (int j = i; j < curLen - 1; j++) {
            listElm[j] = listElm[j + 1];
        }
        curLen--;
    }

    //获取元素下标
    @Override
    public int indexOf(Object o) {
        int index = 0;
        while (index < curLen - 1 && !listElm[index].equals(o)) {
            index++;
        }
        if (index < curLen) {
            return index;
        } else {
            return -1;
        }
    }

    //输出所有元素
    @Override
    public void display() {
        System.out.print("[");
        for (int i = 0; i < curLen; i++) {
            System.out.print(listElm[i] + ",");
        }
        System.out.println("]");
    }
}
