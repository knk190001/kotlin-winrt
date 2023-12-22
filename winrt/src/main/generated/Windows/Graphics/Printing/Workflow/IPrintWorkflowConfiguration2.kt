package Windows.Graphics.Printing.Workflow

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

@ABIMarker(IPrintWorkflowConfiguration2.ABI::class)
@Signature("{de350a50-a6d4-5be2-8b9a-09d3d39ea780}")
@Guid("de350a50a6d45be28b9a09d3d39ea780")
@WinRTInterface("de350a50a6d45be28b9a09d3d39ea780")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintWorkflowConfiguration2.ByReference::class)
public interface IPrintWorkflowConfiguration2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AbortPrintFlow(reason: PrintWorkflowJobAbortReason?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintWorkflowConfiguration2> {
    public override fun getValue() = ABI.makeIPrintWorkflowConfiguration2(pointer.getPointer(0))

    public fun setValue(value: IPrintWorkflowConfiguration2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintWorkflowConfiguration2 {
    public val __871825921_Ptr: Pointer?

    public val _871825921_VtblPtr: Pointer?
      get() = __871825921_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AbortPrintFlow(reason: PrintWorkflowJobAbortReason?): Unit {
      val fnPtr = _871825921_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__871825921_Ptr, marshalToNative(reason),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPrintWorkflowConfiguration2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __871825921_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintWorkflowConfiguration2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("de350a50a6d45be28b9a09d3d39ea780")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintWorkflowConfiguration2(ptr: Pointer?): WithDefault =
        IPrintWorkflowConfiguration2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintWorkflowConfiguration2 {
      val address = segment.toRawLongValue()
      return makeIPrintWorkflowConfiguration2(Pointer(address))
    }

    public override fun toNative(obj: IPrintWorkflowConfiguration2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__871825921_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintWorkflowConfiguration2):
        Array<IPrintWorkflowConfiguration2?> = (elements as
        Array<IPrintWorkflowConfiguration2?>).castToImpl<IPrintWorkflowConfiguration2,IPrintWorkflowConfiguration2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintWorkflowConfiguration2?> =
        arrayOfNulls<IPrintWorkflowConfiguration2_Impl>(size) as
        Array<IPrintWorkflowConfiguration2?>
  }
}
