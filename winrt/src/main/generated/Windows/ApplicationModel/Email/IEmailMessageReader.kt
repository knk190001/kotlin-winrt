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

@ABIMarker(IEmailMessageReader.ABI::class)
@Signature("{2f4abe9f-6213-4a85-a3b0-f92d1a839d19}")
@Guid("2f4abe9f62134a85a3b0f92d1a839d19")
@WinRTInterface("2f4abe9f62134a85a3b0f92d1a839d19")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMessageReader.ByReference::class)
public interface IEmailMessageReader : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ReadBatchAsync(): IAsyncOperation<EmailMessageBatch?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMessageReader> {
    public override fun getValue() = ABI.makeIEmailMessageReader(pointer.getPointer(0))

    public fun setValue(value: IEmailMessageReader_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMessageReader {
    public val __1314953403_Ptr: Pointer?

    public val _1314953403_VtblPtr: Pointer?
      get() = __1314953403_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ReadBatchAsync(): IAsyncOperation<EmailMessageBatch?>? {
      val fnPtr = _1314953403_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<EmailMessageBatch?>>()
      val hr = fn.invokeHR(arrayOf(__1314953403_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<EmailMessageBatch?>>(result.getValue())
      return resultValue
    }
  }

  public class IEmailMessageReader_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1314953403_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMessageReader, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2f4abe9f62134a85a3b0f92d1a839d19")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMessageReader(ptr: Pointer?): WithDefault = IEmailMessageReader_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailMessageReader {
      val address = segment.toRawLongValue()
      return makeIEmailMessageReader(Pointer(address))
    }

    public override fun toNative(obj: IEmailMessageReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1314953403_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMessageReader): Array<IEmailMessageReader?> =
        (elements as
        Array<IEmailMessageReader?>).castToImpl<IEmailMessageReader,IEmailMessageReader_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMessageReader?> =
        arrayOfNulls<IEmailMessageReader_Impl>(size) as Array<IEmailMessageReader?>
  }
}
