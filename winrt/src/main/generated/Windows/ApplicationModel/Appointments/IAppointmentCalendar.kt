package Windows.ApplicationModel.Appointments

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.DateTime
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TimeSpan
import Windows.UI.Color
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

@ABIMarker(IAppointmentCalendar.ABI::class)
@Signature("{5273819d-8339-3d4f-a02f-64084452bb5d}")
@Guid("5273819d83393d4fa02f64084452bb5d")
@WinRTInterface("5273819d83393d4fa02f64084452bb5d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentCalendar.ByReference::class)
public interface IAppointmentCalendar : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DisplayColor(): Color?

  @InterfaceMethod(1)
  public fun get_DisplayName(): String?

  @InterfaceMethod(2)
  public fun put_DisplayName(value: String?): Unit

  @InterfaceMethod(3)
  public fun get_LocalId(): String?

  @InterfaceMethod(4)
  public fun get_IsHidden(): Boolean

  @InterfaceMethod(5)
  public fun get_OtherAppReadAccess(): AppointmentCalendarOtherAppReadAccess?

  @InterfaceMethod(6)
  public fun put_OtherAppReadAccess(value: AppointmentCalendarOtherAppReadAccess?): Unit

  @InterfaceMethod(7)
  public fun get_OtherAppWriteAccess(): AppointmentCalendarOtherAppWriteAccess?

  @InterfaceMethod(8)
  public fun put_OtherAppWriteAccess(value: AppointmentCalendarOtherAppWriteAccess?): Unit

  @InterfaceMethod(9)
  public fun get_SourceDisplayName(): String?

  @InterfaceMethod(10)
  public fun get_SummaryCardView(): AppointmentSummaryCardView?

  @InterfaceMethod(11)
  public fun put_SummaryCardView(value: AppointmentSummaryCardView?): Unit

  @InterfaceMethod(12)
  public fun FindAppointmentsAsync(rangeStart: DateTime?, rangeLength: TimeSpan?):
      IAsyncOperation<IVectorView<Appointment?>?>?

  @InterfaceMethod(13)
  public fun FindAppointmentsAsync(
    rangeStart: DateTime?,
    rangeLength: TimeSpan?,
    options: FindAppointmentsOptions?
  ): IAsyncOperation<IVectorView<Appointment?>?>?

  @InterfaceMethod(14)
  public fun FindExceptionsFromMasterAsync(masterLocalId: String?):
      IAsyncOperation<IVectorView<AppointmentException?>?>?

  @InterfaceMethod(15)
  public fun FindAllInstancesAsync(
    masterLocalId: String?,
    rangeStart: DateTime?,
    rangeLength: TimeSpan?
  ): IAsyncOperation<IVectorView<Appointment?>?>?

  @InterfaceMethod(16)
  public fun FindAllInstancesAsync(
    masterLocalId: String?,
    rangeStart: DateTime?,
    rangeLength: TimeSpan?,
    pOptions: FindAppointmentsOptions?
  ): IAsyncOperation<IVectorView<Appointment?>?>?

  @InterfaceMethod(17)
  public fun GetAppointmentAsync(localId: String?): IAsyncOperation<Appointment?>?

  @InterfaceMethod(18)
  public fun GetAppointmentInstanceAsync(localId: String?, instanceStartTime: DateTime?):
      IAsyncOperation<Appointment?>?

  @InterfaceMethod(19)
  public fun FindUnexpandedAppointmentsAsync(): IAsyncOperation<IVectorView<Appointment?>?>?

  @InterfaceMethod(20)
  public fun FindUnexpandedAppointmentsAsync(options: FindAppointmentsOptions?):
      IAsyncOperation<IVectorView<Appointment?>?>?

  @InterfaceMethod(21)
  public fun DeleteAsync(): IAsyncAction?

  @InterfaceMethod(22)
  public fun SaveAsync(): IAsyncAction?

  @InterfaceMethod(23)
  public fun DeleteAppointmentAsync(localId: String?): IAsyncAction?

  @InterfaceMethod(24)
  public fun DeleteAppointmentInstanceAsync(localId: String?, instanceStartTime: DateTime?):
      IAsyncAction?

  @InterfaceMethod(25)
  public fun SaveAppointmentAsync(pAppointment: Appointment?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentCalendar> {
    public override fun getValue() = ABI.makeIAppointmentCalendar(pointer.getPointer(0))

    public fun setValue(value: IAppointmentCalendar_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentCalendar {
    public val __997961842_Ptr: Pointer?

    public val _997961842_VtblPtr: Pointer?
      get() = __997961842_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DisplayColor(): Color? {
      val fnPtr = _997961842_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__997961842_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DisplayName(): String? {
      val fnPtr = _997961842_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__997961842_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_DisplayName(value: String?): Unit {
      val fnPtr = _997961842_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__997961842_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_LocalId(): String? {
      val fnPtr = _997961842_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__997961842_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_IsHidden(): Boolean {
      val fnPtr = _997961842_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__997961842_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_OtherAppReadAccess(): AppointmentCalendarOtherAppReadAccess? {
      val fnPtr = _997961842_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppointmentCalendarOtherAppReadAccess>()
      val hr = fn.invokeHR(arrayOf(__997961842_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppointmentCalendarOtherAppReadAccess>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_OtherAppReadAccess(value: AppointmentCalendarOtherAppReadAccess?):
        Unit {
      val fnPtr = _997961842_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__997961842_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_OtherAppWriteAccess(): AppointmentCalendarOtherAppWriteAccess? {
      val fnPtr = _997961842_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppointmentCalendarOtherAppWriteAccess>()
      val hr = fn.invokeHR(arrayOf(__997961842_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppointmentCalendarOtherAppWriteAccess>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_OtherAppWriteAccess(value: AppointmentCalendarOtherAppWriteAccess?):
        Unit {
      val fnPtr = _997961842_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__997961842_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_SourceDisplayName(): String? {
      val fnPtr = _997961842_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__997961842_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_SummaryCardView(): AppointmentSummaryCardView? {
      val fnPtr = _997961842_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppointmentSummaryCardView>()
      val hr = fn.invokeHR(arrayOf(__997961842_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppointmentSummaryCardView>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_SummaryCardView(value: AppointmentSummaryCardView?): Unit {
      val fnPtr = _997961842_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__997961842_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun FindAppointmentsAsync(rangeStart: DateTime?, rangeLength: TimeSpan?):
        IAsyncOperation<IVectorView<Appointment?>?>? {
      val fnPtr = _997961842_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<Appointment?>?>>()
      val hr = fn.invokeHR(arrayOf(__997961842_Ptr, marshalToNative(rangeStart),
          marshalToNative(rangeLength), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<Appointment?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun FindAppointmentsAsync(
      rangeStart: DateTime?,
      rangeLength: TimeSpan?,
      options: FindAppointmentsOptions?
    ): IAsyncOperation<IVectorView<Appointment?>?>? {
      val fnPtr = _997961842_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<Appointment?>?>>()
      val hr = fn.invokeHR(arrayOf(__997961842_Ptr, marshalToNative(rangeStart),
          marshalToNative(rangeLength), marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<Appointment?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun FindExceptionsFromMasterAsync(masterLocalId: String?):
        IAsyncOperation<IVectorView<AppointmentException?>?>? {
      val fnPtr = _997961842_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<AppointmentException?>?>>()
      val hr = fn.invokeHR(arrayOf(__997961842_Ptr, marshalToNative(masterLocalId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<AppointmentException?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun FindAllInstancesAsync(
      masterLocalId: String?,
      rangeStart: DateTime?,
      rangeLength: TimeSpan?
    ): IAsyncOperation<IVectorView<Appointment?>?>? {
      val fnPtr = _997961842_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<Appointment?>?>>()
      val hr = fn.invokeHR(arrayOf(__997961842_Ptr, marshalToNative(masterLocalId),
          marshalToNative(rangeStart), marshalToNative(rangeLength), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<Appointment?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun FindAllInstancesAsync(
      masterLocalId: String?,
      rangeStart: DateTime?,
      rangeLength: TimeSpan?,
      pOptions: FindAppointmentsOptions?
    ): IAsyncOperation<IVectorView<Appointment?>?>? {
      val fnPtr = _997961842_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<Appointment?>?>>()
      val hr = fn.invokeHR(arrayOf(__997961842_Ptr, marshalToNative(masterLocalId),
          marshalToNative(rangeStart), marshalToNative(rangeLength), marshalToNative(pOptions),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<Appointment?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun GetAppointmentAsync(localId: String?): IAsyncOperation<Appointment?>? {
      val fnPtr = _997961842_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Appointment?>>()
      val hr = fn.invokeHR(arrayOf(__997961842_Ptr, marshalToNative(localId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Appointment?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun GetAppointmentInstanceAsync(localId: String?, instanceStartTime: DateTime?):
        IAsyncOperation<Appointment?>? {
      val fnPtr = _997961842_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Appointment?>>()
      val hr = fn.invokeHR(arrayOf(__997961842_Ptr, marshalToNative(localId),
          marshalToNative(instanceStartTime), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Appointment?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun FindUnexpandedAppointmentsAsync():
        IAsyncOperation<IVectorView<Appointment?>?>? {
      val fnPtr = _997961842_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<Appointment?>?>>()
      val hr = fn.invokeHR(arrayOf(__997961842_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<Appointment?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun FindUnexpandedAppointmentsAsync(options: FindAppointmentsOptions?):
        IAsyncOperation<IVectorView<Appointment?>?>? {
      val fnPtr = _997961842_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<Appointment?>?>>()
      val hr = fn.invokeHR(arrayOf(__997961842_Ptr, marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<Appointment?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun DeleteAsync(): IAsyncAction? {
      val fnPtr = _997961842_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__997961842_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun SaveAsync(): IAsyncAction? {
      val fnPtr = _997961842_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__997961842_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun DeleteAppointmentAsync(localId: String?): IAsyncAction? {
      val fnPtr = _997961842_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__997961842_Ptr, marshalToNative(localId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun DeleteAppointmentInstanceAsync(localId: String?,
        instanceStartTime: DateTime?): IAsyncAction? {
      val fnPtr = _997961842_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__997961842_Ptr, marshalToNative(localId),
          marshalToNative(instanceStartTime), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun SaveAppointmentAsync(pAppointment: Appointment?): IAsyncAction? {
      val fnPtr = _997961842_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__997961842_Ptr, marshalToNative(pAppointment), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IAppointmentCalendar_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __997961842_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentCalendar, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5273819d83393d4fa02f64084452bb5d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentCalendar(ptr: Pointer?): WithDefault = IAppointmentCalendar_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppointmentCalendar {
      val address = segment.toRawLongValue()
      return makeIAppointmentCalendar(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentCalendar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__997961842_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentCalendar): Array<IAppointmentCalendar?> =
        (elements as
        Array<IAppointmentCalendar?>).castToImpl<IAppointmentCalendar,IAppointmentCalendar_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppointmentCalendar?> =
        arrayOfNulls<IAppointmentCalendar_Impl>(size) as Array<IAppointmentCalendar?>
  }
}
