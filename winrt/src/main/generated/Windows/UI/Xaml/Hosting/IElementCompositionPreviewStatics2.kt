package Windows.UI.Xaml.Hosting

import Windows.UI.Composition.CompositionPropertySet
import Windows.UI.Composition.ICompositionAnimationBase
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IElementCompositionPreviewStatics2.ABI::class)
@Signature("{24148fbb-23d6-4f37-ba0c-0733e799722d}")
@Guid("24148fbb23d64f37ba0c0733e799722d")
@WinRTInterface("24148fbb23d64f37ba0c0733e799722d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IElementCompositionPreviewStatics2.ByReference::class)
public interface IElementCompositionPreviewStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetImplicitShowAnimation(element: UIElement?, animation: ICompositionAnimationBase?):
      Unit

  @InterfaceMethod(1)
  public fun SetImplicitHideAnimation(element: UIElement?, animation: ICompositionAnimationBase?):
      Unit

  @InterfaceMethod(2)
  public fun SetIsTranslationEnabled(element: UIElement?, value: Boolean): Unit

  @InterfaceMethod(3)
  public fun GetPointerPositionPropertySet(targetElement: UIElement?): CompositionPropertySet?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IElementCompositionPreviewStatics2> {
    public override fun getValue() =
        ABI.makeIElementCompositionPreviewStatics2(pointer.getPointer(0))

    public fun setValue(value: IElementCompositionPreviewStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IElementCompositionPreviewStatics2 {
    public val __768247519_Ptr: Pointer?

    public val _768247519_VtblPtr: Pointer?
      get() = __768247519_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetImplicitShowAnimation(element: UIElement?,
        animation: ICompositionAnimationBase?): Unit {
      val fnPtr = _768247519_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__768247519_Ptr, marshalToNative(element),
          marshalToNative(animation),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun SetImplicitHideAnimation(element: UIElement?,
        animation: ICompositionAnimationBase?): Unit {
      val fnPtr = _768247519_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__768247519_Ptr, marshalToNative(element),
          marshalToNative(animation),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun SetIsTranslationEnabled(element: UIElement?, value: Boolean): Unit {
      val fnPtr = _768247519_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__768247519_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun GetPointerPositionPropertySet(targetElement: UIElement?):
        CompositionPropertySet? {
      val fnPtr = _768247519_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionPropertySet>()
      val hr = fn.invokeHR(arrayOf(__768247519_Ptr, marshalToNative(targetElement), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionPropertySet>(result.getValue())
      return resultValue
    }
  }

  public class IElementCompositionPreviewStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __768247519_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IElementCompositionPreviewStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("24148fbb23d64f37ba0c0733e799722d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIElementCompositionPreviewStatics2(ptr: Pointer?): WithDefault =
        IElementCompositionPreviewStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IElementCompositionPreviewStatics2 {
      val address = segment.toRawLongValue()
      return makeIElementCompositionPreviewStatics2(Pointer(address))
    }

    public override fun toNative(obj: IElementCompositionPreviewStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__768247519_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IElementCompositionPreviewStatics2):
        Array<IElementCompositionPreviewStatics2?> = (elements as
        Array<IElementCompositionPreviewStatics2?>).castToImpl<IElementCompositionPreviewStatics2,IElementCompositionPreviewStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IElementCompositionPreviewStatics2?> =
        arrayOfNulls<IElementCompositionPreviewStatics2_Impl>(size) as
        Array<IElementCompositionPreviewStatics2?>
  }
}
