import React from 'react';
import Typography from '@material-ui/core/Typography'
import Button from '@material-ui/core/Button';
import Routes from "../Routes";
import {Link, Redirect, BrowserRouter as Router} from "react-router-dom";
import 'typeface-roboto';

class Home extends React.Component {

    constructor() {
        super();
    }

    render() {

        const style = {
            width: '100%'
        };

        return (
            <div style={style}>
                <Typography variant="h3" align="center" gutterBottom>
                    Zanalizuj swoje poglądy już teraz!<br/>
                    <Link to="/Test">
                        <Button variant="contained" color="primary" className="button">
                            Rozpocznij test
                        </Button>
                    </Link>
                </Typography>
            </div>
        );
    }
}

export default Home;