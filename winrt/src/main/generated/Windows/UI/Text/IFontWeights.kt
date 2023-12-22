package Windows.UI.Text

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

@ABIMarker(IFontWeights.ABI::class)
@Signature("{7880a444-01ab-4997-8517-df822a0c45f1}")
@Guid("7880a44401ab49978517df822a0c45f1")
@WinRTInterface("7880a44401ab49978517df822a0c45f1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFontWeights.ByReference::class)
public interface IFontWeights : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IFontWeights> {
    public override fun getValue() = ABI.makeIFontWeights(pointer.getPointer(0))

    public fun setValue(value: IFontWeights_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFontWeights {
    public val __33524865_Ptr: Pointer?

    public val _33524865_VtblPtr: Pointer?
      get() = __33524865_Ptr?.getPointer(0)
  }

  public class IFontWeights_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __33524865_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFontWeights, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7880a44401ab49978517df822a0c45f1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFontWeights(ptr: Pointer?): WithDefault = IFontWeights_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFontWeights {
      val address = segment.toRawLongValue()
      return makeIFontWeights(Pointer(address))
    }

    public override fun toNative(obj: IFontWeights): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__33524865_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFontWeights): Array<IFontWeights?> = (elements as
        Array<IFontWeights?>).castToImpl<IFontWeights,IFontWeights_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFontWeights?> =
        arrayOfNulls<IFontWeights_Impl>(size) as Array<IFontWeights?>
  }
}
