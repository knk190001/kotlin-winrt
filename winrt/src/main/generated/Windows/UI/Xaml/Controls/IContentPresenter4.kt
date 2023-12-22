package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.CornerRadius
import Windows.UI.Xaml.HorizontalAlignment
import Windows.UI.Xaml.LineStackingStrategy
import Windows.UI.Xaml.Media.Brush
import Windows.UI.Xaml.TextWrapping
import Windows.UI.Xaml.Thickness
import Windows.UI.Xaml.VerticalAlignment
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IContentPresenter4.ABI::class)
@Signature("{997b1b17-3bf8-432b-8fd9-68c7bab21f9d}")
@Guid("997b1b173bf8432b8fd968c7bab21f9d")
@WinRTInterface("997b1b173bf8432b8fd968c7bab21f9d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentPresenter4.ByReference::class)
public interface IContentPresenter4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TextWrapping(): TextWrapping?

  @InterfaceMethod(1)
  public fun put_TextWrapping(value: TextWrapping?): Unit

  @InterfaceMethod(2)
  public fun get_MaxLines(): Int

  @InterfaceMethod(3)
  public fun put_MaxLines(value: Int): Unit

  @InterfaceMethod(4)
  public fun get_LineStackingStrategy(): LineStackingStrategy?

  @InterfaceMethod(5)
  public fun put_LineStackingStrategy(value: LineStackingStrategy?): Unit

  @InterfaceMethod(6)
  public fun get_LineHeight(): Double

  @InterfaceMethod(7)
  public fun put_LineHeight(value: Double): Unit

  @InterfaceMethod(8)
  public fun get_BorderBrush(): Brush?

  @InterfaceMethod(9)
  public fun put_BorderBrush(value: Brush?): Unit

  @InterfaceMethod(10)
  public fun get_BorderThickness(): Thickness?

  @InterfaceMethod(11)
  public fun put_BorderThickness(value: Thickness?): Unit

  @InterfaceMethod(12)
  public fun get_CornerRadius(): CornerRadius?

  @InterfaceMethod(13)
  public fun put_CornerRadius(value: CornerRadius?): Unit

  @InterfaceMethod(14)
  public fun get_Padding(): Thickness?

  @InterfaceMethod(15)
  public fun put_Padding(value: Thickness?): Unit

  @InterfaceMethod(16)
  public fun get_Background(): Brush?

  @InterfaceMethod(17)
  public fun put_Background(value: Brush?): Unit

  @InterfaceMethod(18)
  public fun get_HorizontalContentAlignment(): HorizontalAlignment?

  @InterfaceMethod(19)
  public fun put_HorizontalContentAlignment(value: HorizontalAlignment?): Unit

  @InterfaceMethod(20)
  public fun get_VerticalContentAlignment(): VerticalAlignment?

  @InterfaceMethod(21)
  public fun put_VerticalContentAlignment(value: VerticalAlignment?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentPresenter4> {
    public override fun getValue() = ABI.makeIContentPresenter4(pointer.getPointer(0))

    public fun setValue(value: IContentPresenter4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentPresenter4 {
    public val __1960411319_Ptr: Pointer?

    public val _1960411319_VtblPtr: Pointer?
      get() = __1960411319_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TextWrapping(): TextWrapping? {
      val fnPtr = _1960411319_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextWrapping>()
      val hr = fn.invokeHR(arrayOf(__1960411319_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextWrapping>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_TextWrapping(value: TextWrapping?): Unit {
      val fnPtr = _1960411319_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1960411319_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_MaxLines(): Int {
      val fnPtr = _1960411319_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1960411319_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_MaxLines(value: Int): Unit {
      val fnPtr = _1960411319_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1960411319_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_LineStackingStrategy(): LineStackingStrategy? {
      val fnPtr = _1960411319_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LineStackingStrategy>()
      val hr = fn.invokeHR(arrayOf(__1960411319_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LineStackingStrategy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_LineStackingStrategy(value: LineStackingStrategy?): Unit {
      val fnPtr = _1960411319_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1960411319_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_LineHeight(): Double {
      val fnPtr = _1960411319_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1960411319_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_LineHeight(value: Double): Unit {
      val fnPtr = _1960411319_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1960411319_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_BorderBrush(): Brush? {
      val fnPtr = _1960411319_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1960411319_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_BorderBrush(value: Brush?): Unit {
      val fnPtr = _1960411319_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1960411319_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_BorderThickness(): Thickness? {
      val fnPtr = _1960411319_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1960411319_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_BorderThickness(value: Thickness?): Unit {
      val fnPtr = _1960411319_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1960411319_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_CornerRadius(): CornerRadius? {
      val fnPtr = _1960411319_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CornerRadius>()
      val hr = fn.invokeHR(arrayOf(__1960411319_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CornerRadius>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_CornerRadius(value: CornerRadius?): Unit {
      val fnPtr = _1960411319_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1960411319_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_Padding(): Thickness? {
      val fnPtr = _1960411319_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1960411319_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_Padding(value: Thickness?): Unit {
      val fnPtr = _1960411319_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1960411319_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_Background(): Brush? {
      val fnPtr = _1960411319_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1960411319_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_Background(value: Brush?): Unit {
      val fnPtr = _1960411319_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1960411319_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_HorizontalContentAlignment(): HorizontalAlignment? {
      val fnPtr = _1960411319_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HorizontalAlignment>()
      val hr = fn.invokeHR(arrayOf(__1960411319_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HorizontalAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_HorizontalContentAlignment(value: HorizontalAlignment?): Unit {
      val fnPtr = _1960411319_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1960411319_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_VerticalContentAlignment(): VerticalAlignment? {
      val fnPtr = _1960411319_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VerticalAlignment>()
      val hr = fn.invokeHR(arrayOf(__1960411319_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VerticalAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_VerticalContentAlignment(value: VerticalAlignment?): Unit {
      val fnPtr = _1960411319_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1960411319_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContentPresenter4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1960411319_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentPresenter4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("997b1b173bf8432b8fd968c7bab21f9d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentPresenter4(ptr: Pointer?): WithDefault = IContentPresenter4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentPresenter4 {
      val address = segment.toRawLongValue()
      return makeIContentPresenter4(Pointer(address))
    }

    public override fun toNative(obj: IContentPresenter4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1960411319_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentPresenter4): Array<IContentPresenter4?> =
        (elements as
        Array<IContentPresenter4?>).castToImpl<IContentPresenter4,IContentPresenter4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentPresenter4?> =
        arrayOfNulls<IContentPresenter4_Impl>(size) as Array<IContentPresenter4?>
  }
}
