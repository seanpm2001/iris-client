/* tslint:disable */
/* eslint-disable */
/**
 * IRIS-Gateway API
 * ### Encryption of the data to be transmitted (contact data) In order to be not limited in the amount of data, a hybrid encryption with symmetric encryption of the data and asymmetric encryption of the symmetric key is used for the encryption of the contact data.    1. The apps and applications get the public key of the health department as a 4096-bit RSA key from the IRIS+ server. This key is base64-encoded similar to the Private Enhanced Mail (PEM) format but without key markers (-----BEGIN PUBLIC KEY----- / -----END PUBLIC KEY-----).   2. The app generates a 256-bit AES key.   3. The data is encrypted with this key (algorithm: AES/CBC/PKCS5Padding and 16 byte IV)   4. IV bytes are prepended to the cipher text. Those merged bytes represent the encrypted content.   5. The AES key must be encrypted with the public RSA key of the health department. (algorithm: RSA with Optimal Asymmetric Encryption Padding (OAEP) \"RSA/ECB/OAEPWITHSHA-256ANDMGF1PADDING\")   6. The encrypted AES key and the encrypted content must be transmitted base64 encoded.    #### Schematic sequence    ```   pubKeyEncryption = publicKeyFromBase64(givenPublicKey);   contentKey = generateAESKey();   iv = generateRandomBytes(16);    encrypted = contentKey.encrypt(content, \"AES/CBC/PKCS5Padding\", iv);   keyEncrypted = pubKeyEncryption.encrypt(contentKey, \"RSA/NONE/OAEPWithSHA3-256AndMGF1Padding\");    submissionDto.encryptedData = base64Encode(concat(iv,encrypted));   submissionDto.secret = base64Encode(keyEncrypted);   ``` 
 *
 * The version of the OpenAPI document: 0.2.0
 * Contact: jens.kutzsche@gebea.de
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import { Configuration } from "./configuration";
// Some imports not used depending on template conditions
// @ts-ignore
import globalAxios, { AxiosPromise, AxiosInstance } from 'axios';

export const BASE_PATH = "https://virtserver.swaggerhub.com/jekutzsche/iris_public/0.2.0".replace(/\/+$/, "");

/**
 *
 * @export
 */
export const COLLECTION_FORMATS = {
    csv: ",",
    ssv: " ",
    tsv: "\t",
    pipes: "|",
};

/**
 *
 * @export
 * @interface RequestArgs
 */
export interface RequestArgs {
    url: string;
    options: any;
}

/**
 *
 * @export
 * @class BaseAPI
 */
export class BaseAPI {
    protected configuration: Configuration | undefined;

    constructor(configuration?: Configuration, protected basePath: string = BASE_PATH, protected axios: AxiosInstance = globalAxios) {
        if (configuration) {
            this.configuration = configuration;
            this.basePath = configuration.basePath || this.basePath;
        }
    }
};

/**
 *
 * @export
 * @class RequiredError
 * @extends {Error}
 */
export class RequiredError extends Error {
    name: "RequiredError" = "RequiredError";
    constructor(public field: string, msg?: string) {
        super(msg);
    }
}
