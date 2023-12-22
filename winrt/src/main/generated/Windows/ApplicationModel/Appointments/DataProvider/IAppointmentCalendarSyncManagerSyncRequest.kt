package Windows.ApplicationModel.Appointments.DataProvider

import Windows.Foundation.IAsyncAction
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppointmentCalendarSyncManagerSyncRequest.ABI::class)
@Signature("{12ab382b-7163-4a56-9a4e-7223a84adf46}")
@Guid("12ab382b71634a569a4e7223a84adf46")
@WinRTInterface("12ab382b71634a569a4e7223a84adf46")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentCalendarSyncManagerSyncRequest.ByReference::class)
public interface IAppointmentCalendarSyncManagerSyncRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AppointmentCalendarLocalId(): String?

  @InterfaceMethod(1)
  public fun ReportCompletedAsync(): IAsyncAction?

  @InterfaceMethod(2)
  public fun ReportFailedAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentCalendarSyncManagerSyncRequest> {
    public override fun getValue() =
        ABI.makeIAppointmentCalendarSyncManagerSyncRequest(pointer.getPointer(0))

    public fun setValue(value: IAppointmentCalendarSyncManagerSyncRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentCalendarSyncManagerSyncRequest {
    public val __106865953_Ptr: Pointer?

    public val _106865953_VtblPtr: Pointer?
      get() = __106865953_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AppointmentCalendarLocalId(): String? {
      val fnPtr = _106865953_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__106865953_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ReportCompletedAsync(): IAsyncAction? {
      val fnPtr = _106865953_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__106865953_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ReportFailedAsync(): IAsyncAction? {
      val fnPtr = _106865953_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__106865953_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IAppointmentCalendarSyncManagerSyncRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __106865953_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentCalendarSyncManagerSyncRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("12ab382b71634a569a4e7223a84adf46")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentCalendarSyncManagerSyncRequest(ptr: Pointer?): WithDefault =
        IAppointmentCalendarSyncManagerSyncRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAppointmentCalendarSyncManagerSyncRequest {
      val address = segment.toRawLongValue()
      return makeIAppointmentCalendarSyncManagerSyncRequest(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentCalendarSyncManagerSyncRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__106865953_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentCalendarSyncManagerSyncRequest):
        Array<IAppointmentCalendarSyncManagerSyncRequest?> = (elements as
        Array<IAppointmentCalendarSyncManagerSyncRequest?>).castToImpl<IAppointmentCalendarSyncManagerSyncRequest,IAppointmentCalendarSyncManagerSyncRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppointmentCalendarSyncManagerSyncRequest?> =
        arrayOfNulls<IAppointmentCalendarSyncManagerSyncRequest_Impl>(size) as
        Array<IAppointmentCalendarSyncManagerSyncRequest?>
  }
}
