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

@ABIMarker(IChatConversationReader.ABI::class)
@Signature("{055136d2-de32-4a47-a93a-b3dc0833852b}")
@Guid("055136d2de324a47a93ab3dc0833852b")
@WinRTInterface("055136d2de324a47a93ab3dc0833852b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatConversationReader.ByReference::class)
public interface IChatConversationReader : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ReadBatchAsync(): IAsyncOperation<IVectorView<ChatConversation?>?>?

  @InterfaceMethod(1)
  public fun ReadBatchAsync(count: Int): IAsyncOperation<IVectorView<ChatConversation?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IChatConversationReader> {
    public override fun getValue() = ABI.makeIChatConversationReader(pointer.getPointer(0))

    public fun setValue(value: IChatConversationReader_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatConversationReader {
    public val __681011941_Ptr: Pointer?

    public val _681011941_VtblPtr: Pointer?
      get() = __681011941_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ReadBatchAsync(): IAsyncOperation<IVectorView<ChatConversation?>?>? {
      val fnPtr = _681011941_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<ChatConversation?>?>>()
      val hr = fn.invokeHR(arrayOf(__681011941_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<ChatConversation?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ReadBatchAsync(count: Int):
        IAsyncOperation<IVectorView<ChatConversation?>?>? {
      val fnPtr = _681011941_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<ChatConversation?>?>>()
      val hr = fn.invokeHR(arrayOf(__681011941_Ptr, count, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<ChatConversation?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IChatConversationReader_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __681011941_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatConversationReader, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("055136d2de324a47a93ab3dc0833852b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatConversationReader(ptr: Pointer?): WithDefault =
        IChatConversationReader_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChatConversationReader {
      val address = segment.toRawLongValue()
      return makeIChatConversationReader(Pointer(address))
    }

    public override fun toNative(obj: IChatConversationReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__681011941_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatConversationReader): Array<IChatConversationReader?>
        = (elements as
        Array<IChatConversationReader?>).castToImpl<IChatConversationReader,IChatConversationReader_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatConversationReader?> =
        arrayOfNulls<IChatConversationReader_Impl>(size) as Array<IChatConversationReader?>
  }
}
