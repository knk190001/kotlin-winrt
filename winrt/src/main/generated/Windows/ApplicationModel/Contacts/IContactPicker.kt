package Windows.ApplicationModel.Contacts

import Windows.Foundation.Collections.IVector
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

@ABIMarker(IContactPicker.ABI::class)
@Signature("{0e09fd91-42f8-4055-90a0-896f96738936}")
@Guid("0e09fd9142f8405590a0896f96738936")
@WinRTInterface("0e09fd9142f8405590a0896f96738936")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactPicker.ByReference::class)
public interface IContactPicker : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CommitButtonText(): String?

  @InterfaceMethod(1)
  public fun put_CommitButtonText(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_SelectionMode(): ContactSelectionMode?

  @InterfaceMethod(3)
  public fun put_SelectionMode(value: ContactSelectionMode?): Unit

  @InterfaceMethod(4)
  public fun get_DesiredFields(): IVector<String?>?

  @InterfaceMethod(5)
  public fun PickSingleContactAsync(): IAsyncOperation<ContactInformation?>?

  @InterfaceMethod(6)
  public fun PickMultipleContactsAsync(): IAsyncOperation<IVectorView<ContactInformation?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IContactPicker>
      {
    public override fun getValue() = ABI.makeIContactPicker(pointer.getPointer(0))

    public fun setValue(value: IContactPicker_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactPicker {
    public val __2144467810_Ptr: Pointer?

    public val _2144467810_VtblPtr: Pointer?
      get() = __2144467810_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CommitButtonText(): String? {
      val fnPtr = _2144467810_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2144467810_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_CommitButtonText(value: String?): Unit {
      val fnPtr = _2144467810_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2144467810_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_SelectionMode(): ContactSelectionMode? {
      val fnPtr = _2144467810_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactSelectionMode>()
      val hr = fn.invokeHR(arrayOf(__2144467810_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactSelectionMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_SelectionMode(value: ContactSelectionMode?): Unit {
      val fnPtr = _2144467810_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2144467810_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_DesiredFields(): IVector<String?>? {
      val fnPtr = _2144467810_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__2144467810_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun PickSingleContactAsync(): IAsyncOperation<ContactInformation?>? {
      val fnPtr = _2144467810_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ContactInformation?>>()
      val hr = fn.invokeHR(arrayOf(__2144467810_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ContactInformation?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun PickMultipleContactsAsync():
        IAsyncOperation<IVectorView<ContactInformation?>?>? {
      val fnPtr = _2144467810_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<ContactInformation?>?>>()
      val hr = fn.invokeHR(arrayOf(__2144467810_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<ContactInformation?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IContactPicker_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2144467810_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactPicker, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0e09fd9142f8405590a0896f96738936")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactPicker(ptr: Pointer?): WithDefault = IContactPicker_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactPicker {
      val address = segment.toRawLongValue()
      return makeIContactPicker(Pointer(address))
    }

    public override fun toNative(obj: IContactPicker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2144467810_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactPicker): Array<IContactPicker?> = (elements as
        Array<IContactPicker?>).castToImpl<IContactPicker,IContactPicker_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactPicker?> =
        arrayOfNulls<IContactPicker_Impl>(size) as Array<IContactPicker?>
  }
}
