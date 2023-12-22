package Windows.UI.UIAutomation.Core

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IRemoteAutomationClientSession.ABI::class)
@Signature("{5c8a091d-94cc-5b33-afdb-678cded2bd54}")
@Guid("5c8a091d94cc5b33afdb678cded2bd54")
@WinRTInterface("5c8a091d94cc5b33afdb678cded2bd54")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteAutomationClientSession.ByReference::class)
public interface IRemoteAutomationClientSession : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Start(): Unit

  @InterfaceMethod(1)
  public fun Stop(): Unit

  @InterfaceMethod(2)
  public fun CreateWindowAsync(
    remoteWindowId: WinDef.ULONG,
    remoteProcessId: WinDef.UINT,
    parentAutomationElement: IUnknown?
  ): IAsyncOperation<RemoteAutomationWindow?>?

  @InterfaceMethod(3)
  public fun get_SessionId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(4)
  public fun add_ConnectionRequested(handler: TypedEventHandler<RemoteAutomationClientSession?,
      RemoteAutomationConnectionRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_ConnectionRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_Disconnected(handler: TypedEventHandler<RemoteAutomationClientSession?,
      RemoteAutomationDisconnectedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_Disconnected(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteAutomationClientSession> {
    public override fun getValue() = ABI.makeIRemoteAutomationClientSession(pointer.getPointer(0))

    public fun setValue(value: IRemoteAutomationClientSession_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteAutomationClientSession {
    public val __382673176_Ptr: Pointer?

    public val _382673176_VtblPtr: Pointer?
      get() = __382673176_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Start(): Unit {
      val fnPtr = _382673176_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__382673176_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun Stop(): Unit {
      val fnPtr = _382673176_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__382673176_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun CreateWindowAsync(
      remoteWindowId: WinDef.ULONG,
      remoteProcessId: WinDef.UINT,
      parentAutomationElement: IUnknown?
    ): IAsyncOperation<RemoteAutomationWindow?>? {
      val fnPtr = _382673176_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<RemoteAutomationWindow?>>()
      val hr = fn.invokeHR(arrayOf(__382673176_Ptr, remoteWindowId, remoteProcessId,
          marshalToNative(parentAutomationElement), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<RemoteAutomationWindow?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SessionId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _382673176_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__382673176_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override
        fun add_ConnectionRequested(handler: TypedEventHandler<RemoteAutomationClientSession?,
        RemoteAutomationConnectionRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _382673176_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__382673176_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_ConnectionRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _382673176_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__382673176_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_Disconnected(handler: TypedEventHandler<RemoteAutomationClientSession?,
        RemoteAutomationDisconnectedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _382673176_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__382673176_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_Disconnected(token: EventRegistrationToken?): Unit {
      val fnPtr = _382673176_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__382673176_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRemoteAutomationClientSession_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __382673176_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteAutomationClientSession, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5c8a091d94cc5b33afdb678cded2bd54")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteAutomationClientSession(ptr: Pointer?): WithDefault =
        IRemoteAutomationClientSession_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteAutomationClientSession {
      val address = segment.toRawLongValue()
      return makeIRemoteAutomationClientSession(Pointer(address))
    }

    public override fun toNative(obj: IRemoteAutomationClientSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__382673176_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteAutomationClientSession):
        Array<IRemoteAutomationClientSession?> = (elements as
        Array<IRemoteAutomationClientSession?>).castToImpl<IRemoteAutomationClientSession,IRemoteAutomationClientSession_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteAutomationClientSession?> =
        arrayOfNulls<IRemoteAutomationClientSession_Impl>(size) as
        Array<IRemoteAutomationClientSession?>
  }
}
