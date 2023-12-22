package Windows.Devices.PointOfService

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

@ABIMarker(IMagneticStripeReaderStatics2.ABI::class)
@Signature("{8cadc362-d667-48fa-86bc-f5ae1189262b}")
@Guid("8cadc362d66748fa86bcf5ae1189262b")
@WinRTInterface("8cadc362d66748fa86bcf5ae1189262b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMagneticStripeReaderStatics2.ByReference::class)
public interface IMagneticStripeReaderStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeviceSelector(connectionTypes: PosConnectionTypes?): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMagneticStripeReaderStatics2> {
    public override fun getValue() = ABI.makeIMagneticStripeReaderStatics2(pointer.getPointer(0))

    public fun setValue(value: IMagneticStripeReaderStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMagneticStripeReaderStatics2 {
    public val __752369504_Ptr: Pointer?

    public val _752369504_VtblPtr: Pointer?
      get() = __752369504_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeviceSelector(connectionTypes: PosConnectionTypes?): String? {
      val fnPtr = _752369504_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__752369504_Ptr, marshalToNative(connectionTypes), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IMagneticStripeReaderStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __752369504_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMagneticStripeReaderStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8cadc362d66748fa86bcf5ae1189262b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMagneticStripeReaderStatics2(ptr: Pointer?): WithDefault =
        IMagneticStripeReaderStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMagneticStripeReaderStatics2 {
      val address = segment.toRawLongValue()
      return makeIMagneticStripeReaderStatics2(Pointer(address))
    }

    public override fun toNative(obj: IMagneticStripeReaderStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__752369504_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMagneticStripeReaderStatics2):
        Array<IMagneticStripeReaderStatics2?> = (elements as
        Array<IMagneticStripeReaderStatics2?>).castToImpl<IMagneticStripeReaderStatics2,IMagneticStripeReaderStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMagneticStripeReaderStatics2?> =
        arrayOfNulls<IMagneticStripeReaderStatics2_Impl>(size) as
        Array<IMagneticStripeReaderStatics2?>
  }
}
