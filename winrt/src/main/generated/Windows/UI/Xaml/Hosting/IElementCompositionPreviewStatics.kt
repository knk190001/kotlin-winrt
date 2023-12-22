package Windows.UI.Xaml.Hosting

import Windows.UI.Composition.CompositionPropertySet
import Windows.UI.Composition.Visual
import Windows.UI.Xaml.Controls.ScrollViewer
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IElementCompositionPreviewStatics.ABI::class)
@Signature("{08c92b38-ec99-4c55-bc85-a1c180b27646}")
@Guid("08c92b38ec994c55bc85a1c180b27646")
@WinRTInterface("08c92b38ec994c55bc85a1c180b27646")
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
    public val __667954481_Ptr: Pointer?

    public val _667954481_VtblPtr: Pointer?
      get() = __667954481_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetElementVisual(element: UIElement?): Visual? {
      val fnPtr = _667954481_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Visual>()
      val hr = fn.invokeHR(arrayOf(__667954481_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Visual>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetElementChildVisual(element: UIElement?): Visual? {
      val fnPtr = _667954481_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Visual>()
      val hr = fn.invokeHR(arrayOf(__667954481_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Visual>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetElementChildVisual(element: UIElement?, visual: Visual?): Unit {
      val fnPtr = _667954481_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__667954481_Ptr, marshalToNative(element),
          marshalToNative(visual),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun GetScrollViewerManipulationPropertySet(scrollViewer: ScrollViewer?):
        CompositionPropertySet? {
      val fnPtr = _667954481_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionPropertySet>()
      val hr = fn.invokeHR(arrayOf(__667954481_Ptr, marshalToNative(scrollViewer), result))
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
    public override val __667954481_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IElementCompositionPreviewStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("08c92b38ec994c55bc85a1c180b27646")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIElementCompositionPreviewStatics(ptr: Pointer?): WithDefault =
        IElementCompositionPreviewStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IElementCompositionPreviewStatics {
      val address = segment.toRawLongValue()
      return makeIElementCompositionPreviewStatics(Pointer(address))
    }

    public override fun toNative(obj: IElementCompositionPreviewStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__667954481_Ptr))
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
