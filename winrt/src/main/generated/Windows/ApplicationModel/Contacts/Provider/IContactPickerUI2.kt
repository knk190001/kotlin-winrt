package Windows.ApplicationModel.Contacts.Provider

import Windows.ApplicationModel.Contacts.Contact
import Windows.ApplicationModel.Contacts.ContactFieldType
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

@ABIMarker(IContactPickerUI2.ABI::class)
@Signature("{6e449e28-7b25-4999-9b0b-875400a1e8c8}")
@Guid("6e449e287b2549999b0b875400a1e8c8")
@WinRTInterface("6e449e287b2549999b0b875400a1e8c8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactPickerUI2.ByReference::class)
public interface IContactPickerUI2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AddContact(contact: Contact?): AddContactResult?

  @InterfaceMethod(1)
  public fun get_DesiredFieldsWithContactFieldType(): IVector<ContactFieldType?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactPickerUI2> {
    public override fun getValue() = ABI.makeIContactPickerUI2(pointer.getPointer(0))

    public fun setValue(value: IContactPickerUI2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactPickerUI2 {
    public val __2120479095_Ptr: Pointer?

    public val _2120479095_VtblPtr: Pointer?
      get() = __2120479095_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AddContact(contact: Contact?): AddContactResult? {
      val fnPtr = _2120479095_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AddContactResult>()
      val hr = fn.invokeHR(arrayOf(__2120479095_Ptr, marshalToNative(contact), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AddContactResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DesiredFieldsWithContactFieldType(): IVector<ContactFieldType?>? {
      val fnPtr = _2120479095_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<ContactFieldType?>>()
      val hr = fn.invokeHR(arrayOf(__2120479095_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<ContactFieldType?>>(result.getValue())
      return resultValue
    }
  }

  public class IContactPickerUI2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2120479095_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactPickerUI2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6e449e287b2549999b0b875400a1e8c8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactPickerUI2(ptr: Pointer?): WithDefault = IContactPickerUI2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactPickerUI2 {
      val address = segment.toRawLongValue()
      return makeIContactPickerUI2(Pointer(address))
    }

    public override fun toNative(obj: IContactPickerUI2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2120479095_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactPickerUI2): Array<IContactPickerUI2?> = (elements
        as Array<IContactPickerUI2?>).castToImpl<IContactPickerUI2,IContactPickerUI2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactPickerUI2?> =
        arrayOfNulls<IContactPickerUI2_Impl>(size) as Array<IContactPickerUI2?>
  }
}
