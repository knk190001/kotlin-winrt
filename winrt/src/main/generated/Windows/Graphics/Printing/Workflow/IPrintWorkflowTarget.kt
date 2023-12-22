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

@ABIMarker(IPrintWorkflowTarget.ABI::class)
@Signature("{29da276c-0a73-5aed-4f3d-970d3251f057}")
@Guid("29da276c0a735aed4f3d970d3251f057")
@WinRTInterface("29da276c0a735aed4f3d970d3251f057")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintWorkflowTarget.ByReference::class)
public interface IPrintWorkflowTarget : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TargetAsStream(): PrintWorkflowStreamTarget?

  @InterfaceMethod(1)
  public fun get_TargetAsXpsObjectModelPackage(): PrintWorkflowObjectModelTargetPackage?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintWorkflowTarget> {
    public override fun getValue() = ABI.makeIPrintWorkflowTarget(pointer.getPointer(0))

    public fun setValue(value: IPrintWorkflowTarget_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintWorkflowTarget {
    public val __938866836_Ptr: Pointer?

    public val _938866836_VtblPtr: Pointer?
      get() = __938866836_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TargetAsStream(): PrintWorkflowStreamTarget? {
      val fnPtr = _938866836_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintWorkflowStreamTarget>()
      val hr = fn.invokeHR(arrayOf(__938866836_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintWorkflowStreamTarget>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TargetAsXpsObjectModelPackage():
        PrintWorkflowObjectModelTargetPackage? {
      val fnPtr = _938866836_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintWorkflowObjectModelTargetPackage>()
      val hr = fn.invokeHR(arrayOf(__938866836_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintWorkflowObjectModelTargetPackage>(result.getValue())
      return resultValue
    }
  }

  public class IPrintWorkflowTarget_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __938866836_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintWorkflowTarget, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("29da276c0a735aed4f3d970d3251f057")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintWorkflowTarget(ptr: Pointer?): WithDefault = IPrintWorkflowTarget_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintWorkflowTarget {
      val address = segment.toRawLongValue()
      return makeIPrintWorkflowTarget(Pointer(address))
    }

    public override fun toNative(obj: IPrintWorkflowTarget): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__938866836_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintWorkflowTarget): Array<IPrintWorkflowTarget?> =
        (elements as
        Array<IPrintWorkflowTarget?>).castToImpl<IPrintWorkflowTarget,IPrintWorkflowTarget_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintWorkflowTarget?> =
        arrayOfNulls<IPrintWorkflowTarget_Impl>(size) as Array<IPrintWorkflowTarget?>
  }
}
