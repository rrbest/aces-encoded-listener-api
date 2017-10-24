/**
 * Aces Encoded Listener API
 * API Specification for Encoded Listeners that read data on a blockchain and forward transaction events to registered subscribers. 
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 */


import ApiClient from '../ApiClient';
import SubscriptionEvent from './SubscriptionEvent';





/**
* The InlineResponse200 model module.
* @module model/InlineResponse200
* @version 0.1.0
*/
export default class InlineResponse200 {
    /**
    * Constructs a new <code>InlineResponse200</code>.
    * @alias module:model/InlineResponse200
    * @class
    */

    constructor() {
        

        
        

        

        
    }

    /**
    * Constructs a <code>InlineResponse200</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/InlineResponse200} obj Optional instance to populate.
    * @return {module:model/InlineResponse200} The populated <code>InlineResponse200</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse200();

            
            
            

            if (data.hasOwnProperty('page_size')) {
                obj['page_size'] = ApiClient.convertToType(data['page_size'], 'Number');
            }
            if (data.hasOwnProperty('page')) {
                obj['page'] = ApiClient.convertToType(data['page'], 'Number');
            }
            if (data.hasOwnProperty('continuation')) {
                obj['continuation'] = ApiClient.convertToType(data['continuation'], 'String');
            }
            if (data.hasOwnProperty('items')) {
                obj['items'] = ApiClient.convertToType(data['items'], [SubscriptionEvent]);
            }
        }
        return obj;
    }

    /**
    * @member {Number} page_size
    */
    page_size = undefined;
    /**
    * @member {Number} page
    */
    page = undefined;
    /**
    * @member {String} continuation
    */
    continuation = undefined;
    /**
    * @member {Array.<module:model/SubscriptionEvent>} items
    */
    items = undefined;








}

