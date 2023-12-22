package Windows.UI.Xaml.Documents

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

@ABIMarker(IPlaceContentLinkProvider.ABI::class)
@Signature("{10348a4c-2366-41be-90c8-3258b53b5483}")
@Guid("10348a4c236641be90c83258b53b5483")
@WinRTInterface("10348a4c236641be90c83258b53b5483")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlaceContentLinkProvider.ByReference::class)
public interface IPlaceContentLinkProvider : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlaceContentLinkProvider> {
    public override fun getValue() = ABI.makeIPlaceContentLinkProvider(pointer.getPointer(0))

    public fun setValue(value: IPlaceContentLinkProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlaceContentLinkProvider {
    public val __1002079429_Ptr: Pointer?

    public val _1002079429_VtblPtr: Pointer?
      get() = __1002079429_Ptr?.getPointer(0)
  }

  public class IPlaceContentLinkProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1002079429_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlaceContentLinkProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("10348a4c236641be90c83258b53b5483")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlaceContentLinkProvider(ptr: Pointer?): WithDefault =
        IPlaceContentLinkProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlaceContentLinkProvider {
      val address = segment.toRawLongValue()
      return makeIPlaceContentLinkProvider(Pointer(address))
    }

    public override fun toNative(obj: IPlaceContentLinkProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1002079429_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlaceContentLinkProvider):
        Array<IPlaceContentLinkProvider?> = (elements as
        Array<IPlaceContentLinkProvider?>).castToImpl<IPlaceContentLinkProvider,IPlaceContentLinkProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlaceContentLinkProvider?> =
        arrayOfNulls<IPlaceContentLinkProvider_Impl>(size) as Array<IPlaceContentLinkProvider?>
  }
}
