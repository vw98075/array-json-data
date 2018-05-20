import * as React from 'react';
import { connect } from 'react-redux';
import { Link } from 'react-router-dom';
import { Button, Row, Col } from 'reactstrap';
// tslint:disable-next-line:no-unused-variable
import { ICrudGetAction } from 'react-jhipster';
import FontAwesomeIcon from '@fortawesome/react-fontawesome';

import { getEntity } from './product.reducer';
import { IProduct } from 'app/shared/model/product.model';
// tslint:disable-next-line:no-unused-variable
import { APP_DATE_FORMAT, APP_LOCAL_DATE_FORMAT } from 'app/config/constants';

export interface IProductDetailProps {
  getEntity: ICrudGetAction<IProduct>;
  product: IProduct;
  match: any;
}

export class ProductDetail extends React.Component<IProductDetailProps> {
  componentDidMount() {
    this.props.getEntity(this.props.match.params.id);
  }

  render() {
    const { product } = this.props;
    return (
      <Row>
        <Col md="8">
          <h2>
            Product [<b>{product.id}</b>]
          </h2>
          <Row size="md">
            <dl className="jh-entity-details">
              <dt>
                <span id="brand">Brand</span>
              </dt>
              <dd>{product.brand}</dd>
              <dt>
                <span id="name">Name</span>
              </dt>
              <dd>{product.name}</dd>
              <dt>
                <span id="keywords">Keywords</span>
              </dt>
              <dd>{product.keywords}</dd>
              <dt>
                <span id="specs">Specs</span>
              </dt>
              <dd>{product.specs}</dd>
              <dt>
                <span id="season">Season</span>
              </dt>
              <dd>{product.season}</dd>
            </dl>
          </Row>
          <Button tag={Link} to="/entity/product" replace color="info">
            <FontAwesomeIcon icon="arrow-left" /> <span className="d-none d-md-inline">Back</span>
          </Button>
          <Button tag={Link} to={`/entity/product/${product.id}/edit`} replace color="primary">
            <FontAwesomeIcon icon="pencil-alt" /> <span className="d-none d-md-inline">Edit</span>
          </Button>
        </Col>
      </Row>
    );
  }
}

const mapStateToProps = ({ product }) => ({
  product: product.entity
});

const mapDispatchToProps = { getEntity };

export default connect(mapStateToProps, mapDispatchToProps)(ProductDetail);
