package Windows.Devices.Enumeration.Pnp

import Windows.Devices.Enumeration.DeviceWatcherStatus
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

@ABIMarker(IPnpObjectWatcher.ABI::class)
@Signature("{83c95ca8-4772-4a7a-aca8-e48c42a89c44}")
@Guid("83c95ca847724a7aaca8e48c42a89c44")
@WinRTInterface("83c95ca847724a7aaca8e48c42a89c44")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPnpObjectWatcher.ByReference::class)
public interface IPnpObjectWatcher : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_Added(handler: TypedEventHandler<PnpObjectWatcher?, PnpObject?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_Added(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_Updated(handler: TypedEventHandler<PnpObjectWatcher?, PnpObjectUpdate?>?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_Updated(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_Removed(handler: TypedEventHandler<PnpObjectWatcher?, PnpObjectUpdate?>?):
      EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_Removed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_EnumerationCompleted(handler: TypedEventHandler<PnpObjectWatcher?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_EnumerationCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_Stopped(handler: TypedEventHandler<PnpObjectWatcher?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_Stopped(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun get_Status(): DeviceWatcherStatus?

  @InterfaceMethod(11)
  public fun Start(): Unit

  @InterfaceMethod(12)
  public fun Stop(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPnpObjectWatcher> {
    public override fun getValue() = ABI.makeIPnpObjectWatcher(pointer.getPointer(0))

    public fun setValue(value: IPnpObjectWatcher_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPnpObjectWatcher {
    public val __826755749_Ptr: Pointer?

    public val _826755749_VtblPtr: Pointer?
      get() = __826755749_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_Added(handler: TypedEventHandler<PnpObjectWatcher?, PnpObject?>?):
        EventRegistrationToken? {
      val fnPtr = _826755749_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__826755749_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_Added(token: EventRegistrationToken?): Unit {
      val fnPtr = _826755749_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__826755749_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_Updated(handler: TypedEventHandler<PnpObjectWatcher?,
        PnpObjectUpdate?>?): EventRegistrationToken? {
      val fnPtr = _826755749_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__826755749_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_Updated(token: EventRegistrationToken?): Unit {
      val fnPtr = _826755749_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__826755749_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_Removed(handler: TypedEventHandler<PnpObjectWatcher?,
        PnpObjectUpdate?>?): EventRegistrationToken? {
      val fnPtr = _826755749_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__826755749_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_Removed(token: EventRegistrationToken?): Unit {
      val fnPtr = _826755749_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__826755749_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_EnumerationCompleted(handler: TypedEventHandler<PnpObjectWatcher?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _826755749_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__826755749_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_EnumerationCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _826755749_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__826755749_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_Stopped(handler: TypedEventHandler<PnpObjectWatcher?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _826755749_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__826755749_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_Stopped(token: EventRegistrationToken?): Unit {
      val fnPtr = _826755749_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__826755749_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_Status(): DeviceWatcherStatus? {
      val fnPtr = _826755749_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceWatcherStatus>()
      val hr = fn.invokeHR(arrayOf(__826755749_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceWatcherStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun Start(): Unit {
      val fnPtr = _826755749_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__826755749_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun Stop(): Unit {
      val fnPtr = _826755749_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__826755749_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPnpObjectWatcher_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __826755749_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPnpObjectWatcher, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("83c95ca847724a7aaca8e48c42a89c44")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPnpObjectWatcher(ptr: Pointer?): WithDefault = IPnpObjectWatcher_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPnpObjectWatcher {
      val address = segment.toRawLongValue()
      return makeIPnpObjectWatcher(Pointer(address))
    }

    public override fun toNative(obj: IPnpObjectWatcher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__826755749_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPnpObjectWatcher): Array<IPnpObjectWatcher?> = (elements
        as Array<IPnpObjectWatcher?>).castToImpl<IPnpObjectWatcher,IPnpObjectWatcher_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPnpObjectWatcher?> =
        arrayOfNulls<IPnpObjectWatcher_Impl>(size) as Array<IPnpObjectWatcher?>
  }
}
