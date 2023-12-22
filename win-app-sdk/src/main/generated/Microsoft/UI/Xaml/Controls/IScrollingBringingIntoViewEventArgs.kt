package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.BringIntoViewRequestedEventArgs
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IScrollingBringingIntoViewEventArgs.ABI::class)
@Signature("{09760d99-d60c-5c76-8033-127b2085358c}")
@Guid("09760d99d60c5c768033127b2085358c")
@WinRTInterface("09760d99d60c5c768033127b2085358c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollingBringingIntoViewEventArgs.ByReference::class)
public interface IScrollingBringingIntoViewEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SnapPointsMode(): ScrollingSnapPointsMode?

  @InterfaceMethod(1)
  public fun put_SnapPointsMode(value: ScrollingSnapPointsMode?): Unit

  @InterfaceMethod(2)
  public fun get_RequestEventArgs(): BringIntoViewRequestedEventArgs?

  @InterfaceMethod(3)
  public fun get_TargetHorizontalOffset(): Double

  @InterfaceMethod(4)
  public fun get_TargetVerticalOffset(): Double

  @InterfaceMethod(5)
  public fun get_CorrelationId(): Int

  @InterfaceMethod(6)
  public fun get_Cancel(): Boolean

  @InterfaceMethod(7)
  public fun put_Cancel(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollingBringingIntoViewEventArgs> {
    public override fun getValue() =
        ABI.makeIScrollingBringingIntoViewEventArgs(pointer.getPointer(0))

    public fun setValue(value: IScrollingBringingIntoViewEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollingBringingIntoViewEventArgs {
    public val __1849797460_Ptr: Pointer?

    public val _1849797460_VtblPtr: Pointer?
      get() = __1849797460_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SnapPointsMode(): ScrollingSnapPointsMode? {
      val fnPtr = _1849797460_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollingSnapPointsMode>()
      val hr = fn.invokeHR(arrayOf(__1849797460_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollingSnapPointsMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_SnapPointsMode(value: ScrollingSnapPointsMode?): Unit {
      val fnPtr = _1849797460_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1849797460_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_RequestEventArgs(): BringIntoViewRequestedEventArgs? {
      val fnPtr = _1849797460_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BringIntoViewRequestedEventArgs>()
      val hr = fn.invokeHR(arrayOf(__1849797460_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BringIntoViewRequestedEventArgs>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_TargetHorizontalOffset(): Double {
      val fnPtr = _1849797460_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1849797460_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_TargetVerticalOffset(): Double {
      val fnPtr = _1849797460_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1849797460_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_CorrelationId(): Int {
      val fnPtr = _1849797460_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1849797460_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_Cancel(): Boolean {
      val fnPtr = _1849797460_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1849797460_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_Cancel(value: Boolean): Unit {
      val fnPtr = _1849797460_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1849797460_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IScrollingBringingIntoViewEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1849797460_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollingBringingIntoViewEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("09760d99d60c5c768033127b2085358c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollingBringingIntoViewEventArgs(ptr: Pointer?): WithDefault =
        IScrollingBringingIntoViewEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollingBringingIntoViewEventArgs {
      val address = segment.toRawLongValue()
      return makeIScrollingBringingIntoViewEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IScrollingBringingIntoViewEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1849797460_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollingBringingIntoViewEventArgs):
        Array<IScrollingBringingIntoViewEventArgs?> = (elements as
        Array<IScrollingBringingIntoViewEventArgs?>).castToImpl<IScrollingBringingIntoViewEventArgs,IScrollingBringingIntoViewEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollingBringingIntoViewEventArgs?> =
        arrayOfNulls<IScrollingBringingIntoViewEventArgs_Impl>(size) as
        Array<IScrollingBringingIntoViewEventArgs?>
  }
}
