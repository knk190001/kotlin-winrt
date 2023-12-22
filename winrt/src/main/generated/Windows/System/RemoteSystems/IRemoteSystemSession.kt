package Windows.System.RemoteSystems

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

@ABIMarker(IRemoteSystemSession.ABI::class)
@Signature("{69476a01-9ada-490f-9549-d31cb14c9e95}")
@Guid("69476a019ada490f9549d31cb14c9e95")
@WinRTInterface("69476a019ada490f9549d31cb14c9e95")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemSession.ByReference::class)
public interface IRemoteSystemSession : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun get_DisplayName(): String?

  @InterfaceMethod(2)
  public fun get_ControllerDisplayName(): String?

  @InterfaceMethod(3)
  public fun add_Disconnected(handler: TypedEventHandler<RemoteSystemSession?,
      RemoteSystemSessionDisconnectedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_Disconnected(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun CreateParticipantWatcher(): RemoteSystemSessionParticipantWatcher?

  @InterfaceMethod(6)
  public fun SendInvitationAsync(invitee: RemoteSystem?): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemSession> {
    public override fun getValue() = ABI.makeIRemoteSystemSession(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemSession_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemSession {
    public val __476100382_Ptr: Pointer?

    public val _476100382_VtblPtr: Pointer?
      get() = __476100382_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _476100382_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__476100382_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DisplayName(): String? {
      val fnPtr = _476100382_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__476100382_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ControllerDisplayName(): String? {
      val fnPtr = _476100382_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__476100382_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun add_Disconnected(handler: TypedEventHandler<RemoteSystemSession?,
        RemoteSystemSessionDisconnectedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _476100382_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__476100382_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_Disconnected(token: EventRegistrationToken?): Unit {
      val fnPtr = _476100382_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__476100382_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun CreateParticipantWatcher(): RemoteSystemSessionParticipantWatcher? {
      val fnPtr = _476100382_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemSessionParticipantWatcher>()
      val hr = fn.invokeHR(arrayOf(__476100382_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemSessionParticipantWatcher>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun SendInvitationAsync(invitee: RemoteSystem?): IAsyncOperation<Boolean>? {
      val fnPtr = _476100382_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__476100382_Ptr, marshalToNative(invitee), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystemSession_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __476100382_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemSession, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("69476a019ada490f9549d31cb14c9e95")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemSession(ptr: Pointer?): WithDefault = IRemoteSystemSession_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystemSession {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemSession(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__476100382_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemSession): Array<IRemoteSystemSession?> =
        (elements as
        Array<IRemoteSystemSession?>).castToImpl<IRemoteSystemSession,IRemoteSystemSession_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemSession?> =
        arrayOfNulls<IRemoteSystemSession_Impl>(size) as Array<IRemoteSystemSession?>
  }
}
