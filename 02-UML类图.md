### **1、基本介绍**

1、Unified modeling language，统一建模语言，一种用于软件系统分析和设计的语言工具，它用于帮助软件开发人员进行思考和记录思路的结果

2、UML 本身是一套符号的规定，就像数学符号和化学符号一样，这些符号用于描述软件模型中的各个元素和他们之间的关系，比如类、接口、实现、泛化、依赖 、组合、聚合等。

依赖：使用

关联：一对多

泛化：继承

实现：接口实现

聚合：B类通过 set 方法穿入 A 类

组合：B 类通过new 创建，并作为 A的属性

![](pics\01-UML类图中的各个元素.png)

用途：

用于描述自己的思路

分类：

1. 用例图
2. 静态结构图：**类图**、对象图、包图、组件图、部署图
3. 动态行为图：交互图（时序图与协作图）、状态图、活动图

说明：

1、类图是描述类与类之间关系的，是 UML 图中最核心的

2、类之间的关系：依赖、泛化（继承）、实现、关联、聚合、组合

### 2、类的关系

#### 1、依赖关系

只要在类中用到了对方，他们之间就存在依赖关系。

代码：

```java
public class PersonServiceBean {

    private PersonDao personDao;

    public void save(Person person) {}


    public IDCard getIDCard(Integer personId) {
        return new IDCard();
    }

    public void modify() {
        Department department = new Department();
    }
}
```

类图：

![](pics\03-依赖关系.png)

小结：

1、类中用到了对方

2、如果是类的**成员属性**

3、如果是方法的**返回类型**

4、是方法**接收的参数**

5、在**方法中使用到**

#### 2、泛化关系

实际上就是继承，依赖关系的特例

代码：

```java
public class PsersonServiceBean extends DaoSupport {
}
```

类图：

![](pics\02-泛化关系.png)

小结：

1、如果A类继承了 B类，就说A和B存在泛化关系

#### 3、实现（Implementation）

实现接口，依赖的关系的特例

代码：

```java
public class PersonServiceBean implements PersonService {

    @Override
    public void delete(Integer id) {
        
    }
}
```

类图：

![](pics\04-实现关系.png)

#### 4、关联关系 Assosiation

是类与类之间的联系。

关联性有导航性，双向关系或单向关系。

关系具有多重性：如 1 表示仅有一个，0... 表示0个或者多个，0,1 表示0个或1个，n..m 表示n到m 个都可以，m...* 表示至少m个

![](pics\05-关联关系.png)

#### 5、聚合关系 Aggregation

表示的是整体和部分的关系，整体与部分可以分开，聚合关系和关联关系的特例，所以具有关联关系的导航性和多重性。

代码：

```java
public class Computer {

    private Mouce mouce; // 鼠标可以和电脑分离
    private Monitor monitor; // 显示器也可以和电脑分离

    public void setMouce(Mouce mouce) {
        this.mouce = mouce;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
```

对应的类图：

![](pics\06-聚合关系.png)

#### 6、组合关系 Composition

如果 Mouse 和 Monitor 和 Computer 不可分离，则为组合关系

代码

```java
public class Computer {

    private Mouce mouce = new Mouce(); // 鼠标可以和电脑不可分离
    private Monitor monitor = new Monitor(); //

    public void setMouce(Mouce mouce) {
        this.mouce = mouce;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
```

对应类图：

![](pics\07-组合关系.png)

如果定义了级联删除，那么原来是聚合的关系就变成了组合关系。

