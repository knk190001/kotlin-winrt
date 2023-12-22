package Windows.Devices.PointOfService

import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TimeSpan
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILineDisplayMarquee.ABI::class)
@Signature("{a3d33e3e-f46a-4b7a-bc21-53eb3b57f8b4}")
@Guid("a3d33e3ef46a4b7abc2153eb3b57f8b4")
@WinRTInterface("a3d33e3ef46a4b7abc2153eb3b57f8b4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILineDisplayMarquee.ByReference::class)
public interface ILineDisplayMarquee : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Format(): LineDisplayMarqueeFormat?

  @InterfaceMethod(1)
  public fun put_Format(value: LineDisplayMarqueeFormat?): Unit

  @InterfaceMethod(2)
  public fun get_RepeatWaitInterval(): TimeSpan?

  @InterfaceMethod(3)
  public fun put_RepeatWaitInterval(value: TimeSpan?): Unit

  @InterfaceMethod(4)
  public fun get_ScrollWaitInterval(): TimeSpan?

  @InterfaceMethod(5)
  public fun put_ScrollWaitInterval(value: TimeSpan?): Unit

  @InterfaceMethod(6)
  public fun TryStartScrollingAsync(direction: LineDisplayScrollDirection?):
      IAsyncOperation<Boolean>?

  @InterfaceMethod(7)
  public fun TryStopScrollingAsync(): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILineDisplayMarquee> {
    public override fun getValue() = ABI.makeILineDisplayMarquee(pointer.getPointer(0))

    public fun setValue(value: ILineDisplayMarquee_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILineDisplayMarquee {
    public val __407622797_Ptr: Pointer?

    public val _407622797_VtblPtr: Pointer?
      get() = __407622797_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Format(): LineDisplayMarqueeFormat? {
      val fnPtr = _407622797_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LineDisplayMarqueeFormat>()
      val hr = fn.invokeHR(arrayOf(__407622797_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LineDisplayMarqueeFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Format(value: LineDisplayMarqueeFormat?): Unit {
      val fnPtr = _407622797_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__407622797_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_RepeatWaitInterval(): TimeSpan? {
      val fnPtr = _407622797_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__407622797_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_RepeatWaitInterval(value: TimeSpan?): Unit {
      val fnPtr = _407622797_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__407622797_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ScrollWaitInterval(): TimeSpan? {
      val fnPtr = _407622797_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__407622797_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ScrollWaitInterval(value: TimeSpan?): Unit {
      val fnPtr = _407622797_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__407622797_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun TryStartScrollingAsync(direction: LineDisplayScrollDirection?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _407622797_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__407622797_Ptr, marshalToNative(direction), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun TryStopScrollingAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _407622797_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__407622797_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class ILineDisplayMarquee_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __407622797_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILineDisplayMarquee, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a3d33e3ef46a4b7abc2153eb3b57f8b4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILineDisplayMarquee(ptr: Pointer?): WithDefault = ILineDisplayMarquee_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILineDisplayMarquee {
      val address = segment.toRawLongValue()
      return makeILineDisplayMarquee(Pointer(address))
    }

    public override fun toNative(obj: ILineDisplayMarquee): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__407622797_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILineDisplayMarquee): Array<ILineDisplayMarquee?> =
        (elements as
        Array<ILineDisplayMarquee?>).castToImpl<ILineDisplayMarquee,ILineDisplayMarquee_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILineDisplayMarquee?> =
        arrayOfNulls<ILineDisplayMarquee_Impl>(size) as Array<ILineDisplayMarquee?>
  }
}
