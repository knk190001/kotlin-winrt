package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.UIElement
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

@ABIMarker(IParallaxView.ABI::class)
@Signature("{6b84fcd4-4083-5b4b-bc40-d9204e19b41a}")
@Guid("6b84fcd440835b4bbc40d9204e19b41a")
@WinRTInterface("6b84fcd440835b4bbc40d9204e19b41a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IParallaxView.ByReference::class)
public interface IParallaxView : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Child(): UIElement?

  @InterfaceMethod(1)
  public fun put_Child(value: UIElement?): Unit

  @InterfaceMethod(2)
  public fun get_HorizontalShift(): Double

  @InterfaceMethod(3)
  public fun put_HorizontalShift(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_HorizontalSourceEndOffset(): Double

  @InterfaceMethod(5)
  public fun put_HorizontalSourceEndOffset(value: Double): Unit

  @InterfaceMethod(6)
  public fun get_HorizontalSourceOffsetKind(): ParallaxSourceOffsetKind?

  @InterfaceMethod(7)
  public fun put_HorizontalSourceOffsetKind(value: ParallaxSourceOffsetKind?): Unit

  @InterfaceMethod(8)
  public fun get_HorizontalSourceStartOffset(): Double

  @InterfaceMethod(9)
  public fun put_HorizontalSourceStartOffset(value: Double): Unit

  @InterfaceMethod(10)
  public fun get_IsHorizontalShiftClamped(): Boolean

  @InterfaceMethod(11)
  public fun put_IsHorizontalShiftClamped(value: Boolean): Unit

  @InterfaceMethod(12)
  public fun get_IsVerticalShiftClamped(): Boolean

  @InterfaceMethod(13)
  public fun put_IsVerticalShiftClamped(value: Boolean): Unit

  @InterfaceMethod(14)
  public fun get_MaxHorizontalShiftRatio(): Double

  @InterfaceMethod(15)
  public fun put_MaxHorizontalShiftRatio(value: Double): Unit

  @InterfaceMethod(16)
  public fun get_MaxVerticalShiftRatio(): Double

  @InterfaceMethod(17)
  public fun put_MaxVerticalShiftRatio(value: Double): Unit

  @InterfaceMethod(18)
  public fun get_Source(): UIElement?

  @InterfaceMethod(19)
  public fun put_Source(value: UIElement?): Unit

  @InterfaceMethod(20)
  public fun get_VerticalShift(): Double

  @InterfaceMethod(21)
  public fun put_VerticalShift(value: Double): Unit

  @InterfaceMethod(22)
  public fun get_VerticalSourceEndOffset(): Double

  @InterfaceMethod(23)
  public fun put_VerticalSourceEndOffset(value: Double): Unit

  @InterfaceMethod(24)
  public fun get_VerticalSourceOffsetKind(): ParallaxSourceOffsetKind?

  @InterfaceMethod(25)
  public fun put_VerticalSourceOffsetKind(value: ParallaxSourceOffsetKind?): Unit

  @InterfaceMethod(26)
  public fun get_VerticalSourceStartOffset(): Double

  @InterfaceMethod(27)
  public fun put_VerticalSourceStartOffset(value: Double): Unit

  @InterfaceMethod(28)
  public fun RefreshAutomaticHorizontalOffsets(): Unit

  @InterfaceMethod(29)
  public fun RefreshAutomaticVerticalOffsets(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IParallaxView>
      {
    public override fun getValue() = ABI.makeIParallaxView(pointer.getPointer(0))

    public fun setValue(value: IParallaxView_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IParallaxView {
    public val __527086856_Ptr: Pointer?

    public val _527086856_VtblPtr: Pointer?
      get() = __527086856_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Child(): UIElement? {
      val fnPtr = _527086856_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__527086856_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Child(value: UIElement?): Unit {
      val fnPtr = _527086856_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__527086856_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_HorizontalShift(): Double {
      val fnPtr = _527086856_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__527086856_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_HorizontalShift(value: Double): Unit {
      val fnPtr = _527086856_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__527086856_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_HorizontalSourceEndOffset(): Double {
      val fnPtr = _527086856_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__527086856_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_HorizontalSourceEndOffset(value: Double): Unit {
      val fnPtr = _527086856_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__527086856_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_HorizontalSourceOffsetKind(): ParallaxSourceOffsetKind? {
      val fnPtr = _527086856_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ParallaxSourceOffsetKind>()
      val hr = fn.invokeHR(arrayOf(__527086856_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ParallaxSourceOffsetKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_HorizontalSourceOffsetKind(value: ParallaxSourceOffsetKind?): Unit {
      val fnPtr = _527086856_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__527086856_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_HorizontalSourceStartOffset(): Double {
      val fnPtr = _527086856_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__527086856_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_HorizontalSourceStartOffset(value: Double): Unit {
      val fnPtr = _527086856_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__527086856_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_IsHorizontalShiftClamped(): Boolean {
      val fnPtr = _527086856_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__527086856_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_IsHorizontalShiftClamped(value: Boolean): Unit {
      val fnPtr = _527086856_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__527086856_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_IsVerticalShiftClamped(): Boolean {
      val fnPtr = _527086856_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__527086856_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_IsVerticalShiftClamped(value: Boolean): Unit {
      val fnPtr = _527086856_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__527086856_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_MaxHorizontalShiftRatio(): Double {
      val fnPtr = _527086856_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__527086856_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_MaxHorizontalShiftRatio(value: Double): Unit {
      val fnPtr = _527086856_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__527086856_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_MaxVerticalShiftRatio(): Double {
      val fnPtr = _527086856_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__527086856_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun put_MaxVerticalShiftRatio(value: Double): Unit {
      val fnPtr = _527086856_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__527086856_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_Source(): UIElement? {
      val fnPtr = _527086856_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__527086856_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_Source(value: UIElement?): Unit {
      val fnPtr = _527086856_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__527086856_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_VerticalShift(): Double {
      val fnPtr = _527086856_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__527086856_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(21)
    public override fun put_VerticalShift(value: Double): Unit {
      val fnPtr = _527086856_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__527086856_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_VerticalSourceEndOffset(): Double {
      val fnPtr = _527086856_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__527086856_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(23)
    public override fun put_VerticalSourceEndOffset(value: Double): Unit {
      val fnPtr = _527086856_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__527086856_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_VerticalSourceOffsetKind(): ParallaxSourceOffsetKind? {
      val fnPtr = _527086856_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ParallaxSourceOffsetKind>()
      val hr = fn.invokeHR(arrayOf(__527086856_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ParallaxSourceOffsetKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun put_VerticalSourceOffsetKind(value: ParallaxSourceOffsetKind?): Unit {
      val fnPtr = _527086856_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__527086856_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun get_VerticalSourceStartOffset(): Double {
      val fnPtr = _527086856_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__527086856_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(27)
    public override fun put_VerticalSourceStartOffset(value: Double): Unit {
      val fnPtr = _527086856_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__527086856_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun RefreshAutomaticHorizontalOffsets(): Unit {
      val fnPtr = _527086856_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__527086856_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(29)
    public override fun RefreshAutomaticVerticalOffsets(): Unit {
      val fnPtr = _527086856_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__527086856_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IParallaxView_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __527086856_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IParallaxView, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6b84fcd440835b4bbc40d9204e19b41a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIParallaxView(ptr: Pointer?): WithDefault = IParallaxView_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IParallaxView {
      val address = segment.toRawLongValue()
      return makeIParallaxView(Pointer(address))
    }

    public override fun toNative(obj: IParallaxView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__527086856_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IParallaxView): Array<IParallaxView?> = (elements as
        Array<IParallaxView?>).castToImpl<IParallaxView,IParallaxView_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IParallaxView?> =
        arrayOfNulls<IParallaxView_Impl>(size) as Array<IParallaxView?>
  }
}
