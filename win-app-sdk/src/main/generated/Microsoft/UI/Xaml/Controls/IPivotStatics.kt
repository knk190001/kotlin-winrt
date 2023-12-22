package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DependencyProperty
import Microsoft.UI.Xaml.FrameworkElement
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

@ABIMarker(IPivotStatics.ABI::class)
@Signature("{619cc35f-b97b-5e32-885e-70949ed97eeb}")
@Guid("619cc35fb97b5e32885e70949ed97eeb")
@WinRTInterface("619cc35fb97b5e32885e70949ed97eeb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPivotStatics.ByReference::class)
public interface IPivotStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TitleProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_TitleTemplateProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_LeftHeaderProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_LeftHeaderTemplateProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_RightHeaderProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_RightHeaderTemplateProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_HeaderTemplateProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_SelectedIndexProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_SelectedItemProperty(): DependencyProperty?

  @InterfaceMethod(9)
  public fun get_IsLockedProperty(): DependencyProperty?

  @InterfaceMethod(10)
  public fun get_HeaderFocusVisualPlacementProperty(): DependencyProperty?

  @InterfaceMethod(11)
  public fun get_IsHeaderItemsCarouselEnabledProperty(): DependencyProperty?

  @InterfaceMethod(12)
  public fun get_SlideInAnimationGroupProperty(): DependencyProperty?

  @InterfaceMethod(13)
  public fun GetSlideInAnimationGroup(element: FrameworkElement?): PivotSlideInAnimationGroup?

  @InterfaceMethod(14)
  public fun SetSlideInAnimationGroup(element: FrameworkElement?,
      value: PivotSlideInAnimationGroup?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPivotStatics>
      {
    public override fun getValue() = ABI.makeIPivotStatics(pointer.getPointer(0))

    public fun setValue(value: IPivotStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPivotStatics {
    public val __269432938_Ptr: Pointer?

    public val _269432938_VtblPtr: Pointer?
      get() = __269432938_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TitleProperty(): DependencyProperty? {
      val fnPtr = _269432938_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__269432938_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TitleTemplateProperty(): DependencyProperty? {
      val fnPtr = _269432938_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__269432938_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_LeftHeaderProperty(): DependencyProperty? {
      val fnPtr = _269432938_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__269432938_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_LeftHeaderTemplateProperty(): DependencyProperty? {
      val fnPtr = _269432938_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__269432938_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_RightHeaderProperty(): DependencyProperty? {
      val fnPtr = _269432938_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__269432938_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_RightHeaderTemplateProperty(): DependencyProperty? {
      val fnPtr = _269432938_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__269432938_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_HeaderTemplateProperty(): DependencyProperty? {
      val fnPtr = _269432938_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__269432938_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_SelectedIndexProperty(): DependencyProperty? {
      val fnPtr = _269432938_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__269432938_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_SelectedItemProperty(): DependencyProperty? {
      val fnPtr = _269432938_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__269432938_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_IsLockedProperty(): DependencyProperty? {
      val fnPtr = _269432938_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__269432938_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_HeaderFocusVisualPlacementProperty(): DependencyProperty? {
      val fnPtr = _269432938_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__269432938_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_IsHeaderItemsCarouselEnabledProperty(): DependencyProperty? {
      val fnPtr = _269432938_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__269432938_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_SlideInAnimationGroupProperty(): DependencyProperty? {
      val fnPtr = _269432938_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__269432938_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun GetSlideInAnimationGroup(element: FrameworkElement?):
        PivotSlideInAnimationGroup? {
      val fnPtr = _269432938_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PivotSlideInAnimationGroup>()
      val hr = fn.invokeHR(arrayOf(__269432938_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PivotSlideInAnimationGroup>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun SetSlideInAnimationGroup(element: FrameworkElement?,
        value: PivotSlideInAnimationGroup?): Unit {
      val fnPtr = _269432938_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__269432938_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPivotStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __269432938_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPivotStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("619cc35fb97b5e32885e70949ed97eeb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPivotStatics(ptr: Pointer?): WithDefault = IPivotStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPivotStatics {
      val address = segment.toRawLongValue()
      return makeIPivotStatics(Pointer(address))
    }

    public override fun toNative(obj: IPivotStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__269432938_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPivotStatics): Array<IPivotStatics?> = (elements as
        Array<IPivotStatics?>).castToImpl<IPivotStatics,IPivotStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPivotStatics?> =
        arrayOfNulls<IPivotStatics_Impl>(size) as Array<IPivotStatics?>
  }
}
