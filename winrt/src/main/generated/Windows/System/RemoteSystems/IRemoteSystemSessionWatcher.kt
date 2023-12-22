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

@ABIMarker(IRemoteSystemSessionWatcher.ABI::class)
@Signature("{8003e340-0c41-4a62-b6d7-bdbe2b19be2d}")
@Guid("8003e3400c414a62b6d7bdbe2b19be2d")
@WinRTInterface("8003e3400c414a62b6d7bdbe2b19be2d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemSessionWatcher.ByReference::class)
public interface IRemoteSystemSessionWatcher : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Start(): Unit

  @InterfaceMethod(1)
  public fun Stop(): Unit

  @InterfaceMethod(2)
  public fun get_Status(): RemoteSystemSessionWatcherStatus?

  @InterfaceMethod(3)
  public fun add_Added(handler: TypedEventHandler<RemoteSystemSessionWatcher?,
      RemoteSystemSessionAddedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_Added(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun add_Updated(handler: TypedEventHandler<RemoteSystemSessionWatcher?,
      RemoteSystemSessionUpdatedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_Updated(token: EventRegistrationToken?): Unit

  @InterfaceMethod(7)
  public fun add_Removed(handler: TypedEventHandler<RemoteSystemSessionWatcher?,
      RemoteSystemSessionRemovedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_Removed(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemSessionWatcher> {
    public override fun getValue() = ABI.makeIRemoteSystemSessionWatcher(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemSessionWatcher_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemSessionWatcher {
    public val __1262405242_Ptr: Pointer?

    public val _1262405242_VtblPtr: Pointer?
      get() = __1262405242_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Start(): Unit {
      val fnPtr = _1262405242_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1262405242_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun Stop(): Unit {
      val fnPtr = _1262405242_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1262405242_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Status(): RemoteSystemSessionWatcherStatus? {
      val fnPtr = _1262405242_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemSessionWatcherStatus>()
      val hr = fn.invokeHR(arrayOf(__1262405242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemSessionWatcherStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun add_Added(handler: TypedEventHandler<RemoteSystemSessionWatcher?,
        RemoteSystemSessionAddedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1262405242_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1262405242_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_Added(token: EventRegistrationToken?): Unit {
      val fnPtr = _1262405242_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1262405242_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun add_Updated(handler: TypedEventHandler<RemoteSystemSessionWatcher?,
        RemoteSystemSessionUpdatedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1262405242_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1262405242_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_Updated(token: EventRegistrationToken?): Unit {
      val fnPtr = _1262405242_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1262405242_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun add_Removed(handler: TypedEventHandler<RemoteSystemSessionWatcher?,
        RemoteSystemSessionRemovedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1262405242_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1262405242_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_Removed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1262405242_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1262405242_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRemoteSystemSessionWatcher_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1262405242_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemSessionWatcher, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8003e3400c414a62b6d7bdbe2b19be2d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemSessionWatcher(ptr: Pointer?): WithDefault =
        IRemoteSystemSessionWatcher_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystemSessionWatcher {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemSessionWatcher(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemSessionWatcher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1262405242_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemSessionWatcher):
        Array<IRemoteSystemSessionWatcher?> = (elements as
        Array<IRemoteSystemSessionWatcher?>).castToImpl<IRemoteSystemSessionWatcher,IRemoteSystemSessionWatcher_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemSessionWatcher?> =
        arrayOfNulls<IRemoteSystemSessionWatcher_Impl>(size) as Array<IRemoteSystemSessionWatcher?>
  }
}
