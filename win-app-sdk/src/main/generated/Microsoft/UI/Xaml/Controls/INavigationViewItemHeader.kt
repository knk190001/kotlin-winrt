package Microsoft.UI.Xaml.Controls

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

@ABIMarker(INavigationViewItemHeader.ABI::class)
@Signature("{432bc062-45bc-57ef-a2d3-11851a56a882}")
@Guid("432bc06245bc57efa2d311851a56a882")
@WinRTInterface("432bc06245bc57efa2d311851a56a882")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewItemHeader.ByReference::class)
public interface INavigationViewItemHeader : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewItemHeader> {
    public override fun getValue() = ABI.makeINavigationViewItemHeader(pointer.getPointer(0))

    public fun setValue(value: INavigationViewItemHeader_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewItemHeader {
    public val __211974144_Ptr: Pointer?

    public val _211974144_VtblPtr: Pointer?
      get() = __211974144_Ptr?.getPointer(0)
  }

  public class INavigationViewItemHeader_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __211974144_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewItemHeader, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("432bc06245bc57efa2d311851a56a882")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewItemHeader(ptr: Pointer?): WithDefault =
        INavigationViewItemHeader_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationViewItemHeader {
      val address = segment.toRawLongValue()
      return makeINavigationViewItemHeader(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewItemHeader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__211974144_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewItemHeader):
        Array<INavigationViewItemHeader?> = (elements as
        Array<INavigationViewItemHeader?>).castToImpl<INavigationViewItemHeader,INavigationViewItemHeader_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewItemHeader?> =
        arrayOfNulls<INavigationViewItemHeader_Impl>(size) as Array<INavigationViewItemHeader?>
  }
}
