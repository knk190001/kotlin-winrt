package Windows.ApplicationModel.Contacts.DataProvider

import Windows.ApplicationModel.Contacts.Contact
import Windows.ApplicationModel.Contacts.ContactBatchStatus
import Windows.ApplicationModel.Contacts.ContactQueryOptions
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IContactListServerSearchReadBatchRequest.ABI::class)
@Signature("{ba776a97-4030-4925-9fb4-143b295e653b}")
@Guid("ba776a97403049259fb4143b295e653b")
@WinRTInterface("ba776a97403049259fb4143b295e653b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactListServerSearchReadBatchRequest.ByReference::class)
public interface IContactListServerSearchReadBatchRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SessionId(): String?

  @InterfaceMethod(1)
  public fun get_ContactListId(): String?

  @InterfaceMethod(2)
  public fun get_Options(): ContactQueryOptions?

  @InterfaceMethod(3)
  public fun get_SuggestedBatchSize(): WinDef.UINT

  @InterfaceMethod(4)
  public fun SaveContactAsync(contact: Contact?): IAsyncAction?

  @InterfaceMethod(5)
  public fun ReportCompletedAsync(): IAsyncAction?

  @InterfaceMethod(6)
  public fun ReportFailedAsync(batchStatus: ContactBatchStatus?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactListServerSearchReadBatchRequest> {
    public override fun getValue() =
        ABI.makeIContactListServerSearchReadBatchRequest(pointer.getPointer(0))

    public fun setValue(value: IContactListServerSearchReadBatchRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactListServerSearchReadBatchRequest {
    public val __2129883625_Ptr: Pointer?

    public val _2129883625_VtblPtr: Pointer?
      get() = __2129883625_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SessionId(): String? {
      val fnPtr = _2129883625_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2129883625_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ContactListId(): String? {
      val fnPtr = _2129883625_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2129883625_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Options(): ContactQueryOptions? {
      val fnPtr = _2129883625_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactQueryOptions>()
      val hr = fn.invokeHR(arrayOf(__2129883625_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactQueryOptions>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SuggestedBatchSize(): WinDef.UINT {
      val fnPtr = _2129883625_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__2129883625_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun SaveContactAsync(contact: Contact?): IAsyncAction? {
      val fnPtr = _2129883625_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__2129883625_Ptr, marshalToNative(contact), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun ReportCompletedAsync(): IAsyncAction? {
      val fnPtr = _2129883625_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__2129883625_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun ReportFailedAsync(batchStatus: ContactBatchStatus?): IAsyncAction? {
      val fnPtr = _2129883625_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__2129883625_Ptr, marshalToNative(batchStatus), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IContactListServerSearchReadBatchRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2129883625_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactListServerSearchReadBatchRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ba776a97403049259fb4143b295e653b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactListServerSearchReadBatchRequest(ptr: Pointer?): WithDefault =
        IContactListServerSearchReadBatchRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IContactListServerSearchReadBatchRequest {
      val address = segment.toRawLongValue()
      return makeIContactListServerSearchReadBatchRequest(Pointer(address))
    }

    public override fun toNative(obj: IContactListServerSearchReadBatchRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2129883625_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactListServerSearchReadBatchRequest):
        Array<IContactListServerSearchReadBatchRequest?> = (elements as
        Array<IContactListServerSearchReadBatchRequest?>).castToImpl<IContactListServerSearchReadBatchRequest,IContactListServerSearchReadBatchRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactListServerSearchReadBatchRequest?> =
        arrayOfNulls<IContactListServerSearchReadBatchRequest_Impl>(size) as
        Array<IContactListServerSearchReadBatchRequest?>
  }
}
