

    //-----------------------------------------
//XML LAYOUT LOGIN

    //-----------------------------------------


<androidx.cardview.widget.CardView
        android:id="@+id/btnGoogle"
        android:layout_width="134dp"
        android:layout_height="135dp"
        android:layout_marginTop="20dp"
        android:layout_marginBottom="250dp"
        app:cardBackgroundColor="@color/letrasBotones"
        app:cardCornerRadius="16dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView"
        tools:ignore="MissingConstraints">

        <androidx.appcompat.widget.LinearLayoutCompat
            android:layout_width="142dp"
            android:layout_height="match_parent"
            android:gravity="center"
            android:orientation="vertical">

            <ImageView
                android:layout_width="60dp"
                android:layout_height="60dp"
                android:layout_marginBottom="8dp"
                android:src="@drawable/logingooglee" />

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="INICIAR SESIÓN"
                android:textAllCaps="true"
                android:textColor="@color/fondoNegro"
                android:textStyle="bold" />

        </androidx.appcompat.widget.LinearLayoutCompat>


    </androidx.cardview.widget.CardView>



    //-----------------------------------------

//PIE LOGIN

    //-----------------------------------------

    <?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:background="#FF9800">


    <androidx.appcompat.widget.AppCompatTextView
        android:id="@+id/tvFooter"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="30dp"
        android:layout_marginBottom="100dp"
        android:text="JOSÉ MANUEL GARCÍA TRAVÉ  2ºDAM"
        android:textColor="@color/black"
        android:textSize="19sp"
        app:fontFamily="@font/primera"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.494"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="1.0" />

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:fontFamily="@font/primera"
        android:text="COLABORACIONES:"
        android:textColor="@color/fondoNegro"
        android:textSize="16sp"
        android:textStyle="bold"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.498"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <ImageView
        android:layout_width="60dp"
        android:layout_height="60dp"
        android:layout_marginTop="90dp"
        android:src="@drawable/logoies"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />




</androidx.constraintlayout.widget.ConstraintLayout>




//---------------------------------------------------------------
PostViewHolder
        binding.btnLike.setOnClickListener{
            onItemLike(posts,likeFav)
            cambiarImgLike()
            binding.tvLikes.text = posts.likes.toString() +" Likes"

           // val ese = getString(R.string.numeroLikes)
        }

 private fun cambiarImgLike() {
        likeFav = !likeFav

        if(likeFav){
            binding.btnLike.setImageResource(R.drawable.ic_like_dos)
        }else{
            binding.btnLike.setImageResource(R.drawable.ic_like_uno)
        }


    }