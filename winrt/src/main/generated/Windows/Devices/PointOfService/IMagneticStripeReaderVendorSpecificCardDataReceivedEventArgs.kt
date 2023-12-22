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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMagneticStripeReaderVendorSpecificCardDataReceivedEventArgs.ABI::class)
@Signature("{af0a5514-59cc-4a60-99e8-99a53dace5aa}")
@Guid("af0a551459cc4a6099e899a53dace5aa")
@WinRTInterface("af0a551459cc4a6099e899a53dace5aa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    IMagneticStripeReaderVendorSpecificCardDataReceivedEventArgs.ByReference::class)
public interface IMagneticStripeReaderVendorSpecificCardDataReceivedEventArgs : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Report(): MagneticStripeReaderReport?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMagneticStripeReaderVendorSpecificCardDataReceivedEventArgs> {
    public override fun getValue() =
        ABI.makeIMagneticStripeReaderVendorSpecificCardDataReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMagneticStripeReaderVendorSpecificCardDataReceivedEventArgs_Impl):
        Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMagneticStripeReaderVendorSpecificCardDataReceivedEventArgs {
    public val __1770685489_Ptr: Pointer?

    public val _1770685489_VtblPtr: Pointer?
      get() = __1770685489_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Report(): MagneticStripeReaderReport? {
      val fnPtr = _1770685489_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MagneticStripeReaderReport>()
      val hr = fn.invokeHR(arrayOf(__1770685489_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MagneticStripeReaderReport>(result.getValue())
      return resultValue
    }
  }

  public class IMagneticStripeReaderVendorSpecificCardDataReceivedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1770685489_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMagneticStripeReaderVendorSpecificCardDataReceivedEventArgs,
      MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("af0a551459cc4a6099e899a53dace5aa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMagneticStripeReaderVendorSpecificCardDataReceivedEventArgs(ptr: Pointer?):
        WithDefault = IMagneticStripeReaderVendorSpecificCardDataReceivedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMagneticStripeReaderVendorSpecificCardDataReceivedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMagneticStripeReaderVendorSpecificCardDataReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMagneticStripeReaderVendorSpecificCardDataReceivedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1770685489_Ptr))
  }

  public companion object {
    public fun makeArray(vararg
        elements: IMagneticStripeReaderVendorSpecificCardDataReceivedEventArgs):
        Array<IMagneticStripeReaderVendorSpecificCardDataReceivedEventArgs?> = (elements as
        Array<IMagneticStripeReaderVendorSpecificCardDataReceivedEventArgs?>).castToImpl<IMagneticStripeReaderVendorSpecificCardDataReceivedEventArgs,IMagneticStripeReaderVendorSpecificCardDataReceivedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IMagneticStripeReaderVendorSpecificCardDataReceivedEventArgs?> =
        arrayOfNulls<IMagneticStripeReaderVendorSpecificCardDataReceivedEventArgs_Impl>(size) as
        Array<IMagneticStripeReaderVendorSpecificCardDataReceivedEventArgs?>
  }
}
