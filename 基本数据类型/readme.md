# 基本数据类型

byte, 8 bits, 二进制补码，对应Byte

short， 16 bits， 二进制补码，对应Short

int， 32 bits，二进制补码，对应Integer

long，64 bits, 二进制补码，默认为0L，对应Long

float， 32 bits，IEEE 754标准的浮点数，默认为 0.0f，对应Float

double，64 bits，IEEE 754标准的浮点数，默认为 0.0d，对应Doule

boolean，1 bit，默认为false，对应Boolean

char，16 bits，对应Character

> 上面说的默认值，是指作为类的成员变量的时候
> 列如`private int a;`
> 如果你定义了一个临时变量，如`int i;`
> 则编译器会报错"Variable might not have been initialized"

# float的近似性

0-10之间，有无数个浮点数，但是只有有限个整数。

所以float只能近似地表示一个浮点数

# C语言

浮点数的默认类型为double类型


# 编译器

一般地整型变量默认为int类型；

long a=111111111111111111111111L

浮点数的默认类型为double类型；

float f=6.26F


# null

是java中的一个常量，代表空的引用