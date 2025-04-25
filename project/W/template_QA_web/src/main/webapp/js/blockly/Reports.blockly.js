window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Reports = window.blockly.js.blockly.Reports || {};

/**
 * @function openDashboard
 *
 *
 *
 *
 * @author Leandro Leonardo Assarice
 * @since 25/04/2025, 12:40:36
 *
 */
window.blockly.js.blockly.Reports.openDashboardArgs = [];
window.blockly.js.blockly.Reports.openDashboard = async function() {

  //
  this.cronapi.util.openDashboard('dashboards/pet.dashboard', []);
}

/**
 * @function openReport
 *
 *
 *
 *
 * @author Leandro Leonardo Assarice
 * @since 25/04/2025, 12:40:36
 *
 */
window.blockly.js.blockly.Reports.openReportArgs = [];
window.blockly.js.blockly.Reports.openReport = async function() {

  //
  this.cronapi.util.openReport('reports/pet.report', []);
}
