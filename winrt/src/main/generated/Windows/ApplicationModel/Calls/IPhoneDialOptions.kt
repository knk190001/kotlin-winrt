package Windows.ApplicationModel.Calls

import Windows.ApplicationModel.Contacts.Contact
import Windows.ApplicationModel.Contacts.ContactPhone
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

@ABIMarker(IPhoneDialOptions.ABI::class)
@Signature("{b639c4b8-f06f-36cb-a863-823742b5f2d4}")
@Guid("b639c4b8f06f36cba863823742b5f2d4")
@WinRTInterface("b639c4b8f06f36cba863823742b5f2d4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneDialOptions.ByReference::class)
public interface IPhoneDialOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Number(): String?

  @InterfaceMethod(1)
  public fun put_Number(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_DisplayName(): String?

  @InterfaceMethod(3)
  public fun put_DisplayName(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_Contact(): Contact?

  @InterfaceMethod(5)
  public fun put_Contact(value: Contact?): Unit

  @InterfaceMethod(6)
  public fun get_ContactPhone(): ContactPhone?

  @InterfaceMethod(7)
  public fun put_ContactPhone(value: ContactPhone?): Unit

  @InterfaceMethod(8)
  public fun get_Media(): PhoneCallMedia?

  @InterfaceMethod(9)
  public fun put_Media(value: PhoneCallMedia?): Unit

  @InterfaceMethod(10)
  public fun get_AudioEndpoint(): PhoneAudioRoutingEndpoint?

  @InterfaceMethod(11)
  public fun put_AudioEndpoint(value: PhoneAudioRoutingEndpoint?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneDialOptions> {
    public override fun getValue() = ABI.makeIPhoneDialOptions(pointer.getPointer(0))

    public fun setValue(value: IPhoneDialOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneDialOptions {
    public val __891006270_Ptr: Pointer?

    public val _891006270_VtblPtr: Pointer?
      get() = __891006270_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Number(): String? {
      val fnPtr = _891006270_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__891006270_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Number(value: String?): Unit {
      val fnPtr = _891006270_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__891006270_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DisplayName(): String? {
      val fnPtr = _891006270_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__891006270_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_DisplayName(value: String?): Unit {
      val fnPtr = _891006270_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__891006270_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Contact(): Contact? {
      val fnPtr = _891006270_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Contact>()
      val hr = fn.invokeHR(arrayOf(__891006270_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Contact>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Contact(value: Contact?): Unit {
      val fnPtr = _891006270_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__891006270_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_ContactPhone(): ContactPhone? {
      val fnPtr = _891006270_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactPhone>()
      val hr = fn.invokeHR(arrayOf(__891006270_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactPhone>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_ContactPhone(value: ContactPhone?): Unit {
      val fnPtr = _891006270_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__891006270_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Media(): PhoneCallMedia? {
      val fnPtr = _891006270_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneCallMedia>()
      val hr = fn.invokeHR(arrayOf(__891006270_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneCallMedia>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_Media(value: PhoneCallMedia?): Unit {
      val fnPtr = _891006270_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__891006270_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_AudioEndpoint(): PhoneAudioRoutingEndpoint? {
      val fnPtr = _891006270_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneAudioRoutingEndpoint>()
      val hr = fn.invokeHR(arrayOf(__891006270_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneAudioRoutingEndpoint>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_AudioEndpoint(value: PhoneAudioRoutingEndpoint?): Unit {
      val fnPtr = _891006270_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__891006270_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPhoneDialOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __891006270_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneDialOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b639c4b8f06f36cba863823742b5f2d4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneDialOptions(ptr: Pointer?): WithDefault = IPhoneDialOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneDialOptions {
      val address = segment.toRawLongValue()
      return makeIPhoneDialOptions(Pointer(address))
    }

    public override fun toNative(obj: IPhoneDialOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__891006270_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneDialOptions): Array<IPhoneDialOptions?> = (elements
        as Array<IPhoneDialOptions?>).castToImpl<IPhoneDialOptions,IPhoneDialOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneDialOptions?> =
        arrayOfNulls<IPhoneDialOptions_Impl>(size) as Array<IPhoneDialOptions?>
  }
}
