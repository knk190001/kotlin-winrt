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

@ABIMarker(INavigationViewItemSeparator.ABI::class)
@Signature("{e3c35630-1d5f-5689-a0cb-8794485caacf}")
@Guid("e3c356301d5f5689a0cb8794485caacf")
@WinRTInterface("e3c356301d5f5689a0cb8794485caacf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewItemSeparator.ByReference::class)
public interface INavigationViewItemSeparator : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewItemSeparator> {
    public override fun getValue() = ABI.makeINavigationViewItemSeparator(pointer.getPointer(0))

    public fun setValue(value: INavigationViewItemSeparator_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewItemSeparator {
    public val __626418834_Ptr: Pointer?

    public val _626418834_VtblPtr: Pointer?
      get() = __626418834_Ptr?.getPointer(0)
  }

  public class INavigationViewItemSeparator_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __626418834_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewItemSeparator, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e3c356301d5f5689a0cb8794485caacf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewItemSeparator(ptr: Pointer?): WithDefault =
        INavigationViewItemSeparator_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationViewItemSeparator {
      val address = segment.toRawLongValue()
      return makeINavigationViewItemSeparator(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewItemSeparator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__626418834_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewItemSeparator):
        Array<INavigationViewItemSeparator?> = (elements as
        Array<INavigationViewItemSeparator?>).castToImpl<INavigationViewItemSeparator,INavigationViewItemSeparator_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewItemSeparator?> =
        arrayOfNulls<INavigationViewItemSeparator_Impl>(size) as
        Array<INavigationViewItemSeparator?>
  }
}
