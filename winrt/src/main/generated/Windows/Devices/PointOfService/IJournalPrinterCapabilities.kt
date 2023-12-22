package Windows.Devices.PointOfService

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

@ABIMarker(IJournalPrinterCapabilities.ABI::class)
@Signature("{3b5ccc43-e047-4463-bb58-17b5ba1d8056}")
@Guid("3b5ccc43e0474463bb5817b5ba1d8056")
@WinRTInterface("3b5ccc43e0474463bb5817b5ba1d8056")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IJournalPrinterCapabilities.ByReference::class)
public interface IJournalPrinterCapabilities : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IJournalPrinterCapabilities> {
    public override fun getValue() = ABI.makeIJournalPrinterCapabilities(pointer.getPointer(0))

    public fun setValue(value: IJournalPrinterCapabilities_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IJournalPrinterCapabilities {
    public val __1947668120_Ptr: Pointer?

    public val _1947668120_VtblPtr: Pointer?
      get() = __1947668120_Ptr?.getPointer(0)
  }

  public class IJournalPrinterCapabilities_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1947668120_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IJournalPrinterCapabilities, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3b5ccc43e0474463bb5817b5ba1d8056")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIJournalPrinterCapabilities(ptr: Pointer?): WithDefault =
        IJournalPrinterCapabilities_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IJournalPrinterCapabilities {
      val address = segment.toRawLongValue()
      return makeIJournalPrinterCapabilities(Pointer(address))
    }

    public override fun toNative(obj: IJournalPrinterCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1947668120_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IJournalPrinterCapabilities):
        Array<IJournalPrinterCapabilities?> = (elements as
        Array<IJournalPrinterCapabilities?>).castToImpl<IJournalPrinterCapabilities,IJournalPrinterCapabilities_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IJournalPrinterCapabilities?> =
        arrayOfNulls<IJournalPrinterCapabilities_Impl>(size) as Array<IJournalPrinterCapabilities?>
  }
}
