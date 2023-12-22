package Windows.Networking.ServiceDiscovery.Dnssd

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

@ABIMarker(IDnssdServiceWatcher.ABI::class)
@Signature("{cc34d9c1-db7d-4b69-983d-c6f83f205682}")
@Guid("cc34d9c1db7d4b69983dc6f83f205682")
@WinRTInterface("cc34d9c1db7d4b69983dc6f83f205682")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDnssdServiceWatcher.ByReference::class)
public interface IDnssdServiceWatcher : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_Added(handler: TypedEventHandler<DnssdServiceWatcher?, DnssdServiceInstance?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_Added(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_EnumerationCompleted(handler: TypedEventHandler<DnssdServiceWatcher?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_EnumerationCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_Stopped(handler: TypedEventHandler<DnssdServiceWatcher?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_Stopped(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun get_Status(): DnssdServiceWatcherStatus?

  @InterfaceMethod(7)
  public fun Start(): Unit

  @InterfaceMethod(8)
  public fun Stop(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDnssdServiceWatcher> {
    public override fun getValue() = ABI.makeIDnssdServiceWatcher(pointer.getPointer(0))

    public fun setValue(value: IDnssdServiceWatcher_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDnssdServiceWatcher {
    public val __335571566_Ptr: Pointer?

    public val _335571566_VtblPtr: Pointer?
      get() = __335571566_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_Added(handler: TypedEventHandler<DnssdServiceWatcher?,
        DnssdServiceInstance?>?): EventRegistrationToken? {
      val fnPtr = _335571566_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__335571566_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_Added(token: EventRegistrationToken?): Unit {
      val fnPtr = _335571566_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__335571566_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_EnumerationCompleted(handler: TypedEventHandler<DnssdServiceWatcher?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _335571566_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__335571566_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_EnumerationCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _335571566_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__335571566_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_Stopped(handler: TypedEventHandler<DnssdServiceWatcher?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _335571566_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__335571566_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_Stopped(token: EventRegistrationToken?): Unit {
      val fnPtr = _335571566_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__335571566_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Status(): DnssdServiceWatcherStatus? {
      val fnPtr = _335571566_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DnssdServiceWatcherStatus>()
      val hr = fn.invokeHR(arrayOf(__335571566_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DnssdServiceWatcherStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun Start(): Unit {
      val fnPtr = _335571566_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__335571566_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun Stop(): Unit {
      val fnPtr = _335571566_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__335571566_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDnssdServiceWatcher_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __335571566_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDnssdServiceWatcher, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cc34d9c1db7d4b69983dc6f83f205682")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDnssdServiceWatcher(ptr: Pointer?): WithDefault = IDnssdServiceWatcher_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDnssdServiceWatcher {
      val address = segment.toRawLongValue()
      return makeIDnssdServiceWatcher(Pointer(address))
    }

    public override fun toNative(obj: IDnssdServiceWatcher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__335571566_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDnssdServiceWatcher): Array<IDnssdServiceWatcher?> =
        (elements as
        Array<IDnssdServiceWatcher?>).castToImpl<IDnssdServiceWatcher,IDnssdServiceWatcher_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDnssdServiceWatcher?> =
        arrayOfNulls<IDnssdServiceWatcher_Impl>(size) as Array<IDnssdServiceWatcher?>
  }
}
