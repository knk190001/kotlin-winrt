package Windows.Phone.Notification.Management

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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPhoneLineDetails.ABI::class)
@Signature("{47eb32dc-33ed-49b9-995c-a296bac82b77}")
@Guid("47eb32dc33ed49b9995ca296bac82b77")
@WinRTInterface("47eb32dc33ed49b9995ca296bac82b77")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneLineDetails.ByReference::class)
public interface IPhoneLineDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LineId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_DisplayName(): String?

  @InterfaceMethod(2)
  public fun get_LineNumber(): String?

  @InterfaceMethod(3)
  public fun get_DefaultOutgoingLine(): Boolean

  @InterfaceMethod(4)
  public fun get_VoicemailCount(): WinDef.UINT

  @InterfaceMethod(5)
  public fun get_RegistrationState(): PhoneLineRegistrationState?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneLineDetails> {
    public override fun getValue() = ABI.makeIPhoneLineDetails(pointer.getPointer(0))

    public fun setValue(value: IPhoneLineDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneLineDetails {
    public val __1836713710_Ptr: Pointer?

    public val _1836713710_VtblPtr: Pointer?
      get() = __1836713710_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LineId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1836713710_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1836713710_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DisplayName(): String? {
      val fnPtr = _1836713710_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1836713710_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_LineNumber(): String? {
      val fnPtr = _1836713710_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1836713710_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_DefaultOutgoingLine(): Boolean {
      val fnPtr = _1836713710_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1836713710_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_VoicemailCount(): WinDef.UINT {
      val fnPtr = _1836713710_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1836713710_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_RegistrationState(): PhoneLineRegistrationState? {
      val fnPtr = _1836713710_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneLineRegistrationState>()
      val hr = fn.invokeHR(arrayOf(__1836713710_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneLineRegistrationState>(result.getValue())
      return resultValue
    }
  }

  public class IPhoneLineDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1836713710_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneLineDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("47eb32dc33ed49b9995ca296bac82b77")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneLineDetails(ptr: Pointer?): WithDefault = IPhoneLineDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneLineDetails {
      val address = segment.toRawLongValue()
      return makeIPhoneLineDetails(Pointer(address))
    }

    public override fun toNative(obj: IPhoneLineDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1836713710_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneLineDetails): Array<IPhoneLineDetails?> = (elements
        as Array<IPhoneLineDetails?>).castToImpl<IPhoneLineDetails,IPhoneLineDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneLineDetails?> =
        arrayOfNulls<IPhoneLineDetails_Impl>(size) as Array<IPhoneLineDetails?>
  }
}
