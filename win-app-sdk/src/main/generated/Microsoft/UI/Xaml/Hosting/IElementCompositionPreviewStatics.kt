package Microsoft.UI.Xaml.Hosting

import Microsoft.UI.Composition.CompositionPropertySet
import Microsoft.UI.Composition.ICompositionAnimationBase
import Microsoft.UI.Composition.Visual
import Microsoft.UI.Xaml.Controls.ScrollViewer
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IElementCompositionPreviewStatics.ABI::class)
@Signature("{84da5a6c-0cfa-532b-9b15-ccd986374342}")
@Guid("84da5a6c0cfa532b9b15ccd986374342")
@WinRTInterface("84da5a6c0cfa532b9b15ccd986374342")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IElementCompositionPreviewStatics.ByReference::class)
public interface IElementCompositionPreviewStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetElementVisual(element: UIElement?): Visual?

  @InterfaceMethod(1)
  public fun GetElementChildVisual(element: UIElement?): Visual?

  @InterfaceMethod(2)
  public fun SetElementChildVisual(element: UIElement?, visual: Visual?): Unit

  @InterfaceMethod(3)
  public fun GetScrollViewerManipulationPropertySet(scrollViewer: ScrollViewer?):
      CompositionPropertySet?

  @InterfaceMethod(4)
  public fun SetImplicitShowAnimation(element: UIElement?, animation: ICompositionAnimationBase?):
      Unit

  @InterfaceMethod(5)
  public fun SetImplicitHideAnimation(element: UIElement?, animation: ICompositionAnimationBase?):
      Unit

  @InterfaceMethod(6)
  public fun SetIsTranslationEnabled(element: UIElement?, value: Boolean): Unit

  @InterfaceMethod(7)
  public fun GetPointerPositionPropertySet(targetElement: UIElement?): CompositionPropertySet?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IElementCompositionPreviewStatics> {
    public override fun getValue() =
        ABI.makeIElementCompositionPreviewStatics(pointer.getPointer(0))

    public fun setValue(value: IElementCompositionPreviewStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IElementCompositionPreviewStatics {
    public val __1297303078_Ptr: Pointer?

    public val _1297303078_VtblPtr: Pointer?
      get() = __1297303078_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetElementVisual(element: UIElement?): Visual? {
      val fnPtr = _1297303078_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Visual>()
      val hr = fn.invokeHR(arrayOf(__1297303078_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Visual>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetElementChildVisual(element: UIElement?): Visual? {
      val fnPtr = _1297303078_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Visual>()
      val hr = fn.invokeHR(arrayOf(__1297303078_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Visual>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetElementChildVisual(element: UIElement?, visual: Visual?): Unit {
      val fnPtr = _1297303078_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1297303078_Ptr, marshalToNative(element),
          marshalToNative(visual),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun GetScrollViewerManipulationPropertySet(scrollViewer: ScrollViewer?):
        CompositionPropertySet? {
      val fnPtr = _1297303078_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionPropertySet>()
      val hr = fn.invokeHR(arrayOf(__1297303078_Ptr, marshalToNative(scrollViewer), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionPropertySet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun SetImplicitShowAnimation(element: UIElement?,
        animation: ICompositionAnimationBase?): Unit {
      val fnPtr = _1297303078_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1297303078_Ptr, marshalToNative(element),
          marshalToNative(animation),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun SetImplicitHideAnimation(element: UIElement?,
        animation: ICompositionAnimationBase?): Unit {
      val fnPtr = _1297303078_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1297303078_Ptr, marshalToNative(element),
          marshalToNative(animation),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun SetIsTranslationEnabled(element: UIElement?, value: Boolean): Unit {
      val fnPtr = _1297303078_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1297303078_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun GetPointerPositionPropertySet(targetElement: UIElement?):
        CompositionPropertySet? {
      val fnPtr = _1297303078_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionPropertySet>()
      val hr = fn.invokeHR(arrayOf(__1297303078_Ptr, marshalToNative(targetElement), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionPropertySet>(result.getValue())
      return resultValue
    }
  }

  public class IElementCompositionPreviewStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1297303078_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IElementCompositionPreviewStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("84da5a6c0cfa532b9b15ccd986374342")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIElementCompositionPreviewStatics(ptr: Pointer?): WithDefault =
        IElementCompositionPreviewStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IElementCompositionPreviewStatics {
      val address = segment.toRawLongValue()
      return makeIElementCompositionPreviewStatics(Pointer(address))
    }

    public override fun toNative(obj: IElementCompositionPreviewStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1297303078_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IElementCompositionPreviewStatics):
        Array<IElementCompositionPreviewStatics?> = (elements as
        Array<IElementCompositionPreviewStatics?>).castToImpl<IElementCompositionPreviewStatics,IElementCompositionPreviewStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IElementCompositionPreviewStatics?> =
        arrayOfNulls<IElementCompositionPreviewStatics_Impl>(size) as
        Array<IElementCompositionPreviewStatics?>
  }
}
