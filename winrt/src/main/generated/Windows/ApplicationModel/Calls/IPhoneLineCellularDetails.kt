package Windows.ApplicationModel.Calls

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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPhoneLineCellularDetails.ABI::class)
@Signature("{192601d5-147c-4769-b673-98a5ec8426cb}")
@Guid("192601d5147c4769b67398a5ec8426cb")
@WinRTInterface("192601d5147c4769b67398a5ec8426cb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneLineCellularDetails.ByReference::class)
public interface IPhoneLineCellularDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SimState(): PhoneSimState?

  @InterfaceMethod(1)
  public fun get_SimSlotIndex(): Int

  @InterfaceMethod(2)
  public fun get_IsModemOn(): Boolean

  @InterfaceMethod(3)
  public fun get_RegistrationRejectCode(): Int

  @InterfaceMethod(4)
  public fun GetNetworkOperatorDisplayText(location: PhoneLineNetworkOperatorDisplayTextLocation?):
      String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneLineCellularDetails> {
    public override fun getValue() = ABI.makeIPhoneLineCellularDetails(pointer.getPointer(0))

    public fun setValue(value: IPhoneLineCellularDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneLineCellularDetails {
    public val __1327820564_Ptr: Pointer?

    public val _1327820564_VtblPtr: Pointer?
      get() = __1327820564_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SimState(): PhoneSimState? {
      val fnPtr = _1327820564_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneSimState>()
      val hr = fn.invokeHR(arrayOf(__1327820564_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneSimState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SimSlotIndex(): Int {
      val fnPtr = _1327820564_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1327820564_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_IsModemOn(): Boolean {
      val fnPtr = _1327820564_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1327820564_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_RegistrationRejectCode(): Int {
      val fnPtr = _1327820564_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1327820564_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override
        fun GetNetworkOperatorDisplayText(location: PhoneLineNetworkOperatorDisplayTextLocation?):
        String? {
      val fnPtr = _1327820564_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1327820564_Ptr, marshalToNative(location), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IPhoneLineCellularDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1327820564_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneLineCellularDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("192601d5147c4769b67398a5ec8426cb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneLineCellularDetails(ptr: Pointer?): WithDefault =
        IPhoneLineCellularDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneLineCellularDetails {
      val address = segment.toRawLongValue()
      return makeIPhoneLineCellularDetails(Pointer(address))
    }

    public override fun toNative(obj: IPhoneLineCellularDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1327820564_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneLineCellularDetails):
        Array<IPhoneLineCellularDetails?> = (elements as
        Array<IPhoneLineCellularDetails?>).castToImpl<IPhoneLineCellularDetails,IPhoneLineCellularDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneLineCellularDetails?> =
        arrayOfNulls<IPhoneLineCellularDetails_Impl>(size) as Array<IPhoneLineCellularDetails?>
  }
}
