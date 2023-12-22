package Windows.Graphics.Printing.Workflow

import Windows.Storage.Streams.IOutputStream
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

@ABIMarker(IPrintWorkflowStreamTarget.ABI::class)
@Signature("{b23bba84-8565-488b-9839-1c9e7c7aa916}")
@Guid("b23bba848565488b98391c9e7c7aa916")
@WinRTInterface("b23bba848565488b98391c9e7c7aa916")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintWorkflowStreamTarget.ByReference::class)
public interface IPrintWorkflowStreamTarget : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetOutputStream(): IOutputStream?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintWorkflowStreamTarget> {
    public override fun getValue() = ABI.makeIPrintWorkflowStreamTarget(pointer.getPointer(0))

    public fun setValue(value: IPrintWorkflowStreamTarget_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintWorkflowStreamTarget {
    public val __1433926156_Ptr: Pointer?

    public val _1433926156_VtblPtr: Pointer?
      get() = __1433926156_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetOutputStream(): IOutputStream? {
      val fnPtr = _1433926156_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IOutputStream>()
      val hr = fn.invokeHR(arrayOf(__1433926156_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IOutputStream>(result.getValue())
      return resultValue
    }
  }

  public class IPrintWorkflowStreamTarget_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1433926156_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintWorkflowStreamTarget, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b23bba848565488b98391c9e7c7aa916")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintWorkflowStreamTarget(ptr: Pointer?): WithDefault =
        IPrintWorkflowStreamTarget_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintWorkflowStreamTarget {
      val address = segment.toRawLongValue()
      return makeIPrintWorkflowStreamTarget(Pointer(address))
    }

    public override fun toNative(obj: IPrintWorkflowStreamTarget): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1433926156_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintWorkflowStreamTarget):
        Array<IPrintWorkflowStreamTarget?> = (elements as
        Array<IPrintWorkflowStreamTarget?>).castToImpl<IPrintWorkflowStreamTarget,IPrintWorkflowStreamTarget_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintWorkflowStreamTarget?> =
        arrayOfNulls<IPrintWorkflowStreamTarget_Impl>(size) as Array<IPrintWorkflowStreamTarget?>
  }
}
