import axios from "axios";
async function login(username, password) {
    var data = {
        username: username,
        password: password
    };
    var config = {
        "Content-Type": "application/json"
    };
    return await axios
        .post("http://localhost:8080/api/login", data, config)
        .then(res => {
            return res;
        })
        .catch(err => {
            return err.response;
        });
}
export { login};