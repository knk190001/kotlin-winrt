package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DragEventArgs
import Windows.UI.Xaml.Input.DoubleTappedRoutedEventArgs
import Windows.UI.Xaml.Input.HoldingRoutedEventArgs
import Windows.UI.Xaml.Input.KeyRoutedEventArgs
import Windows.UI.Xaml.Input.ManipulationCompletedRoutedEventArgs
import Windows.UI.Xaml.Input.ManipulationDeltaRoutedEventArgs
import Windows.UI.Xaml.Input.ManipulationInertiaStartingRoutedEventArgs
import Windows.UI.Xaml.Input.ManipulationStartedRoutedEventArgs
import Windows.UI.Xaml.Input.ManipulationStartingRoutedEventArgs
import Windows.UI.Xaml.Input.PointerRoutedEventArgs
import Windows.UI.Xaml.Input.RightTappedRoutedEventArgs
import Windows.UI.Xaml.Input.TappedRoutedEventArgs
import Windows.UI.Xaml.RoutedEventArgs
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IControlOverrides.ABI::class)
@Signature("{a09691df-9824-41fe-b530-b0d8990e64c1}")
@Guid("a09691df982441feb530b0d8990e64c1")
@WinRTInterface("a09691df982441feb530b0d8990e64c1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IControlOverrides.ByReference::class)
public interface IControlOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OnPointerEntered(e: PointerRoutedEventArgs?): Unit

  @InterfaceMethod(1)
  public fun OnPointerPressed(e: PointerRoutedEventArgs?): Unit

  @InterfaceMethod(2)
  public fun OnPointerMoved(e: PointerRoutedEventArgs?): Unit

  @InterfaceMethod(3)
  public fun OnPointerReleased(e: PointerRoutedEventArgs?): Unit

  @InterfaceMethod(4)
  public fun OnPointerExited(e: PointerRoutedEventArgs?): Unit

  @InterfaceMethod(5)
  public fun OnPointerCaptureLost(e: PointerRoutedEventArgs?): Unit

  @InterfaceMethod(6)
  public fun OnPointerCanceled(e: PointerRoutedEventArgs?): Unit

  @InterfaceMethod(7)
  public fun OnPointerWheelChanged(e: PointerRoutedEventArgs?): Unit

  @InterfaceMethod(8)
  public fun OnTapped(e: TappedRoutedEventArgs?): Unit

  @InterfaceMethod(9)
  public fun OnDoubleTapped(e: DoubleTappedRoutedEventArgs?): Unit

  @InterfaceMethod(10)
  public fun OnHolding(e: HoldingRoutedEventArgs?): Unit

  @InterfaceMethod(11)
  public fun OnRightTapped(e: RightTappedRoutedEventArgs?): Unit

  @InterfaceMethod(12)
  public fun OnManipulationStarting(e: ManipulationStartingRoutedEventArgs?): Unit

  @InterfaceMethod(13)
  public fun OnManipulationInertiaStarting(e: ManipulationInertiaStartingRoutedEventArgs?): Unit

  @InterfaceMethod(14)
  public fun OnManipulationStarted(e: ManipulationStartedRoutedEventArgs?): Unit

  @InterfaceMethod(15)
  public fun OnManipulationDelta(e: ManipulationDeltaRoutedEventArgs?): Unit

  @InterfaceMethod(16)
  public fun OnManipulationCompleted(e: ManipulationCompletedRoutedEventArgs?): Unit

  @InterfaceMethod(17)
  public fun OnKeyUp(e: KeyRoutedEventArgs?): Unit

  @InterfaceMethod(18)
  public fun OnKeyDown(e: KeyRoutedEventArgs?): Unit

  @InterfaceMethod(19)
  public fun OnGotFocus(e: RoutedEventArgs?): Unit

  @InterfaceMethod(20)
  public fun OnLostFocus(e: RoutedEventArgs?): Unit

  @InterfaceMethod(21)
  public fun OnDragEnter(e: DragEventArgs?): Unit

  @InterfaceMethod(22)
  public fun OnDragLeave(e: DragEventArgs?): Unit

  @InterfaceMethod(23)
  public fun OnDragOver(e: DragEventArgs?): Unit

  @InterfaceMethod(24)
  public fun OnDrop(e: DragEventArgs?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IControlOverrides> {
    public override fun getValue() = ABI.makeIControlOverrides(pointer.getPointer(0))

    public fun setValue(value: IControlOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IControlOverrides {
    public val __1007777126_Ptr: Pointer?

    public val _1007777126_VtblPtr: Pointer?
      get() = __1007777126_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OnPointerEntered(e: PointerRoutedEventArgs?): Unit {
      val fnPtr = _1007777126_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1007777126_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun OnPointerPressed(e: PointerRoutedEventArgs?): Unit {
      val fnPtr = _1007777126_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1007777126_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun OnPointerMoved(e: PointerRoutedEventArgs?): Unit {
      val fnPtr = _1007777126_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1007777126_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun OnPointerReleased(e: PointerRoutedEventArgs?): Unit {
      val fnPtr = _1007777126_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1007777126_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun OnPointerExited(e: PointerRoutedEventArgs?): Unit {
      val fnPtr = _1007777126_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1007777126_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun OnPointerCaptureLost(e: PointerRoutedEventArgs?): Unit {
      val fnPtr = _1007777126_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1007777126_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun OnPointerCanceled(e: PointerRoutedEventArgs?): Unit {
      val fnPtr = _1007777126_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1007777126_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun OnPointerWheelChanged(e: PointerRoutedEventArgs?): Unit {
      val fnPtr = _1007777126_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1007777126_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun OnTapped(e: TappedRoutedEventArgs?): Unit {
      val fnPtr = _1007777126_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1007777126_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun OnDoubleTapped(e: DoubleTappedRoutedEventArgs?): Unit {
      val fnPtr = _1007777126_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1007777126_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun OnHolding(e: HoldingRoutedEventArgs?): Unit {
      val fnPtr = _1007777126_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1007777126_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun OnRightTapped(e: RightTappedRoutedEventArgs?): Unit {
      val fnPtr = _1007777126_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1007777126_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun OnManipulationStarting(e: ManipulationStartingRoutedEventArgs?): Unit {
      val fnPtr = _1007777126_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1007777126_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override
        fun OnManipulationInertiaStarting(e: ManipulationInertiaStartingRoutedEventArgs?): Unit {
      val fnPtr = _1007777126_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1007777126_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun OnManipulationStarted(e: ManipulationStartedRoutedEventArgs?): Unit {
      val fnPtr = _1007777126_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1007777126_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun OnManipulationDelta(e: ManipulationDeltaRoutedEventArgs?): Unit {
      val fnPtr = _1007777126_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1007777126_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun OnManipulationCompleted(e: ManipulationCompletedRoutedEventArgs?): Unit {
      val fnPtr = _1007777126_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1007777126_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun OnKeyUp(e: KeyRoutedEventArgs?): Unit {
      val fnPtr = _1007777126_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1007777126_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun OnKeyDown(e: KeyRoutedEventArgs?): Unit {
      val fnPtr = _1007777126_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1007777126_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun OnGotFocus(e: RoutedEventArgs?): Unit {
      val fnPtr = _1007777126_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1007777126_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun OnLostFocus(e: RoutedEventArgs?): Unit {
      val fnPtr = _1007777126_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1007777126_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun OnDragEnter(e: DragEventArgs?): Unit {
      val fnPtr = _1007777126_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1007777126_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun OnDragLeave(e: DragEventArgs?): Unit {
      val fnPtr = _1007777126_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1007777126_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun OnDragOver(e: DragEventArgs?): Unit {
      val fnPtr = _1007777126_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1007777126_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun OnDrop(e: DragEventArgs?): Unit {
      val fnPtr = _1007777126_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1007777126_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IControlOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1007777126_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IControlOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a09691df982441feb530b0d8990e64c1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIControlOverrides(ptr: Pointer?): WithDefault = IControlOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IControlOverrides {
      val address = segment.toRawLongValue()
      return makeIControlOverrides(Pointer(address))
    }

    public override fun toNative(obj: IControlOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1007777126_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IControlOverrides): Array<IControlOverrides?> = (elements
        as Array<IControlOverrides?>).castToImpl<IControlOverrides,IControlOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IControlOverrides?> =
        arrayOfNulls<IControlOverrides_Impl>(size) as Array<IControlOverrides?>
  }
}
