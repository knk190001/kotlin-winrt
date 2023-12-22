package Windows.Graphics.Printing.Workflow

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

@ABIMarker(IPrintWorkflowObjectModelTargetPackage.ABI::class)
@Signature("{7d96bc74-9b54-4ca1-ad3a-979c3d44ddac}")
@Guid("7d96bc749b544ca1ad3a979c3d44ddac")
@WinRTInterface("7d96bc749b544ca1ad3a979c3d44ddac")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintWorkflowObjectModelTargetPackage.ByReference::class)
public interface IPrintWorkflowObjectModelTargetPackage : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintWorkflowObjectModelTargetPackage> {
    public override fun getValue() =
        ABI.makeIPrintWorkflowObjectModelTargetPackage(pointer.getPointer(0))

    public fun setValue(value: IPrintWorkflowObjectModelTargetPackage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintWorkflowObjectModelTargetPackage {
    public val __1209295186_Ptr: Pointer?

    public val _1209295186_VtblPtr: Pointer?
      get() = __1209295186_Ptr?.getPointer(0)
  }

  public class IPrintWorkflowObjectModelTargetPackage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1209295186_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintWorkflowObjectModelTargetPackage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7d96bc749b544ca1ad3a979c3d44ddac")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintWorkflowObjectModelTargetPackage(ptr: Pointer?): WithDefault =
        IPrintWorkflowObjectModelTargetPackage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintWorkflowObjectModelTargetPackage {
      val address = segment.toRawLongValue()
      return makeIPrintWorkflowObjectModelTargetPackage(Pointer(address))
    }

    public override fun toNative(obj: IPrintWorkflowObjectModelTargetPackage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1209295186_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintWorkflowObjectModelTargetPackage):
        Array<IPrintWorkflowObjectModelTargetPackage?> = (elements as
        Array<IPrintWorkflowObjectModelTargetPackage?>).castToImpl<IPrintWorkflowObjectModelTargetPackage,IPrintWorkflowObjectModelTargetPackage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintWorkflowObjectModelTargetPackage?> =
        arrayOfNulls<IPrintWorkflowObjectModelTargetPackage_Impl>(size) as
        Array<IPrintWorkflowObjectModelTargetPackage?>
  }
}
