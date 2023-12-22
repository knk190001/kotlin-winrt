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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPhoneLineTransportDeviceStatics.ABI::class)
@Signature("{0f3121ac-d609-51a1-96f3-fb00d1819252}")
@Guid("0f3121acd60951a196f3fb00d1819252")
@WinRTInterface("0f3121acd60951a196f3fb00d1819252")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneLineTransportDeviceStatics.ByReference::class)
public interface IPhoneLineTransportDeviceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromId(id: String?): PhoneLineTransportDevice?

  @InterfaceMethod(1)
  public fun GetDeviceSelector(): String?

  @InterfaceMethod(2)
  public fun GetDeviceSelector(transport: PhoneLineTransport?): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneLineTransportDeviceStatics> {
    public override fun getValue() = ABI.makeIPhoneLineTransportDeviceStatics(pointer.getPointer(0))

    public fun setValue(value: IPhoneLineTransportDeviceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneLineTransportDeviceStatics {
    public val __735321802_Ptr: Pointer?

    public val _735321802_VtblPtr: Pointer?
      get() = __735321802_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromId(id: String?): PhoneLineTransportDevice? {
      val fnPtr = _735321802_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneLineTransportDevice>()
      val hr = fn.invokeHR(arrayOf(__735321802_Ptr, marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneLineTransportDevice>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeviceSelector(): String? {
      val fnPtr = _735321802_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__735321802_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetDeviceSelector(transport: PhoneLineTransport?): String? {
      val fnPtr = _735321802_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__735321802_Ptr, marshalToNative(transport), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IPhoneLineTransportDeviceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __735321802_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneLineTransportDeviceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0f3121acd60951a196f3fb00d1819252")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneLineTransportDeviceStatics(ptr: Pointer?): WithDefault =
        IPhoneLineTransportDeviceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneLineTransportDeviceStatics {
      val address = segment.toRawLongValue()
      return makeIPhoneLineTransportDeviceStatics(Pointer(address))
    }

    public override fun toNative(obj: IPhoneLineTransportDeviceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__735321802_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneLineTransportDeviceStatics):
        Array<IPhoneLineTransportDeviceStatics?> = (elements as
        Array<IPhoneLineTransportDeviceStatics?>).castToImpl<IPhoneLineTransportDeviceStatics,IPhoneLineTransportDeviceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneLineTransportDeviceStatics?> =
        arrayOfNulls<IPhoneLineTransportDeviceStatics_Impl>(size) as
        Array<IPhoneLineTransportDeviceStatics?>
  }
}
