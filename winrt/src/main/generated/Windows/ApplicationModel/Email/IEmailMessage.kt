package Windows.ApplicationModel.Email

import Windows.Foundation.Collections.IVector
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

@ABIMarker(IEmailMessage.ABI::class)
@Signature("{6c6d948d-80b5-48f8-b0b1-e04e430f44e5}")
@Guid("6c6d948d80b548f8b0b1e04e430f44e5")
@WinRTInterface("6c6d948d80b548f8b0b1e04e430f44e5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMessage.ByReference::class)
public interface IEmailMessage : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Subject(): String?

  @InterfaceMethod(1)
  public fun put_Subject(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Body(): String?

  @InterfaceMethod(3)
  public fun put_Body(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_To(): IVector<EmailRecipient?>?

  @InterfaceMethod(5)
  public fun get_CC(): IVector<EmailRecipient?>?

  @InterfaceMethod(6)
  public fun get_Bcc(): IVector<EmailRecipient?>?

  @InterfaceMethod(7)
  public fun get_Attachments(): IVector<EmailAttachment?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IEmailMessage>
      {
    public override fun getValue() = ABI.makeIEmailMessage(pointer.getPointer(0))

    public fun setValue(value: IEmailMessage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMessage {
    public val __40954910_Ptr: Pointer?

    public val _40954910_VtblPtr: Pointer?
      get() = __40954910_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Subject(): String? {
      val fnPtr = _40954910_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__40954910_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Subject(value: String?): Unit {
      val fnPtr = _40954910_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__40954910_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Body(): String? {
      val fnPtr = _40954910_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__40954910_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Body(value: String?): Unit {
      val fnPtr = _40954910_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__40954910_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_To(): IVector<EmailRecipient?>? {
      val fnPtr = _40954910_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<EmailRecipient?>>()
      val hr = fn.invokeHR(arrayOf(__40954910_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<EmailRecipient?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_CC(): IVector<EmailRecipient?>? {
      val fnPtr = _40954910_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<EmailRecipient?>>()
      val hr = fn.invokeHR(arrayOf(__40954910_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<EmailRecipient?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Bcc(): IVector<EmailRecipient?>? {
      val fnPtr = _40954910_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<EmailRecipient?>>()
      val hr = fn.invokeHR(arrayOf(__40954910_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<EmailRecipient?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_Attachments(): IVector<EmailAttachment?>? {
      val fnPtr = _40954910_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<EmailAttachment?>>()
      val hr = fn.invokeHR(arrayOf(__40954910_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<EmailAttachment?>>(result.getValue())
      return resultValue
    }
  }

  public class IEmailMessage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __40954910_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMessage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6c6d948d80b548f8b0b1e04e430f44e5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMessage(ptr: Pointer?): WithDefault = IEmailMessage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailMessage {
      val address = segment.toRawLongValue()
      return makeIEmailMessage(Pointer(address))
    }

    public override fun toNative(obj: IEmailMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__40954910_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMessage): Array<IEmailMessage?> = (elements as
        Array<IEmailMessage?>).castToImpl<IEmailMessage,IEmailMessage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMessage?> =
        arrayOfNulls<IEmailMessage_Impl>(size) as Array<IEmailMessage?>
  }
}
