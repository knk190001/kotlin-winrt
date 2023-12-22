package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.Primitives.PlacementMode
import Microsoft.UI.Xaml.DependencyObject
import Microsoft.UI.Xaml.DependencyProperty
import Microsoft.UI.Xaml.UIElement
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IToolTipServiceStatics.ABI::class)
@Signature("{5aa38adc-9874-5e0a-8d8e-1574efc0b88f}")
@Guid("5aa38adc98745e0a8d8e1574efc0b88f")
@WinRTInterface("5aa38adc98745e0a8d8e1574efc0b88f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToolTipServiceStatics.ByReference::class)
public interface IToolTipServiceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PlacementProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun GetPlacement(element: DependencyObject?): PlacementMode?

  @InterfaceMethod(2)
  public fun SetPlacement(element: DependencyObject?, value: PlacementMode?): Unit

  @InterfaceMethod(3)
  public fun get_PlacementTargetProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun GetPlacementTarget(element: DependencyObject?): UIElement?

  @InterfaceMethod(5)
  public fun SetPlacementTarget(element: DependencyObject?, value: UIElement?): Unit

  @InterfaceMethod(6)
  public fun get_ToolTipProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun GetToolTip(element: DependencyObject?): IUnknown?

  @InterfaceMethod(8)
  public fun SetToolTip(element: DependencyObject?, value: IUnknown?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToolTipServiceStatics> {
    public override fun getValue() = ABI.makeIToolTipServiceStatics(pointer.getPointer(0))

    public fun setValue(value: IToolTipServiceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToolTipServiceStatics {
    public val __413551276_Ptr: Pointer?

    public val _413551276_VtblPtr: Pointer?
      get() = __413551276_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PlacementProperty(): DependencyProperty? {
      val fnPtr = _413551276_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__413551276_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetPlacement(element: DependencyObject?): PlacementMode? {
      val fnPtr = _413551276_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlacementMode>()
      val hr = fn.invokeHR(arrayOf(__413551276_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlacementMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetPlacement(element: DependencyObject?, value: PlacementMode?): Unit {
      val fnPtr = _413551276_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__413551276_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_PlacementTargetProperty(): DependencyProperty? {
      val fnPtr = _413551276_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__413551276_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetPlacementTarget(element: DependencyObject?): UIElement? {
      val fnPtr = _413551276_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__413551276_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun SetPlacementTarget(element: DependencyObject?, value: UIElement?): Unit {
      val fnPtr = _413551276_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__413551276_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_ToolTipProperty(): DependencyProperty? {
      val fnPtr = _413551276_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__413551276_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetToolTip(element: DependencyObject?): IUnknown? {
      val fnPtr = _413551276_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__413551276_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun SetToolTip(element: DependencyObject?, value: IUnknown?): Unit {
      val fnPtr = _413551276_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__413551276_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IToolTipServiceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __413551276_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToolTipServiceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5aa38adc98745e0a8d8e1574efc0b88f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToolTipServiceStatics(ptr: Pointer?): WithDefault =
        IToolTipServiceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToolTipServiceStatics {
      val address = segment.toRawLongValue()
      return makeIToolTipServiceStatics(Pointer(address))
    }

    public override fun toNative(obj: IToolTipServiceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__413551276_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToolTipServiceStatics): Array<IToolTipServiceStatics?> =
        (elements as
        Array<IToolTipServiceStatics?>).castToImpl<IToolTipServiceStatics,IToolTipServiceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToolTipServiceStatics?> =
        arrayOfNulls<IToolTipServiceStatics_Impl>(size) as Array<IToolTipServiceStatics?>
  }
}
