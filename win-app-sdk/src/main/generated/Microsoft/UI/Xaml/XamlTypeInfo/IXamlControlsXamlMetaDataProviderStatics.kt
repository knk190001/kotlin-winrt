package Microsoft.UI.Xaml.XamlTypeInfo

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

@ABIMarker(IXamlControlsXamlMetaDataProviderStatics.ABI::class)
@Signature("{2d7eb3fd-ecdb-5084-b7e0-12f9598381ef}")
@Guid("2d7eb3fdecdb5084b7e012f9598381ef")
@WinRTInterface("2d7eb3fdecdb5084b7e012f9598381ef")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlControlsXamlMetaDataProviderStatics.ByReference::class)
public interface IXamlControlsXamlMetaDataProviderStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Initialize(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlControlsXamlMetaDataProviderStatics> {
    public override fun getValue() =
        ABI.makeIXamlControlsXamlMetaDataProviderStatics(pointer.getPointer(0))

    public fun setValue(value: IXamlControlsXamlMetaDataProviderStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlControlsXamlMetaDataProviderStatics {
    public val __1999586062_Ptr: Pointer?

    public val _1999586062_VtblPtr: Pointer?
      get() = __1999586062_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Initialize(): Unit {
      val fnPtr = _1999586062_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1999586062_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IXamlControlsXamlMetaDataProviderStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1999586062_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlControlsXamlMetaDataProviderStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2d7eb3fdecdb5084b7e012f9598381ef")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlControlsXamlMetaDataProviderStatics(ptr: Pointer?): WithDefault =
        IXamlControlsXamlMetaDataProviderStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IXamlControlsXamlMetaDataProviderStatics {
      val address = segment.toRawLongValue()
      return makeIXamlControlsXamlMetaDataProviderStatics(Pointer(address))
    }

    public override fun toNative(obj: IXamlControlsXamlMetaDataProviderStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1999586062_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlControlsXamlMetaDataProviderStatics):
        Array<IXamlControlsXamlMetaDataProviderStatics?> = (elements as
        Array<IXamlControlsXamlMetaDataProviderStatics?>).castToImpl<IXamlControlsXamlMetaDataProviderStatics,IXamlControlsXamlMetaDataProviderStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlControlsXamlMetaDataProviderStatics?> =
        arrayOfNulls<IXamlControlsXamlMetaDataProviderStatics_Impl>(size) as
        Array<IXamlControlsXamlMetaDataProviderStatics?>
  }
}
