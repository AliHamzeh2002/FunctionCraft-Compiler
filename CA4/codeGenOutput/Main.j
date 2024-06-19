.class public Main
		.super java/lang/Object
.method public static main([Ljava/lang/String;)V
		.limit stack 128
		.limit locals 128
		new Main
		invokespecial Main/<init>()V
		return
		.end method
.method public start(Ljava/lang/Boolean;Ljava/lang/Integer;)V
.limit stack 128
.limit locals 128
		aload 1
		checkcast java/lang/Boolean
		invokevirtual java/lang/Boolean/booleanValue()Z
		ldc 1
		ixor
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		invokevirtual java/lang/Boolean/booleanValue()Z
		ifeq Label_1
	Label_0:
		aload 1
		checkcast java/lang/Boolean
		invokevirtual java/lang/Boolean/booleanValue()Z
		ifeq Label_4
	Label_3:
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 2
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		ldc 30
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		idiv
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/println(I)V
		goto Label_5
	Label_4:
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 2
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		ldc 30
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		imul
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/println(I)V
	Label_5:
		goto Label_2
	Label_1:
	Label_2:
		new Fptr
		dup
		aload_0
		ldc "itList"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 3
		aload 3
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		pop
		return
.end method
.method public itList()V
.limit stack 128
.limit locals 128
		new Fptr
		dup
		aload_0
		ldc "printRecursive"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 1
		aload 1
		new List
		dup
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 2
		aload 2
		ldc "ata"
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 2
		ldc "souri"
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 2
		ldc "javad"
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 2
		ldc "nemati"
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 2
		ldc "darabi"
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new List
		dup
		aload 2
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		invokespecial List/<init>(LList;)V
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 1
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 1
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		pop
		return
.end method
.method public printRecursive(LList;Ljava/lang/Integer;)V
.limit stack 128
.limit locals 128
		aload 2
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		ldc 5
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		if_icmpeq Label_6
		ldc 0
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		goto Label_7
	Label_6:
		ldc 1
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
	Label_7:
		invokevirtual java/lang/Boolean/booleanValue()Z
		ifeq Label_9
	Label_8:
		return
		goto Label_10
	Label_9:
	Label_10:
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 1
		checkcast List
		aload 2
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual List/getElement(I)Ljava/lang/Object;
		checkcast java/lang/String
		checkcast java/lang/String
		invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
		new Fptr
		dup
		aload_0
		ldc "printRecursive"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 3
		aload 3
		new List
		dup
		aload 1
		checkcast List
		invokespecial List/<init>(LList;)V
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 3
		aload 2
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		ldc 1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		iadd
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 3
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		pop
		return
.end method
.method public <init>()V
		.limit stack 128
		.limit locals 128
		aload_0
		invokespecial java/lang/Object/<init>()V
		new Fptr
		dup
		aload_0
		ldc "start"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 1
		aload 1
		ldc 1
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 1
		ldc 300
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 1
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		pop
		return
		.end method
