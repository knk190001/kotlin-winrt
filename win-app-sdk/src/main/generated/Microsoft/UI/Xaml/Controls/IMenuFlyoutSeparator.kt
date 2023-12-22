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

@ABIMarker(IMenuFlyoutSeparator.ABI::class)
@Signature("{3eaf5fd5-935e-5ed7-8d05-f6bafa936d25}")
@Guid("3eaf5fd5935e5ed78d05f6bafa936d25")
@WinRTInterface("3eaf5fd5935e5ed78d05f6bafa936d25")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMenuFlyoutSeparator.ByReference::class)
public interface IMenuFlyoutSeparator : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMenuFlyoutSeparator> {
    public override fun getValue() = ABI.makeIMenuFlyoutSeparator(pointer.getPointer(0))

    public fun setValue(value: IMenuFlyoutSeparator_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMenuFlyoutSeparator {
    public val __245314212_Ptr: Pointer?

    public val _245314212_VtblPtr: Pointer?
      get() = __245314212_Ptr?.getPointer(0)
  }

  public class IMenuFlyoutSeparator_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __245314212_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMenuFlyoutSeparator, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3eaf5fd5935e5ed78d05f6bafa936d25")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMenuFlyoutSeparator(ptr: Pointer?): WithDefault = IMenuFlyoutSeparator_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMenuFlyoutSeparator {
      val address = segment.toRawLongValue()
      return makeIMenuFlyoutSeparator(Pointer(address))
    }

    public override fun toNative(obj: IMenuFlyoutSeparator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__245314212_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMenuFlyoutSeparator): Array<IMenuFlyoutSeparator?> =
        (elements as
        Array<IMenuFlyoutSeparator?>).castToImpl<IMenuFlyoutSeparator,IMenuFlyoutSeparator_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMenuFlyoutSeparator?> =
        arrayOfNulls<IMenuFlyoutSeparator_Impl>(size) as Array<IMenuFlyoutSeparator?>
  }
}
