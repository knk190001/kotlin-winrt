package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.BrushTransition
import Microsoft.UI.Xaml.CornerRadius
import Microsoft.UI.Xaml.Media.Animation.TransitionCollection
import Microsoft.UI.Xaml.Media.Brush
import Microsoft.UI.Xaml.Thickness
import Microsoft.UI.Xaml.UIElement
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

@ABIMarker(IBorder.ABI::class)
@Signature("{1ca13b47-ff5c-5abc-a411-a177df9482a9}")
@Guid("1ca13b47ff5c5abca411a177df9482a9")
@WinRTInterface("1ca13b47ff5c5abca411a177df9482a9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBorder.ByReference::class)
public interface IBorder : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BorderBrush(): Brush?

  @InterfaceMethod(1)
  public fun put_BorderBrush(value: Brush?): Unit

  @InterfaceMethod(2)
  public fun get_BorderThickness(): Thickness?

  @InterfaceMethod(3)
  public fun put_BorderThickness(value: Thickness?): Unit

  @InterfaceMethod(4)
  public fun get_Background(): Brush?

  @InterfaceMethod(5)
  public fun put_Background(value: Brush?): Unit

  @InterfaceMethod(6)
  public fun get_BackgroundSizing(): BackgroundSizing?

  @InterfaceMethod(7)
  public fun put_BackgroundSizing(value: BackgroundSizing?): Unit

  @InterfaceMethod(8)
  public fun get_CornerRadius(): CornerRadius?

  @InterfaceMethod(9)
  public fun put_CornerRadius(value: CornerRadius?): Unit

  @InterfaceMethod(10)
  public fun get_Padding(): Thickness?

  @InterfaceMethod(11)
  public fun put_Padding(value: Thickness?): Unit

  @InterfaceMethod(12)
  public fun get_Child(): UIElement?

  @InterfaceMethod(13)
  public fun put_Child(value: UIElement?): Unit

  @InterfaceMethod(14)
  public fun get_ChildTransitions(): TransitionCollection?

  @InterfaceMethod(15)
  public fun put_ChildTransitions(value: TransitionCollection?): Unit

  @InterfaceMethod(16)
  public fun get_BackgroundTransition(): BrushTransition?

  @InterfaceMethod(17)
  public fun put_BackgroundTransition(value: BrushTransition?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IBorder> {
    public override fun getValue() = ABI.makeIBorder(pointer.getPointer(0))

    public fun setValue(value: IBorder_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBorder {
    public val __1878954163_Ptr: Pointer?

    public val _1878954163_VtblPtr: Pointer?
      get() = __1878954163_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BorderBrush(): Brush? {
      val fnPtr = _1878954163_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1878954163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_BorderBrush(value: Brush?): Unit {
      val fnPtr = _1878954163_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1878954163_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_BorderThickness(): Thickness? {
      val fnPtr = _1878954163_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1878954163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_BorderThickness(value: Thickness?): Unit {
      val fnPtr = _1878954163_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1878954163_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Background(): Brush? {
      val fnPtr = _1878954163_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1878954163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Background(value: Brush?): Unit {
      val fnPtr = _1878954163_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1878954163_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_BackgroundSizing(): BackgroundSizing? {
      val fnPtr = _1878954163_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BackgroundSizing>()
      val hr = fn.invokeHR(arrayOf(__1878954163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BackgroundSizing>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_BackgroundSizing(value: BackgroundSizing?): Unit {
      val fnPtr = _1878954163_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1878954163_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_CornerRadius(): CornerRadius? {
      val fnPtr = _1878954163_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CornerRadius>()
      val hr = fn.invokeHR(arrayOf(__1878954163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CornerRadius>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_CornerRadius(value: CornerRadius?): Unit {
      val fnPtr = _1878954163_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1878954163_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_Padding(): Thickness? {
      val fnPtr = _1878954163_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1878954163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_Padding(value: Thickness?): Unit {
      val fnPtr = _1878954163_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1878954163_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_Child(): UIElement? {
      val fnPtr = _1878954163_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__1878954163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_Child(value: UIElement?): Unit {
      val fnPtr = _1878954163_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1878954163_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_ChildTransitions(): TransitionCollection? {
      val fnPtr = _1878954163_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TransitionCollection>()
      val hr = fn.invokeHR(arrayOf(__1878954163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TransitionCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_ChildTransitions(value: TransitionCollection?): Unit {
      val fnPtr = _1878954163_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1878954163_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_BackgroundTransition(): BrushTransition? {
      val fnPtr = _1878954163_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BrushTransition>()
      val hr = fn.invokeHR(arrayOf(__1878954163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BrushTransition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_BackgroundTransition(value: BrushTransition?): Unit {
      val fnPtr = _1878954163_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1878954163_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBorder_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1878954163_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBorder, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1ca13b47ff5c5abca411a177df9482a9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBorder(ptr: Pointer?): WithDefault = IBorder_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBorder {
      val address = segment.toRawLongValue()
      return makeIBorder(Pointer(address))
    }

    public override fun toNative(obj: IBorder): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1878954163_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBorder): Array<IBorder?> = (elements as
        Array<IBorder?>).castToImpl<IBorder,IBorder_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBorder?> = arrayOfNulls<IBorder_Impl>(size) as
        Array<IBorder?>
  }
}
