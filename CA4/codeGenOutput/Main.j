.class public Main
		.super java/lang/Object
.method public static main([Ljava/lang/String;)V
		.limit stack 128
		.limit locals 128
		new Main
		invokespecial Main/<init>()V
		return
		.end method
.method public static f(II)I
.limit stack 128
.limit locals 128
		iload 0
		aload 1
		iadd
		areturn
.end method
		
.method public <init>()V
		.limit stack 128
		.limit locals 128
		aload_0
		invokespecial java/lang/Object/<init>()V
		ldc 1
		istore 0
		
		return
		.end method
