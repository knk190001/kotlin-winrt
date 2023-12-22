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

@ABIMarker(IPrintWorkflowJobTriggerDetails.ABI::class)
@Signature("{ff296129-60e2-51db-ba8c-e2ccddb516b9}")
@Guid("ff29612960e251dbba8ce2ccddb516b9")
@WinRTInterface("ff29612960e251dbba8ce2ccddb516b9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintWorkflowJobTriggerDetails.ByReference::class)
public interface IPrintWorkflowJobTriggerDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PrintWorkflowJobSession(): PrintWorkflowJobBackgroundSession?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintWorkflowJobTriggerDetails> {
    public override fun getValue() = ABI.makeIPrintWorkflowJobTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IPrintWorkflowJobTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintWorkflowJobTriggerDetails {
    public val __2132117596_Ptr: Pointer?

    public val _2132117596_VtblPtr: Pointer?
      get() = __2132117596_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PrintWorkflowJobSession(): PrintWorkflowJobBackgroundSession? {
      val fnPtr = _2132117596_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintWorkflowJobBackgroundSession>()
      val hr = fn.invokeHR(arrayOf(__2132117596_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintWorkflowJobBackgroundSession>(result.getValue())
      return resultValue
    }
  }

  public class IPrintWorkflowJobTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2132117596_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintWorkflowJobTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ff29612960e251dbba8ce2ccddb516b9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintWorkflowJobTriggerDetails(ptr: Pointer?): WithDefault =
        IPrintWorkflowJobTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintWorkflowJobTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIPrintWorkflowJobTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IPrintWorkflowJobTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2132117596_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintWorkflowJobTriggerDetails):
        Array<IPrintWorkflowJobTriggerDetails?> = (elements as
        Array<IPrintWorkflowJobTriggerDetails?>).castToImpl<IPrintWorkflowJobTriggerDetails,IPrintWorkflowJobTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintWorkflowJobTriggerDetails?> =
        arrayOfNulls<IPrintWorkflowJobTriggerDetails_Impl>(size) as
        Array<IPrintWorkflowJobTriggerDetails?>
  }
}
