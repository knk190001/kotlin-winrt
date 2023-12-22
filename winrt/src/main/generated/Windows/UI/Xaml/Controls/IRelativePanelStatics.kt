package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyProperty
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRelativePanelStatics.ABI::class)
@Signature("{15903c27-f18c-4c35-8e19-6a7459d907b6}")
@Guid("15903c27f18c4c358e196a7459d907b6")
@WinRTInterface("15903c27f18c4c358e196a7459d907b6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRelativePanelStatics.ByReference::class)
public interface IRelativePanelStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LeftOfProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun GetLeftOf(element: UIElement?): IUnknown?

  @InterfaceMethod(2)
  public fun SetLeftOf(element: UIElement?, value: IUnknown?): Unit

  @InterfaceMethod(3)
  public fun get_AboveProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun GetAbove(element: UIElement?): IUnknown?

  @InterfaceMethod(5)
  public fun SetAbove(element: UIElement?, value: IUnknown?): Unit

  @InterfaceMethod(6)
  public fun get_RightOfProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun GetRightOf(element: UIElement?): IUnknown?

  @InterfaceMethod(8)
  public fun SetRightOf(element: UIElement?, value: IUnknown?): Unit

  @InterfaceMethod(9)
  public fun get_BelowProperty(): DependencyProperty?

  @InterfaceMethod(10)
  public fun GetBelow(element: UIElement?): IUnknown?

  @InterfaceMethod(11)
  public fun SetBelow(element: UIElement?, value: IUnknown?): Unit

  @InterfaceMethod(12)
  public fun get_AlignHorizontalCenterWithProperty(): DependencyProperty?

  @InterfaceMethod(13)
  public fun GetAlignHorizontalCenterWith(element: UIElement?): IUnknown?

  @InterfaceMethod(14)
  public fun SetAlignHorizontalCenterWith(element: UIElement?, value: IUnknown?): Unit

  @InterfaceMethod(15)
  public fun get_AlignVerticalCenterWithProperty(): DependencyProperty?

  @InterfaceMethod(16)
  public fun GetAlignVerticalCenterWith(element: UIElement?): IUnknown?

  @InterfaceMethod(17)
  public fun SetAlignVerticalCenterWith(element: UIElement?, value: IUnknown?): Unit

  @InterfaceMethod(18)
  public fun get_AlignLeftWithProperty(): DependencyProperty?

  @InterfaceMethod(19)
  public fun GetAlignLeftWith(element: UIElement?): IUnknown?

  @InterfaceMethod(20)
  public fun SetAlignLeftWith(element: UIElement?, value: IUnknown?): Unit

  @InterfaceMethod(21)
  public fun get_AlignTopWithProperty(): DependencyProperty?

  @InterfaceMethod(22)
  public fun GetAlignTopWith(element: UIElement?): IUnknown?

  @InterfaceMethod(23)
  public fun SetAlignTopWith(element: UIElement?, value: IUnknown?): Unit

  @InterfaceMethod(24)
  public fun get_AlignRightWithProperty(): DependencyProperty?

  @InterfaceMethod(25)
  public fun GetAlignRightWith(element: UIElement?): IUnknown?

  @InterfaceMethod(26)
  public fun SetAlignRightWith(element: UIElement?, value: IUnknown?): Unit

  @InterfaceMethod(27)
  public fun get_AlignBottomWithProperty(): DependencyProperty?

  @InterfaceMethod(28)
  public fun GetAlignBottomWith(element: UIElement?): IUnknown?

  @InterfaceMethod(29)
  public fun SetAlignBottomWith(element: UIElement?, value: IUnknown?): Unit

  @InterfaceMethod(30)
  public fun get_AlignLeftWithPanelProperty(): DependencyProperty?

  @InterfaceMethod(31)
  public fun GetAlignLeftWithPanel(element: UIElement?): Boolean

  @InterfaceMethod(32)
  public fun SetAlignLeftWithPanel(element: UIElement?, value: Boolean): Unit

  @InterfaceMethod(33)
  public fun get_AlignTopWithPanelProperty(): DependencyProperty?

  @InterfaceMethod(34)
  public fun GetAlignTopWithPanel(element: UIElement?): Boolean

  @InterfaceMethod(35)
  public fun SetAlignTopWithPanel(element: UIElement?, value: Boolean): Unit

  @InterfaceMethod(36)
  public fun get_AlignRightWithPanelProperty(): DependencyProperty?

  @InterfaceMethod(37)
  public fun GetAlignRightWithPanel(element: UIElement?): Boolean

  @InterfaceMethod(38)
  public fun SetAlignRightWithPanel(element: UIElement?, value: Boolean): Unit

  @InterfaceMethod(39)
  public fun get_AlignBottomWithPanelProperty(): DependencyProperty?

  @InterfaceMethod(40)
  public fun GetAlignBottomWithPanel(element: UIElement?): Boolean

  @InterfaceMethod(41)
  public fun SetAlignBottomWithPanel(element: UIElement?, value: Boolean): Unit

  @InterfaceMethod(42)
  public fun get_AlignHorizontalCenterWithPanelProperty(): DependencyProperty?

  @InterfaceMethod(43)
  public fun GetAlignHorizontalCenterWithPanel(element: UIElement?): Boolean

  @InterfaceMethod(44)
  public fun SetAlignHorizontalCenterWithPanel(element: UIElement?, value: Boolean): Unit

  @InterfaceMethod(45)
  public fun get_AlignVerticalCenterWithPanelProperty(): DependencyProperty?

  @InterfaceMethod(46)
  public fun GetAlignVerticalCenterWithPanel(element: UIElement?): Boolean

  @InterfaceMethod(47)
  public fun SetAlignVerticalCenterWithPanel(element: UIElement?, value: Boolean): Unit

  @InterfaceMethod(48)
  public fun get_BorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(49)
  public fun get_BorderThicknessProperty(): DependencyProperty?

  @InterfaceMethod(50)
  public fun get_CornerRadiusProperty(): DependencyProperty?

  @InterfaceMethod(51)
  public fun get_PaddingProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRelativePanelStatics> {
    public override fun getValue() = ABI.makeIRelativePanelStatics(pointer.getPointer(0))

    public fun setValue(value: IRelativePanelStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRelativePanelStatics {
    public val __1015460905_Ptr: Pointer?

    public val _1015460905_VtblPtr: Pointer?
      get() = __1015460905_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LeftOfProperty(): DependencyProperty? {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetLeftOf(element: UIElement?): IUnknown? {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetLeftOf(element: UIElement?, value: IUnknown?): Unit {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_AboveProperty(): DependencyProperty? {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetAbove(element: UIElement?): IUnknown? {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun SetAbove(element: UIElement?, value: IUnknown?): Unit {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_RightOfProperty(): DependencyProperty? {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetRightOf(element: UIElement?): IUnknown? {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun SetRightOf(element: UIElement?, value: IUnknown?): Unit {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_BelowProperty(): DependencyProperty? {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun GetBelow(element: UIElement?): IUnknown? {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun SetBelow(element: UIElement?, value: IUnknown?): Unit {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_AlignHorizontalCenterWithProperty(): DependencyProperty? {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun GetAlignHorizontalCenterWith(element: UIElement?): IUnknown? {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun SetAlignHorizontalCenterWith(element: UIElement?, value: IUnknown?): Unit {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_AlignVerticalCenterWithProperty(): DependencyProperty? {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun GetAlignVerticalCenterWith(element: UIElement?): IUnknown? {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun SetAlignVerticalCenterWith(element: UIElement?, value: IUnknown?): Unit {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_AlignLeftWithProperty(): DependencyProperty? {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun GetAlignLeftWith(element: UIElement?): IUnknown? {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun SetAlignLeftWith(element: UIElement?, value: IUnknown?): Unit {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun get_AlignTopWithProperty(): DependencyProperty? {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun GetAlignTopWith(element: UIElement?): IUnknown? {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun SetAlignTopWith(element: UIElement?, value: IUnknown?): Unit {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_AlignRightWithProperty(): DependencyProperty? {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun GetAlignRightWith(element: UIElement?): IUnknown? {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun SetAlignRightWith(element: UIElement?, value: IUnknown?): Unit {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(27)
    public override fun get_AlignBottomWithProperty(): DependencyProperty? {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun GetAlignBottomWith(element: UIElement?): IUnknown? {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun SetAlignBottomWith(element: UIElement?, value: IUnknown?): Unit {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun get_AlignLeftWithPanelProperty(): DependencyProperty? {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun GetAlignLeftWithPanel(element: UIElement?): Boolean {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(32)
    public override fun SetAlignLeftWithPanel(element: UIElement?, value: Boolean): Unit {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(33)
    public override fun get_AlignTopWithPanelProperty(): DependencyProperty? {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(34)
    public override fun GetAlignTopWithPanel(element: UIElement?): Boolean {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(35)
    public override fun SetAlignTopWithPanel(element: UIElement?, value: Boolean): Unit {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(36)
    public override fun get_AlignRightWithPanelProperty(): DependencyProperty? {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(37)
    public override fun GetAlignRightWithPanel(element: UIElement?): Boolean {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(38)
    public override fun SetAlignRightWithPanel(element: UIElement?, value: Boolean): Unit {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(39)
    public override fun get_AlignBottomWithPanelProperty(): DependencyProperty? {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(40)
    public override fun GetAlignBottomWithPanel(element: UIElement?): Boolean {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(41)
    public override fun SetAlignBottomWithPanel(element: UIElement?, value: Boolean): Unit {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(42)
    public override fun get_AlignHorizontalCenterWithPanelProperty(): DependencyProperty? {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(43)
    public override fun GetAlignHorizontalCenterWithPanel(element: UIElement?): Boolean {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(44)
    public override fun SetAlignHorizontalCenterWithPanel(element: UIElement?, value: Boolean):
        Unit {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(45)
    public override fun get_AlignVerticalCenterWithPanelProperty(): DependencyProperty? {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(46)
    public override fun GetAlignVerticalCenterWithPanel(element: UIElement?): Boolean {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(47)
    public override fun SetAlignVerticalCenterWithPanel(element: UIElement?, value: Boolean): Unit {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(48)
    public override fun get_BorderBrushProperty(): DependencyProperty? {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(49)
    public override fun get_BorderThicknessProperty(): DependencyProperty? {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(50)
    public override fun get_CornerRadiusProperty(): DependencyProperty? {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(51)
    public override fun get_PaddingProperty(): DependencyProperty? {
      val fnPtr = _1015460905_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1015460905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IRelativePanelStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1015460905_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRelativePanelStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("15903c27f18c4c358e196a7459d907b6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRelativePanelStatics(ptr: Pointer?): WithDefault =
        IRelativePanelStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRelativePanelStatics {
      val address = segment.toRawLongValue()
      return makeIRelativePanelStatics(Pointer(address))
    }

    public override fun toNative(obj: IRelativePanelStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1015460905_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRelativePanelStatics): Array<IRelativePanelStatics?> =
        (elements as
        Array<IRelativePanelStatics?>).castToImpl<IRelativePanelStatics,IRelativePanelStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRelativePanelStatics?> =
        arrayOfNulls<IRelativePanelStatics_Impl>(size) as Array<IRelativePanelStatics?>
  }
}
