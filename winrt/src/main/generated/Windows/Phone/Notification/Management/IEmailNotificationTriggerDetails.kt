package Windows.Phone.Notification.Management

import Windows.ApplicationModel.Email.EmailMessage
import Windows.Foundation.DateTime
import Windows.Phone.Notification.Management.IAccessoryNotificationTriggerDetails.ABI.IID
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

@ABIMarker(IEmailNotificationTriggerDetails.ABI::class)
@Signature("{f3b82612-46cf-4e70-8e0d-7b2e04ab492b}")
@Guid("f3b8261246cf4e708e0d7b2e04ab492b")
@WinRTInterface("f3b8261246cf4e708e0d7b2e04ab492b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailNotificationTriggerDetails.ByReference::class)
public interface IEmailNotificationTriggerDetails : NativeMapped, IWinRTInterface,
    IAccessoryNotificationTriggerDetails {
  @InterfaceMethod(0)
  public fun get_AccountName(): String?

  @InterfaceMethod(1)
  public fun get_ParentFolderName(): String?

  @InterfaceMethod(2)
  public fun get_SenderName(): String?

  @InterfaceMethod(3)
  public fun get_SenderAddress(): String?

  @InterfaceMethod(4)
  public fun get_EmailMessage(): EmailMessage?

  @InterfaceMethod(5)
  public fun get_Timestamp(): DateTime?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailNotificationTriggerDetails> {
    public override fun getValue() = ABI.makeIEmailNotificationTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IEmailNotificationTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailNotificationTriggerDetails,
      IAccessoryNotificationTriggerDetails.WithDefault {
    public val __678335651_Ptr: Pointer?

    public val _678335651_VtblPtr: Pointer?
      get() = __678335651_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AccountName(): String? {
      val fnPtr = _678335651_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__678335651_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ParentFolderName(): String? {
      val fnPtr = _678335651_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__678335651_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SenderName(): String? {
      val fnPtr = _678335651_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__678335651_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SenderAddress(): String? {
      val fnPtr = _678335651_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__678335651_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_EmailMessage(): EmailMessage? {
      val fnPtr = _678335651_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMessage>()
      val hr = fn.invokeHR(arrayOf(__678335651_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailMessage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Timestamp(): DateTime? {
      val fnPtr = _678335651_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__678335651_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }
  }

  public class IEmailNotificationTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface,
      IAccessoryNotificationTriggerDetails {
    public override val __1414915993_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_678335651_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __678335651_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailNotificationTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f3b8261246cf4e708e0d7b2e04ab492b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailNotificationTriggerDetails(ptr: Pointer?): WithDefault =
        IEmailNotificationTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailNotificationTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIEmailNotificationTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IEmailNotificationTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__678335651_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailNotificationTriggerDetails):
        Array<IEmailNotificationTriggerDetails?> = (elements as
        Array<IEmailNotificationTriggerDetails?>).castToImpl<IEmailNotificationTriggerDetails,IEmailNotificationTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailNotificationTriggerDetails?> =
        arrayOfNulls<IEmailNotificationTriggerDetails_Impl>(size) as
        Array<IEmailNotificationTriggerDetails?>
  }
}
