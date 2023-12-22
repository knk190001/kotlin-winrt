package Windows.ApplicationModel.Calls

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

@ABIMarker(IPhoneCallVideoCapabilitiesManagerStatics.ABI::class)
@Signature("{f3c64b56-f00b-4a1c-a0c6-ee1910749ce7}")
@Guid("f3c64b56f00b4a1ca0c6ee1910749ce7")
@WinRTInterface("f3c64b56f00b4a1ca0c6ee1910749ce7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneCallVideoCapabilitiesManagerStatics.ByReference::class)
public interface IPhoneCallVideoCapabilitiesManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetCapabilitiesAsync(phoneNumber: String?):
      IAsyncOperation<PhoneCallVideoCapabilities?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneCallVideoCapabilitiesManagerStatics> {
    public override fun getValue() =
        ABI.makeIPhoneCallVideoCapabilitiesManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IPhoneCallVideoCapabilitiesManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneCallVideoCapabilitiesManagerStatics {
    public val __1384404859_Ptr: Pointer?

    public val _1384404859_VtblPtr: Pointer?
      get() = __1384404859_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCapabilitiesAsync(phoneNumber: String?):
        IAsyncOperation<PhoneCallVideoCapabilities?>? {
      val fnPtr = _1384404859_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PhoneCallVideoCapabilities?>>()
      val hr = fn.invokeHR(arrayOf(__1384404859_Ptr, marshalToNative(phoneNumber), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PhoneCallVideoCapabilities?>>(result.getValue())
      return resultValue
    }
  }

  public class IPhoneCallVideoCapabilitiesManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1384404859_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneCallVideoCapabilitiesManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f3c64b56f00b4a1ca0c6ee1910749ce7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneCallVideoCapabilitiesManagerStatics(ptr: Pointer?): WithDefault =
        IPhoneCallVideoCapabilitiesManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPhoneCallVideoCapabilitiesManagerStatics {
      val address = segment.toRawLongValue()
      return makeIPhoneCallVideoCapabilitiesManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IPhoneCallVideoCapabilitiesManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1384404859_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneCallVideoCapabilitiesManagerStatics):
        Array<IPhoneCallVideoCapabilitiesManagerStatics?> = (elements as
        Array<IPhoneCallVideoCapabilitiesManagerStatics?>).castToImpl<IPhoneCallVideoCapabilitiesManagerStatics,IPhoneCallVideoCapabilitiesManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneCallVideoCapabilitiesManagerStatics?> =
        arrayOfNulls<IPhoneCallVideoCapabilitiesManagerStatics_Impl>(size) as
        Array<IPhoneCallVideoCapabilitiesManagerStatics?>
  }
}
