package Windows.System.RemoteSystems

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

@ABIMarker(IRemoteSystemWatcher2.ABI::class)
@Signature("{73436700-19ca-48f9-a4cd-780f7ad58c71}")
@Guid("7343670019ca48f9a4cd780f7ad58c71")
@WinRTInterface("7343670019ca48f9a4cd780f7ad58c71")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemWatcher2.ByReference::class)
public interface IRemoteSystemWatcher2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_EnumerationCompleted(handler: TypedEventHandler<RemoteSystemWatcher?,
      RemoteSystemEnumerationCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_EnumerationCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_ErrorOccurred(handler: TypedEventHandler<RemoteSystemWatcher?,
      RemoteSystemWatcherErrorOccurredEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_ErrorOccurred(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemWatcher2> {
    public override fun getValue() = ABI.makeIRemoteSystemWatcher2(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemWatcher2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemWatcher2 {
    public val __1560830250_Ptr: Pointer?

    public val _1560830250_VtblPtr: Pointer?
      get() = __1560830250_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_EnumerationCompleted(handler: TypedEventHandler<RemoteSystemWatcher?,
        RemoteSystemEnumerationCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1560830250_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1560830250_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_EnumerationCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _1560830250_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1560830250_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_ErrorOccurred(handler: TypedEventHandler<RemoteSystemWatcher?,
        RemoteSystemWatcherErrorOccurredEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1560830250_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1560830250_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_ErrorOccurred(token: EventRegistrationToken?): Unit {
      val fnPtr = _1560830250_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1560830250_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRemoteSystemWatcher2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1560830250_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemWatcher2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7343670019ca48f9a4cd780f7ad58c71")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemWatcher2(ptr: Pointer?): WithDefault =
        IRemoteSystemWatcher2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystemWatcher2 {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemWatcher2(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemWatcher2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1560830250_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemWatcher2): Array<IRemoteSystemWatcher2?> =
        (elements as
        Array<IRemoteSystemWatcher2?>).castToImpl<IRemoteSystemWatcher2,IRemoteSystemWatcher2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemWatcher2?> =
        arrayOfNulls<IRemoteSystemWatcher2_Impl>(size) as Array<IRemoteSystemWatcher2?>
  }
}
