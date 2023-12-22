package Microsoft.UI.Xaml.Media

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IXamlLightStatics.ABI::class)
@Signature("{a2d8ea26-26ff-5374-b1dd-f232d5604f6a}")
@Guid("a2d8ea2626ff5374b1ddf232d5604f6a")
@WinRTInterface("a2d8ea2626ff5374b1ddf232d5604f6a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlLightStatics.ByReference::class)
public interface IXamlLightStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AddTargetElement(lightId: String?, element: UIElement?): Unit

  @InterfaceMethod(1)
  public fun RemoveTargetElement(lightId: String?, element: UIElement?): Unit

  @InterfaceMethod(2)
  public fun AddTargetBrush(lightId: String?, brush: Brush?): Unit

  @InterfaceMethod(3)
  public fun RemoveTargetBrush(lightId: String?, brush: Brush?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlLightStatics> {
    public override fun getValue() = ABI.makeIXamlLightStatics(pointer.getPointer(0))

    public fun setValue(value: IXamlLightStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlLightStatics {
    public val __1639924328_Ptr: Pointer?

    public val _1639924328_VtblPtr: Pointer?
      get() = __1639924328_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AddTargetElement(lightId: String?, element: UIElement?): Unit {
      val fnPtr = _1639924328_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1639924328_Ptr, marshalToNative(lightId),
          marshalToNative(element),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun RemoveTargetElement(lightId: String?, element: UIElement?): Unit {
      val fnPtr = _1639924328_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1639924328_Ptr, marshalToNative(lightId),
          marshalToNative(element),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun AddTargetBrush(lightId: String?, brush: Brush?): Unit {
      val fnPtr = _1639924328_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1639924328_Ptr, marshalToNative(lightId),
          marshalToNative(brush),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun RemoveTargetBrush(lightId: String?, brush: Brush?): Unit {
      val fnPtr = _1639924328_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1639924328_Ptr, marshalToNative(lightId),
          marshalToNative(brush),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IXamlLightStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1639924328_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlLightStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a2d8ea2626ff5374b1ddf232d5604f6a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlLightStatics(ptr: Pointer?): WithDefault = IXamlLightStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlLightStatics {
      val address = segment.toRawLongValue()
      return makeIXamlLightStatics(Pointer(address))
    }

    public override fun toNative(obj: IXamlLightStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1639924328_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlLightStatics): Array<IXamlLightStatics?> = (elements
        as Array<IXamlLightStatics?>).castToImpl<IXamlLightStatics,IXamlLightStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlLightStatics?> =
        arrayOfNulls<IXamlLightStatics_Impl>(size) as Array<IXamlLightStatics?>
  }
}
