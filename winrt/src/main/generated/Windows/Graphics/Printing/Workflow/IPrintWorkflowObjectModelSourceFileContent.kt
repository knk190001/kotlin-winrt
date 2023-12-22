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

@ABIMarker(IPrintWorkflowObjectModelSourceFileContent.ABI::class)
@Signature("{c36c8a6a-8a2a-419a-b3c3-2090e6bfab2f}")
@Guid("c36c8a6a8a2a419ab3c32090e6bfab2f")
@WinRTInterface("c36c8a6a8a2a419ab3c32090e6bfab2f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintWorkflowObjectModelSourceFileContent.ByReference::class)
public interface IPrintWorkflowObjectModelSourceFileContent : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintWorkflowObjectModelSourceFileContent> {
    public override fun getValue() =
        ABI.makeIPrintWorkflowObjectModelSourceFileContent(pointer.getPointer(0))

    public fun setValue(value: IPrintWorkflowObjectModelSourceFileContent_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintWorkflowObjectModelSourceFileContent {
    public val __1901746427_Ptr: Pointer?

    public val _1901746427_VtblPtr: Pointer?
      get() = __1901746427_Ptr?.getPointer(0)
  }

  public class IPrintWorkflowObjectModelSourceFileContent_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1901746427_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintWorkflowObjectModelSourceFileContent, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c36c8a6a8a2a419ab3c32090e6bfab2f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintWorkflowObjectModelSourceFileContent(ptr: Pointer?): WithDefault =
        IPrintWorkflowObjectModelSourceFileContent_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPrintWorkflowObjectModelSourceFileContent {
      val address = segment.toRawLongValue()
      return makeIPrintWorkflowObjectModelSourceFileContent(Pointer(address))
    }

    public override fun toNative(obj: IPrintWorkflowObjectModelSourceFileContent): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1901746427_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintWorkflowObjectModelSourceFileContent):
        Array<IPrintWorkflowObjectModelSourceFileContent?> = (elements as
        Array<IPrintWorkflowObjectModelSourceFileContent?>).castToImpl<IPrintWorkflowObjectModelSourceFileContent,IPrintWorkflowObjectModelSourceFileContent_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintWorkflowObjectModelSourceFileContent?> =
        arrayOfNulls<IPrintWorkflowObjectModelSourceFileContent_Impl>(size) as
        Array<IPrintWorkflowObjectModelSourceFileContent?>
  }
}
