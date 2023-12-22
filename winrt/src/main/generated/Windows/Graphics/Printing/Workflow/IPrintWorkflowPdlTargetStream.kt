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

@ABIMarker(IPrintWorkflowPdlTargetStream.ABI::class)
@Signature("{a742dfe5-1ee3-52a9-9f9f-2e2043180fd1}")
@Guid("a742dfe51ee352a99f9f2e2043180fd1")
@WinRTInterface("a742dfe51ee352a99f9f2e2043180fd1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintWorkflowPdlTargetStream.ByReference::class)
public interface IPrintWorkflowPdlTargetStream : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetOutputStream(): IOutputStream?

  @InterfaceMethod(1)
  public fun CompleteStreamSubmission(status: PrintWorkflowSubmittedStatus?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintWorkflowPdlTargetStream> {
    public override fun getValue() = ABI.makeIPrintWorkflowPdlTargetStream(pointer.getPointer(0))

    public fun setValue(value: IPrintWorkflowPdlTargetStream_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintWorkflowPdlTargetStream {
    public val __1416067558_Ptr: Pointer?

    public val _1416067558_VtblPtr: Pointer?
      get() = __1416067558_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetOutputStream(): IOutputStream? {
      val fnPtr = _1416067558_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IOutputStream>()
      val hr = fn.invokeHR(arrayOf(__1416067558_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IOutputStream>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CompleteStreamSubmission(status: PrintWorkflowSubmittedStatus?): Unit {
      val fnPtr = _1416067558_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1416067558_Ptr, marshalToNative(status),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPrintWorkflowPdlTargetStream_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1416067558_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintWorkflowPdlTargetStream, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a742dfe51ee352a99f9f2e2043180fd1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintWorkflowPdlTargetStream(ptr: Pointer?): WithDefault =
        IPrintWorkflowPdlTargetStream_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintWorkflowPdlTargetStream {
      val address = segment.toRawLongValue()
      return makeIPrintWorkflowPdlTargetStream(Pointer(address))
    }

    public override fun toNative(obj: IPrintWorkflowPdlTargetStream): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1416067558_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintWorkflowPdlTargetStream):
        Array<IPrintWorkflowPdlTargetStream?> = (elements as
        Array<IPrintWorkflowPdlTargetStream?>).castToImpl<IPrintWorkflowPdlTargetStream,IPrintWorkflowPdlTargetStream_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintWorkflowPdlTargetStream?> =
        arrayOfNulls<IPrintWorkflowPdlTargetStream_Impl>(size) as
        Array<IPrintWorkflowPdlTargetStream?>
  }
}
