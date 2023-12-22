package Windows.UI.Xaml.Hosting

import Windows.UI.WindowManagement.AppWindow
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

@ABIMarker(IElementCompositionPreviewStatics3.ABI::class)
@Signature("{843bc4c3-c105-59fe-a3d1-373c1d3e6fbc}")
@Guid("843bc4c3c10559fea3d1373c1d3e6fbc")
@WinRTInterface("843bc4c3c10559fea3d1373c1d3e6fbc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IElementCompositionPreviewStatics3.ByReference::class)
public interface IElementCompositionPreviewStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetAppWindowContent(appWindow: AppWindow?, xamlContent: UIElement?): Unit

  @InterfaceMethod(1)
  public fun GetAppWindowContent(appWindow: AppWindow?): UIElement?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IElementCompositionPreviewStatics3> {
    public override fun getValue() =
        ABI.makeIElementCompositionPreviewStatics3(pointer.getPointer(0))

    public fun setValue(value: IElementCompositionPreviewStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IElementCompositionPreviewStatics3 {
    public val __768247518_Ptr: Pointer?

    public val _768247518_VtblPtr: Pointer?
      get() = __768247518_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetAppWindowContent(appWindow: AppWindow?, xamlContent: UIElement?): Unit {
      val fnPtr = _768247518_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__768247518_Ptr, marshalToNative(appWindow),
          marshalToNative(xamlContent),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun GetAppWindowContent(appWindow: AppWindow?): UIElement? {
      val fnPtr = _768247518_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__768247518_Ptr, marshalToNative(appWindow), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }
  }

  public class IElementCompositionPreviewStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __768247518_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IElementCompositionPreviewStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("843bc4c3c10559fea3d1373c1d3e6fbc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIElementCompositionPreviewStatics3(ptr: Pointer?): WithDefault =
        IElementCompositionPreviewStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IElementCompositionPreviewStatics3 {
      val address = segment.toRawLongValue()
      return makeIElementCompositionPreviewStatics3(Pointer(address))
    }

    public override fun toNative(obj: IElementCompositionPreviewStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__768247518_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IElementCompositionPreviewStatics3):
        Array<IElementCompositionPreviewStatics3?> = (elements as
        Array<IElementCompositionPreviewStatics3?>).castToImpl<IElementCompositionPreviewStatics3,IElementCompositionPreviewStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IElementCompositionPreviewStatics3?> =
        arrayOfNulls<IElementCompositionPreviewStatics3_Impl>(size) as
        Array<IElementCompositionPreviewStatics3?>
  }
}
