package Windows.ApplicationModel.Appointments

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.DateTime
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Rect
import Windows.Foundation.TimeSpan
import Windows.UI.Popups.Placement
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppointmentStore.ABI::class)
@Signature("{a461918c-7a47-4d96-96c9-15cd8a05a735}")
@Guid("a461918c7a474d9696c915cd8a05a735")
@WinRTInterface("a461918c7a474d9696c915cd8a05a735")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentStore.ByReference::class)
public interface IAppointmentStore : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ChangeTracker(): AppointmentStoreChangeTracker?

  @InterfaceMethod(1)
  public fun CreateAppointmentCalendarAsync(name: String?): IAsyncOperation<AppointmentCalendar?>?

  @InterfaceMethod(2)
  public fun GetAppointmentCalendarAsync(calendarId: String?):
      IAsyncOperation<AppointmentCalendar?>?

  @InterfaceMethod(3)
  public fun GetAppointmentAsync(localId: String?): IAsyncOperation<Appointment?>?

  @InterfaceMethod(4)
  public fun GetAppointmentInstanceAsync(localId: String?, instanceStartTime: DateTime?):
      IAsyncOperation<Appointment?>?

  @InterfaceMethod(5)
  public fun FindAppointmentCalendarsAsync(): IAsyncOperation<IVectorView<AppointmentCalendar?>?>?

  @InterfaceMethod(6)
  public fun FindAppointmentCalendarsAsync(options: FindAppointmentCalendarsOptions?):
      IAsyncOperation<IVectorView<AppointmentCalendar?>?>?

  @InterfaceMethod(7)
  public fun FindAppointmentsAsync(rangeStart: DateTime?, rangeLength: TimeSpan?):
      IAsyncOperation<IVectorView<Appointment?>?>?

  @InterfaceMethod(8)
  public fun FindAppointmentsAsync(
    rangeStart: DateTime?,
    rangeLength: TimeSpan?,
    options: FindAppointmentsOptions?
  ): IAsyncOperation<IVectorView<Appointment?>?>?

  @InterfaceMethod(9)
  public fun FindConflictAsync(appointment: Appointment?):
      IAsyncOperation<AppointmentConflictResult?>?

  @InterfaceMethod(10)
  public fun FindConflictAsync(appointment: Appointment?, instanceStartTime: DateTime?):
      IAsyncOperation<AppointmentConflictResult?>?

  @InterfaceMethod(11)
  public fun MoveAppointmentAsync(appointment: Appointment?,
      destinationCalendar: AppointmentCalendar?): IAsyncAction?

  @InterfaceMethod(12)
  public fun ShowAddAppointmentAsync(appointment: Appointment?, selection: Rect?):
      IAsyncOperation<String?>?

  @InterfaceMethod(13)
  public fun ShowReplaceAppointmentAsync(
    localId: String?,
    appointment: Appointment?,
    selection: Rect?
  ): IAsyncOperation<String?>?

  @InterfaceMethod(14)
  public fun ShowReplaceAppointmentAsync(
    localId: String?,
    appointment: Appointment?,
    selection: Rect?,
    preferredPlacement: Placement?,
    instanceStartDate: DateTime?
  ): IAsyncOperation<String?>?

  @InterfaceMethod(15)
  public fun ShowRemoveAppointmentAsync(localId: String?, selection: Rect?):
      IAsyncOperation<Boolean>?

  @InterfaceMethod(16)
  public fun ShowRemoveAppointmentAsync(
    localId: String?,
    selection: Rect?,
    preferredPlacement: Placement?,
    instanceStartDate: DateTime?
  ): IAsyncOperation<Boolean>?

  @InterfaceMethod(17)
  public fun ShowAppointmentDetailsAsync(localId: String?): IAsyncAction?

  @InterfaceMethod(18)
  public fun ShowAppointmentDetailsAsync(localId: String?, instanceStartDate: DateTime?):
      IAsyncAction?

  @InterfaceMethod(19)
  public fun ShowEditNewAppointmentAsync(appointment: Appointment?): IAsyncOperation<String?>?

  @InterfaceMethod(20)
  public fun FindLocalIdsFromRoamingIdAsync(roamingId: String?):
      IAsyncOperation<IVectorView<String?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentStore> {
    public override fun getValue() = ABI.makeIAppointmentStore(pointer.getPointer(0))

    public fun setValue(value: IAppointmentStore_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentStore {
    public val __773230547_Ptr: Pointer?

    public val _773230547_VtblPtr: Pointer?
      get() = __773230547_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ChangeTracker(): AppointmentStoreChangeTracker? {
      val fnPtr = _773230547_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppointmentStoreChangeTracker>()
      val hr = fn.invokeHR(arrayOf(__773230547_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppointmentStoreChangeTracker>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateAppointmentCalendarAsync(name: String?):
        IAsyncOperation<AppointmentCalendar?>? {
      val fnPtr = _773230547_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AppointmentCalendar?>>()
      val hr = fn.invokeHR(arrayOf(__773230547_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<AppointmentCalendar?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetAppointmentCalendarAsync(calendarId: String?):
        IAsyncOperation<AppointmentCalendar?>? {
      val fnPtr = _773230547_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AppointmentCalendar?>>()
      val hr = fn.invokeHR(arrayOf(__773230547_Ptr, marshalToNative(calendarId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<AppointmentCalendar?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetAppointmentAsync(localId: String?): IAsyncOperation<Appointment?>? {
      val fnPtr = _773230547_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Appointment?>>()
      val hr = fn.invokeHR(arrayOf(__773230547_Ptr, marshalToNative(localId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Appointment?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetAppointmentInstanceAsync(localId: String?, instanceStartTime: DateTime?):
        IAsyncOperation<Appointment?>? {
      val fnPtr = _773230547_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Appointment?>>()
      val hr = fn.invokeHR(arrayOf(__773230547_Ptr, marshalToNative(localId),
          marshalToNative(instanceStartTime), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Appointment?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun FindAppointmentCalendarsAsync():
        IAsyncOperation<IVectorView<AppointmentCalendar?>?>? {
      val fnPtr = _773230547_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<AppointmentCalendar?>?>>()
      val hr = fn.invokeHR(arrayOf(__773230547_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<AppointmentCalendar?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun FindAppointmentCalendarsAsync(options: FindAppointmentCalendarsOptions?):
        IAsyncOperation<IVectorView<AppointmentCalendar?>?>? {
      val fnPtr = _773230547_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<AppointmentCalendar?>?>>()
      val hr = fn.invokeHR(arrayOf(__773230547_Ptr, marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<AppointmentCalendar?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun FindAppointmentsAsync(rangeStart: DateTime?, rangeLength: TimeSpan?):
        IAsyncOperation<IVectorView<Appointment?>?>? {
      val fnPtr = _773230547_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<Appointment?>?>>()
      val hr = fn.invokeHR(arrayOf(__773230547_Ptr, marshalToNative(rangeStart),
          marshalToNative(rangeLength), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<Appointment?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun FindAppointmentsAsync(
      rangeStart: DateTime?,
      rangeLength: TimeSpan?,
      options: FindAppointmentsOptions?
    ): IAsyncOperation<IVectorView<Appointment?>?>? {
      val fnPtr = _773230547_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<Appointment?>?>>()
      val hr = fn.invokeHR(arrayOf(__773230547_Ptr, marshalToNative(rangeStart),
          marshalToNative(rangeLength), marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<Appointment?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun FindConflictAsync(appointment: Appointment?):
        IAsyncOperation<AppointmentConflictResult?>? {
      val fnPtr = _773230547_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AppointmentConflictResult?>>()
      val hr = fn.invokeHR(arrayOf(__773230547_Ptr, marshalToNative(appointment), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<AppointmentConflictResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun FindConflictAsync(appointment: Appointment?, instanceStartTime: DateTime?):
        IAsyncOperation<AppointmentConflictResult?>? {
      val fnPtr = _773230547_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AppointmentConflictResult?>>()
      val hr = fn.invokeHR(arrayOf(__773230547_Ptr, marshalToNative(appointment),
          marshalToNative(instanceStartTime), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<AppointmentConflictResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun MoveAppointmentAsync(appointment: Appointment?,
        destinationCalendar: AppointmentCalendar?): IAsyncAction? {
      val fnPtr = _773230547_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__773230547_Ptr, marshalToNative(appointment),
          marshalToNative(destinationCalendar), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun ShowAddAppointmentAsync(appointment: Appointment?, selection: Rect?):
        IAsyncOperation<String?>? {
      val fnPtr = _773230547_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__773230547_Ptr, marshalToNative(appointment),
          marshalToNative(selection), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun ShowReplaceAppointmentAsync(
      localId: String?,
      appointment: Appointment?,
      selection: Rect?
    ): IAsyncOperation<String?>? {
      val fnPtr = _773230547_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__773230547_Ptr, marshalToNative(localId),
          marshalToNative(appointment), marshalToNative(selection), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun ShowReplaceAppointmentAsync(
      localId: String?,
      appointment: Appointment?,
      selection: Rect?,
      preferredPlacement: Placement?,
      instanceStartDate: DateTime?
    ): IAsyncOperation<String?>? {
      val fnPtr = _773230547_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__773230547_Ptr, marshalToNative(localId),
          marshalToNative(appointment), marshalToNative(selection),
          marshalToNative(preferredPlacement), marshalToNative(instanceStartDate), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun ShowRemoveAppointmentAsync(localId: String?, selection: Rect?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _773230547_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__773230547_Ptr, marshalToNative(localId),
          marshalToNative(selection), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun ShowRemoveAppointmentAsync(
      localId: String?,
      selection: Rect?,
      preferredPlacement: Placement?,
      instanceStartDate: DateTime?
    ): IAsyncOperation<Boolean>? {
      val fnPtr = _773230547_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__773230547_Ptr, marshalToNative(localId),
          marshalToNative(selection), marshalToNative(preferredPlacement),
          marshalToNative(instanceStartDate), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun ShowAppointmentDetailsAsync(localId: String?): IAsyncAction? {
      val fnPtr = _773230547_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__773230547_Ptr, marshalToNative(localId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun ShowAppointmentDetailsAsync(localId: String?, instanceStartDate: DateTime?):
        IAsyncAction? {
      val fnPtr = _773230547_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__773230547_Ptr, marshalToNative(localId),
          marshalToNative(instanceStartDate), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun ShowEditNewAppointmentAsync(appointment: Appointment?):
        IAsyncOperation<String?>? {
      val fnPtr = _773230547_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__773230547_Ptr, marshalToNative(appointment), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun FindLocalIdsFromRoamingIdAsync(roamingId: String?):
        IAsyncOperation<IVectorView<String?>?>? {
      val fnPtr = _773230547_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<String?>?>>()
      val hr = fn.invokeHR(arrayOf(__773230547_Ptr, marshalToNative(roamingId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IVectorView<String?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IAppointmentStore_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __773230547_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentStore, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a461918c7a474d9696c915cd8a05a735")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentStore(ptr: Pointer?): WithDefault = IAppointmentStore_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppointmentStore {
      val address = segment.toRawLongValue()
      return makeIAppointmentStore(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentStore): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__773230547_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentStore): Array<IAppointmentStore?> = (elements
        as Array<IAppointmentStore?>).castToImpl<IAppointmentStore,IAppointmentStore_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppointmentStore?> =
        arrayOfNulls<IAppointmentStore_Impl>(size) as Array<IAppointmentStore?>
  }
}
