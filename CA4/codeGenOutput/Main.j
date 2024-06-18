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
		ldc "salam"
		dup
		invokevirtual java/lang/String/length()I
		ldc 1
		isub
		iconst_0
		swap
		invokevirtual java/lang/String/substring(II)Ljava/lang/String;
		invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
		return
		.end method
