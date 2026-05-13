# Changelog

## 0.2.0 (2026-05-13)

Full Changelog: [v0.1.0...v0.2.0](https://github.com/jd-st/jd-project-kotlin/compare/v0.1.0...v0.2.0)

### Features

* **api:** api update ([5e8ad48](https://github.com/jd-st/jd-project-kotlin/commit/5e8ad48a613d038589c65157c6bc1833198a17bf))
* **client:** add connection pooling option ([0a3b71e](https://github.com/jd-st/jd-project-kotlin/commit/0a3b71e2bfbd709918a436677a9214641c170a3b))
* **client:** add more convenience service method overloads ([35945aa](https://github.com/jd-st/jd-project-kotlin/commit/35945aa98c9190862c1257d8377dba65f2ec54ab))
* **client:** send `X-Stainless-Kotlin-Version` header ([b9b5f42](https://github.com/jd-st/jd-project-kotlin/commit/b9b5f42ba325afaf7b9b5161e6e32fbd2de62a52))


### Bug Fixes

* **client:** allow updating header/query affecting fields in `toBuilder()` ([1094a0a](https://github.com/jd-st/jd-project-kotlin/commit/1094a0a4740076dbcec7cac993b6a06309eb3e85))
* **client:** incorrect `Retry-After` parsing ([7b9d228](https://github.com/jd-st/jd-project-kotlin/commit/7b9d228a470bb95f0f9ae31ca44daf8382f21478))
* **client:** preserve time zone in lenient date-time parsing ([c854122](https://github.com/jd-st/jd-project-kotlin/commit/c854122900253a4a1c16341fd58af67075ccc33b))
* **tests:** add missing query/header params ([bdee09c](https://github.com/jd-st/jd-project-kotlin/commit/bdee09c8e4d0315174d656c22dced5432061d2e3))


### Chores

* drop apache dependency ([ca917ca](https://github.com/jd-st/jd-project-kotlin/commit/ca917ca7c34a6f245fceff21f3276f47f667d967))
* **internal:** allow passing args to `./scripts/test` ([44f9de7](https://github.com/jd-st/jd-project-kotlin/commit/44f9de7ab5a22c7ffeac32f506b0672f3b932950))
* **internal:** bump ktfmt ([ca3c12f](https://github.com/jd-st/jd-project-kotlin/commit/ca3c12f580db18580fbb56881f7d8c955bdfab3a))
* **internal:** bump palantir-java-format ([d88b23b](https://github.com/jd-st/jd-project-kotlin/commit/d88b23bad8041df68e596a0e1ecfcf7aba98aaeb))
* **internal:** codegen related update ([4e83db0](https://github.com/jd-st/jd-project-kotlin/commit/4e83db0a21e950442b7fbb67250b7ce08b12204f))
* **internal:** codegen related update ([9964e9e](https://github.com/jd-st/jd-project-kotlin/commit/9964e9ec3eedf4508d5918129c8bd0f877f5f28a))
* **internal:** codegen related update ([61586d7](https://github.com/jd-st/jd-project-kotlin/commit/61586d784053e8788e9a088947f5ce3a38979dc8))
* **internal:** codegen related update ([a1bac2f](https://github.com/jd-st/jd-project-kotlin/commit/a1bac2f309365c43d1079cb608b7c3ac7e756468))
* **internal:** codegen related update ([22c937c](https://github.com/jd-st/jd-project-kotlin/commit/22c937cb795ee56583b93b02d18d4d83f290e0e1))
* **internal:** codegen related update ([1ecda4d](https://github.com/jd-st/jd-project-kotlin/commit/1ecda4d84cbc0c0855f869047af3d5fc8bdf53b7))
* **internal:** codegen related update ([a63e901](https://github.com/jd-st/jd-project-kotlin/commit/a63e901880210e9e707b7ec51d26ca3780134d1a))
* **internal:** codegen related update ([4a435d3](https://github.com/jd-st/jd-project-kotlin/commit/4a435d36c3c07b033b0295e739f892fa410f7dd0))
* **internal:** codegen related update ([c766792](https://github.com/jd-st/jd-project-kotlin/commit/c766792572dff50a58d95f4d3521c57ed70a4ab3))
* **internal:** codegen related update ([e580c87](https://github.com/jd-st/jd-project-kotlin/commit/e580c8775cba07f6f1c9de07c2f635cd18542d50))
* **internal:** codegen related update ([0fdb6a7](https://github.com/jd-st/jd-project-kotlin/commit/0fdb6a79c41e98343a922a507f7d2f4c26cdde12))
* **internal:** correct cache invalidation for `SKIP_MOCK_TESTS` ([fb25083](https://github.com/jd-st/jd-project-kotlin/commit/fb250837dc12745fe6f9efbf6a63df460a918ad9))
* **internal:** expand imports ([2fecf69](https://github.com/jd-st/jd-project-kotlin/commit/2fecf697599d0363170c792e120fa6f81594334d))
* **internal:** make `OkHttp` constructor internal ([02b8d85](https://github.com/jd-st/jd-project-kotlin/commit/02b8d851dc3f3145df7e641f7f785961c86004c8))
* **internal:** remove mock server code ([9c73be7](https://github.com/jd-st/jd-project-kotlin/commit/9c73be7700b0ad30a38189910992988bad188340))
* **internal:** tweak CI branches ([3fae2a5](https://github.com/jd-st/jd-project-kotlin/commit/3fae2a54f8484201779a3ca368382173384e3c27))
* **internal:** update `TestServerExtension` comment ([0e49d58](https://github.com/jd-st/jd-project-kotlin/commit/0e49d5858c9c186966bd352f9d32570b5a28b75f))
* **internal:** update retry delay tests ([b17cb73](https://github.com/jd-st/jd-project-kotlin/commit/b17cb73efbd6c8717df700eddfc386e4afad3049))
* **internal:** upgrade AssertJ ([eec6d0b](https://github.com/jd-st/jd-project-kotlin/commit/eec6d0b05ef905d410a6e4673fb3c829bdf27b5e))
* make `Properties` more resilient to `null` ([36a09d1](https://github.com/jd-st/jd-project-kotlin/commit/36a09d17fa064e0949829605939c36a2eb677d64))
* update mock server docs ([f078b9a](https://github.com/jd-st/jd-project-kotlin/commit/f078b9af0a95115412eec56a9dd341833feb2aae))
* update placeholder string ([61f06ac](https://github.com/jd-st/jd-project-kotlin/commit/61f06ace2265d2e4b48b6ded40b076cf003e7401))

## 0.1.0 (2026-01-17)

Full Changelog: [v0.0.1...v0.1.0](https://github.com/jd-st/jd-project-kotlin/compare/v0.0.1...v0.1.0)

### Features

* **api:** manual updates ([5ea1048](https://github.com/jd-st/jd-project-kotlin/commit/5ea1048f903235d8d4232f6581fae29f0ca1267e))
* **client:** allow configuring dispatcher executor service ([fe20344](https://github.com/jd-st/jd-project-kotlin/commit/fe2034468ee452619f61a691544c916362f49e8d))


### Bug Fixes

* **client:** disallow coercion from float to int ([74808cb](https://github.com/jd-st/jd-project-kotlin/commit/74808cb9f4f4c74364dffcb24fa162410718b4d4))
* **client:** fully respect max retries ([b39da00](https://github.com/jd-st/jd-project-kotlin/commit/b39da00fb911f93969c055deae14b4c30361ef20))
* **client:** send retry count header for max retries 0 ([b39da00](https://github.com/jd-st/jd-project-kotlin/commit/b39da00fb911f93969c055deae14b4c30361ef20))
* date time deserialization leniency ([1fc6616](https://github.com/jd-st/jd-project-kotlin/commit/1fc66160b1791d11e5bab4ec9265e885840ccd1b))


### Chores

* **ci:** upgrade `actions/setup-java` ([ca0abe3](https://github.com/jd-st/jd-project-kotlin/commit/ca0abe31d25db0353e41ebbe8b8dbc3c6f3e875f))
* configure new SDK language ([5e22eb7](https://github.com/jd-st/jd-project-kotlin/commit/5e22eb794b37d1f258b9fa02cdb2fa8a1e32ee2a))
* **internal:** codegen related update ([53417c6](https://github.com/jd-st/jd-project-kotlin/commit/53417c6e181d673714021a3b04533e1f691ee27c))
* **internal:** codegen related update ([9223d8c](https://github.com/jd-st/jd-project-kotlin/commit/9223d8c7a4211e9d9d9327c0d0fd22d7024a72fe))
* **internal:** depend on packages directly in example ([b39da00](https://github.com/jd-st/jd-project-kotlin/commit/b39da00fb911f93969c055deae14b4c30361ef20))
* **internal:** refactor build files to support future stainless package uploads ([3112ecb](https://github.com/jd-st/jd-project-kotlin/commit/3112ecbaaf97b2aca4171c3719fe5a05fd96661d))
* **internal:** update `actions/checkout` version ([b402488](https://github.com/jd-st/jd-project-kotlin/commit/b4024886a82afa476489293bedbdb08aa965f43b))
* test on Jackson 2.14.0 to avoid encountering FasterXML/jackson-databind[#3240](https://github.com/jd-st/jd-project-kotlin/issues/3240) in tests ([1fc6616](https://github.com/jd-st/jd-project-kotlin/commit/1fc66160b1791d11e5bab4ec9265e885840ccd1b))
* update SDK settings ([da59730](https://github.com/jd-st/jd-project-kotlin/commit/da59730aaba1fdc10567ff1b536fedcabc901e5c))
