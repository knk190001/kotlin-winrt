package Windows.UI.Xaml

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

@ABIMarker(IUIElementStatics5.ABI::class)
@Signature("{59bd7d91-8fa3-4c65-ba1b-40df38556cbb}")
@Guid("59bd7d918fa34c65ba1b40df38556cbb")
@WinRTInterface("59bd7d918fa34c65ba1b40df38556cbb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUIElementStatics5.ByReference::class)
public interface IUIElementStatics5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LightsProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_KeyTipPlacementModeProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_KeyTipHorizontalOffsetProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_KeyTipVerticalOffsetProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_XYFocusKeyboardNavigationProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_XYFocusUpNavigationStrategyProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_XYFocusDownNavigationStrategyProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_XYFocusLeftNavigationStrategyProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_XYFocusRightNavigationStrategyProperty(): DependencyProperty?

  @InterfaceMethod(9)
  public fun get_HighContrastAdjustmentProperty(): DependencyProperty?

  @InterfaceMethod(10)
  public fun get_TabFocusNavigationProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUIElementStatics5> {
    public override fun getValue() = ABI.makeIUIElementStatics5(pointer.getPointer(0))

    public fun setValue(value: IUIElementStatics5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUIElementStatics5 {
    public val __1915643130_Ptr: Pointer?

    public val _1915643130_VtblPtr: Pointer?
      get() = __1915643130_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LightsProperty(): DependencyProperty? {
      val fnPtr = _1915643130_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1915643130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_KeyTipPlacementModeProperty(): DependencyProperty? {
      val fnPtr = _1915643130_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1915643130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_KeyTipHorizontalOffsetProperty(): DependencyProperty? {
      val fnPtr = _1915643130_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1915643130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_KeyTipVerticalOffsetProperty(): DependencyProperty? {
      val fnPtr = _1915643130_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1915643130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_XYFocusKeyboardNavigationProperty(): DependencyProperty? {
      val fnPtr = _1915643130_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1915643130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_XYFocusUpNavigationStrategyProperty(): DependencyProperty? {
      val fnPtr = _1915643130_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1915643130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_XYFocusDownNavigationStrategyProperty(): DependencyProperty? {
      val fnPtr = _1915643130_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1915643130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_XYFocusLeftNavigationStrategyProperty(): DependencyProperty? {
      val fnPtr = _1915643130_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1915643130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_XYFocusRightNavigationStrategyProperty(): DependencyProperty? {
      val fnPtr = _1915643130_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1915643130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_HighContrastAdjustmentProperty(): DependencyProperty? {
      val fnPtr = _1915643130_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1915643130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_TabFocusNavigationProperty(): DependencyProperty? {
      val fnPtr = _1915643130_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1915643130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IUIElementStatics5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1915643130_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUIElementStatics5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("59bd7d918fa34c65ba1b40df38556cbb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUIElementStatics5(ptr: Pointer?): WithDefault = IUIElementStatics5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUIElementStatics5 {
      val address = segment.toRawLongValue()
      return makeIUIElementStatics5(Pointer(address))
    }

    public override fun toNative(obj: IUIElementStatics5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1915643130_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUIElementStatics5): Array<IUIElementStatics5?> =
        (elements as
        Array<IUIElementStatics5?>).castToImpl<IUIElementStatics5,IUIElementStatics5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUIElementStatics5?> =
        arrayOfNulls<IUIElementStatics5_Impl>(size) as Array<IUIElementStatics5?>
  }
}
