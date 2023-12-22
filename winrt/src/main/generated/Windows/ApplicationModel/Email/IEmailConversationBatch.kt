package Windows.ApplicationModel.Email

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IEmailConversationBatch.ABI::class)
@Signature("{b8c1ab81-01c5-432a-9df1-fe85d98a279a}")
@Guid("b8c1ab8101c5432a9df1fe85d98a279a")
@WinRTInterface("b8c1ab8101c5432a9df1fe85d98a279a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailConversationBatch.ByReference::class)
public interface IEmailConversationBatch : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Conversations(): IVectorView<EmailConversation?>?

  @InterfaceMethod(1)
  public fun get_Status(): EmailBatchStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailConversationBatch> {
    public override fun getValue() = ABI.makeIEmailConversationBatch(pointer.getPointer(0))

    public fun setValue(value: IEmailConversationBatch_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailConversationBatch {
    public val __871128430_Ptr: Pointer?

    public val _871128430_VtblPtr: Pointer?
      get() = __871128430_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Conversations(): IVectorView<EmailConversation?>? {
      val fnPtr = _871128430_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<EmailConversation?>>()
      val hr = fn.invokeHR(arrayOf(__871128430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<EmailConversation?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Status(): EmailBatchStatus? {
      val fnPtr = _871128430_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailBatchStatus>()
      val hr = fn.invokeHR(arrayOf(__871128430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailBatchStatus>(result.getValue())
      return resultValue
    }
  }

  public class IEmailConversationBatch_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __871128430_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailConversationBatch, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b8c1ab8101c5432a9df1fe85d98a279a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailConversationBatch(ptr: Pointer?): WithDefault =
        IEmailConversationBatch_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailConversationBatch {
      val address = segment.toRawLongValue()
      return makeIEmailConversationBatch(Pointer(address))
    }

    public override fun toNative(obj: IEmailConversationBatch): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__871128430_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailConversationBatch): Array<IEmailConversationBatch?>
        = (elements as
        Array<IEmailConversationBatch?>).castToImpl<IEmailConversationBatch,IEmailConversationBatch_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailConversationBatch?> =
        arrayOfNulls<IEmailConversationBatch_Impl>(size) as Array<IEmailConversationBatch?>
  }
}
