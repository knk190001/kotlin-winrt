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

@ABIMarker(IVirtualizingPanelFactory.ABI::class)
@Signature("{be19f839-cbd0-43e9-a5d0-0bdba0ffbd38}")
@Guid("be19f839cbd043e9a5d00bdba0ffbd38")
@WinRTInterface("be19f839cbd043e9a5d00bdba0ffbd38")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVirtualizingPanelFactory.ByReference::class)
public interface IVirtualizingPanelFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVirtualizingPanelFactory> {
    public override fun getValue() = ABI.makeIVirtualizingPanelFactory(pointer.getPointer(0))

    public fun setValue(value: IVirtualizingPanelFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVirtualizingPanelFactory {
    public val __964729208_Ptr: Pointer?

    public val _964729208_VtblPtr: Pointer?
      get() = __964729208_Ptr?.getPointer(0)
  }

  public class IVirtualizingPanelFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __964729208_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVirtualizingPanelFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("be19f839cbd043e9a5d00bdba0ffbd38")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVirtualizingPanelFactory(ptr: Pointer?): WithDefault =
        IVirtualizingPanelFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVirtualizingPanelFactory {
      val address = segment.toRawLongValue()
      return makeIVirtualizingPanelFactory(Pointer(address))
    }

    public override fun toNative(obj: IVirtualizingPanelFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__964729208_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVirtualizingPanelFactory):
        Array<IVirtualizingPanelFactory?> = (elements as
        Array<IVirtualizingPanelFactory?>).castToImpl<IVirtualizingPanelFactory,IVirtualizingPanelFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVirtualizingPanelFactory?> =
        arrayOfNulls<IVirtualizingPanelFactory_Impl>(size) as Array<IVirtualizingPanelFactory?>
  }
}
