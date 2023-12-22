package Windows.Graphics.Printing.PrintSupport

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

@ABIMarker(IPrintSupportExtensionTriggerDetails.ABI::class)
@Signature("{ae083711-9b09-55d1-a0ae-2a14c5f83d6a}")
@Guid("ae0837119b0955d1a0ae2a14c5f83d6a")
@WinRTInterface("ae0837119b0955d1a0ae2a14c5f83d6a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintSupportExtensionTriggerDetails.ByReference::class)
public interface IPrintSupportExtensionTriggerDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Session(): PrintSupportExtensionSession?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintSupportExtensionTriggerDetails> {
    public override fun getValue() =
        ABI.makeIPrintSupportExtensionTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IPrintSupportExtensionTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintSupportExtensionTriggerDetails {
    public val __1265484863_Ptr: Pointer?

    public val _1265484863_VtblPtr: Pointer?
      get() = __1265484863_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Session(): PrintSupportExtensionSession? {
      val fnPtr = _1265484863_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintSupportExtensionSession>()
      val hr = fn.invokeHR(arrayOf(__1265484863_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintSupportExtensionSession>(result.getValue())
      return resultValue
    }
  }

  public class IPrintSupportExtensionTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1265484863_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintSupportExtensionTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ae0837119b0955d1a0ae2a14c5f83d6a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintSupportExtensionTriggerDetails(ptr: Pointer?): WithDefault =
        IPrintSupportExtensionTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintSupportExtensionTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIPrintSupportExtensionTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IPrintSupportExtensionTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1265484863_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintSupportExtensionTriggerDetails):
        Array<IPrintSupportExtensionTriggerDetails?> = (elements as
        Array<IPrintSupportExtensionTriggerDetails?>).castToImpl<IPrintSupportExtensionTriggerDetails,IPrintSupportExtensionTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintSupportExtensionTriggerDetails?> =
        arrayOfNulls<IPrintSupportExtensionTriggerDetails_Impl>(size) as
        Array<IPrintSupportExtensionTriggerDetails?>
  }
}
