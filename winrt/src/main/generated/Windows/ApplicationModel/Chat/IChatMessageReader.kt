package Windows.ApplicationModel.Chat

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IChatMessageReader.ABI::class)
@Signature("{b6ea78ce-4489-56f9-76aa-e204682514cf}")
@Guid("b6ea78ce448956f976aae204682514cf")
@WinRTInterface("b6ea78ce448956f976aae204682514cf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatMessageReader.ByReference::class)
public interface IChatMessageReader : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ReadBatchAsync(): IAsyncOperation<IVectorView<ChatMessage?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IChatMessageReader> {
    public override fun getValue() = ABI.makeIChatMessageReader(pointer.getPointer(0))

    public fun setValue(value: IChatMessageReader_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatMessageReader {
    public val __1863504011_Ptr: Pointer?

    public val _1863504011_VtblPtr: Pointer?
      get() = __1863504011_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ReadBatchAsync(): IAsyncOperation<IVectorView<ChatMessage?>?>? {
      val fnPtr = _1863504011_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<ChatMessage?>?>>()
      val hr = fn.invokeHR(arrayOf(__1863504011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<ChatMessage?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IChatMessageReader_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1863504011_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatMessageReader, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b6ea78ce448956f976aae204682514cf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatMessageReader(ptr: Pointer?): WithDefault = IChatMessageReader_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChatMessageReader {
      val address = segment.toRawLongValue()
      return makeIChatMessageReader(Pointer(address))
    }

    public override fun toNative(obj: IChatMessageReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1863504011_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatMessageReader): Array<IChatMessageReader?> =
        (elements as
        Array<IChatMessageReader?>).castToImpl<IChatMessageReader,IChatMessageReader_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatMessageReader?> =
        arrayOfNulls<IChatMessageReader_Impl>(size) as Array<IChatMessageReader?>
  }
}
