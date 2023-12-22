package Windows.Phone.Notification.Management

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.DateTime
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

@ABIMarker(IPhoneCallDetails.ABI::class)
@Signature("{0c1b6f53-f071-483e-bf33-ebd44b724447}")
@Guid("0c1b6f53f071483ebf33ebd44b724447")
@WinRTInterface("0c1b6f53f071483ebf33ebd44b724447")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneCallDetails.ByReference::class)
public interface IPhoneCallDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PhoneLine(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_CallId(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_CallTransport(): PhoneCallTransport?

  @InterfaceMethod(3)
  public fun get_CallMediaType(): PhoneMediaType?

  @InterfaceMethod(4)
  public fun get_CallDirection(): PhoneCallDirection?

  @InterfaceMethod(5)
  public fun get_State(): PhoneCallState?

  @InterfaceMethod(6)
  public fun get_ConferenceCallId(): WinDef.UINT

  @InterfaceMethod(7)
  public fun get_StartTime(): DateTime?

  @InterfaceMethod(8)
  public fun get_EndTime(): DateTime?

  @InterfaceMethod(9)
  public fun get_PhoneNumber(): String?

  @InterfaceMethod(10)
  public fun get_ContactName(): String?

  @InterfaceMethod(11)
  public fun get_PresetTextResponses(): IVectorView<TextResponse?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneCallDetails> {
    public override fun getValue() = ABI.makeIPhoneCallDetails(pointer.getPointer(0))

    public fun setValue(value: IPhoneCallDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneCallDetails {
    public val __1036226884_Ptr: Pointer?

    public val _1036226884_VtblPtr: Pointer?
      get() = __1036226884_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PhoneLine(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1036226884_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1036226884_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CallId(): WinDef.UINT {
      val fnPtr = _1036226884_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1036226884_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_CallTransport(): PhoneCallTransport? {
      val fnPtr = _1036226884_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneCallTransport>()
      val hr = fn.invokeHR(arrayOf(__1036226884_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneCallTransport>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_CallMediaType(): PhoneMediaType? {
      val fnPtr = _1036226884_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneMediaType>()
      val hr = fn.invokeHR(arrayOf(__1036226884_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneMediaType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_CallDirection(): PhoneCallDirection? {
      val fnPtr = _1036226884_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneCallDirection>()
      val hr = fn.invokeHR(arrayOf(__1036226884_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneCallDirection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_State(): PhoneCallState? {
      val fnPtr = _1036226884_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneCallState>()
      val hr = fn.invokeHR(arrayOf(__1036226884_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneCallState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_ConferenceCallId(): WinDef.UINT {
      val fnPtr = _1036226884_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1036226884_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_StartTime(): DateTime? {
      val fnPtr = _1036226884_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1036226884_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_EndTime(): DateTime? {
      val fnPtr = _1036226884_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1036226884_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_PhoneNumber(): String? {
      val fnPtr = _1036226884_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1036226884_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_ContactName(): String? {
      val fnPtr = _1036226884_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1036226884_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_PresetTextResponses(): IVectorView<TextResponse?>? {
      val fnPtr = _1036226884_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<TextResponse?>>()
      val hr = fn.invokeHR(arrayOf(__1036226884_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<TextResponse?>>(result.getValue())
      return resultValue
    }
  }

  public class IPhoneCallDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1036226884_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneCallDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0c1b6f53f071483ebf33ebd44b724447")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneCallDetails(ptr: Pointer?): WithDefault = IPhoneCallDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneCallDetails {
      val address = segment.toRawLongValue()
      return makeIPhoneCallDetails(Pointer(address))
    }

    public override fun toNative(obj: IPhoneCallDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1036226884_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneCallDetails): Array<IPhoneCallDetails?> = (elements
        as Array<IPhoneCallDetails?>).castToImpl<IPhoneCallDetails,IPhoneCallDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneCallDetails?> =
        arrayOfNulls<IPhoneCallDetails_Impl>(size) as Array<IPhoneCallDetails?>
  }
}
