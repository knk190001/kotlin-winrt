package Windows.UI.Xaml.Controls.Primitives

import Windows.Foundation.Rect
import Windows.UI.Xaml.UIElement
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICarouselPanel.ABI::class)
@Signature("{deab78b2-373b-4151-8785-e544d0d9362b}")
@Guid("deab78b2373b41518785e544d0d9362b")
@WinRTInterface("deab78b2373b41518785e544d0d9362b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICarouselPanel.ByReference::class)
public interface ICarouselPanel : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CanVerticallyScroll(): Boolean

  @InterfaceMethod(1)
  public fun put_CanVerticallyScroll(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_CanHorizontallyScroll(): Boolean

  @InterfaceMethod(3)
  public fun put_CanHorizontallyScroll(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_ExtentWidth(): Double

  @InterfaceMethod(5)
  public fun get_ExtentHeight(): Double

  @InterfaceMethod(6)
  public fun get_ViewportWidth(): Double

  @InterfaceMethod(7)
  public fun get_ViewportHeight(): Double

  @InterfaceMethod(8)
  public fun get_HorizontalOffset(): Double

  @InterfaceMethod(9)
  public fun get_VerticalOffset(): Double

  @InterfaceMethod(10)
  public fun get_ScrollOwner(): IUnknown?

  @InterfaceMethod(11)
  public fun put_ScrollOwner(value: IUnknown?): Unit

  @InterfaceMethod(12)
  public fun LineUp(): Unit

  @InterfaceMethod(13)
  public fun LineDown(): Unit

  @InterfaceMethod(14)
  public fun LineLeft(): Unit

  @InterfaceMethod(15)
  public fun LineRight(): Unit

  @InterfaceMethod(16)
  public fun PageUp(): Unit

  @InterfaceMethod(17)
  public fun PageDown(): Unit

  @InterfaceMethod(18)
  public fun PageLeft(): Unit

  @InterfaceMethod(19)
  public fun PageRight(): Unit

  @InterfaceMethod(20)
  public fun MouseWheelUp(): Unit

  @InterfaceMethod(21)
  public fun MouseWheelDown(): Unit

  @InterfaceMethod(22)
  public fun MouseWheelLeft(): Unit

  @InterfaceMethod(23)
  public fun MouseWheelRight(): Unit

  @InterfaceMethod(24)
  public fun SetHorizontalOffset(offset: Double): Unit

  @InterfaceMethod(25)
  public fun SetVerticalOffset(offset: Double): Unit

  @InterfaceMethod(26)
  public fun MakeVisible(visual: UIElement?, rectangle: Rect?): Rect?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICarouselPanel>
      {
    public override fun getValue() = ABI.makeICarouselPanel(pointer.getPointer(0))

    public fun setValue(value: ICarouselPanel_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICarouselPanel {
    public val __1788497704_Ptr: Pointer?

    public val _1788497704_VtblPtr: Pointer?
      get() = __1788497704_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CanVerticallyScroll(): Boolean {
      val fnPtr = _1788497704_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1788497704_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_CanVerticallyScroll(value: Boolean): Unit {
      val fnPtr = _1788497704_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1788497704_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CanHorizontallyScroll(): Boolean {
      val fnPtr = _1788497704_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1788497704_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_CanHorizontallyScroll(value: Boolean): Unit {
      val fnPtr = _1788497704_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1788497704_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ExtentWidth(): Double {
      val fnPtr = _1788497704_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1788497704_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_ExtentHeight(): Double {
      val fnPtr = _1788497704_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1788497704_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_ViewportWidth(): Double {
      val fnPtr = _1788497704_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1788497704_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_ViewportHeight(): Double {
      val fnPtr = _1788497704_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1788497704_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_HorizontalOffset(): Double {
      val fnPtr = _1788497704_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1788497704_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_VerticalOffset(): Double {
      val fnPtr = _1788497704_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1788497704_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun get_ScrollOwner(): IUnknown? {
      val fnPtr = _1788497704_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1788497704_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_ScrollOwner(value: IUnknown?): Unit {
      val fnPtr = _1788497704_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1788497704_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun LineUp(): Unit {
      val fnPtr = _1788497704_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1788497704_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun LineDown(): Unit {
      val fnPtr = _1788497704_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1788497704_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun LineLeft(): Unit {
      val fnPtr = _1788497704_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1788497704_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun LineRight(): Unit {
      val fnPtr = _1788497704_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1788497704_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun PageUp(): Unit {
      val fnPtr = _1788497704_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1788497704_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun PageDown(): Unit {
      val fnPtr = _1788497704_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1788497704_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun PageLeft(): Unit {
      val fnPtr = _1788497704_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1788497704_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun PageRight(): Unit {
      val fnPtr = _1788497704_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1788497704_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun MouseWheelUp(): Unit {
      val fnPtr = _1788497704_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1788497704_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun MouseWheelDown(): Unit {
      val fnPtr = _1788497704_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1788497704_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun MouseWheelLeft(): Unit {
      val fnPtr = _1788497704_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1788497704_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun MouseWheelRight(): Unit {
      val fnPtr = _1788497704_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1788497704_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun SetHorizontalOffset(offset: Double): Unit {
      val fnPtr = _1788497704_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1788497704_Ptr, offset,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(25)
    public override fun SetVerticalOffset(offset: Double): Unit {
      val fnPtr = _1788497704_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1788497704_Ptr, offset,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun MakeVisible(visual: UIElement?, rectangle: Rect?): Rect? {
      val fnPtr = _1788497704_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__1788497704_Ptr, marshalToNative(visual),
          marshalToNative(rectangle), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }
  }

  public class ICarouselPanel_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1788497704_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICarouselPanel, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("deab78b2373b41518785e544d0d9362b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICarouselPanel(ptr: Pointer?): WithDefault = ICarouselPanel_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICarouselPanel {
      val address = segment.toRawLongValue()
      return makeICarouselPanel(Pointer(address))
    }

    public override fun toNative(obj: ICarouselPanel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1788497704_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICarouselPanel): Array<ICarouselPanel?> = (elements as
        Array<ICarouselPanel?>).castToImpl<ICarouselPanel,ICarouselPanel_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICarouselPanel?> =
        arrayOfNulls<ICarouselPanel_Impl>(size) as Array<ICarouselPanel?>
  }
}
