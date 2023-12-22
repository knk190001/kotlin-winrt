package Windows.Phone.PersonalInformation

import Windows.Foundation.Collections.IMap
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Phone.PersonalInformation.IContactInformation.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IStoredContact.ABI::class)
@Signature("{b070b7b1-263d-4e71-abe7-591d2466570e}")
@Guid("b070b7b1263d4e71abe7591d2466570e")
@WinRTInterface("b070b7b1263d4e71abe7591d2466570e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStoredContact.ByReference::class)
public interface IStoredContact : NativeMapped, IWinRTInterface, IContactInformation {
  @InterfaceMethod(0)
  public fun get_Store(): ContactStore?

  @InterfaceMethod(1)
  public fun get_Id(): String?

  @InterfaceMethod(2)
  public fun get_RemoteId(): String?

  @InterfaceMethod(3)
  public fun put_RemoteId(value: String?): Unit

  @InterfaceMethod(4)
  public fun GetExtendedPropertiesAsync(): IAsyncOperation<IMap<String?, IUnknown?>?>?

  @InterfaceMethod(5)
  public fun SaveAsync(): IAsyncAction?

  @InterfaceMethod(6)
  public fun ReplaceExistingContactAsync(id: String?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IStoredContact>
      {
    public override fun getValue() = ABI.makeIStoredContact(pointer.getPointer(0))

    public fun setValue(value: IStoredContact_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStoredContact, IContactInformation.WithDefault {
    public val __156536245_Ptr: Pointer?

    public val _156536245_VtblPtr: Pointer?
      get() = __156536245_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Store(): ContactStore? {
      val fnPtr = _156536245_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactStore>()
      val hr = fn.invokeHR(arrayOf(__156536245_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactStore>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Id(): String? {
      val fnPtr = _156536245_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__156536245_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_RemoteId(): String? {
      val fnPtr = _156536245_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__156536245_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_RemoteId(value: String?): Unit {
      val fnPtr = _156536245_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156536245_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun GetExtendedPropertiesAsync(): IAsyncOperation<IMap<String?, IUnknown?>?>? {
      val fnPtr = _156536245_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IMap<String?, IUnknown?>?>>()
      val hr = fn.invokeHR(arrayOf(__156536245_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IMap<String?,
          IUnknown?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun SaveAsync(): IAsyncAction? {
      val fnPtr = _156536245_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__156536245_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun ReplaceExistingContactAsync(id: String?): IAsyncAction? {
      val fnPtr = _156536245_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__156536245_Ptr, marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IStoredContact_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IContactInformation {
    public override val __3320524_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_156536245_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __156536245_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStoredContact, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b070b7b1263d4e71abe7591d2466570e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStoredContact(ptr: Pointer?): WithDefault = IStoredContact_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStoredContact {
      val address = segment.toRawLongValue()
      return makeIStoredContact(Pointer(address))
    }

    public override fun toNative(obj: IStoredContact): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__156536245_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStoredContact): Array<IStoredContact?> = (elements as
        Array<IStoredContact?>).castToImpl<IStoredContact,IStoredContact_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStoredContact?> =
        arrayOfNulls<IStoredContact_Impl>(size) as Array<IStoredContact?>
  }
}
