package Windows.Devices.PointOfService

import Windows.Storage.Streams.IBuffer
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

@ABIMarker(IMagneticStripeReaderTrackData.ABI::class)
@Signature("{104cf671-4a9d-446e-abc5-20402307ba36}")
@Guid("104cf6714a9d446eabc520402307ba36")
@WinRTInterface("104cf6714a9d446eabc520402307ba36")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMagneticStripeReaderTrackData.ByReference::class)
public interface IMagneticStripeReaderTrackData : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Data(): IBuffer?

  @InterfaceMethod(1)
  public fun get_DiscretionaryData(): IBuffer?

  @InterfaceMethod(2)
  public fun get_EncryptedData(): IBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMagneticStripeReaderTrackData> {
    public override fun getValue() = ABI.makeIMagneticStripeReaderTrackData(pointer.getPointer(0))

    public fun setValue(value: IMagneticStripeReaderTrackData_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMagneticStripeReaderTrackData {
    public val __364723106_Ptr: Pointer?

    public val _364723106_VtblPtr: Pointer?
      get() = __364723106_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Data(): IBuffer? {
      val fnPtr = _364723106_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__364723106_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DiscretionaryData(): IBuffer? {
      val fnPtr = _364723106_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__364723106_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_EncryptedData(): IBuffer? {
      val fnPtr = _364723106_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__364723106_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }
  }

  public class IMagneticStripeReaderTrackData_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __364723106_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMagneticStripeReaderTrackData, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("104cf6714a9d446eabc520402307ba36")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMagneticStripeReaderTrackData(ptr: Pointer?): WithDefault =
        IMagneticStripeReaderTrackData_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMagneticStripeReaderTrackData {
      val address = segment.toRawLongValue()
      return makeIMagneticStripeReaderTrackData(Pointer(address))
    }

    public override fun toNative(obj: IMagneticStripeReaderTrackData): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__364723106_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMagneticStripeReaderTrackData):
        Array<IMagneticStripeReaderTrackData?> = (elements as
        Array<IMagneticStripeReaderTrackData?>).castToImpl<IMagneticStripeReaderTrackData,IMagneticStripeReaderTrackData_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMagneticStripeReaderTrackData?> =
        arrayOfNulls<IMagneticStripeReaderTrackData_Impl>(size) as
        Array<IMagneticStripeReaderTrackData?>
  }
}
