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

@ABIMarker(IMenuBarItemFlyout.ABI::class)
@Signature("{ed00d2d8-b686-55fe-8dbb-f04a640e42ef}")
@Guid("ed00d2d8b68655fe8dbbf04a640e42ef")
@WinRTInterface("ed00d2d8b68655fe8dbbf04a640e42ef")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMenuBarItemFlyout.ByReference::class)
public interface IMenuBarItemFlyout : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMenuBarItemFlyout> {
    public override fun getValue() = ABI.makeIMenuBarItemFlyout(pointer.getPointer(0))

    public fun setValue(value: IMenuBarItemFlyout_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMenuBarItemFlyout {
    public val __1570963546_Ptr: Pointer?

    public val _1570963546_VtblPtr: Pointer?
      get() = __1570963546_Ptr?.getPointer(0)
  }

  public class IMenuBarItemFlyout_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1570963546_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMenuBarItemFlyout, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ed00d2d8b68655fe8dbbf04a640e42ef")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMenuBarItemFlyout(ptr: Pointer?): WithDefault = IMenuBarItemFlyout_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMenuBarItemFlyout {
      val address = segment.toRawLongValue()
      return makeIMenuBarItemFlyout(Pointer(address))
    }

    public override fun toNative(obj: IMenuBarItemFlyout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1570963546_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMenuBarItemFlyout): Array<IMenuBarItemFlyout?> =
        (elements as
        Array<IMenuBarItemFlyout?>).castToImpl<IMenuBarItemFlyout,IMenuBarItemFlyout_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMenuBarItemFlyout?> =
        arrayOfNulls<IMenuBarItemFlyout_Impl>(size) as Array<IMenuBarItemFlyout?>
  }
}
