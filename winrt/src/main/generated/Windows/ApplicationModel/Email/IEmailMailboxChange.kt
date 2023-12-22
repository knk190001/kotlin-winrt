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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IEmailMailboxChange.ABI::class)
@Signature("{61edf54b-11ef-400c-adde-8cde65c85e66}")
@Guid("61edf54b11ef400cadde8cde65c85e66")
@WinRTInterface("61edf54b11ef400cadde8cde65c85e66")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailboxChange.ByReference::class)
public interface IEmailMailboxChange : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ChangeType(): EmailMailboxChangeType?

  @InterfaceMethod(1)
  public fun get_MailboxActions(): IVector<EmailMailboxAction?>?

  @InterfaceMethod(2)
  public fun get_Message(): EmailMessage?

  @InterfaceMethod(3)
  public fun get_Folder(): EmailFolder?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMailboxChange> {
    public override fun getValue() = ABI.makeIEmailMailboxChange(pointer.getPointer(0))

    public fun setValue(value: IEmailMailboxChange_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailboxChange {
    public val __1159875297_Ptr: Pointer?

    public val _1159875297_VtblPtr: Pointer?
      get() = __1159875297_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ChangeType(): EmailMailboxChangeType? {
      val fnPtr = _1159875297_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMailboxChangeType>()
      val hr = fn.invokeHR(arrayOf(__1159875297_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailMailboxChangeType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MailboxActions(): IVector<EmailMailboxAction?>? {
      val fnPtr = _1159875297_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<EmailMailboxAction?>>()
      val hr = fn.invokeHR(arrayOf(__1159875297_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<EmailMailboxAction?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Message(): EmailMessage? {
      val fnPtr = _1159875297_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMessage>()
      val hr = fn.invokeHR(arrayOf(__1159875297_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailMessage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Folder(): EmailFolder? {
      val fnPtr = _1159875297_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailFolder>()
      val hr = fn.invokeHR(arrayOf(__1159875297_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailFolder>(result.getValue())
      return resultValue
    }
  }

  public class IEmailMailboxChange_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1159875297_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailboxChange, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("61edf54b11ef400cadde8cde65c85e66")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailboxChange(ptr: Pointer?): WithDefault = IEmailMailboxChange_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailMailboxChange {
      val address = segment.toRawLongValue()
      return makeIEmailMailboxChange(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailboxChange): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1159875297_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailboxChange): Array<IEmailMailboxChange?> =
        (elements as
        Array<IEmailMailboxChange?>).castToImpl<IEmailMailboxChange,IEmailMailboxChange_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMailboxChange?> =
        arrayOfNulls<IEmailMailboxChange_Impl>(size) as Array<IEmailMailboxChange?>
  }
}
