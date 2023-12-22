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

@ABIMarker(IMagneticStripeReaderErrorOccurredEventArgs.ABI::class)
@Signature("{1fedf95d-2c84-41ad-b778-f2356a789ab1}")
@Guid("1fedf95d2c8441adb778f2356a789ab1")
@WinRTInterface("1fedf95d2c8441adb778f2356a789ab1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMagneticStripeReaderErrorOccurredEventArgs.ByReference::class)
public interface IMagneticStripeReaderErrorOccurredEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Track1Status(): MagneticStripeReaderTrackErrorType?

  @InterfaceMethod(1)
  public fun get_Track2Status(): MagneticStripeReaderTrackErrorType?

  @InterfaceMethod(2)
  public fun get_Track3Status(): MagneticStripeReaderTrackErrorType?

  @InterfaceMethod(3)
  public fun get_Track4Status(): MagneticStripeReaderTrackErrorType?

  @InterfaceMethod(4)
  public fun get_ErrorData(): UnifiedPosErrorData?

  @InterfaceMethod(5)
  public fun get_PartialInputData(): MagneticStripeReaderReport?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMagneticStripeReaderErrorOccurredEventArgs> {
    public override fun getValue() =
        ABI.makeIMagneticStripeReaderErrorOccurredEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMagneticStripeReaderErrorOccurredEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMagneticStripeReaderErrorOccurredEventArgs {
    public val __1527677219_Ptr: Pointer?

    public val _1527677219_VtblPtr: Pointer?
      get() = __1527677219_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Track1Status(): MagneticStripeReaderTrackErrorType? {
      val fnPtr = _1527677219_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MagneticStripeReaderTrackErrorType>()
      val hr = fn.invokeHR(arrayOf(__1527677219_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MagneticStripeReaderTrackErrorType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Track2Status(): MagneticStripeReaderTrackErrorType? {
      val fnPtr = _1527677219_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MagneticStripeReaderTrackErrorType>()
      val hr = fn.invokeHR(arrayOf(__1527677219_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MagneticStripeReaderTrackErrorType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Track3Status(): MagneticStripeReaderTrackErrorType? {
      val fnPtr = _1527677219_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MagneticStripeReaderTrackErrorType>()
      val hr = fn.invokeHR(arrayOf(__1527677219_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MagneticStripeReaderTrackErrorType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Track4Status(): MagneticStripeReaderTrackErrorType? {
      val fnPtr = _1527677219_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MagneticStripeReaderTrackErrorType>()
      val hr = fn.invokeHR(arrayOf(__1527677219_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MagneticStripeReaderTrackErrorType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ErrorData(): UnifiedPosErrorData? {
      val fnPtr = _1527677219_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UnifiedPosErrorData>()
      val hr = fn.invokeHR(arrayOf(__1527677219_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UnifiedPosErrorData>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_PartialInputData(): MagneticStripeReaderReport? {
      val fnPtr = _1527677219_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MagneticStripeReaderReport>()
      val hr = fn.invokeHR(arrayOf(__1527677219_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MagneticStripeReaderReport>(result.getValue())
      return resultValue
    }
  }

  public class IMagneticStripeReaderErrorOccurredEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1527677219_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMagneticStripeReaderErrorOccurredEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1fedf95d2c8441adb778f2356a789ab1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMagneticStripeReaderErrorOccurredEventArgs(ptr: Pointer?): WithDefault =
        IMagneticStripeReaderErrorOccurredEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMagneticStripeReaderErrorOccurredEventArgs {
      val address = segment.toRawLongValue()
      return makeIMagneticStripeReaderErrorOccurredEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMagneticStripeReaderErrorOccurredEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1527677219_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMagneticStripeReaderErrorOccurredEventArgs):
        Array<IMagneticStripeReaderErrorOccurredEventArgs?> = (elements as
        Array<IMagneticStripeReaderErrorOccurredEventArgs?>).castToImpl<IMagneticStripeReaderErrorOccurredEventArgs,IMagneticStripeReaderErrorOccurredEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMagneticStripeReaderErrorOccurredEventArgs?> =
        arrayOfNulls<IMagneticStripeReaderErrorOccurredEventArgs_Impl>(size) as
        Array<IMagneticStripeReaderErrorOccurredEventArgs?>
  }
}
