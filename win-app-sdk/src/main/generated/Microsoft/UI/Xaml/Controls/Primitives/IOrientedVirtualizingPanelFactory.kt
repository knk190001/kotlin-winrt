package Microsoft.UI.Xaml.Controls.Primitives

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

@ABIMarker(IOrientedVirtualizingPanelFactory.ABI::class)
@Signature("{a70c98f4-d671-5f46-9b01-28b1b5528fc0}")
@Guid("a70c98f4d6715f469b0128b1b5528fc0")
@WinRTInterface("a70c98f4d6715f469b0128b1b5528fc0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IOrientedVirtualizingPanelFactory.ByReference::class)
public interface IOrientedVirtualizingPanelFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IOrientedVirtualizingPanelFactory> {
    public override fun getValue() =
        ABI.makeIOrientedVirtualizingPanelFactory(pointer.getPointer(0))

    public fun setValue(value: IOrientedVirtualizingPanelFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IOrientedVirtualizingPanelFactory {
    public val __1505196673_Ptr: Pointer?

    public val _1505196673_VtblPtr: Pointer?
      get() = __1505196673_Ptr?.getPointer(0)
  }

  public class IOrientedVirtualizingPanelFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1505196673_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IOrientedVirtualizingPanelFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a70c98f4d6715f469b0128b1b5528fc0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIOrientedVirtualizingPanelFactory(ptr: Pointer?): WithDefault =
        IOrientedVirtualizingPanelFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IOrientedVirtualizingPanelFactory {
      val address = segment.toRawLongValue()
      return makeIOrientedVirtualizingPanelFactory(Pointer(address))
    }

    public override fun toNative(obj: IOrientedVirtualizingPanelFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1505196673_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IOrientedVirtualizingPanelFactory):
        Array<IOrientedVirtualizingPanelFactory?> = (elements as
        Array<IOrientedVirtualizingPanelFactory?>).castToImpl<IOrientedVirtualizingPanelFactory,IOrientedVirtualizingPanelFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IOrientedVirtualizingPanelFactory?> =
        arrayOfNulls<IOrientedVirtualizingPanelFactory_Impl>(size) as
        Array<IOrientedVirtualizingPanelFactory?>
  }
}
