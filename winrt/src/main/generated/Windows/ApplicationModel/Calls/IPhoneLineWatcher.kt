package Windows.ApplicationModel.Calls

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

@ABIMarker(IPhoneLineWatcher.ABI::class)
@Signature("{8a45cd0a-6323-44e0-a6f6-9f21f64dc90a}")
@Guid("8a45cd0a632344e0a6f69f21f64dc90a")
@WinRTInterface("8a45cd0a632344e0a6f69f21f64dc90a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneLineWatcher.ByReference::class)
public interface IPhoneLineWatcher : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Start(): Unit

  @InterfaceMethod(1)
  public fun Stop(): Unit

  @InterfaceMethod(2)
  public fun add_LineAdded(handler: TypedEventHandler<PhoneLineWatcher?,
      PhoneLineWatcherEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_LineAdded(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_LineRemoved(handler: TypedEventHandler<PhoneLineWatcher?,
      PhoneLineWatcherEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_LineRemoved(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_LineUpdated(handler: TypedEventHandler<PhoneLineWatcher?,
      PhoneLineWatcherEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_LineUpdated(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_EnumerationCompleted(handler: TypedEventHandler<PhoneLineWatcher?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_EnumerationCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun add_Stopped(handler: TypedEventHandler<PhoneLineWatcher?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_Stopped(token: EventRegistrationToken?): Unit

  @InterfaceMethod(12)
  public fun get_Status(): PhoneLineWatcherStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneLineWatcher> {
    public override fun getValue() = ABI.makeIPhoneLineWatcher(pointer.getPointer(0))

    public fun setValue(value: IPhoneLineWatcher_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneLineWatcher {
    public val __438894424_Ptr: Pointer?

    public val _438894424_VtblPtr: Pointer?
      get() = __438894424_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Start(): Unit {
      val fnPtr = _438894424_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__438894424_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun Stop(): Unit {
      val fnPtr = _438894424_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__438894424_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_LineAdded(handler: TypedEventHandler<PhoneLineWatcher?,
        PhoneLineWatcherEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _438894424_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__438894424_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_LineAdded(token: EventRegistrationToken?): Unit {
      val fnPtr = _438894424_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__438894424_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_LineRemoved(handler: TypedEventHandler<PhoneLineWatcher?,
        PhoneLineWatcherEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _438894424_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__438894424_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_LineRemoved(token: EventRegistrationToken?): Unit {
      val fnPtr = _438894424_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__438894424_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_LineUpdated(handler: TypedEventHandler<PhoneLineWatcher?,
        PhoneLineWatcherEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _438894424_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__438894424_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_LineUpdated(token: EventRegistrationToken?): Unit {
      val fnPtr = _438894424_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__438894424_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_EnumerationCompleted(handler: TypedEventHandler<PhoneLineWatcher?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _438894424_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__438894424_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_EnumerationCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _438894424_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__438894424_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun add_Stopped(handler: TypedEventHandler<PhoneLineWatcher?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _438894424_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__438894424_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_Stopped(token: EventRegistrationToken?): Unit {
      val fnPtr = _438894424_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__438894424_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_Status(): PhoneLineWatcherStatus? {
      val fnPtr = _438894424_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneLineWatcherStatus>()
      val hr = fn.invokeHR(arrayOf(__438894424_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneLineWatcherStatus>(result.getValue())
      return resultValue
    }
  }

  public class IPhoneLineWatcher_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __438894424_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneLineWatcher, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8a45cd0a632344e0a6f69f21f64dc90a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneLineWatcher(ptr: Pointer?): WithDefault = IPhoneLineWatcher_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneLineWatcher {
      val address = segment.toRawLongValue()
      return makeIPhoneLineWatcher(Pointer(address))
    }

    public override fun toNative(obj: IPhoneLineWatcher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__438894424_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneLineWatcher): Array<IPhoneLineWatcher?> = (elements
        as Array<IPhoneLineWatcher?>).castToImpl<IPhoneLineWatcher,IPhoneLineWatcher_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneLineWatcher?> =
        arrayOfNulls<IPhoneLineWatcher_Impl>(size) as Array<IPhoneLineWatcher?>
  }
}
