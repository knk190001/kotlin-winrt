package Windows.Networking.Proximity

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

@ABIMarker(IPeerInformation.ABI::class)
@Signature("{20024f08-9fff-45f4-b6e9-408b2ebef373}")
@Guid("20024f089fff45f4b6e9408b2ebef373")
@WinRTInterface("20024f089fff45f4b6e9408b2ebef373")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPeerInformation.ByReference::class)
public interface IPeerInformation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DisplayName(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPeerInformation> {
    public override fun getValue() = ABI.makeIPeerInformation(pointer.getPointer(0))

    public fun setValue(value: IPeerInformation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPeerInformation {
    public val __2055291793_Ptr: Pointer?

    public val _2055291793_VtblPtr: Pointer?
      get() = __2055291793_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DisplayName(): String? {
      val fnPtr = _2055291793_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2055291793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IPeerInformation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2055291793_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPeerInformation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("20024f089fff45f4b6e9408b2ebef373")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPeerInformation(ptr: Pointer?): WithDefault = IPeerInformation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPeerInformation {
      val address = segment.toRawLongValue()
      return makeIPeerInformation(Pointer(address))
    }

    public override fun toNative(obj: IPeerInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2055291793_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPeerInformation): Array<IPeerInformation?> = (elements as
        Array<IPeerInformation?>).castToImpl<IPeerInformation,IPeerInformation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPeerInformation?> =
        arrayOfNulls<IPeerInformation_Impl>(size) as Array<IPeerInformation?>
  }
}
