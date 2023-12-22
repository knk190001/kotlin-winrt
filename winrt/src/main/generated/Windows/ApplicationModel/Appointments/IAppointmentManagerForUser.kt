package Windows.ApplicationModel.Appointments

import Windows.Foundation.DateTime
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Rect
import Windows.Foundation.TimeSpan
import Windows.System.User
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

@ABIMarker(IAppointmentManagerForUser.ABI::class)
@Signature("{70261423-73cc-4660-b318-b01365302a03}")
@Guid("7026142373cc4660b318b01365302a03")
@WinRTInterface("7026142373cc4660b318b01365302a03")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentManagerForUser.ByReference::class)
public interface IAppointmentManagerForUser : NativeMapped, IWinRTInterface {
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

  @InterfaceMethod(9)
  public fun ShowAppointmentDetailsAsync(appointmentId: String?): IAsyncAction?

  @InterfaceMethod(10)
  public fun ShowAppointmentDetailsAsync(appointmentId: String?, instanceStartDate: DateTime?):
      IAsyncAction?

  @InterfaceMethod(11)
  public fun ShowEditNewAppointmentAsync(appointment: Appointment?): IAsyncOperation<String?>?

  @InterfaceMethod(12)
  public fun RequestStoreAsync(options: AppointmentStoreAccessType?):
      IAsyncOperation<AppointmentStore?>?

  @InterfaceMethod(13)
  public fun get_User(): User?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentManagerForUser> {
    public override fun getValue() = ABI.makeIAppointmentManagerForUser(pointer.getPointer(0))

    public fun setValue(value: IAppointmentManagerForUser_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentManagerForUser {
    public val __1366645243_Ptr: Pointer?

    public val _1366645243_VtblPtr: Pointer?
      get() = __1366645243_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ShowAddAppointmentAsync(appointment: Appointment?, selection: Rect?):
        IAsyncOperation<String?>? {
      val fnPtr = _1366645243_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__1366645243_Ptr, marshalToNative(appointment),
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
      val fnPtr = _1366645243_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__1366645243_Ptr, marshalToNative(appointment),
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
      val fnPtr = _1366645243_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__1366645243_Ptr, marshalToNative(appointmentId),
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
      val fnPtr = _1366645243_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__1366645243_Ptr, marshalToNative(appointmentId),
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
      val fnPtr = _1366645243_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__1366645243_Ptr, marshalToNative(appointmentId),
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
      val fnPtr = _1366645243_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1366645243_Ptr, marshalToNative(appointmentId),
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
      val fnPtr = _1366645243_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1366645243_Ptr, marshalToNative(appointmentId),
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
      val fnPtr = _1366645243_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1366645243_Ptr, marshalToNative(appointmentId),
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
      val fnPtr = _1366645243_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1366645243_Ptr, marshalToNative(timeToShow),
          marshalToNative(duration), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun ShowAppointmentDetailsAsync(appointmentId: String?): IAsyncAction? {
      val fnPtr = _1366645243_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1366645243_Ptr, marshalToNative(appointmentId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun ShowAppointmentDetailsAsync(appointmentId: String?,
        instanceStartDate: DateTime?): IAsyncAction? {
      val fnPtr = _1366645243_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1366645243_Ptr, marshalToNative(appointmentId),
          marshalToNative(instanceStartDate), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun ShowEditNewAppointmentAsync(appointment: Appointment?):
        IAsyncOperation<String?>? {
      val fnPtr = _1366645243_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__1366645243_Ptr, marshalToNative(appointment), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun RequestStoreAsync(options: AppointmentStoreAccessType?):
        IAsyncOperation<AppointmentStore?>? {
      val fnPtr = _1366645243_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AppointmentStore?>>()
      val hr = fn.invokeHR(arrayOf(__1366645243_Ptr, marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<AppointmentStore?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_User(): User? {
      val fnPtr = _1366645243_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__1366645243_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }
  }

  public class IAppointmentManagerForUser_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1366645243_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentManagerForUser, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7026142373cc4660b318b01365302a03")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentManagerForUser(ptr: Pointer?): WithDefault =
        IAppointmentManagerForUser_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppointmentManagerForUser {
      val address = segment.toRawLongValue()
      return makeIAppointmentManagerForUser(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentManagerForUser): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1366645243_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentManagerForUser):
        Array<IAppointmentManagerForUser?> = (elements as
        Array<IAppointmentManagerForUser?>).castToImpl<IAppointmentManagerForUser,IAppointmentManagerForUser_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppointmentManagerForUser?> =
        arrayOfNulls<IAppointmentManagerForUser_Impl>(size) as Array<IAppointmentManagerForUser?>
  }
}
