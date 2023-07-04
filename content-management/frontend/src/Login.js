import React, {useEffect, useState} from "react";
import axios from "axios";
import * as authApi from "./api/authApi.js";


function Login() {
    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");
    const handleFormSubmit = e => {
        if (username && password) {
            authApi.login(username, password)
                .then(res => {
                    console.log(res);
                    alert("success")
                })
                .catch(err => {
                    console.log(err);
                    alert("error")
                });
        }
    }
    return (
        <div className="login-form">
            <h2>Fill out the form below to login</h2>
            <form onSubmit={handleFormSubmit}>
                <div className="form form-user">
                    <input type="text" name="Username" placeholder="Username " required=""/>
                    <div className="icon-w3">
                        <i className="fa fa-user" aria-hidden="true"></i>
                    </div>
                </div>
                <div className="form form-pass">
                    <input type="password" name="Password" placeholder="Password" required=""/>
                    <div className="icon-w3">
                        <i className="fa fa-unlock-alt" aria-hidden="true"></i>
                    </div>
                </div>
                <label className="anim">
                    <input type="checkbox" className="checkbox"/>
                    <span>Remember Me</span>
                    <a href="#">Forgot Password</a>
                </label>
                <button type="submit" value="Login" className="btn-login">Login</button>
            </form>


        </div>
    );

}

export default Login;