package Windows.ApplicationModel.Email

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IEmailStore.ABI::class)
@Signature("{f803226e-9137-4f8b-a470-279ac3058eb6}")
@Guid("f803226e91374f8ba470279ac3058eb6")
@WinRTInterface("f803226e91374f8ba470279ac3058eb6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailStore.ByReference::class)
public interface IEmailStore : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FindMailboxesAsync(): IAsyncOperation<IVectorView<EmailMailbox?>?>?

  @InterfaceMethod(1)
  public fun GetConversationReader(): EmailConversationReader?

  @InterfaceMethod(2)
  public fun GetConversationReader(options: EmailQueryOptions?): EmailConversationReader?

  @InterfaceMethod(3)
  public fun GetMessageReader(): EmailMessageReader?

  @InterfaceMethod(4)
  public fun GetMessageReader(options: EmailQueryOptions?): EmailMessageReader?

  @InterfaceMethod(5)
  public fun GetMailboxAsync(id: String?): IAsyncOperation<EmailMailbox?>?

  @InterfaceMethod(6)
  public fun GetConversationAsync(id: String?): IAsyncOperation<EmailConversation?>?

  @InterfaceMethod(7)
  public fun GetFolderAsync(id: String?): IAsyncOperation<EmailFolder?>?

  @InterfaceMethod(8)
  public fun GetMessageAsync(id: String?): IAsyncOperation<EmailMessage?>?

  @InterfaceMethod(9)
  public fun CreateMailboxAsync(accountName: String?, accountAddress: String?):
      IAsyncOperation<EmailMailbox?>?

  @InterfaceMethod(10)
  public fun CreateMailboxAsync(
    accountName: String?,
    accountAddress: String?,
    userDataAccountId: String?
  ): IAsyncOperation<EmailMailbox?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IEmailStore> {
    public override fun getValue() = ABI.makeIEmailStore(pointer.getPointer(0))

    public fun setValue(value: IEmailStore_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailStore {
    public val __2058860676_Ptr: Pointer?

    public val _2058860676_VtblPtr: Pointer?
      get() = __2058860676_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FindMailboxesAsync(): IAsyncOperation<IVectorView<EmailMailbox?>?>? {
      val fnPtr = _2058860676_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<EmailMailbox?>?>>()
      val hr = fn.invokeHR(arrayOf(__2058860676_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<EmailMailbox?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetConversationReader(): EmailConversationReader? {
      val fnPtr = _2058860676_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailConversationReader>()
      val hr = fn.invokeHR(arrayOf(__2058860676_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailConversationReader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetConversationReader(options: EmailQueryOptions?):
        EmailConversationReader? {
      val fnPtr = _2058860676_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailConversationReader>()
      val hr = fn.invokeHR(arrayOf(__2058860676_Ptr, marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailConversationReader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetMessageReader(): EmailMessageReader? {
      val fnPtr = _2058860676_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMessageReader>()
      val hr = fn.invokeHR(arrayOf(__2058860676_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailMessageReader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetMessageReader(options: EmailQueryOptions?): EmailMessageReader? {
      val fnPtr = _2058860676_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMessageReader>()
      val hr = fn.invokeHR(arrayOf(__2058860676_Ptr, marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailMessageReader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetMailboxAsync(id: String?): IAsyncOperation<EmailMailbox?>? {
      val fnPtr = _2058860676_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<EmailMailbox?>>()
      val hr = fn.invokeHR(arrayOf(__2058860676_Ptr, marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<EmailMailbox?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetConversationAsync(id: String?): IAsyncOperation<EmailConversation?>? {
      val fnPtr = _2058860676_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<EmailConversation?>>()
      val hr = fn.invokeHR(arrayOf(__2058860676_Ptr, marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<EmailConversation?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetFolderAsync(id: String?): IAsyncOperation<EmailFolder?>? {
      val fnPtr = _2058860676_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<EmailFolder?>>()
      val hr = fn.invokeHR(arrayOf(__2058860676_Ptr, marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<EmailFolder?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun GetMessageAsync(id: String?): IAsyncOperation<EmailMessage?>? {
      val fnPtr = _2058860676_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<EmailMessage?>>()
      val hr = fn.invokeHR(arrayOf(__2058860676_Ptr, marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<EmailMessage?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun CreateMailboxAsync(accountName: String?, accountAddress: String?):
        IAsyncOperation<EmailMailbox?>? {
      val fnPtr = _2058860676_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<EmailMailbox?>>()
      val hr = fn.invokeHR(arrayOf(__2058860676_Ptr, marshalToNative(accountName),
          marshalToNative(accountAddress), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<EmailMailbox?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun CreateMailboxAsync(
      accountName: String?,
      accountAddress: String?,
      userDataAccountId: String?
    ): IAsyncOperation<EmailMailbox?>? {
      val fnPtr = _2058860676_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<EmailMailbox?>>()
      val hr = fn.invokeHR(arrayOf(__2058860676_Ptr, marshalToNative(accountName),
          marshalToNative(accountAddress), marshalToNative(userDataAccountId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<EmailMailbox?>>(result.getValue())
      return resultValue
    }
  }

  public class IEmailStore_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2058860676_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailStore, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f803226e91374f8ba470279ac3058eb6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailStore(ptr: Pointer?): WithDefault = IEmailStore_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailStore {
      val address = segment.toRawLongValue()
      return makeIEmailStore(Pointer(address))
    }

    public override fun toNative(obj: IEmailStore): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2058860676_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailStore): Array<IEmailStore?> = (elements as
        Array<IEmailStore?>).castToImpl<IEmailStore,IEmailStore_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailStore?> =
        arrayOfNulls<IEmailStore_Impl>(size) as Array<IEmailStore?>
  }
}
