package Microsoft.UI.Content

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

@ABIMarker(IContentSiteFactory.ABI::class)
@Signature("{72fb98d5-b28a-57f1-91fa-24c014a342c1}")
@Guid("72fb98d5b28a57f191fa24c014a342c1")
@WinRTInterface("72fb98d5b28a57f191fa24c014a342c1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentSiteFactory.ByReference::class)
public interface IContentSiteFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentSiteFactory> {
    public override fun getValue() = ABI.makeIContentSiteFactory(pointer.getPointer(0))

    public fun setValue(value: IContentSiteFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentSiteFactory {
    public val __1655785676_Ptr: Pointer?

    public val _1655785676_VtblPtr: Pointer?
      get() = __1655785676_Ptr?.getPointer(0)
  }

  public class IContentSiteFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1655785676_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentSiteFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("72fb98d5b28a57f191fa24c014a342c1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentSiteFactory(ptr: Pointer?): WithDefault = IContentSiteFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentSiteFactory {
      val address = segment.toRawLongValue()
      return makeIContentSiteFactory(Pointer(address))
    }

    public override fun toNative(obj: IContentSiteFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1655785676_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentSiteFactory): Array<IContentSiteFactory?> =
        (elements as
        Array<IContentSiteFactory?>).castToImpl<IContentSiteFactory,IContentSiteFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentSiteFactory?> =
        arrayOfNulls<IContentSiteFactory_Impl>(size) as Array<IContentSiteFactory?>
  }
}
