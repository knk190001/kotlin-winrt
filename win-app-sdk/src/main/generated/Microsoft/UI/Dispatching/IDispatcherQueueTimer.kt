package Microsoft.UI.Dispatching

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TimeSpan
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDispatcherQueueTimer.ABI::class)
@Signature("{ad4d63fd-88fe-541f-ac11-bf2dc1ed2ce5}")
@Guid("ad4d63fd88fe541fac11bf2dc1ed2ce5")
@WinRTInterface("ad4d63fd88fe541fac11bf2dc1ed2ce5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDispatcherQueueTimer.ByReference::class)
public interface IDispatcherQueueTimer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Interval(): TimeSpan?

  @InterfaceMethod(1)
  public fun put_Interval(value: TimeSpan?): Unit

  @InterfaceMethod(2)
  public fun get_IsRunning(): Boolean

  @InterfaceMethod(3)
  public fun get_IsRepeating(): Boolean

  @InterfaceMethod(4)
  public fun put_IsRepeating(value: Boolean): Unit

  @InterfaceMethod(5)
  public fun Start(): Unit

  @InterfaceMethod(6)
  public fun Stop(): Unit

  @InterfaceMethod(7)
  public fun add_Tick(handler: TypedEventHandler<DispatcherQueueTimer?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_Tick(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDispatcherQueueTimer> {
    public override fun getValue() = ABI.makeIDispatcherQueueTimer(pointer.getPointer(0))

    public fun setValue(value: IDispatcherQueueTimer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDispatcherQueueTimer {
    public val __1325256598_Ptr: Pointer?

    public val _1325256598_VtblPtr: Pointer?
      get() = __1325256598_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Interval(): TimeSpan? {
      val fnPtr = _1325256598_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1325256598_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Interval(value: TimeSpan?): Unit {
      val fnPtr = _1325256598_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1325256598_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsRunning(): Boolean {
      val fnPtr = _1325256598_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1325256598_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsRepeating(): Boolean {
      val fnPtr = _1325256598_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1325256598_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_IsRepeating(value: Boolean): Unit {
      val fnPtr = _1325256598_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1325256598_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun Start(): Unit {
      val fnPtr = _1325256598_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1325256598_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun Stop(): Unit {
      val fnPtr = _1325256598_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1325256598_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun add_Tick(handler: TypedEventHandler<DispatcherQueueTimer?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1325256598_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1325256598_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_Tick(token: EventRegistrationToken?): Unit {
      val fnPtr = _1325256598_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1325256598_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDispatcherQueueTimer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1325256598_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDispatcherQueueTimer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ad4d63fd88fe541fac11bf2dc1ed2ce5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDispatcherQueueTimer(ptr: Pointer?): WithDefault =
        IDispatcherQueueTimer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDispatcherQueueTimer {
      val address = segment.toRawLongValue()
      return makeIDispatcherQueueTimer(Pointer(address))
    }

    public override fun toNative(obj: IDispatcherQueueTimer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1325256598_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDispatcherQueueTimer): Array<IDispatcherQueueTimer?> =
        (elements as
        Array<IDispatcherQueueTimer?>).castToImpl<IDispatcherQueueTimer,IDispatcherQueueTimer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDispatcherQueueTimer?> =
        arrayOfNulls<IDispatcherQueueTimer_Impl>(size) as Array<IDispatcherQueueTimer?>
  }
}
