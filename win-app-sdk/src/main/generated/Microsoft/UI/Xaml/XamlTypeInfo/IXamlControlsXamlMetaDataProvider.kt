package Microsoft.UI.Xaml.XamlTypeInfo

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

@ABIMarker(IXamlControlsXamlMetaDataProvider.ABI::class)
@Signature("{17fa3f58-3472-5aa2-a0f8-1ab8a519573d}")
@Guid("17fa3f5834725aa2a0f81ab8a519573d")
@WinRTInterface("17fa3f5834725aa2a0f81ab8a519573d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlControlsXamlMetaDataProvider.ByReference::class)
public interface IXamlControlsXamlMetaDataProvider : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlControlsXamlMetaDataProvider> {
    public override fun getValue() =
        ABI.makeIXamlControlsXamlMetaDataProvider(pointer.getPointer(0))

    public fun setValue(value: IXamlControlsXamlMetaDataProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlControlsXamlMetaDataProvider {
    public val __1524660397_Ptr: Pointer?

    public val _1524660397_VtblPtr: Pointer?
      get() = __1524660397_Ptr?.getPointer(0)
  }

  public class IXamlControlsXamlMetaDataProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1524660397_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlControlsXamlMetaDataProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("17fa3f5834725aa2a0f81ab8a519573d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlControlsXamlMetaDataProvider(ptr: Pointer?): WithDefault =
        IXamlControlsXamlMetaDataProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlControlsXamlMetaDataProvider {
      val address = segment.toRawLongValue()
      return makeIXamlControlsXamlMetaDataProvider(Pointer(address))
    }

    public override fun toNative(obj: IXamlControlsXamlMetaDataProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1524660397_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlControlsXamlMetaDataProvider):
        Array<IXamlControlsXamlMetaDataProvider?> = (elements as
        Array<IXamlControlsXamlMetaDataProvider?>).castToImpl<IXamlControlsXamlMetaDataProvider,IXamlControlsXamlMetaDataProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlControlsXamlMetaDataProvider?> =
        arrayOfNulls<IXamlControlsXamlMetaDataProvider_Impl>(size) as
        Array<IXamlControlsXamlMetaDataProvider?>
  }
}
