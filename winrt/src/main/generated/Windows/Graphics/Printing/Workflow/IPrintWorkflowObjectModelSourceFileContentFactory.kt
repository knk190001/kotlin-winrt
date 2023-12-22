package Windows.Graphics.Printing.Workflow

import Windows.Storage.Streams.IInputStream
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

@ABIMarker(IPrintWorkflowObjectModelSourceFileContentFactory.ABI::class)
@Signature("{93b1b903-f013-56d6-b708-99ac2ccb12ee}")
@Guid("93b1b903f01356d6b70899ac2ccb12ee")
@WinRTInterface("93b1b903f01356d6b70899ac2ccb12ee")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintWorkflowObjectModelSourceFileContentFactory.ByReference::class)
public interface IPrintWorkflowObjectModelSourceFileContentFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(xpsStream: IInputStream?): PrintWorkflowObjectModelSourceFileContent?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintWorkflowObjectModelSourceFileContentFactory> {
    public override fun getValue() =
        ABI.makeIPrintWorkflowObjectModelSourceFileContentFactory(pointer.getPointer(0))

    public fun setValue(value: IPrintWorkflowObjectModelSourceFileContentFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintWorkflowObjectModelSourceFileContentFactory {
    public val __1732415601_Ptr: Pointer?

    public val _1732415601_VtblPtr: Pointer?
      get() = __1732415601_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(xpsStream: IInputStream?):
        PrintWorkflowObjectModelSourceFileContent? {
      val fnPtr = _1732415601_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintWorkflowObjectModelSourceFileContent>()
      val hr = fn.invokeHR(arrayOf(__1732415601_Ptr, marshalToNative(xpsStream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<PrintWorkflowObjectModelSourceFileContent>(result.getValue())
      return resultValue
    }
  }

  public class IPrintWorkflowObjectModelSourceFileContentFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1732415601_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintWorkflowObjectModelSourceFileContentFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("93b1b903f01356d6b70899ac2ccb12ee")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintWorkflowObjectModelSourceFileContentFactory(ptr: Pointer?): WithDefault =
        IPrintWorkflowObjectModelSourceFileContentFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPrintWorkflowObjectModelSourceFileContentFactory {
      val address = segment.toRawLongValue()
      return makeIPrintWorkflowObjectModelSourceFileContentFactory(Pointer(address))
    }

    public override fun toNative(obj: IPrintWorkflowObjectModelSourceFileContentFactory):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1732415601_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintWorkflowObjectModelSourceFileContentFactory):
        Array<IPrintWorkflowObjectModelSourceFileContentFactory?> = (elements as
        Array<IPrintWorkflowObjectModelSourceFileContentFactory?>).castToImpl<IPrintWorkflowObjectModelSourceFileContentFactory,IPrintWorkflowObjectModelSourceFileContentFactory_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IPrintWorkflowObjectModelSourceFileContentFactory?> =
        arrayOfNulls<IPrintWorkflowObjectModelSourceFileContentFactory_Impl>(size) as
        Array<IPrintWorkflowObjectModelSourceFileContentFactory?>
  }
}
