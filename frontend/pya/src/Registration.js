import React, {Component} from 'react';
import Form from 'react-bootstrap/Form';
import Button from 'react-bootstrap/Button';

import './Registration.css';


class Registration extends Component {

    handleSubmit = event => {
        event.preventDefault();
        console.log(event.target.username.value);
        console.log(event.target.password.value);
    }

    render() {
        return <div className="Register">

            <Form onSubmit={this.handleSubmit}>
                <Form.Group controlId="username" size="lg">
                    <Form.Label>
                        Username
                    </Form.Label>
                    <Form.Control autoFocus name="username"/>
                </Form.Group>
                <Form.Group controlId="password" size="lg">
                    <Form.Label>
                        Password
                    </Form.Label>
                    <Form.Control type="password" name="password"/>
                </Form.Group>
                <Button type="submit">Register</Button>
            </Form>
        </div>
    };
}

export default Registration;
