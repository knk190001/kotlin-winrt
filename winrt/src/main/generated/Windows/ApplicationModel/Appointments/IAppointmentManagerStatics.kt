package Windows.ApplicationModel.Appointments

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

@ABIMarker(IAppointmentManagerStatics.ABI::class)
@Signature("{3a30fa01-5c40-499d-b33f-a43050f74fc4}")
@Guid("3a30fa015c40499db33fa43050f74fc4")
@WinRTInterface("3a30fa015c40499db33fa43050f74fc4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentManagerStatics.ByReference::class)
public interface IAppointmentManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ShowAddAppointmentAsync(appointment: Appointment?, selection: Rect?):
      IAsyncOperation<String?>?

  @InterfaceMethod(1)
  public fun ShowAddAppointmentAsync(
    appointment: Appointment?,
    selection: Rect?,
    preferredPlacement: Placement?
  ): IAsyncOperation<String?>?

  @InterfaceMethod(2)
  public fun ShowReplaceAppointmentAsync(
    appointmentId: String?,
    appointment: Appointment?,
    selection: Rect?
  ): IAsyncOperation<String?>?

  @InterfaceMethod(3)
  public fun ShowReplaceAppointmentAsync(
    appointmentId: String?,
    appointment: Appointment?,
    selection: Rect?,
    preferredPlacement: Placement?
  ): IAsyncOperation<String?>?

  @InterfaceMethod(4)
  public fun ShowReplaceAppointmentAsync(
    appointmentId: String?,
    appointment: Appointment?,
    selection: Rect?,
    preferredPlacement: Placement?,
    instanceStartDate: DateTime?
  ): IAsyncOperation<String?>?

  @InterfaceMethod(5)
  public fun ShowRemoveAppointmentAsync(appointmentId: String?, selection: Rect?):
      IAsyncOperation<Boolean>?

  @InterfaceMethod(6)
  public fun ShowRemoveAppointmentAsync(
    appointmentId: String?,
    selection: Rect?,
    preferredPlacement: Placement?
  ): IAsyncOperation<Boolean>?

  @InterfaceMethod(7)
  public fun ShowRemoveAppointmentAsync(
    appointmentId: String?,
    selection: Rect?,
    preferredPlacement: Placement?,
    instanceStartDate: DateTime?
  ): IAsyncOperation<Boolean>?

  @InterfaceMethod(8)
  public fun ShowTimeFrameAsync(timeToShow: DateTime?, duration: TimeSpan?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentManagerStatics> {
    public override fun getValue() = ABI.makeIAppointmentManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IAppointmentManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentManagerStatics {
    public val __147650956_Ptr: Pointer?

    public val _147650956_VtblPtr: Pointer?
      get() = __147650956_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ShowAddAppointmentAsync(appointment: Appointment?, selection: Rect?):
        IAsyncOperation<String?>? {
      val fnPtr = _147650956_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__147650956_Ptr, marshalToNative(appointment),
          marshalToNative(selection), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ShowAddAppointmentAsync(
      appointment: Appointment?,
      selection: Rect?,
      preferredPlacement: Placement?
    ): IAsyncOperation<String?>? {
      val fnPtr = _147650956_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__147650956_Ptr, marshalToNative(appointment),
          marshalToNative(selection), marshalToNative(preferredPlacement), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ShowReplaceAppointmentAsync(
      appointmentId: String?,
      appointment: Appointment?,
      selection: Rect?
    ): IAsyncOperation<String?>? {
      val fnPtr = _147650956_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__147650956_Ptr, marshalToNative(appointmentId),
          marshalToNative(appointment), marshalToNative(selection), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ShowReplaceAppointmentAsync(
      appointmentId: String?,
      appointment: Appointment?,
      selection: Rect?,
      preferredPlacement: Placement?
    ): IAsyncOperation<String?>? {
      val fnPtr = _147650956_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__147650956_Ptr, marshalToNative(appointmentId),
          marshalToNative(appointment), marshalToNative(selection),
          marshalToNative(preferredPlacement), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun ShowReplaceAppointmentAsync(
      appointmentId: String?,
      appointment: Appointment?,
      selection: Rect?,
      preferredPlacement: Placement?,
      instanceStartDate: DateTime?
    ): IAsyncOperation<String?>? {
      val fnPtr = _147650956_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__147650956_Ptr, marshalToNative(appointmentId),
          marshalToNative(appointment), marshalToNative(selection),
          marshalToNative(preferredPlacement), marshalToNative(instanceStartDate), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun ShowRemoveAppointmentAsync(appointmentId: String?, selection: Rect?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _147650956_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__147650956_Ptr, marshalToNative(appointmentId),
          marshalToNative(selection), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun ShowRemoveAppointmentAsync(
      appointmentId: String?,
      selection: Rect?,
      preferredPlacement: Placement?
    ): IAsyncOperation<Boolean>? {
      val fnPtr = _147650956_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__147650956_Ptr, marshalToNative(appointmentId),
          marshalToNative(selection), marshalToNative(preferredPlacement), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun ShowRemoveAppointmentAsync(
      appointmentId: String?,
      selection: Rect?,
      preferredPlacement: Placement?,
      instanceStartDate: DateTime?
    ): IAsyncOperation<Boolean>? {
      val fnPtr = _147650956_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__147650956_Ptr, marshalToNative(appointmentId),
          marshalToNative(selection), marshalToNative(preferredPlacement),
          marshalToNative(instanceStartDate), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun ShowTimeFrameAsync(timeToShow: DateTime?, duration: TimeSpan?):
        IAsyncAction? {
      val fnPtr = _147650956_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__147650956_Ptr, marshalToNative(timeToShow),
          marshalToNative(duration), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IAppointmentManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __147650956_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3a30fa015c40499db33fa43050f74fc4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentManagerStatics(ptr: Pointer?): WithDefault =
        IAppointmentManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppointmentManagerStatics {
      val address = segment.toRawLongValue()
      return makeIAppointmentManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__147650956_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentManagerStatics):
        Array<IAppointmentManagerStatics?> = (elements as
        Array<IAppointmentManagerStatics?>).castToImpl<IAppointmentManagerStatics,IAppointmentManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppointmentManagerStatics?> =
        arrayOfNulls<IAppointmentManagerStatics_Impl>(size) as Array<IAppointmentManagerStatics?>
  }
}
