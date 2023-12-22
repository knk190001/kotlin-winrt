package Windows.Graphics.Printing

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

@ABIMarker(IPrintDocumentSource.ABI::class)
@Signature("{dedc0c30-f1eb-47df-aae6-ed5427511f01}")
@Guid("dedc0c30f1eb47dfaae6ed5427511f01")
@WinRTInterface("dedc0c30f1eb47dfaae6ed5427511f01")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintDocumentSource.ByReference::class)
public interface IPrintDocumentSource : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintDocumentSource> {
    public override fun getValue() = ABI.makeIPrintDocumentSource(pointer.getPointer(0))

    public fun setValue(value: IPrintDocumentSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintDocumentSource {
    public val __1773976807_Ptr: Pointer?

    public val _1773976807_VtblPtr: Pointer?
      get() = __1773976807_Ptr?.getPointer(0)
  }

  public class IPrintDocumentSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1773976807_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintDocumentSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dedc0c30f1eb47dfaae6ed5427511f01")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintDocumentSource(ptr: Pointer?): WithDefault = IPrintDocumentSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintDocumentSource {
      val address = segment.toRawLongValue()
      return makeIPrintDocumentSource(Pointer(address))
    }

    public override fun toNative(obj: IPrintDocumentSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1773976807_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintDocumentSource): Array<IPrintDocumentSource?> =
        (elements as
        Array<IPrintDocumentSource?>).castToImpl<IPrintDocumentSource,IPrintDocumentSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintDocumentSource?> =
        arrayOfNulls<IPrintDocumentSource_Impl>(size) as Array<IPrintDocumentSource?>
  }
}
