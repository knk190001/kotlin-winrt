package Windows.System.Profile.SystemManufacturers

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

@ABIMarker(ISmbiosInformationStatics.ABI::class)
@Signature("{080cca7c-637c-48c4-b728-f9273812db8e}")
@Guid("080cca7c637c48c4b728f9273812db8e")
@WinRTInterface("080cca7c637c48c4b728f9273812db8e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmbiosInformationStatics.ByReference::class)
public interface ISmbiosInformationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SerialNumber(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmbiosInformationStatics> {
    public override fun getValue() = ABI.makeISmbiosInformationStatics(pointer.getPointer(0))

    public fun setValue(value: ISmbiosInformationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmbiosInformationStatics {
    public val __279254739_Ptr: Pointer?

    public val _279254739_VtblPtr: Pointer?
      get() = __279254739_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SerialNumber(): String? {
      val fnPtr = _279254739_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__279254739_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ISmbiosInformationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __279254739_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmbiosInformationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("080cca7c637c48c4b728f9273812db8e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmbiosInformationStatics(ptr: Pointer?): WithDefault =
        ISmbiosInformationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmbiosInformationStatics {
      val address = segment.toRawLongValue()
      return makeISmbiosInformationStatics(Pointer(address))
    }

    public override fun toNative(obj: ISmbiosInformationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__279254739_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmbiosInformationStatics):
        Array<ISmbiosInformationStatics?> = (elements as
        Array<ISmbiosInformationStatics?>).castToImpl<ISmbiosInformationStatics,ISmbiosInformationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmbiosInformationStatics?> =
        arrayOfNulls<ISmbiosInformationStatics_Impl>(size) as Array<ISmbiosInformationStatics?>
  }
}
