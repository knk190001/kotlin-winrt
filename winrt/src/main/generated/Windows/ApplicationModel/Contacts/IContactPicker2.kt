package Windows.ApplicationModel.Contacts

import Windows.Foundation.Collections.IVector
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IContactPicker2.ABI::class)
@Signature("{b35011cf-5cef-4d24-aa0c-340c5208725d}")
@Guid("b35011cf5cef4d24aa0c340c5208725d")
@WinRTInterface("b35011cf5cef4d24aa0c340c5208725d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactPicker2.ByReference::class)
public interface IContactPicker2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DesiredFieldsWithContactFieldType(): IVector<ContactFieldType?>?

  @InterfaceMethod(1)
  public fun PickContactAsync(): IAsyncOperation<Contact?>?

  @InterfaceMethod(2)
  public fun PickContactsAsync(): IAsyncOperation<IVector<Contact?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactPicker2> {
    public override fun getValue() = ABI.makeIContactPicker2(pointer.getPointer(0))

    public fun setValue(value: IContactPicker2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactPicker2 {
    public val __2053992720_Ptr: Pointer?

    public val _2053992720_VtblPtr: Pointer?
      get() = __2053992720_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DesiredFieldsWithContactFieldType(): IVector<ContactFieldType?>? {
      val fnPtr = _2053992720_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<ContactFieldType?>>()
      val hr = fn.invokeHR(arrayOf(__2053992720_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<ContactFieldType?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun PickContactAsync(): IAsyncOperation<Contact?>? {
      val fnPtr = _2053992720_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Contact?>>()
      val hr = fn.invokeHR(arrayOf(__2053992720_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Contact?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun PickContactsAsync(): IAsyncOperation<IVector<Contact?>?>? {
      val fnPtr = _2053992720_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVector<Contact?>?>>()
      val hr = fn.invokeHR(arrayOf(__2053992720_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IVector<Contact?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IContactPicker2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2053992720_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactPicker2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b35011cf5cef4d24aa0c340c5208725d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactPicker2(ptr: Pointer?): WithDefault = IContactPicker2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactPicker2 {
      val address = segment.toRawLongValue()
      return makeIContactPicker2(Pointer(address))
    }

    public override fun toNative(obj: IContactPicker2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2053992720_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactPicker2): Array<IContactPicker2?> = (elements as
        Array<IContactPicker2?>).castToImpl<IContactPicker2,IContactPicker2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactPicker2?> =
        arrayOfNulls<IContactPicker2_Impl>(size) as Array<IContactPicker2?>
  }
}
