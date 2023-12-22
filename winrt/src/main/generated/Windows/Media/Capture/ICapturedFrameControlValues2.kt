package Windows.Media.Capture

import Windows.Foundation.IReference
import Windows.Media.Devices.MediaCaptureFocusState
import Windows.Media.MediaProperties.MediaRatio
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICapturedFrameControlValues2.ABI::class)
@Signature("{500b2b88-06d2-4aa7-a7db-d37af73321d8}")
@Guid("500b2b8806d24aa7a7dbd37af73321d8")
@WinRTInterface("500b2b8806d24aa7a7dbd37af73321d8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICapturedFrameControlValues2.ByReference::class)
public interface ICapturedFrameControlValues2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FocusState(): IReference<MediaCaptureFocusState?>?

  @InterfaceMethod(1)
  public fun get_IsoDigitalGain(): IReference<Double>?

  @InterfaceMethod(2)
  public fun get_IsoAnalogGain(): IReference<Double>?

  @InterfaceMethod(3)
  public fun get_SensorFrameRate(): MediaRatio?

  @InterfaceMethod(4)
  public fun get_WhiteBalanceGain(): IReference<WhiteBalanceGain?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICapturedFrameControlValues2> {
    public override fun getValue() = ABI.makeICapturedFrameControlValues2(pointer.getPointer(0))

    public fun setValue(value: ICapturedFrameControlValues2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICapturedFrameControlValues2 {
    public val __47758442_Ptr: Pointer?

    public val _47758442_VtblPtr: Pointer?
      get() = __47758442_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FocusState(): IReference<MediaCaptureFocusState?>? {
      val fnPtr = _47758442_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<MediaCaptureFocusState?>>()
      val hr = fn.invokeHR(arrayOf(__47758442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<MediaCaptureFocusState?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsoDigitalGain(): IReference<Double>? {
      val fnPtr = _47758442_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__47758442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsoAnalogGain(): IReference<Double>? {
      val fnPtr = _47758442_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__47758442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SensorFrameRate(): MediaRatio? {
      val fnPtr = _47758442_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaRatio>()
      val hr = fn.invokeHR(arrayOf(__47758442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaRatio>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_WhiteBalanceGain(): IReference<WhiteBalanceGain?>? {
      val fnPtr = _47758442_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WhiteBalanceGain?>>()
      val hr = fn.invokeHR(arrayOf(__47758442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WhiteBalanceGain?>>(result.getValue())
      return resultValue
    }
  }

  public class ICapturedFrameControlValues2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __47758442_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICapturedFrameControlValues2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("500b2b8806d24aa7a7dbd37af73321d8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICapturedFrameControlValues2(ptr: Pointer?): WithDefault =
        ICapturedFrameControlValues2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICapturedFrameControlValues2 {
      val address = segment.toRawLongValue()
      return makeICapturedFrameControlValues2(Pointer(address))
    }

    public override fun toNative(obj: ICapturedFrameControlValues2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__47758442_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICapturedFrameControlValues2):
        Array<ICapturedFrameControlValues2?> = (elements as
        Array<ICapturedFrameControlValues2?>).castToImpl<ICapturedFrameControlValues2,ICapturedFrameControlValues2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICapturedFrameControlValues2?> =
        arrayOfNulls<ICapturedFrameControlValues2_Impl>(size) as
        Array<ICapturedFrameControlValues2?>
  }
}
