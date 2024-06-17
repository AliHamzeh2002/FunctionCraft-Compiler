.class public Main
		.super java/lang/Object
.method public static main([Ljava/lang/String;)V
		.limit stack 128
		.limit locals 128
		new Main
		invokespecial Main/<init>()V
		return
		.end method
.method public <init>()V
		.limit stack 128
		.limit locals 128
		aload_0
		invokespecial java/lang/Object/<init>()V
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc 0
		invokevirtual java/io/PrintStream/println(I)V
		ldc 1
		istore 0
		iload 0
		
		ldc 1
		if_icmpeq Label_0
		ldc 0
		goto Label_1
		Label_0:
		ldc 1
		Label_1:
		ifeq Label_3
		Label_2:
		ldc 1
		istore 1
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 1
		
		goto Label_4
		Label_3:
		Label_4:
		return
		.end method
