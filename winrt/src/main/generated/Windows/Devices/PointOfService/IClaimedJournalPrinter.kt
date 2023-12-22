package Windows.Devices.PointOfService

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
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
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IClaimedJournalPrinter.ABI::class)
@Signature("{67ea0630-517d-487f-9fdf-d2e0a0a264a5}")
@Guid("67ea0630517d487f9fdfd2e0a0a264a5")
@WinRTInterface("67ea0630517d487f9fdfd2e0a0a264a5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IClaimedJournalPrinter.ByReference::class)
public interface IClaimedJournalPrinter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateJob(): JournalPrintJob?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IClaimedJournalPrinter> {
    public override fun getValue() = ABI.makeIClaimedJournalPrinter(pointer.getPointer(0))

    public fun setValue(value: IClaimedJournalPrinter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IClaimedJournalPrinter {
    public val __1432139297_Ptr: Pointer?

    public val _1432139297_VtblPtr: Pointer?
      get() = __1432139297_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateJob(): JournalPrintJob? {
      val fnPtr = _1432139297_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<JournalPrintJob>()
      val hr = fn.invokeHR(arrayOf(__1432139297_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<JournalPrintJob>(result.getValue())
      return resultValue
    }
  }

  public class IClaimedJournalPrinter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1432139297_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IClaimedJournalPrinter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("67ea0630517d487f9fdfd2e0a0a264a5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIClaimedJournalPrinter(ptr: Pointer?): WithDefault =
        IClaimedJournalPrinter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IClaimedJournalPrinter {
      val address = segment.toRawLongValue()
      return makeIClaimedJournalPrinter(Pointer(address))
    }

    public override fun toNative(obj: IClaimedJournalPrinter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1432139297_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IClaimedJournalPrinter): Array<IClaimedJournalPrinter?> =
        (elements as
        Array<IClaimedJournalPrinter?>).castToImpl<IClaimedJournalPrinter,IClaimedJournalPrinter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IClaimedJournalPrinter?> =
        arrayOfNulls<IClaimedJournalPrinter_Impl>(size) as Array<IClaimedJournalPrinter?>
  }
}
