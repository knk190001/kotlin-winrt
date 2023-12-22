package Windows.Networking.Proximity

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

@ABIMarker(IPeerWatcher.ABI::class)
@Signature("{3cee21f8-2fa6-4679-9691-03c94a420f34}")
@Guid("3cee21f82fa64679969103c94a420f34")
@WinRTInterface("3cee21f82fa64679969103c94a420f34")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPeerWatcher.ByReference::class)
public interface IPeerWatcher : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_Added(handler: TypedEventHandler<PeerWatcher?, PeerInformation?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_Added(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_Removed(handler: TypedEventHandler<PeerWatcher?, PeerInformation?>?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_Removed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_Updated(handler: TypedEventHandler<PeerWatcher?, PeerInformation?>?):
      EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_Updated(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_EnumerationCompleted(handler: TypedEventHandler<PeerWatcher?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_EnumerationCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_Stopped(handler: TypedEventHandler<PeerWatcher?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_Stopped(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun get_Status(): PeerWatcherStatus?

  @InterfaceMethod(11)
  public fun Start(): Unit

  @InterfaceMethod(12)
  public fun Stop(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPeerWatcher> {
    public override fun getValue() = ABI.makeIPeerWatcher(pointer.getPointer(0))

    public fun setValue(value: IPeerWatcher_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPeerWatcher {
    public val __1255187105_Ptr: Pointer?

    public val _1255187105_VtblPtr: Pointer?
      get() = __1255187105_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_Added(handler: TypedEventHandler<PeerWatcher?, PeerInformation?>?):
        EventRegistrationToken? {
      val fnPtr = _1255187105_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1255187105_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_Added(token: EventRegistrationToken?): Unit {
      val fnPtr = _1255187105_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1255187105_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_Removed(handler: TypedEventHandler<PeerWatcher?, PeerInformation?>?):
        EventRegistrationToken? {
      val fnPtr = _1255187105_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1255187105_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_Removed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1255187105_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1255187105_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_Updated(handler: TypedEventHandler<PeerWatcher?, PeerInformation?>?):
        EventRegistrationToken? {
      val fnPtr = _1255187105_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1255187105_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_Updated(token: EventRegistrationToken?): Unit {
      val fnPtr = _1255187105_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1255187105_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_EnumerationCompleted(handler: TypedEventHandler<PeerWatcher?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1255187105_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1255187105_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_EnumerationCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _1255187105_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1255187105_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_Stopped(handler: TypedEventHandler<PeerWatcher?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1255187105_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1255187105_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_Stopped(token: EventRegistrationToken?): Unit {
      val fnPtr = _1255187105_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1255187105_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_Status(): PeerWatcherStatus? {
      val fnPtr = _1255187105_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PeerWatcherStatus>()
      val hr = fn.invokeHR(arrayOf(__1255187105_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PeerWatcherStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun Start(): Unit {
      val fnPtr = _1255187105_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1255187105_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun Stop(): Unit {
      val fnPtr = _1255187105_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1255187105_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPeerWatcher_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1255187105_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPeerWatcher, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3cee21f82fa64679969103c94a420f34")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPeerWatcher(ptr: Pointer?): WithDefault = IPeerWatcher_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPeerWatcher {
      val address = segment.toRawLongValue()
      return makeIPeerWatcher(Pointer(address))
    }

    public override fun toNative(obj: IPeerWatcher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1255187105_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPeerWatcher): Array<IPeerWatcher?> = (elements as
        Array<IPeerWatcher?>).castToImpl<IPeerWatcher,IPeerWatcher_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPeerWatcher?> =
        arrayOfNulls<IPeerWatcher_Impl>(size) as Array<IPeerWatcher?>
  }
}
