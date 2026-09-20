-- ============================================
-- DENTAL IMPLANT DATABASE - SAMPLE DATA
-- ============================================

-- ============================================
-- 1. BRANDS
-- ============================================

INSERT INTO brand
    (brand_id, brand_name, company_name, country, website, description, logo_url)
VALUES
    (1, 'Straumann', 'Institut Straumann AG', 'Switzerland',
     'https://www.straumann.com',
     'Swiss dental implant manufacturer providing implant and restorative solutions.',
     null);

INSERT INTO brand
    (brand_id, brand_name, company_name, country, website, description, logo_url)
VALUES
    (2, 'Nobel Biocare', 'Nobel Biocare Services AG', 'Switzerland',
     'https://www.nobelbiocare.com',
     'Dental implant company providing implant systems and restorative solutions.',
     null);

INSERT INTO brand
    (brand_id, brand_name, company_name, country, website, description, logo_url)
VALUES
    (3, 'Osstem', 'Osstem Implant Co., Ltd.', 'South Korea',
     'https://www.osstem.com',
     'Dental implant manufacturer offering implant systems and related products.',
     null);


-- ============================================
-- 2. IMPLANT TYPES
-- ============================================

INSERT INTO implant_type
    (type_id, type_name, description)
VALUES
    (1, 'Bone-Level Implant',
     'Implant designed to be positioned at the level of the crestal bone.');

INSERT INTO implant_type
    (type_id, type_name, description)
VALUES
    (2, 'Tissue-Level Implant',
     'Implant designed with a transmucosal component positioned above the bone level.');

INSERT INTO implant_type
    (type_id, type_name, description)
VALUES
    (3, 'Tapered Implant',
     'Implant body designed with a tapered geometry to support insertion and primary stability.');


-- ============================================
-- 3. MATERIALS
-- ============================================

INSERT INTO material
    (material_id, material_name, description)
VALUES
    (1, 'Titanium',
     'Titanium material commonly used for dental implants because of its strength and biocompatibility.');

INSERT INTO material
    (material_id, material_name, description)
VALUES
    (2, 'Titanium Alloy',
     'Titanium-based alloy used for dental implant applications.');

INSERT INTO material
    (material_id, material_name, description)
VALUES
    (3, 'Zirconia',
     'Ceramic material used in selected dental implant applications.');


-- ============================================
-- 4. SIZES
-- ============================================

INSERT INTO size
    (size_id, diameter_mm, length_mm)
VALUES
    (1, 3.3, 8.0);

INSERT INTO size
    (size_id, diameter_mm, length_mm)
VALUES
    (2, 3.3, 10.0);

INSERT INTO size
    (size_id, diameter_mm, length_mm)
VALUES
    (3, 3.8, 10.0);

INSERT INTO size
    (size_id, diameter_mm, length_mm)
VALUES
    (4, 4.1, 12.0);

INSERT INTO size
    (size_id, diameter_mm, length_mm)
VALUES
    (5, 4.8, 12.0);


-- ============================================
-- 5. IMPLANT MODELS
-- ============================================

INSERT INTO implant_model
    (model_id, model_name, description, status, brand_id, type_id, material_id)
VALUES
    (1,
     'BLT Implant',
     'Bone-level tapered implant designed for a range of clinical applications.',
     'Active',
     1, 1, 1);

INSERT INTO implant_model
    (model_id, model_name, description, status, brand_id, type_id, material_id)
VALUES
    (2,
     'Tissue Level Implant',
     'Tissue-level implant designed with a transmucosal component.',
     'Active',
     1, 2, 1);

INSERT INTO implant_model
    (model_id, model_name, description, status, brand_id, type_id, material_id)
VALUES
    (3,
     'NobelActive',
     'Implant model designed for applications requiring primary stability.',
     'Active',
     2, 3, 1);

INSERT INTO implant_model
    (model_id, model_name, description, status, brand_id, type_id, material_id)
VALUES
    (4,
     'NobelParallel',
     'Parallel-walled implant system designed for general implant applications.',
     'Active',
     2, 1, 1);

