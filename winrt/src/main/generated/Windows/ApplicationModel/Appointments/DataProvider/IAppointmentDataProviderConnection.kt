package Windows.ApplicationModel.Appointments.DataProvider

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppointmentDataProviderConnection.ABI::class)
@Signature("{f3dd9d83-3254-465f-abdb-928046552cf4}")
@Guid("f3dd9d833254465fabdb928046552cf4")
@WinRTInterface("f3dd9d833254465fabdb928046552cf4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentDataProviderConnection.ByReference::class)
public interface IAppointmentDataProviderConnection : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_SyncRequested(handler: TypedEventHandler<AppointmentDataProviderConnection?,
      AppointmentCalendarSyncManagerSyncRequestEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_SyncRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public
      fun add_CreateOrUpdateAppointmentRequested(handler: TypedEventHandler<AppointmentDataProviderConnection?,
      AppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_CreateOrUpdateAppointmentRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public
      fun add_CancelMeetingRequested(handler: TypedEventHandler<AppointmentDataProviderConnection?,
      AppointmentCalendarCancelMeetingRequestEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_CancelMeetingRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public
      fun add_ForwardMeetingRequested(handler: TypedEventHandler<AppointmentDataProviderConnection?,
      AppointmentCalendarForwardMeetingRequestEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_ForwardMeetingRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public
      fun add_ProposeNewTimeForMeetingRequested(handler: TypedEventHandler<AppointmentDataProviderConnection?,
      AppointmentCalendarProposeNewTimeForMeetingRequestEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_ProposeNewTimeForMeetingRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public
      fun add_UpdateMeetingResponseRequested(handler: TypedEventHandler<AppointmentDataProviderConnection?,
      AppointmentCalendarUpdateMeetingResponseRequestEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_UpdateMeetingResponseRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(12)
  public fun Start(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentDataProviderConnection> {
    public override fun getValue() =
        ABI.makeIAppointmentDataProviderConnection(pointer.getPointer(0))

    public fun setValue(value: IAppointmentDataProviderConnection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentDataProviderConnection {
    public val __827904698_Ptr: Pointer?

    public val _827904698_VtblPtr: Pointer?
      get() = __827904698_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_SyncRequested(handler: TypedEventHandler<AppointmentDataProviderConnection?,
        AppointmentCalendarSyncManagerSyncRequestEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _827904698_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__827904698_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_SyncRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _827904698_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__827904698_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override
        fun add_CreateOrUpdateAppointmentRequested(handler: TypedEventHandler<AppointmentDataProviderConnection?,
        AppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _827904698_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__827904698_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_CreateOrUpdateAppointmentRequested(token: EventRegistrationToken?):
        Unit {
      val fnPtr = _827904698_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__827904698_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override
        fun add_CancelMeetingRequested(handler: TypedEventHandler<AppointmentDataProviderConnection?,
        AppointmentCalendarCancelMeetingRequestEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _827904698_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__827904698_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_CancelMeetingRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _827904698_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__827904698_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override
        fun add_ForwardMeetingRequested(handler: TypedEventHandler<AppointmentDataProviderConnection?,
        AppointmentCalendarForwardMeetingRequestEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _827904698_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__827904698_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_ForwardMeetingRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _827904698_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__827904698_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override
        fun add_ProposeNewTimeForMeetingRequested(handler: TypedEventHandler<AppointmentDataProviderConnection?,
        AppointmentCalendarProposeNewTimeForMeetingRequestEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _827904698_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__827904698_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_ProposeNewTimeForMeetingRequested(token: EventRegistrationToken?):
        Unit {
      val fnPtr = _827904698_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__827904698_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override
        fun add_UpdateMeetingResponseRequested(handler: TypedEventHandler<AppointmentDataProviderConnection?,
        AppointmentCalendarUpdateMeetingResponseRequestEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _827904698_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__827904698_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_UpdateMeetingResponseRequested(token: EventRegistrationToken?):
        Unit {
      val fnPtr = _827904698_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__827904698_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun Start(): Unit {
      val fnPtr = _827904698_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__827904698_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppointmentDataProviderConnection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __827904698_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentDataProviderConnection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f3dd9d833254465fabdb928046552cf4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentDataProviderConnection(ptr: Pointer?): WithDefault =
        IAppointmentDataProviderConnection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppointmentDataProviderConnection {
      val address = segment.toRawLongValue()
      return makeIAppointmentDataProviderConnection(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentDataProviderConnection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__827904698_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentDataProviderConnection):
        Array<IAppointmentDataProviderConnection?> = (elements as
        Array<IAppointmentDataProviderConnection?>).castToImpl<IAppointmentDataProviderConnection,IAppointmentDataProviderConnection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppointmentDataProviderConnection?> =
        arrayOfNulls<IAppointmentDataProviderConnection_Impl>(size) as
        Array<IAppointmentDataProviderConnection?>
  }
}
