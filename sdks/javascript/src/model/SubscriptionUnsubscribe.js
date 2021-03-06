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





/**
* The SubscriptionUnsubscribe model module.
* @module model/SubscriptionUnsubscribe
* @version 0.1.0
*/
export default class SubscriptionUnsubscribe {
    /**
    * Constructs a new <code>SubscriptionUnsubscribe</code>.
    * @alias module:model/SubscriptionUnsubscribe
    * @class
    */

    constructor() {
        

        
        

        

        
    }

    /**
    * Constructs a <code>SubscriptionUnsubscribe</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/SubscriptionUnsubscribe} obj Optional instance to populate.
    * @return {module:model/SubscriptionUnsubscribe} The populated <code>SubscriptionUnsubscribe</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SubscriptionUnsubscribe();

            
            
            

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('created_at')) {
                obj['created_at'] = ApiClient.convertToType(data['created_at'], 'Date');
            }
        }
        return obj;
    }

    /**
    * Unsubscription identifier
    * @member {String} id
    */
    id = undefined;
    /**
    * Date the Unsubscription was created.
    * @member {Date} created_at
    */
    created_at = undefined;








}


