window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Report = window.blockly.js.blockly.Report || {};

/**
 * @function openReport
 *
 *
 *
 *
 * @author Leandro Leonardo Assarice
 * @since 24/04/2025, 09:54:32
 *
 */
window.blockly.js.blockly.Report.openReportArgs = [];
window.blockly.js.blockly.Report.openReport = async function() {

  //
  this.cronapi.util.openReport('reports/template_report.report', []);
}

/**
 * @function openDashboard
 *
 *
 *
 *
 * @author Leandro Leonardo Assarice
 * @since 24/04/2025, 09:54:32
 *
 */
window.blockly.js.blockly.Report.openDashboardArgs = [];
window.blockly.js.blockly.Report.openDashboard = async function() {

  //
  this.cronapi.util.openDashboard('dashboards/template_dashboard.dashboard', []);
}
