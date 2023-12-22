package Windows.ApplicationModel.Calls

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
import Windows.UI.Color
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPhoneLine.ABI::class)
@Signature("{27c66f30-6a69-34ca-a2ba-65302530c311}")
@Guid("27c66f306a6934caa2ba65302530c311")
@WinRTInterface("27c66f306a6934caa2ba65302530c311")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneLine.ByReference::class)
public interface IPhoneLine : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_LineChanged(handler: TypedEventHandler<PhoneLine?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_LineChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun get_Id(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(3)
  public fun get_DisplayColor(): Color?

  @InterfaceMethod(4)
  public fun get_NetworkState(): PhoneNetworkState?

  @InterfaceMethod(5)
  public fun get_DisplayName(): String?

  @InterfaceMethod(6)
  public fun get_Voicemail(): PhoneVoicemail?

  @InterfaceMethod(7)
  public fun get_NetworkName(): String?

  @InterfaceMethod(8)
  public fun get_CellularDetails(): PhoneLineCellularDetails?

  @InterfaceMethod(9)
  public fun get_Transport(): PhoneLineTransport?

  @InterfaceMethod(10)
  public fun get_CanDial(): Boolean

  @InterfaceMethod(11)
  public fun get_SupportsTile(): Boolean

  @InterfaceMethod(12)
  public fun get_VideoCallingCapabilities(): PhoneCallVideoCapabilities?

  @InterfaceMethod(13)
  public fun get_LineConfiguration(): PhoneLineConfiguration?

  @InterfaceMethod(14)
  public fun IsImmediateDialNumberAsync(number: String?): IAsyncOperation<Boolean>?

  @InterfaceMethod(15)
  public fun Dial(number: String?, displayName: String?): Unit

  @InterfaceMethod(16)
  public fun DialWithOptions(options: PhoneDialOptions?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPhoneLine> {
    public override fun getValue() = ABI.makeIPhoneLine(pointer.getPointer(0))

    public fun setValue(value: IPhoneLine_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneLine {
    public val __1867108924_Ptr: Pointer?

    public val _1867108924_VtblPtr: Pointer?
      get() = __1867108924_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_LineChanged(handler: TypedEventHandler<PhoneLine?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1867108924_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1867108924_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_LineChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1867108924_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1867108924_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Id(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1867108924_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1867108924_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_DisplayColor(): Color? {
      val fnPtr = _1867108924_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__1867108924_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_NetworkState(): PhoneNetworkState? {
      val fnPtr = _1867108924_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneNetworkState>()
      val hr = fn.invokeHR(arrayOf(__1867108924_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneNetworkState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_DisplayName(): String? {
      val fnPtr = _1867108924_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1867108924_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Voicemail(): PhoneVoicemail? {
      val fnPtr = _1867108924_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneVoicemail>()
      val hr = fn.invokeHR(arrayOf(__1867108924_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneVoicemail>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_NetworkName(): String? {
      val fnPtr = _1867108924_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1867108924_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_CellularDetails(): PhoneLineCellularDetails? {
      val fnPtr = _1867108924_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneLineCellularDetails>()
      val hr = fn.invokeHR(arrayOf(__1867108924_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneLineCellularDetails>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_Transport(): PhoneLineTransport? {
      val fnPtr = _1867108924_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneLineTransport>()
      val hr = fn.invokeHR(arrayOf(__1867108924_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneLineTransport>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_CanDial(): Boolean {
      val fnPtr = _1867108924_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1867108924_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun get_SupportsTile(): Boolean {
      val fnPtr = _1867108924_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1867108924_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun get_VideoCallingCapabilities(): PhoneCallVideoCapabilities? {
      val fnPtr = _1867108924_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneCallVideoCapabilities>()
      val hr = fn.invokeHR(arrayOf(__1867108924_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneCallVideoCapabilities>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_LineConfiguration(): PhoneLineConfiguration? {
      val fnPtr = _1867108924_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneLineConfiguration>()
      val hr = fn.invokeHR(arrayOf(__1867108924_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneLineConfiguration>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun IsImmediateDialNumberAsync(number: String?): IAsyncOperation<Boolean>? {
      val fnPtr = _1867108924_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1867108924_Ptr, marshalToNative(number), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun Dial(number: String?, displayName: String?): Unit {
      val fnPtr = _1867108924_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1867108924_Ptr, marshalToNative(number),
          marshalToNative(displayName),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun DialWithOptions(options: PhoneDialOptions?): Unit {
      val fnPtr = _1867108924_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1867108924_Ptr, marshalToNative(options),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPhoneLine_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1867108924_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneLine, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("27c66f306a6934caa2ba65302530c311")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneLine(ptr: Pointer?): WithDefault = IPhoneLine_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneLine {
      val address = segment.toRawLongValue()
      return makeIPhoneLine(Pointer(address))
    }

    public override fun toNative(obj: IPhoneLine): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1867108924_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneLine): Array<IPhoneLine?> = (elements as
        Array<IPhoneLine?>).castToImpl<IPhoneLine,IPhoneLine_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneLine?> = arrayOfNulls<IPhoneLine_Impl>(size)
        as Array<IPhoneLine?>
  }
}
