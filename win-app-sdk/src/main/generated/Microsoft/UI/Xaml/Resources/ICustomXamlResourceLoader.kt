package Microsoft.UI.Xaml.Resources

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICustomXamlResourceLoader.ABI::class)
@Signature("{2832c2e5-2ace-5993-a173-3c9c3b992b2e}")
@Guid("2832c2e52ace5993a1733c9c3b992b2e")
@WinRTInterface("2832c2e52ace5993a1733c9c3b992b2e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICustomXamlResourceLoader.ByReference::class)
public interface ICustomXamlResourceLoader : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICustomXamlResourceLoader> {
    public override fun getValue() = ABI.makeICustomXamlResourceLoader(pointer.getPointer(0))

    public fun setValue(value: ICustomXamlResourceLoader_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICustomXamlResourceLoader {
    public val __1871629194_Ptr: Pointer?

    public val _1871629194_VtblPtr: Pointer?
      get() = __1871629194_Ptr?.getPointer(0)
  }

  public class ICustomXamlResourceLoader_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1871629194_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICustomXamlResourceLoader, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2832c2e52ace5993a1733c9c3b992b2e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICustomXamlResourceLoader(ptr: Pointer?): WithDefault =
        ICustomXamlResourceLoader_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICustomXamlResourceLoader {
      val address = segment.toRawLongValue()
      return makeICustomXamlResourceLoader(Pointer(address))
    }

    public override fun toNative(obj: ICustomXamlResourceLoader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1871629194_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICustomXamlResourceLoader):
        Array<ICustomXamlResourceLoader?> = (elements as
        Array<ICustomXamlResourceLoader?>).castToImpl<ICustomXamlResourceLoader,ICustomXamlResourceLoader_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICustomXamlResourceLoader?> =
        arrayOfNulls<ICustomXamlResourceLoader_Impl>(size) as Array<ICustomXamlResourceLoader?>
  }
}
