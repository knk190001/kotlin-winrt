package Windows.ApplicationModel.Chat

import Windows.Storage.Streams.IRandomAccessStreamReference
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

@ABIMarker(IChatMessageAttachmentFactory.ABI::class)
@Signature("{205852a2-a356-5b71-6ca9-66c985b7d0d5}")
@Guid("205852a2a3565b716ca966c985b7d0d5")
@WinRTInterface("205852a2a3565b716ca966c985b7d0d5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatMessageAttachmentFactory.ByReference::class)
public interface IChatMessageAttachmentFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateChatMessageAttachment(mimeType: String?,
      dataStreamReference: IRandomAccessStreamReference?): ChatMessageAttachment?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IChatMessageAttachmentFactory> {
    public override fun getValue() = ABI.makeIChatMessageAttachmentFactory(pointer.getPointer(0))

    public fun setValue(value: IChatMessageAttachmentFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatMessageAttachmentFactory {
    public val __1117074017_Ptr: Pointer?

    public val _1117074017_VtblPtr: Pointer?
      get() = __1117074017_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateChatMessageAttachment(mimeType: String?,
        dataStreamReference: IRandomAccessStreamReference?): ChatMessageAttachment? {
      val fnPtr = _1117074017_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ChatMessageAttachment>()
      val hr = fn.invokeHR(arrayOf(__1117074017_Ptr, marshalToNative(mimeType),
          marshalToNative(dataStreamReference), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ChatMessageAttachment>(result.getValue())
      return resultValue
    }
  }

  public class IChatMessageAttachmentFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1117074017_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatMessageAttachmentFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("205852a2a3565b716ca966c985b7d0d5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatMessageAttachmentFactory(ptr: Pointer?): WithDefault =
        IChatMessageAttachmentFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChatMessageAttachmentFactory {
      val address = segment.toRawLongValue()
      return makeIChatMessageAttachmentFactory(Pointer(address))
    }

    public override fun toNative(obj: IChatMessageAttachmentFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1117074017_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatMessageAttachmentFactory):
        Array<IChatMessageAttachmentFactory?> = (elements as
        Array<IChatMessageAttachmentFactory?>).castToImpl<IChatMessageAttachmentFactory,IChatMessageAttachmentFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatMessageAttachmentFactory?> =
        arrayOfNulls<IChatMessageAttachmentFactory_Impl>(size) as
        Array<IChatMessageAttachmentFactory?>
  }
}
