package Microsoft.UI.Xaml.Media

import Microsoft.UI.Composition.CompositionLight
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

@ABIMarker(IXamlLightProtected.ABI::class)
@Signature("{c307bf12-fdaf-54ca-a631-ad0e86263c6e}")
@Guid("c307bf12fdaf54caa631ad0e86263c6e")
@WinRTInterface("c307bf12fdaf54caa631ad0e86263c6e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlLightProtected.ByReference::class)
public interface IXamlLightProtected : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CompositionLight(): CompositionLight?

  @InterfaceMethod(1)
  public fun put_CompositionLight(value: CompositionLight?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlLightProtected> {
    public override fun getValue() = ABI.makeIXamlLightProtected(pointer.getPointer(0))

    public fun setValue(value: IXamlLightProtected_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlLightProtected {
    public val __1187484049_Ptr: Pointer?

    public val _1187484049_VtblPtr: Pointer?
      get() = __1187484049_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CompositionLight(): CompositionLight? {
      val fnPtr = _1187484049_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionLight>()
      val hr = fn.invokeHR(arrayOf(__1187484049_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionLight>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_CompositionLight(value: CompositionLight?): Unit {
      val fnPtr = _1187484049_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1187484049_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IXamlLightProtected_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1187484049_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlLightProtected, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c307bf12fdaf54caa631ad0e86263c6e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlLightProtected(ptr: Pointer?): WithDefault = IXamlLightProtected_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlLightProtected {
      val address = segment.toRawLongValue()
      return makeIXamlLightProtected(Pointer(address))
    }

    public override fun toNative(obj: IXamlLightProtected): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1187484049_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlLightProtected): Array<IXamlLightProtected?> =
        (elements as
        Array<IXamlLightProtected?>).castToImpl<IXamlLightProtected,IXamlLightProtected_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlLightProtected?> =
        arrayOfNulls<IXamlLightProtected_Impl>(size) as Array<IXamlLightProtected?>
  }
}
