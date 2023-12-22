package Windows.ApplicationModel.Email

import Windows.ApplicationModel.Email.IEmailMailbox2.ABI.IID
import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
import Windows.Security.Cryptography.Certificates.Certificate
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IEmailMailbox3.ABI::class)
@Signature("{3da5897b-458b-408a-8e37-ac8b05d8af56}")
@Guid("3da5897b458b408a8e37ac8b05d8af56")
@WinRTInterface("3da5897b458b408a8e37ac8b05d8af56")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailbox3.ByReference::class)
public interface IEmailMailbox3 : NativeMapped, IWinRTInterface, IEmailMailbox2, IEmailMailbox {
  @InterfaceMethod(0)
  public fun ResolveRecipientsAsync(recipients: IIterable<String?>?):
      IAsyncOperation<IVectorView<EmailRecipientResolutionResult?>?>?

  @InterfaceMethod(1)
  public fun ValidateCertificatesAsync(certificates: IIterable<Certificate?>?):
      IAsyncOperation<IVectorView<EmailCertificateValidationStatus?>?>?

  @InterfaceMethod(2)
  public fun TryEmptyFolderAsync(folderId: String?):
      IAsyncOperation<EmailMailboxEmptyFolderStatus?>?

  @InterfaceMethod(3)
  public fun TryCreateFolderAsync(parentFolderId: String?, name: String?):
      IAsyncOperation<EmailMailboxCreateFolderResult?>?

  @InterfaceMethod(4)
  public fun TryDeleteFolderAsync(folderId: String?):
      IAsyncOperation<EmailMailboxDeleteFolderStatus?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IEmailMailbox3>
      {
    public override fun getValue() = ABI.makeIEmailMailbox3(pointer.getPointer(0))

    public fun setValue(value: IEmailMailbox3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailbox3, IEmailMailbox2.WithDefault,
      IEmailMailbox.WithDefault {
    public val __817367676_Ptr: Pointer?

    public val _817367676_VtblPtr: Pointer?
      get() = __817367676_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ResolveRecipientsAsync(recipients: IIterable<String?>?):
        IAsyncOperation<IVectorView<EmailRecipientResolutionResult?>?>? {
      val fnPtr = _817367676_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<IVectorView<EmailRecipientResolutionResult?>?>>()
      val hr = fn.invokeHR(arrayOf(__817367676_Ptr, marshalToNative(recipients), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<EmailRecipientResolutionResult?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ValidateCertificatesAsync(certificates: IIterable<Certificate?>?):
        IAsyncOperation<IVectorView<EmailCertificateValidationStatus?>?>? {
      val fnPtr = _817367676_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<IVectorView<EmailCertificateValidationStatus?>?>>()
      val hr = fn.invokeHR(arrayOf(__817367676_Ptr, marshalToNative(certificates), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<EmailCertificateValidationStatus?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun TryEmptyFolderAsync(folderId: String?):
        IAsyncOperation<EmailMailboxEmptyFolderStatus?>? {
      val fnPtr = _817367676_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<EmailMailboxEmptyFolderStatus?>>()
      val hr = fn.invokeHR(arrayOf(__817367676_Ptr, marshalToNative(folderId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<EmailMailboxEmptyFolderStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun TryCreateFolderAsync(parentFolderId: String?, name: String?):
        IAsyncOperation<EmailMailboxCreateFolderResult?>? {
      val fnPtr = _817367676_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<EmailMailboxCreateFolderResult?>>()
      val hr = fn.invokeHR(arrayOf(__817367676_Ptr, marshalToNative(parentFolderId),
          marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<EmailMailboxCreateFolderResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun TryDeleteFolderAsync(folderId: String?):
        IAsyncOperation<EmailMailboxDeleteFolderStatus?>? {
      val fnPtr = _817367676_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<EmailMailboxDeleteFolderStatus?>>()
      val hr = fn.invokeHR(arrayOf(__817367676_Ptr, marshalToNative(folderId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<EmailMailboxDeleteFolderStatus?>>(result.getValue())
      return resultValue
    }
  }

  public class IEmailMailbox3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IEmailMailbox2, IEmailMailbox {
    public override val __817367677_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_817367676_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __164914033_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IEmailMailbox.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_817367676_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __817367676_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailbox3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3da5897b458b408a8e37ac8b05d8af56")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailbox3(ptr: Pointer?): WithDefault = IEmailMailbox3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailMailbox3 {
      val address = segment.toRawLongValue()
      return makeIEmailMailbox3(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailbox3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__817367676_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailbox3): Array<IEmailMailbox3?> = (elements as
        Array<IEmailMailbox3?>).castToImpl<IEmailMailbox3,IEmailMailbox3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMailbox3?> =
        arrayOfNulls<IEmailMailbox3_Impl>(size) as Array<IEmailMailbox3?>
  }
}