INSERT INTO implant_model
    (model_id, model_name, description, status, brand_id, type_id, material_id)
VALUES
    (5,
     'TS Implant',
     'Tapered implant system designed to support primary stability.',
     'Active',
     3, 3, 1);


-- ============================================
-- 6. IMPLANT SPECIFICATIONS
-- ============================================

INSERT INTO implant_specification
    (specification_id, platform, connection_type, surface_treatment, description, model_id)
VALUES
    (1,
     'Regular',
     'Internal',
     'SLActive',
     'Standard specification for the implant model.',
     1);

INSERT INTO implant_specification
    (specification_id, platform, connection_type, surface_treatment, description, model_id)
VALUES
    (2,
     'Regular',
     'Internal',
     'SLA',
     'Tissue-level implant specification.',
     2);

INSERT INTO implant_specification
    (specification_id, platform, connection_type, surface_treatment, description, model_id)
VALUES
    (3,
     'Narrow',
     'Internal',
     'TiUnite',
     'Narrow platform specification for selected clinical applications.',
     3);

INSERT INTO implant_specification
    (specification_id, platform, connection_type, surface_treatment, description, model_id)
VALUES
    (4,
     'Regular',
     'Internal',
     'TiUnite',
     'Regular platform specification.',
     4);

INSERT INTO implant_specification
    (specification_id, platform, connection_type, surface_treatment, description, model_id)
VALUES
    (5,
     'Regular',
     'Internal',
     'SA',
     'Standard specification for the tapered implant model.',
     5);


-- ============================================
-- 7. SPECIFICATION ↔ SIZE
-- ============================================

INSERT INTO implant_specification_size
    (id, specification_id, size_id)
VALUES
    (1, 1, 1);

INSERT INTO implant_specification_size
    (id, specification_id, size_id)
VALUES
    (2, 1, 2);

INSERT INTO implant_specification_size
    (id, specification_id, size_id)
VALUES
    (3, 1, 3);

INSERT INTO implant_specification_size
    (id, specification_id, size_id)
VALUES
    (4, 2, 3);

INSERT INTO implant_specification_size
    (id, specification_id, size_id)
VALUES
    (5, 2, 4);

INSERT INTO implant_specification_size
    (id, specification_id, size_id)
VALUES
    (6, 3, 1);

INSERT INTO implant_specification_size
    (id, specification_id, size_id)
VALUES
    (7, 3, 2);

INSERT INTO implant_specification_size
    (id, specification_id, size_id)
VALUES
    (8, 4, 4);

INSERT INTO implant_specification_size
    (id, specification_id, size_id)
VALUES
    (9, 4, 5);

INSERT INTO implant_specification_size
    (id, specification_id, size_id)
VALUES
    (10, 5, 2);

INSERT INTO implant_specification_size
    (id, specification_id, size_id)
VALUES
    (11, 5, 4);


-- ============================================
-- 8. USERS
-- ============================================

INSERT INTO app_user
    (user_id, full_name, email, phone, role, status)
VALUES
    (1, 'Dr. Anan Chaiyaporn',
     'anan@example.com',
     '0812345678',
     'DENTIST',
     'ACTIVE');

INSERT INTO app_user
    (user_id, full_name, email, phone, role, status)
VALUES
    (2, 'Nicha Wongchai',
     'nicha@example.com',
     '0823456789',
     'DENTIST',
     'ACTIVE');

INSERT INTO app_user
    (user_id, full_name, email, phone, role, status)
VALUES
    (3, 'Somchai Klinchai',
     'somchai@example.com',
     '0834567890',
     'NURSE',
     'ACTIVE');

INSERT INTO app_user
    (user_id, full_name, email, phone, role, status)
VALUES
    (4, 'Pimchanok Srisuk',
     'pimchanok@example.com',
     '0845678901',
     'PATIENT',
     'ACTIVE');


-- ============================================
-- 9. ADMIN
-- ============================================

INSERT INTO admin
    (admin_id, full_name, email, username, password, status)
VALUES
    (1,
     'System Administrator',
     'admin@dentalimplant.com',
     'admin',
     'admin123',
     'ACTIVE');