package Microsoft.UI.Dispatching

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

@ABIMarker(IDispatcherQueue3.ABI::class)
@Signature("{14a7a175-5c27-5a35-b079-21960cf764a8}")
@Guid("14a7a1755c275a35b07921960cf764a8")
@WinRTInterface("14a7a1755c275a35b07921960cf764a8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDispatcherQueue3.ByReference::class)
public interface IDispatcherQueue3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun EnqueueEventLoopExit(): Unit

  @InterfaceMethod(1)
  public fun EnsureSystemDispatcherQueue(): Unit

  @InterfaceMethod(2)
  public fun RunEventLoop(): Unit

  @InterfaceMethod(3)
  public fun RunEventLoop(options: DispatcherRunOptions?, deferral: DispatcherExitDeferral?): Unit

  @InterfaceMethod(4)
  public fun add_FrameworkShutdownStarting(handler: TypedEventHandler<DispatcherQueue?,
      DispatcherQueueShutdownStartingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_FrameworkShutdownStarting(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_FrameworkShutdownCompleted(handler: TypedEventHandler<DispatcherQueue?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_FrameworkShutdownCompleted(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDispatcherQueue3> {
    public override fun getValue() = ABI.makeIDispatcherQueue3(pointer.getPointer(0))

    public fun setValue(value: IDispatcherQueue3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDispatcherQueue3 {
    public val __2029295908_Ptr: Pointer?

    public val _2029295908_VtblPtr: Pointer?
      get() = __2029295908_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun EnqueueEventLoopExit(): Unit {
      val fnPtr = _2029295908_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2029295908_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun EnsureSystemDispatcherQueue(): Unit {
      val fnPtr = _2029295908_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2029295908_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun RunEventLoop(): Unit {
      val fnPtr = _2029295908_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2029295908_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun RunEventLoop(options: DispatcherRunOptions?,
        deferral: DispatcherExitDeferral?): Unit {
      val fnPtr = _2029295908_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2029295908_Ptr, marshalToNative(options),
          marshalToNative(deferral),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_FrameworkShutdownStarting(handler: TypedEventHandler<DispatcherQueue?,
        DispatcherQueueShutdownStartingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2029295908_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2029295908_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_FrameworkShutdownStarting(token: EventRegistrationToken?): Unit {
      val fnPtr = _2029295908_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2029295908_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_FrameworkShutdownCompleted(handler: TypedEventHandler<DispatcherQueue?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _2029295908_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2029295908_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_FrameworkShutdownCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _2029295908_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2029295908_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDispatcherQueue3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2029295908_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDispatcherQueue3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("14a7a1755c275a35b07921960cf764a8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDispatcherQueue3(ptr: Pointer?): WithDefault = IDispatcherQueue3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDispatcherQueue3 {
      val address = segment.toRawLongValue()
      return makeIDispatcherQueue3(Pointer(address))
    }

    public override fun toNative(obj: IDispatcherQueue3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2029295908_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDispatcherQueue3): Array<IDispatcherQueue3?> = (elements
        as Array<IDispatcherQueue3?>).castToImpl<IDispatcherQueue3,IDispatcherQueue3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDispatcherQueue3?> =
        arrayOfNulls<IDispatcherQueue3_Impl>(size) as Array<IDispatcherQueue3?>
  }
}
