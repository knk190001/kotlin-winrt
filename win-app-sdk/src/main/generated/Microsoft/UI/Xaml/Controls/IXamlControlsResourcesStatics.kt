package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IXamlControlsResourcesStatics.ABI::class)
@Signature("{cb49196c-1458-5e92-b701-d08d3e816bc5}")
@Guid("cb49196c14585e92b701d08d3e816bc5")
@WinRTInterface("cb49196c14585e92b701d08d3e816bc5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlControlsResourcesStatics.ByReference::class)
public interface IXamlControlsResourcesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun EnsureRevealLights(element: UIElement?): Unit

  @InterfaceMethod(1)
  public fun get_UseCompactResourcesProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlControlsResourcesStatics> {
    public override fun getValue() = ABI.makeIXamlControlsResourcesStatics(pointer.getPointer(0))

    public fun setValue(value: IXamlControlsResourcesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlControlsResourcesStatics {
    public val __1349104741_Ptr: Pointer?

    public val _1349104741_VtblPtr: Pointer?
      get() = __1349104741_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun EnsureRevealLights(element: UIElement?): Unit {
      val fnPtr = _1349104741_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1349104741_Ptr, marshalToNative(element),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_UseCompactResourcesProperty(): DependencyProperty? {
      val fnPtr = _1349104741_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1349104741_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IXamlControlsResourcesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1349104741_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlControlsResourcesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cb49196c14585e92b701d08d3e816bc5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlControlsResourcesStatics(ptr: Pointer?): WithDefault =
        IXamlControlsResourcesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlControlsResourcesStatics {
      val address = segment.toRawLongValue()
      return makeIXamlControlsResourcesStatics(Pointer(address))
    }

    public override fun toNative(obj: IXamlControlsResourcesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1349104741_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlControlsResourcesStatics):
        Array<IXamlControlsResourcesStatics?> = (elements as
        Array<IXamlControlsResourcesStatics?>).castToImpl<IXamlControlsResourcesStatics,IXamlControlsResourcesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlControlsResourcesStatics?> =
        arrayOfNulls<IXamlControlsResourcesStatics_Impl>(size) as
        Array<IXamlControlsResourcesStatics?>
  }
}
