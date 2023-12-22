package Windows.ApplicationModel.Email

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.DateTime
import Windows.Foundation.IAsyncAction
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IEmailFolder.ABI::class)
@Signature("{a24f7771-996c-4864-b1ba-ed1240e57d11}")
@Guid("a24f7771996c4864b1baed1240e57d11")
@WinRTInterface("a24f7771996c4864b1baed1240e57d11")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailFolder.ByReference::class)
public interface IEmailFolder : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun get_RemoteId(): String?

  @InterfaceMethod(2)
  public fun put_RemoteId(value: String?): Unit

  @InterfaceMethod(3)
  public fun get_MailboxId(): String?

  @InterfaceMethod(4)
  public fun get_ParentFolderId(): String?

  @InterfaceMethod(5)
  public fun get_DisplayName(): String?

  @InterfaceMethod(6)
  public fun put_DisplayName(value: String?): Unit

  @InterfaceMethod(7)
  public fun get_IsSyncEnabled(): Boolean

  @InterfaceMethod(8)
  public fun put_IsSyncEnabled(value: Boolean): Unit

  @InterfaceMethod(9)
  public fun get_LastSuccessfulSyncTime(): DateTime?

  @InterfaceMethod(10)
  public fun put_LastSuccessfulSyncTime(value: DateTime?): Unit

  @InterfaceMethod(11)
  public fun get_Kind(): EmailSpecialFolderKind?

  @InterfaceMethod(12)
  public fun CreateFolderAsync(name: String?): IAsyncOperation<EmailFolder?>?

  @InterfaceMethod(13)
  public fun DeleteAsync(): IAsyncAction?

  @InterfaceMethod(14)
  public fun FindChildFoldersAsync(): IAsyncOperation<IVectorView<EmailFolder?>?>?

  @InterfaceMethod(15)
  public fun GetConversationReader(): EmailConversationReader?

  @InterfaceMethod(16)
  public fun GetConversationReader(options: EmailQueryOptions?): EmailConversationReader?

  @InterfaceMethod(17)
  public fun GetMessageAsync(id: String?): IAsyncOperation<EmailMessage?>?

  @InterfaceMethod(18)
  public fun GetMessageReader(): EmailMessageReader?

  @InterfaceMethod(19)
  public fun GetMessageReader(options: EmailQueryOptions?): EmailMessageReader?

  @InterfaceMethod(20)
  public fun GetMessageCountsAsync(): IAsyncOperation<EmailItemCounts?>?

  @InterfaceMethod(21)
  public fun TryMoveAsync(newParentFolder: EmailFolder?): IAsyncOperation<Boolean>?

  @InterfaceMethod(22)
  public fun TryMoveAsync(newParentFolder: EmailFolder?, newFolderName: String?):
      IAsyncOperation<Boolean>?

  @InterfaceMethod(23)
  public fun TrySaveAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(24)
  public fun SaveMessageAsync(message: EmailMessage?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IEmailFolder> {
    public override fun getValue() = ABI.makeIEmailFolder(pointer.getPointer(0))

    public fun setValue(value: IEmailFolder_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailFolder {
    public val __222929203_Ptr: Pointer?

    public val _222929203_VtblPtr: Pointer?
      get() = __222929203_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _222929203_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__222929203_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RemoteId(): String? {
      val fnPtr = _222929203_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__222929203_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_RemoteId(value: String?): Unit {
      val fnPtr = _222929203_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__222929203_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_MailboxId(): String? {
      val fnPtr = _222929203_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__222929203_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ParentFolderId(): String? {
      val fnPtr = _222929203_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__222929203_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_DisplayName(): String? {
      val fnPtr = _222929203_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__222929203_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_DisplayName(value: String?): Unit {
      val fnPtr = _222929203_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__222929203_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_IsSyncEnabled(): Boolean {
      val fnPtr = _222929203_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__222929203_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun put_IsSyncEnabled(value: Boolean): Unit {
      val fnPtr = _222929203_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__222929203_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_LastSuccessfulSyncTime(): DateTime? {
      val fnPtr = _222929203_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__222929203_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_LastSuccessfulSyncTime(value: DateTime?): Unit {
      val fnPtr = _222929203_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__222929203_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_Kind(): EmailSpecialFolderKind? {
      val fnPtr = _222929203_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailSpecialFolderKind>()
      val hr = fn.invokeHR(arrayOf(__222929203_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailSpecialFolderKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun CreateFolderAsync(name: String?): IAsyncOperation<EmailFolder?>? {
      val fnPtr = _222929203_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<EmailFolder?>>()
      val hr = fn.invokeHR(arrayOf(__222929203_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<EmailFolder?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun DeleteAsync(): IAsyncAction? {
      val fnPtr = _222929203_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__222929203_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun FindChildFoldersAsync(): IAsyncOperation<IVectorView<EmailFolder?>?>? {
      val fnPtr = _222929203_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<EmailFolder?>?>>()
      val hr = fn.invokeHR(arrayOf(__222929203_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<EmailFolder?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun GetConversationReader(): EmailConversationReader? {
      val fnPtr = _222929203_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailConversationReader>()
      val hr = fn.invokeHR(arrayOf(__222929203_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailConversationReader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun GetConversationReader(options: EmailQueryOptions?):
        EmailConversationReader? {
      val fnPtr = _222929203_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailConversationReader>()
      val hr = fn.invokeHR(arrayOf(__222929203_Ptr, marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailConversationReader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun GetMessageAsync(id: String?): IAsyncOperation<EmailMessage?>? {
      val fnPtr = _222929203_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<EmailMessage?>>()
      val hr = fn.invokeHR(arrayOf(__222929203_Ptr, marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<EmailMessage?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun GetMessageReader(): EmailMessageReader? {
      val fnPtr = _222929203_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMessageReader>()
      val hr = fn.invokeHR(arrayOf(__222929203_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailMessageReader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun GetMessageReader(options: EmailQueryOptions?): EmailMessageReader? {
      val fnPtr = _222929203_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMessageReader>()
      val hr = fn.invokeHR(arrayOf(__222929203_Ptr, marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailMessageReader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun GetMessageCountsAsync(): IAsyncOperation<EmailItemCounts?>? {
      val fnPtr = _222929203_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<EmailItemCounts?>>()
      val hr = fn.invokeHR(arrayOf(__222929203_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<EmailItemCounts?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun TryMoveAsync(newParentFolder: EmailFolder?): IAsyncOperation<Boolean>? {
      val fnPtr = _222929203_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__222929203_Ptr, marshalToNative(newParentFolder), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun TryMoveAsync(newParentFolder: EmailFolder?, newFolderName: String?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _222929203_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__222929203_Ptr, marshalToNative(newParentFolder),
          marshalToNative(newFolderName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun TrySaveAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _222929203_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__222929203_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun SaveMessageAsync(message: EmailMessage?): IAsyncAction? {
      val fnPtr = _222929203_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__222929203_Ptr, marshalToNative(message), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IEmailFolder_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __222929203_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailFolder, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a24f7771996c4864b1baed1240e57d11")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailFolder(ptr: Pointer?): WithDefault = IEmailFolder_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailFolder {
      val address = segment.toRawLongValue()
      return makeIEmailFolder(Pointer(address))
    }

    public override fun toNative(obj: IEmailFolder): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__222929203_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailFolder): Array<IEmailFolder?> = (elements as
        Array<IEmailFolder?>).castToImpl<IEmailFolder,IEmailFolder_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailFolder?> =
        arrayOfNulls<IEmailFolder_Impl>(size) as Array<IEmailFolder?>
  }
}
