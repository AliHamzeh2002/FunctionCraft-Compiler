.class public Main
		.super java/lang/Object
.method public static main([Ljava/lang/String;)V
		.limit stack 128
		.limit locals 128
		new Main
		invokespecial Main/<init>()V
		return
		.end method
.method public calcPow(Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;
.limit stack 128
.limit locals 128
		ldc 1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 3
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 4
	Label_0:
		aload 4
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		aload 2
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		if_icmpeq Label_2
		ldc 0
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		goto Label_3
	Label_2:
		ldc 1
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
	Label_3:
		invokevirtual java/lang/Boolean/booleanValue()Z
		ifeq Label_5
	Label_4:
		goto Label_1
		goto Label_6
	Label_5:
	Label_6:
		aload 3
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		aload 1
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		imul
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 3
		aload 4
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		ldc 1
		iadd
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 4
		goto Label_0
	Label_1:
		aload 3
		checkcast java/lang/Integer
		areturn
.end method
.method public <init>()V
		.limit stack 128
		.limit locals 128
		aload_0
		invokespecial java/lang/Object/<init>()V
		getstatic java/lang/System/out Ljava/io/PrintStream;
		new Fptr
		dup
		aload_0
		ldc "calcPow"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 1
		aload 1
		ldc 3
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 1
		ldc 5
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 1
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/println(I)V
		return
		.end method
