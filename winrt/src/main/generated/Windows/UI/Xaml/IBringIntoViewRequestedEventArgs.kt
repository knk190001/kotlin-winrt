package Windows.UI.Xaml

import Windows.Foundation.Rect
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

@ABIMarker(IBringIntoViewRequestedEventArgs.ABI::class)
@Signature("{0e629ec4-2206-4c8b-94ae-bdb66a4ebfd1}")
@Guid("0e629ec422064c8b94aebdb66a4ebfd1")
@WinRTInterface("0e629ec422064c8b94aebdb66a4ebfd1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBringIntoViewRequestedEventArgs.ByReference::class)
public interface IBringIntoViewRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TargetElement(): UIElement?

  @InterfaceMethod(1)
  public fun put_TargetElement(value: UIElement?): Unit

  @InterfaceMethod(2)
  public fun get_AnimationDesired(): Boolean

  @InterfaceMethod(3)
  public fun put_AnimationDesired(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_TargetRect(): Rect?

  @InterfaceMethod(5)
  public fun put_TargetRect(value: Rect?): Unit

  @InterfaceMethod(6)
  public fun get_HorizontalAlignmentRatio(): Double

  @InterfaceMethod(7)
  public fun get_VerticalAlignmentRatio(): Double

  @InterfaceMethod(8)
  public fun get_HorizontalOffset(): Double

  @InterfaceMethod(9)
  public fun put_HorizontalOffset(value: Double): Unit

  @InterfaceMethod(10)
  public fun get_VerticalOffset(): Double

  @InterfaceMethod(11)
  public fun put_VerticalOffset(value: Double): Unit

  @InterfaceMethod(12)
  public fun get_Handled(): Boolean

  @InterfaceMethod(13)
  public fun put_Handled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBringIntoViewRequestedEventArgs> {
    public override fun getValue() = ABI.makeIBringIntoViewRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IBringIntoViewRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBringIntoViewRequestedEventArgs {
    public val __690201454_Ptr: Pointer?

    public val _690201454_VtblPtr: Pointer?
      get() = __690201454_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TargetElement(): UIElement? {
      val fnPtr = _690201454_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__690201454_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_TargetElement(value: UIElement?): Unit {
      val fnPtr = _690201454_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__690201454_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_AnimationDesired(): Boolean {
      val fnPtr = _690201454_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__690201454_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_AnimationDesired(value: Boolean): Unit {
      val fnPtr = _690201454_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__690201454_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_TargetRect(): Rect? {
      val fnPtr = _690201454_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__690201454_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_TargetRect(value: Rect?): Unit {
      val fnPtr = _690201454_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__690201454_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_HorizontalAlignmentRatio(): Double {
      val fnPtr = _690201454_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__690201454_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_VerticalAlignmentRatio(): Double {
      val fnPtr = _690201454_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__690201454_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_HorizontalOffset(): Double {
      val fnPtr = _690201454_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__690201454_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_HorizontalOffset(value: Double): Unit {
      val fnPtr = _690201454_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__690201454_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_VerticalOffset(): Double {
      val fnPtr = _690201454_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__690201454_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_VerticalOffset(value: Double): Unit {
      val fnPtr = _690201454_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__690201454_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_Handled(): Boolean {
      val fnPtr = _690201454_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__690201454_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _690201454_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__690201454_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBringIntoViewRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __690201454_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBringIntoViewRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0e629ec422064c8b94aebdb66a4ebfd1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBringIntoViewRequestedEventArgs(ptr: Pointer?): WithDefault =
        IBringIntoViewRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBringIntoViewRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIBringIntoViewRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IBringIntoViewRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__690201454_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBringIntoViewRequestedEventArgs):
        Array<IBringIntoViewRequestedEventArgs?> = (elements as
        Array<IBringIntoViewRequestedEventArgs?>).castToImpl<IBringIntoViewRequestedEventArgs,IBringIntoViewRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBringIntoViewRequestedEventArgs?> =
        arrayOfNulls<IBringIntoViewRequestedEventArgs_Impl>(size) as
        Array<IBringIntoViewRequestedEventArgs?>
  }
}
