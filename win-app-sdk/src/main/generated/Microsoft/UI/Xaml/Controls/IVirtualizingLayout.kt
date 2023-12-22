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

@ABIMarker(IVirtualizingLayout.ABI::class)
@Signature("{54857ce0-b9e6-51a3-bfa8-dcd8ee306d5c}")
@Guid("54857ce0b9e651a3bfa8dcd8ee306d5c")
@WinRTInterface("54857ce0b9e651a3bfa8dcd8ee306d5c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVirtualizingLayout.ByReference::class)
public interface IVirtualizingLayout : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVirtualizingLayout> {
    public override fun getValue() = ABI.makeIVirtualizingLayout(pointer.getPointer(0))

    public fun setValue(value: IVirtualizingLayout_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVirtualizingLayout {
    public val __922873271_Ptr: Pointer?

    public val _922873271_VtblPtr: Pointer?
      get() = __922873271_Ptr?.getPointer(0)
  }

  public class IVirtualizingLayout_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __922873271_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVirtualizingLayout, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("54857ce0b9e651a3bfa8dcd8ee306d5c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVirtualizingLayout(ptr: Pointer?): WithDefault = IVirtualizingLayout_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVirtualizingLayout {
      val address = segment.toRawLongValue()
      return makeIVirtualizingLayout(Pointer(address))
    }

    public override fun toNative(obj: IVirtualizingLayout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__922873271_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVirtualizingLayout): Array<IVirtualizingLayout?> =
        (elements as
        Array<IVirtualizingLayout?>).castToImpl<IVirtualizingLayout,IVirtualizingLayout_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVirtualizingLayout?> =
        arrayOfNulls<IVirtualizingLayout_Impl>(size) as Array<IVirtualizingLayout?>
  }
}
