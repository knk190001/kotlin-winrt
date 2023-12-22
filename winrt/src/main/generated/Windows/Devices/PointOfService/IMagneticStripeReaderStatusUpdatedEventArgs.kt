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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IMagneticStripeReaderStatusUpdatedEventArgs.ABI::class)
@Signature("{09cc6bb0-3262-401d-9e8a-e80d6358906b}")
@Guid("09cc6bb03262401d9e8ae80d6358906b")
@WinRTInterface("09cc6bb03262401d9e8ae80d6358906b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMagneticStripeReaderStatusUpdatedEventArgs.ByReference::class)
public interface IMagneticStripeReaderStatusUpdatedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): MagneticStripeReaderStatus?

  @InterfaceMethod(1)
  public fun get_ExtendedStatus(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMagneticStripeReaderStatusUpdatedEventArgs> {
    public override fun getValue() =
        ABI.makeIMagneticStripeReaderStatusUpdatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMagneticStripeReaderStatusUpdatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMagneticStripeReaderStatusUpdatedEventArgs {
    public val __725555903_Ptr: Pointer?

    public val _725555903_VtblPtr: Pointer?
      get() = __725555903_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): MagneticStripeReaderStatus? {
      val fnPtr = _725555903_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MagneticStripeReaderStatus>()
      val hr = fn.invokeHR(arrayOf(__725555903_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MagneticStripeReaderStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedStatus(): WinDef.UINT {
      val fnPtr = _725555903_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__725555903_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IMagneticStripeReaderStatusUpdatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __725555903_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMagneticStripeReaderStatusUpdatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("09cc6bb03262401d9e8ae80d6358906b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMagneticStripeReaderStatusUpdatedEventArgs(ptr: Pointer?): WithDefault =
        IMagneticStripeReaderStatusUpdatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMagneticStripeReaderStatusUpdatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMagneticStripeReaderStatusUpdatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMagneticStripeReaderStatusUpdatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__725555903_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMagneticStripeReaderStatusUpdatedEventArgs):
        Array<IMagneticStripeReaderStatusUpdatedEventArgs?> = (elements as
        Array<IMagneticStripeReaderStatusUpdatedEventArgs?>).castToImpl<IMagneticStripeReaderStatusUpdatedEventArgs,IMagneticStripeReaderStatusUpdatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMagneticStripeReaderStatusUpdatedEventArgs?> =
        arrayOfNulls<IMagneticStripeReaderStatusUpdatedEventArgs_Impl>(size) as
        Array<IMagneticStripeReaderStatusUpdatedEventArgs?>
  }
}
