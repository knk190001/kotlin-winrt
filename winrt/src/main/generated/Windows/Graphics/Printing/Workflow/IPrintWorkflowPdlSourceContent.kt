package Windows.Graphics.Printing.Workflow

import Windows.Foundation.IAsyncOperation
import Windows.Storage.StorageFile
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPrintWorkflowPdlSourceContent.ABI::class)
@Signature("{92f7fc41-32b8-56ab-845e-b1e68b3aedd5}")
@Guid("92f7fc4132b856ab845eb1e68b3aedd5")
@WinRTInterface("92f7fc4132b856ab845eb1e68b3aedd5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintWorkflowPdlSourceContent.ByReference::class)
public interface IPrintWorkflowPdlSourceContent : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContentType(): String?

  @InterfaceMethod(1)
  public fun GetInputStream(): IInputStream?

  @InterfaceMethod(2)
  public fun GetContentFileAsync(): IAsyncOperation<StorageFile?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintWorkflowPdlSourceContent> {
    public override fun getValue() = ABI.makeIPrintWorkflowPdlSourceContent(pointer.getPointer(0))

    public fun setValue(value: IPrintWorkflowPdlSourceContent_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintWorkflowPdlSourceContent {
    public val __1572458761_Ptr: Pointer?

    public val _1572458761_VtblPtr: Pointer?
      get() = __1572458761_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContentType(): String? {
      val fnPtr = _1572458761_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1572458761_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetInputStream(): IInputStream? {
      val fnPtr = _1572458761_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IInputStream>()
      val hr = fn.invokeHR(arrayOf(__1572458761_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IInputStream>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetContentFileAsync(): IAsyncOperation<StorageFile?>? {
      val fnPtr = _1572458761_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFile?>>()
      val hr = fn.invokeHR(arrayOf(__1572458761_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFile?>>(result.getValue())
      return resultValue
    }
  }

  public class IPrintWorkflowPdlSourceContent_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1572458761_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintWorkflowPdlSourceContent, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("92f7fc4132b856ab845eb1e68b3aedd5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintWorkflowPdlSourceContent(ptr: Pointer?): WithDefault =
        IPrintWorkflowPdlSourceContent_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintWorkflowPdlSourceContent {
      val address = segment.toRawLongValue()
      return makeIPrintWorkflowPdlSourceContent(Pointer(address))
    }

    public override fun toNative(obj: IPrintWorkflowPdlSourceContent): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1572458761_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintWorkflowPdlSourceContent):
        Array<IPrintWorkflowPdlSourceContent?> = (elements as
        Array<IPrintWorkflowPdlSourceContent?>).castToImpl<IPrintWorkflowPdlSourceContent,IPrintWorkflowPdlSourceContent_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintWorkflowPdlSourceContent?> =
        arrayOfNulls<IPrintWorkflowPdlSourceContent_Impl>(size) as
        Array<IPrintWorkflowPdlSourceContent?>
  }
}
