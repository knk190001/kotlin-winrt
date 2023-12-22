package Windows.UI.Xaml.Controls

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

@ABIMarker(IMenuFlyoutItemBase.ABI::class)
@Signature("{f9b56047-8da6-4730-9208-144125c6b396}")
@Guid("f9b560478da647309208144125c6b396")
@WinRTInterface("f9b560478da647309208144125c6b396")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMenuFlyoutItemBase.ByReference::class)
public interface IMenuFlyoutItemBase : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMenuFlyoutItemBase> {
    public override fun getValue() = ABI.makeIMenuFlyoutItemBase(pointer.getPointer(0))

    public fun setValue(value: IMenuFlyoutItemBase_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMenuFlyoutItemBase {
    public val __1031402490_Ptr: Pointer?

    public val _1031402490_VtblPtr: Pointer?
      get() = __1031402490_Ptr?.getPointer(0)
  }

  public class IMenuFlyoutItemBase_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1031402490_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMenuFlyoutItemBase, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f9b560478da647309208144125c6b396")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMenuFlyoutItemBase(ptr: Pointer?): WithDefault = IMenuFlyoutItemBase_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMenuFlyoutItemBase {
      val address = segment.toRawLongValue()
      return makeIMenuFlyoutItemBase(Pointer(address))
    }

    public override fun toNative(obj: IMenuFlyoutItemBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1031402490_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMenuFlyoutItemBase): Array<IMenuFlyoutItemBase?> =
        (elements as
        Array<IMenuFlyoutItemBase?>).castToImpl<IMenuFlyoutItemBase,IMenuFlyoutItemBase_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMenuFlyoutItemBase?> =
        arrayOfNulls<IMenuFlyoutItemBase_Impl>(size) as Array<IMenuFlyoutItemBase?>
  }
}
