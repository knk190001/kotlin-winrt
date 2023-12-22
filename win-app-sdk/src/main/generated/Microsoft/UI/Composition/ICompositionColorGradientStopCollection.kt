package Microsoft.UI.Composition

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

@ABIMarker(ICompositionColorGradientStopCollection.ABI::class)
@Signature("{4794cb29-ce9d-5837-9fc9-847df3e197de}")
@Guid("4794cb29ce9d58379fc9847df3e197de")
@WinRTInterface("4794cb29ce9d58379fc9847df3e197de")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionColorGradientStopCollection.ByReference::class)
public interface ICompositionColorGradientStopCollection : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionColorGradientStopCollection> {
    public override fun getValue() =
        ABI.makeICompositionColorGradientStopCollection(pointer.getPointer(0))

    public fun setValue(value: ICompositionColorGradientStopCollection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionColorGradientStopCollection {
    public val __1871488990_Ptr: Pointer?

    public val _1871488990_VtblPtr: Pointer?
      get() = __1871488990_Ptr?.getPointer(0)
  }

  public class ICompositionColorGradientStopCollection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1871488990_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionColorGradientStopCollection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4794cb29ce9d58379fc9847df3e197de")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionColorGradientStopCollection(ptr: Pointer?): WithDefault =
        ICompositionColorGradientStopCollection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICompositionColorGradientStopCollection {
      val address = segment.toRawLongValue()
      return makeICompositionColorGradientStopCollection(Pointer(address))
    }

    public override fun toNative(obj: ICompositionColorGradientStopCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1871488990_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionColorGradientStopCollection):
        Array<ICompositionColorGradientStopCollection?> = (elements as
        Array<ICompositionColorGradientStopCollection?>).castToImpl<ICompositionColorGradientStopCollection,ICompositionColorGradientStopCollection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionColorGradientStopCollection?> =
        arrayOfNulls<ICompositionColorGradientStopCollection_Impl>(size) as
        Array<ICompositionColorGradientStopCollection?>
  }
}
