package Windows.ApplicationModel.Contacts.DataProvider

import Windows.Foundation.IAsyncAction
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

@ABIMarker(IContactListDeleteContactRequest.ABI::class)
@Signature("{5e114687-ce03-4de5-8557-9ccf552d472a}")
@Guid("5e114687ce034de585579ccf552d472a")
@WinRTInterface("5e114687ce034de585579ccf552d472a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactListDeleteContactRequest.ByReference::class)
public interface IContactListDeleteContactRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContactListId(): String?

  @InterfaceMethod(1)
  public fun get_ContactId(): String?

  @InterfaceMethod(2)
  public fun ReportCompletedAsync(): IAsyncAction?

  @InterfaceMethod(3)
  public fun ReportFailedAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactListDeleteContactRequest> {
    public override fun getValue() = ABI.makeIContactListDeleteContactRequest(pointer.getPointer(0))

    public fun setValue(value: IContactListDeleteContactRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactListDeleteContactRequest {
    public val __964648869_Ptr: Pointer?

    public val _964648869_VtblPtr: Pointer?
      get() = __964648869_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContactListId(): String? {
      val fnPtr = _964648869_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__964648869_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ContactId(): String? {
      val fnPtr = _964648869_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__964648869_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ReportCompletedAsync(): IAsyncAction? {
      val fnPtr = _964648869_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__964648869_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ReportFailedAsync(): IAsyncAction? {
      val fnPtr = _964648869_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__964648869_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IContactListDeleteContactRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __964648869_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactListDeleteContactRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5e114687ce034de585579ccf552d472a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactListDeleteContactRequest(ptr: Pointer?): WithDefault =
        IContactListDeleteContactRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactListDeleteContactRequest {
      val address = segment.toRawLongValue()
      return makeIContactListDeleteContactRequest(Pointer(address))
    }

    public override fun toNative(obj: IContactListDeleteContactRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__964648869_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactListDeleteContactRequest):
        Array<IContactListDeleteContactRequest?> = (elements as
        Array<IContactListDeleteContactRequest?>).castToImpl<IContactListDeleteContactRequest,IContactListDeleteContactRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactListDeleteContactRequest?> =
        arrayOfNulls<IContactListDeleteContactRequest_Impl>(size) as
        Array<IContactListDeleteContactRequest?>
  }
}
