package Windows.Media.Control

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IGlobalSystemMediaTransportControlsSessionManager.ABI::class)
@Signature("{cace8eac-e86e-504a-ab31-5ff8ff1bce49}")
@Guid("cace8eace86e504aab315ff8ff1bce49")
@WinRTInterface("cace8eace86e504aab315ff8ff1bce49")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGlobalSystemMediaTransportControlsSessionManager.ByReference::class)
public interface IGlobalSystemMediaTransportControlsSessionManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetCurrentSession(): GlobalSystemMediaTransportControlsSession?

  @InterfaceMethod(1)
  public fun GetSessions(): IVectorView<GlobalSystemMediaTransportControlsSession?>?

  @InterfaceMethod(2)
  public
      fun add_CurrentSessionChanged(handler: TypedEventHandler<GlobalSystemMediaTransportControlsSessionManager?,
      CurrentSessionChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_CurrentSessionChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public
      fun add_SessionsChanged(handler: TypedEventHandler<GlobalSystemMediaTransportControlsSessionManager?,
      SessionsChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_SessionsChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGlobalSystemMediaTransportControlsSessionManager> {
    public override fun getValue() =
        ABI.makeIGlobalSystemMediaTransportControlsSessionManager(pointer.getPointer(0))

    public fun setValue(value: IGlobalSystemMediaTransportControlsSessionManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGlobalSystemMediaTransportControlsSessionManager {
    public val __1612675067_Ptr: Pointer?

    public val _1612675067_VtblPtr: Pointer?
      get() = __1612675067_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCurrentSession(): GlobalSystemMediaTransportControlsSession? {
      val fnPtr = _1612675067_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GlobalSystemMediaTransportControlsSession>()
      val hr = fn.invokeHR(arrayOf(__1612675067_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<GlobalSystemMediaTransportControlsSession>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetSessions(): IVectorView<GlobalSystemMediaTransportControlsSession?>? {
      val fnPtr = _1612675067_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<GlobalSystemMediaTransportControlsSession?>>()
      val hr = fn.invokeHR(arrayOf(__1612675067_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<GlobalSystemMediaTransportControlsSession?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override
        fun add_CurrentSessionChanged(handler: TypedEventHandler<GlobalSystemMediaTransportControlsSessionManager?,
        CurrentSessionChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1612675067_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1612675067_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_CurrentSessionChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1612675067_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1612675067_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override
        fun add_SessionsChanged(handler: TypedEventHandler<GlobalSystemMediaTransportControlsSessionManager?,
        SessionsChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1612675067_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1612675067_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_SessionsChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1612675067_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1612675067_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGlobalSystemMediaTransportControlsSessionManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1612675067_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGlobalSystemMediaTransportControlsSessionManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cace8eace86e504aab315ff8ff1bce49")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGlobalSystemMediaTransportControlsSessionManager(ptr: Pointer?): WithDefault =
        IGlobalSystemMediaTransportControlsSessionManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IGlobalSystemMediaTransportControlsSessionManager {
      val address = segment.toRawLongValue()
      return makeIGlobalSystemMediaTransportControlsSessionManager(Pointer(address))
    }

    public override fun toNative(obj: IGlobalSystemMediaTransportControlsSessionManager):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1612675067_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGlobalSystemMediaTransportControlsSessionManager):
        Array<IGlobalSystemMediaTransportControlsSessionManager?> = (elements as
        Array<IGlobalSystemMediaTransportControlsSessionManager?>).castToImpl<IGlobalSystemMediaTransportControlsSessionManager,IGlobalSystemMediaTransportControlsSessionManager_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IGlobalSystemMediaTransportControlsSessionManager?> =
        arrayOfNulls<IGlobalSystemMediaTransportControlsSessionManager_Impl>(size) as
        Array<IGlobalSystemMediaTransportControlsSessionManager?>
  }
}
