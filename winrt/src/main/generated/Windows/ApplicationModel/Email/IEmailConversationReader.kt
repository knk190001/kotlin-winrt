package Windows.ApplicationModel.Email

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IEmailConversationReader.ABI::class)
@Signature("{b4630f82-2875-44c8-9b8c-85beb3a3c653}")
@Guid("b4630f82287544c89b8c85beb3a3c653")
@WinRTInterface("b4630f82287544c89b8c85beb3a3c653")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailConversationReader.ByReference::class)
public interface IEmailConversationReader : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ReadBatchAsync(): IAsyncOperation<EmailConversationBatch?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailConversationReader> {
    public override fun getValue() = ABI.makeIEmailConversationReader(pointer.getPointer(0))

    public fun setValue(value: IEmailConversationReader_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailConversationReader {
    public val __773982101_Ptr: Pointer?

    public val _773982101_VtblPtr: Pointer?
      get() = __773982101_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ReadBatchAsync(): IAsyncOperation<EmailConversationBatch?>? {
      val fnPtr = _773982101_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<EmailConversationBatch?>>()
      val hr = fn.invokeHR(arrayOf(__773982101_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<EmailConversationBatch?>>(result.getValue())
      return resultValue
    }
  }

  public class IEmailConversationReader_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __773982101_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailConversationReader, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b4630f82287544c89b8c85beb3a3c653")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailConversationReader(ptr: Pointer?): WithDefault =
        IEmailConversationReader_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailConversationReader {
      val address = segment.toRawLongValue()
      return makeIEmailConversationReader(Pointer(address))
    }

    public override fun toNative(obj: IEmailConversationReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__773982101_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailConversationReader):
        Array<IEmailConversationReader?> = (elements as
        Array<IEmailConversationReader?>).castToImpl<IEmailConversationReader,IEmailConversationReader_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailConversationReader?> =
        arrayOfNulls<IEmailConversationReader_Impl>(size) as Array<IEmailConversationReader?>
  }
}
