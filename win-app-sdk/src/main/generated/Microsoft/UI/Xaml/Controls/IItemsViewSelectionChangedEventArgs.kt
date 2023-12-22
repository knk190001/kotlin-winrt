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

@ABIMarker(IItemsViewSelectionChangedEventArgs.ABI::class)
@Signature("{9cd1690f-6c9d-543c-82f2-30cd37d765b3}")
@Guid("9cd1690f6c9d543c82f230cd37d765b3")
@WinRTInterface("9cd1690f6c9d543c82f230cd37d765b3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemsViewSelectionChangedEventArgs.ByReference::class)
public interface IItemsViewSelectionChangedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemsViewSelectionChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIItemsViewSelectionChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IItemsViewSelectionChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemsViewSelectionChangedEventArgs {
    public val __1150006513_Ptr: Pointer?

    public val _1150006513_VtblPtr: Pointer?
      get() = __1150006513_Ptr?.getPointer(0)
  }

  public class IItemsViewSelectionChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1150006513_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemsViewSelectionChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9cd1690f6c9d543c82f230cd37d765b3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemsViewSelectionChangedEventArgs(ptr: Pointer?): WithDefault =
        IItemsViewSelectionChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemsViewSelectionChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIItemsViewSelectionChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IItemsViewSelectionChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1150006513_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemsViewSelectionChangedEventArgs):
        Array<IItemsViewSelectionChangedEventArgs?> = (elements as
        Array<IItemsViewSelectionChangedEventArgs?>).castToImpl<IItemsViewSelectionChangedEventArgs,IItemsViewSelectionChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemsViewSelectionChangedEventArgs?> =
        arrayOfNulls<IItemsViewSelectionChangedEventArgs_Impl>(size) as
        Array<IItemsViewSelectionChangedEventArgs?>
  }
}
