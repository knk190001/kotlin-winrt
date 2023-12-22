package Windows.Security.Cryptography.Certificates

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

@ABIMarker(IKeyAttestationHelperStatics.ABI::class)
@Signature("{1648e246-f644-4326-88be-3af102d30e0c}")
@Guid("1648e246f644432688be3af102d30e0c")
@WinRTInterface("1648e246f644432688be3af102d30e0c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyAttestationHelperStatics.ByReference::class)
public interface IKeyAttestationHelperStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun DecryptTpmAttestationCredentialAsync(credential: String?): IAsyncOperation<String?>?

  @InterfaceMethod(1)
  public fun GetTpmAttestationCredentialId(credential: String?): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKeyAttestationHelperStatics> {
    public override fun getValue() = ABI.makeIKeyAttestationHelperStatics(pointer.getPointer(0))

    public fun setValue(value: IKeyAttestationHelperStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyAttestationHelperStatics {
    public val __1225949720_Ptr: Pointer?

    public val _1225949720_VtblPtr: Pointer?
      get() = __1225949720_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun DecryptTpmAttestationCredentialAsync(credential: String?):
        IAsyncOperation<String?>? {
      val fnPtr = _1225949720_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__1225949720_Ptr, marshalToNative(credential), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetTpmAttestationCredentialId(credential: String?): String? {
      val fnPtr = _1225949720_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1225949720_Ptr, marshalToNative(credential), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IKeyAttestationHelperStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1225949720_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyAttestationHelperStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1648e246f644432688be3af102d30e0c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyAttestationHelperStatics(ptr: Pointer?): WithDefault =
        IKeyAttestationHelperStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyAttestationHelperStatics {
      val address = segment.toRawLongValue()
      return makeIKeyAttestationHelperStatics(Pointer(address))
    }

    public override fun toNative(obj: IKeyAttestationHelperStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1225949720_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyAttestationHelperStatics):
        Array<IKeyAttestationHelperStatics?> = (elements as
        Array<IKeyAttestationHelperStatics?>).castToImpl<IKeyAttestationHelperStatics,IKeyAttestationHelperStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyAttestationHelperStatics?> =
        arrayOfNulls<IKeyAttestationHelperStatics_Impl>(size) as
        Array<IKeyAttestationHelperStatics?>
  }
}
