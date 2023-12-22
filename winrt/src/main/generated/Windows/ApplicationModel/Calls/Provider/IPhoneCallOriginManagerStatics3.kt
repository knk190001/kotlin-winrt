package Windows.ApplicationModel.Calls.Provider

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPhoneCallOriginManagerStatics3.ABI::class)
@Signature("{2ed69764-a6e3-50f0-b76a-d67cb39bdfde}")
@Guid("2ed69764a6e350f0b76ad67cb39bdfde")
@WinRTInterface("2ed69764a6e350f0b76ad67cb39bdfde")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneCallOriginManagerStatics3.ByReference::class)
public interface IPhoneCallOriginManagerStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneCallOriginManagerStatics3> {
    public override fun getValue() = ABI.makeIPhoneCallOriginManagerStatics3(pointer.getPointer(0))

    public fun setValue(value: IPhoneCallOriginManagerStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneCallOriginManagerStatics3 {
    public val __1508306206_Ptr: Pointer?

    public val _1508306206_VtblPtr: Pointer?
      get() = __1508306206_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsSupported(): Boolean {
      val fnPtr = _1508306206_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1508306206_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IPhoneCallOriginManagerStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1508306206_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneCallOriginManagerStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2ed69764a6e350f0b76ad67cb39bdfde")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneCallOriginManagerStatics3(ptr: Pointer?): WithDefault =
        IPhoneCallOriginManagerStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneCallOriginManagerStatics3 {
      val address = segment.toRawLongValue()
      return makeIPhoneCallOriginManagerStatics3(Pointer(address))
    }

    public override fun toNative(obj: IPhoneCallOriginManagerStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1508306206_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneCallOriginManagerStatics3):
        Array<IPhoneCallOriginManagerStatics3?> = (elements as
        Array<IPhoneCallOriginManagerStatics3?>).castToImpl<IPhoneCallOriginManagerStatics3,IPhoneCallOriginManagerStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneCallOriginManagerStatics3?> =
        arrayOfNulls<IPhoneCallOriginManagerStatics3_Impl>(size) as
        Array<IPhoneCallOriginManagerStatics3?>
  }
}
