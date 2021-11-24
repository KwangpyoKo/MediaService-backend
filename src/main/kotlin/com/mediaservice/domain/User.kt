package com.mediaservice.domain

import javax.persistence.*

@Entity
@Table(name = "TB_USER")
class User(var email: String, var password: String): BaseEntity(){
    constructor(id:String, email: String, password: String) : this(email, password)
}