import './footer.scss';

import * as React from 'react';

import { Col, Row } from 'reactstrap';

const Footer = props => (
  <div className="footer page-content">
    <Row>
      <Col md="12">
        <p>Your footer</p>
      </Col>
    </Row>
  </div>
);

export default Footer;
