package Windows.Networking.NetworkOperators

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

@ABIMarker(IESimWatcher.ABI::class)
@Signature("{c1f84ceb-a28d-4fbf-9771-6e31b81ccf22}")
@Guid("c1f84ceba28d4fbf97716e31b81ccf22")
@WinRTInterface("c1f84ceba28d4fbf97716e31b81ccf22")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IESimWatcher.ByReference::class)
public interface IESimWatcher : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): ESimWatcherStatus?

  @InterfaceMethod(1)
  public fun Start(): Unit

  @InterfaceMethod(2)
  public fun Stop(): Unit

  @InterfaceMethod(3)
  public fun add_Added(handler: TypedEventHandler<ESimWatcher?, ESimAddedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_Added(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun add_EnumerationCompleted(handler: TypedEventHandler<ESimWatcher?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_EnumerationCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(7)
  public fun add_Removed(handler: TypedEventHandler<ESimWatcher?, ESimRemovedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_Removed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(9)
  public fun add_Stopped(handler: TypedEventHandler<ESimWatcher?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_Stopped(token: EventRegistrationToken?): Unit

  @InterfaceMethod(11)
  public fun add_Updated(handler: TypedEventHandler<ESimWatcher?, ESimUpdatedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(12)
  public fun remove_Updated(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IESimWatcher> {
    public override fun getValue() = ABI.makeIESimWatcher(pointer.getPointer(0))

    public fun setValue(value: IESimWatcher_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IESimWatcher {
    public val __721981329_Ptr: Pointer?

    public val _721981329_VtblPtr: Pointer?
      get() = __721981329_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): ESimWatcherStatus? {
      val fnPtr = _721981329_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ESimWatcherStatus>()
      val hr = fn.invokeHR(arrayOf(__721981329_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ESimWatcherStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Start(): Unit {
      val fnPtr = _721981329_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__721981329_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun Stop(): Unit {
      val fnPtr = _721981329_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__721981329_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun add_Added(handler: TypedEventHandler<ESimWatcher?, ESimAddedEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _721981329_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__721981329_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_Added(token: EventRegistrationToken?): Unit {
      val fnPtr = _721981329_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__721981329_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun add_EnumerationCompleted(handler: TypedEventHandler<ESimWatcher?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _721981329_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__721981329_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_EnumerationCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _721981329_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__721981329_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun add_Removed(handler: TypedEventHandler<ESimWatcher?,
        ESimRemovedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _721981329_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__721981329_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_Removed(token: EventRegistrationToken?): Unit {
      val fnPtr = _721981329_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__721981329_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun add_Stopped(handler: TypedEventHandler<ESimWatcher?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _721981329_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__721981329_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_Stopped(token: EventRegistrationToken?): Unit {
      val fnPtr = _721981329_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__721981329_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun add_Updated(handler: TypedEventHandler<ESimWatcher?,
        ESimUpdatedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _721981329_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__721981329_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun remove_Updated(token: EventRegistrationToken?): Unit {
      val fnPtr = _721981329_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__721981329_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IESimWatcher_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __721981329_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IESimWatcher, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c1f84ceba28d4fbf97716e31b81ccf22")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIESimWatcher(ptr: Pointer?): WithDefault = IESimWatcher_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IESimWatcher {
      val address = segment.toRawLongValue()
      return makeIESimWatcher(Pointer(address))
    }

    public override fun toNative(obj: IESimWatcher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__721981329_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IESimWatcher): Array<IESimWatcher?> = (elements as
        Array<IESimWatcher?>).castToImpl<IESimWatcher,IESimWatcher_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IESimWatcher?> =
        arrayOfNulls<IESimWatcher_Impl>(size) as Array<IESimWatcher?>
  }
}
