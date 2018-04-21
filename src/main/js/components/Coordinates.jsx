import React, { Component } from 'react';

class Coordinates extends Component {

    constructor(props) {
        super(props);
        this.state = {
            xAxis : 0,
            yAxis : 0
        };
        //this.saveData(this.state.incTax);
    }

    componentDidMount() {

    }

    updateX(val) {
        const value = this.state.xAxis + val;
        this.setState({xAxis: value})
    }

    updateY(val) {
        const value = this.state.yAxis + val;
        this.setState({yAxis: value})
    }

    saveData() {
        fetch('http://localhost:8080/api/coordinates',
            {   headers: {
                'Content-Type': 'application/json',
            },
                method: 'POST',
                body: JSON.stringify(this.state)
            }).catch( err => console.error(err));
    }

    render() {

        return(
            <div>bazatest</div>
        );
    }
}
export default Coordinates;