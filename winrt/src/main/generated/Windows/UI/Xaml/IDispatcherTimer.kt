package Windows.UI.Xaml

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TimeSpan
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDispatcherTimer.ABI::class)
@Signature("{d160ce46-cd22-4f5f-8c97-40e61da3e2dc}")
@Guid("d160ce46cd224f5f8c9740e61da3e2dc")
@WinRTInterface("d160ce46cd224f5f8c9740e61da3e2dc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDispatcherTimer.ByReference::class)
public interface IDispatcherTimer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Interval(): TimeSpan?

  @InterfaceMethod(1)
  public fun put_Interval(value: TimeSpan?): Unit

  @InterfaceMethod(2)
  public fun get_IsEnabled(): Boolean

  @InterfaceMethod(3)
  public fun add_Tick(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_Tick(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun Start(): Unit

  @InterfaceMethod(6)
  public fun Stop(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDispatcherTimer> {
    public override fun getValue() = ABI.makeIDispatcherTimer(pointer.getPointer(0))

    public fun setValue(value: IDispatcherTimer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDispatcherTimer {
    public val __1063708596_Ptr: Pointer?

    public val _1063708596_VtblPtr: Pointer?
      get() = __1063708596_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Interval(): TimeSpan? {
      val fnPtr = _1063708596_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1063708596_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Interval(value: TimeSpan?): Unit {
      val fnPtr = _1063708596_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1063708596_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsEnabled(): Boolean {
      val fnPtr = _1063708596_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1063708596_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun add_Tick(handler: EventHandler<IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1063708596_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1063708596_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_Tick(token: EventRegistrationToken?): Unit {
      val fnPtr = _1063708596_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1063708596_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun Start(): Unit {
      val fnPtr = _1063708596_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1063708596_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun Stop(): Unit {
      val fnPtr = _1063708596_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1063708596_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDispatcherTimer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1063708596_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDispatcherTimer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d160ce46cd224f5f8c9740e61da3e2dc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDispatcherTimer(ptr: Pointer?): WithDefault = IDispatcherTimer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDispatcherTimer {
      val address = segment.toRawLongValue()
      return makeIDispatcherTimer(Pointer(address))
    }

    public override fun toNative(obj: IDispatcherTimer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1063708596_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDispatcherTimer): Array<IDispatcherTimer?> = (elements as
        Array<IDispatcherTimer?>).castToImpl<IDispatcherTimer,IDispatcherTimer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDispatcherTimer?> =
        arrayOfNulls<IDispatcherTimer_Impl>(size) as Array<IDispatcherTimer?>
  }
}
