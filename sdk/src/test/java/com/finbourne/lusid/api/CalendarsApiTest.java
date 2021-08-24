/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](https://www.lusid.com/api/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages and frameworks:  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python) * [Angular](https://github.com/finbourne/lusid-sdk-angular)  The LUSID platform is made up of a number of sub-applications. You can find the API / swagger documentation by following the links in the table below.   | Application | Description | API / Swagger Documentation | | ----- | ----- | ---- | | LUSID | Open, API-first, developer-friendly investment data platform. | [Swagger](https://www.lusid.com/api/swagger/index.html) | | Web app | User-facing front end for LUSID. | [Swagger](https://www.lusid.com/app/swagger/index.html) | | Scheduler | Automated job scheduler. | [Swagger](https://www.lusid.com/scheduler2/swagger/index.html) | | Insights |Monitoring and troubleshooting service. | [Swagger](https://www.lusid.com/insights/swagger/index.html) | | Identity | Identity management for LUSID (in conjuction with Access) | [Swagger](https://www.lusid.com/identity/swagger/index.html) | | Access | Access control for LUSID (in conjunction with Identity) | [Swagger](https://www.lusid.com/access/swagger/index.html) | | Drive | Secure file repository and manager for collaboration. | [Swagger](https://www.lusid.com/drive/swagger/index.html) | | Luminesce | Data virtualisation service (query data from multiple providers, including LUSID) | [Swagger](https://www.lusid.com/honeycomb/swagger/index.html) | | Notification | Notification service. | [Swagger](https://www.lusid.com/notifications/swagger/index.html) | | Configuration | File store for secrets and other sensitive information. | [Swagger](https://www.lusid.com/configuration/swagger/index.html) | 
 *
 * The version of the OpenAPI document: 0.11.3425
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.lusid.api;

import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.model.AddBusinessDaysToDateRequest;
import com.finbourne.lusid.model.AddBusinessDaysToDateResponse;
import com.finbourne.lusid.model.Calendar;
import com.finbourne.lusid.model.CalendarDate;
import com.finbourne.lusid.model.CreateCalendarRequest;
import com.finbourne.lusid.model.CreateDateRequest;
import com.finbourne.lusid.model.IsBusinessDayResponse;
import com.finbourne.lusid.model.LusidProblemDetails;
import com.finbourne.lusid.model.LusidValidationProblemDetails;
import java.time.OffsetDateTime;
import com.finbourne.lusid.model.PagedResourceListOfCalendar;
import com.finbourne.lusid.model.ResourceListOfCalendarDate;
import com.finbourne.lusid.model.UpdateCalendarRequest;
import com.finbourne.lusid.model.ValuationSchedule;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CalendarsApi
 */
@Ignore
public class CalendarsApiTest {

    private final CalendarsApi api = new CalendarsApi();

    
    /**
     * [EXPERIMENTAL] Adds the requested number of Business Days to the provided date.
     *
     * A Business day is defined as a point in time that:      * Does not represent a day in the calendar&#39;s weekend      * Does not represent a day in the calendar&#39;s list of holidays (e.g. Christmas Day in the UK)                 All dates specified must be UTC and the upper bound of a calendar is not inclusive                 e.g. From: 2020-12-24-00-00-00:       Adding 3 business days returns 2020-12-30, assuming Saturday and Sunday are weekends, and the 25th and 28th are holidays.       Adding -2 business days returns 2020-12-22 under the same assumptions.                If the provided number of days to add is zero, returns a failure.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addBusinessDaysToDateTest() throws ApiException {
        String scope = null;
        AddBusinessDaysToDateRequest addBusinessDaysToDateRequest = null;
        AddBusinessDaysToDateResponse response = api.addBusinessDaysToDate(scope, addBusinessDaysToDateRequest);

        // TODO: test validations
    }
    
    /**
     * [BETA] Add a date to a calendar
     *
     * Add an event to the calendar. These Events can be a maximum of 24 hours and must be specified in UTC.  A local date will be calculated by the system and applied to the calendar before processing.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addDateToCalendarTest() throws ApiException {
        String scope = null;
        String code = null;
        CreateDateRequest createDateRequest = null;
        CalendarDate response = api.addDateToCalendar(scope, code, createDateRequest);

        // TODO: test validations
    }
    
    /**
     * [BETA] Create a calendar in its generic form
     *
     * Create a calendar in a generic form which can be used to store date events.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCalendarTest() throws ApiException {
        CreateCalendarRequest createCalendarRequest = null;
        Calendar response = api.createCalendar(createCalendarRequest);

        // TODO: test validations
    }
    
    /**
     * [BETA] Delete a calendar
     *
     * Delete a calendar and all of its respective dates
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCalendarTest() throws ApiException {
        String scope = null;
        String code = null;
        Calendar response = api.deleteCalendar(scope, code);

        // TODO: test validations
    }
    
    /**
     * [BETA] Remove a date from a calendar
     *
     * Remove a date from a calendar.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDateFromCalendarTest() throws ApiException {
        String scope = null;
        String code = null;
        String dateId = null;
        CalendarDate response = api.deleteDateFromCalendar(scope, code, dateId);

        // TODO: test validations
    }
    
    /**
     * [EXPERIMENTAL] Generate an ordered schedule of dates.
     *
     * Returns an ordered array of dates. The dates will only fall on business  days as defined by the scope and calendar codes in the valuation schedule.                Valuations are made at a frequency defined by the valuation schedule&#39;s tenor, e.g. every day (\&quot;1D\&quot;),  every other week (\&quot;2W\&quot;) etc. These dates will be adjusted onto business days as defined by the schedule&#39;s  rollConvention.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generateScheduleTest() throws ApiException {
        String scope = null;
        ValuationSchedule valuationSchedule = null;
        OffsetDateTime asAt = null;
        List<OffsetDateTime> response = api.generateSchedule(scope, valuationSchedule, asAt);

        // TODO: test validations
    }
    
    /**
     * [BETA] Get a calendar in its generic form
     *
     * Retrieve a generic calendar by a specific ID at a point in AsAt time
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCalendarTest() throws ApiException {
        String scope = null;
        String code = null;
        OffsetDateTime asAt = null;
        Calendar response = api.getCalendar(scope, code, asAt);

        // TODO: test validations
    }
    
    /**
     * [BETA] Get dates for a specific calendar
     *
     * Get dates from a specific calendar within a specific window of effective time, at a point in AsAt time.  Providing an id filter can further refine the results.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDatesTest() throws ApiException {
        String scope = null;
        String code = null;
        String fromEffectiveAt = null;
        String toEffectiveAt = null;
        OffsetDateTime asAt = null;
        List<String> idFilter = null;
        ResourceListOfCalendarDate response = api.getDates(scope, code, fromEffectiveAt, toEffectiveAt, asAt, idFilter);

        // TODO: test validations
    }
    
    /**
     * [BETA] Check whether a DateTime is a \&quot;Business DateTime\&quot;
     *
     * A Business DateTime is defined as a point in time that:      * Does not represent a day that overlaps with the calendars WeekendMask      * If the calendar is a \&quot;Holiday Calendar\&quot; Does not overlap with any dates in the calendar      * If the calendar is a \&quot;TradingHours Calendar\&quot; Does overlap with a date in the calendar                All dates specified must be UTC and the upper bound of a calendar is not inclusive   e.g. From: 2020-12-25-00-00-00        To: 2020-12-26-00-00-00  IsBusinessDay(2020-12-26-00-00-00) &#x3D;&#x3D; false
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void isBusinessDateTimeTest() throws ApiException {
        OffsetDateTime dateTime = null;
        String scope = null;
        String code = null;
        OffsetDateTime asAt = null;
        IsBusinessDayResponse response = api.isBusinessDateTime(dateTime, scope, code, asAt);

        // TODO: test validations
    }
    
    /**
     * [BETA] List Calenders
     *
     * List calendars at a point in AsAt time.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCalendarsTest() throws ApiException {
        OffsetDateTime asAt = null;
        String page = null;
        Integer limit = null;
        String filter = null;
        PagedResourceListOfCalendar response = api.listCalendars(asAt, page, limit, filter);

        // TODO: test validations
    }
    
    /**
     * [BETA] List all calenders in a specified scope
     *
     * List calendars at a point in AsAt time.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCalendarsInScopeTest() throws ApiException {
        String scope = null;
        OffsetDateTime asAt = null;
        String page = null;
        Integer start = null;
        Integer limit = null;
        String filter = null;
        PagedResourceListOfCalendar response = api.listCalendarsInScope(scope, asAt, page, start, limit, filter);

        // TODO: test validations
    }
    
    /**
     * [BETA] Update a calendar
     *
     * Update the calendars WeekendMask, SourceProvider or Properties
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCalendarTest() throws ApiException {
        String scope = null;
        String code = null;
        UpdateCalendarRequest updateCalendarRequest = null;
        Calendar response = api.updateCalendar(scope, code, updateCalendarRequest);

        // TODO: test validations
    }
    
}
