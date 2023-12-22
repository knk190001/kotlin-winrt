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

@ABIMarker(ILinedFlowLayoutItemCollectionTransitionProvider.ABI::class)
@Signature("{a7c000de-2543-5dc2-a36d-5d69f4f55d61}")
@Guid("a7c000de25435dc2a36d5d69f4f55d61")
@WinRTInterface("a7c000de25435dc2a36d5d69f4f55d61")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILinedFlowLayoutItemCollectionTransitionProvider.ByReference::class)
public interface ILinedFlowLayoutItemCollectionTransitionProvider : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILinedFlowLayoutItemCollectionTransitionProvider> {
    public override fun getValue() =
        ABI.makeILinedFlowLayoutItemCollectionTransitionProvider(pointer.getPointer(0))

    public fun setValue(value: ILinedFlowLayoutItemCollectionTransitionProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILinedFlowLayoutItemCollectionTransitionProvider {
    public val __1881886424_Ptr: Pointer?

    public val _1881886424_VtblPtr: Pointer?
      get() = __1881886424_Ptr?.getPointer(0)
  }

  public class ILinedFlowLayoutItemCollectionTransitionProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1881886424_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILinedFlowLayoutItemCollectionTransitionProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a7c000de25435dc2a36d5d69f4f55d61")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILinedFlowLayoutItemCollectionTransitionProvider(ptr: Pointer?): WithDefault =
        ILinedFlowLayoutItemCollectionTransitionProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ILinedFlowLayoutItemCollectionTransitionProvider {
      val address = segment.toRawLongValue()
      return makeILinedFlowLayoutItemCollectionTransitionProvider(Pointer(address))
    }

    public override fun toNative(obj: ILinedFlowLayoutItemCollectionTransitionProvider):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1881886424_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILinedFlowLayoutItemCollectionTransitionProvider):
        Array<ILinedFlowLayoutItemCollectionTransitionProvider?> = (elements as
        Array<ILinedFlowLayoutItemCollectionTransitionProvider?>).castToImpl<ILinedFlowLayoutItemCollectionTransitionProvider,ILinedFlowLayoutItemCollectionTransitionProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILinedFlowLayoutItemCollectionTransitionProvider?>
        = arrayOfNulls<ILinedFlowLayoutItemCollectionTransitionProvider_Impl>(size) as
        Array<ILinedFlowLayoutItemCollectionTransitionProvider?>
  }
}
