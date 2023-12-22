package Windows.Devices.PointOfService

import Windows.Foundation.Collections.IMapView
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IMagneticStripeReaderReport.ABI::class)
@Signature("{6a5b6047-99b0-4188-bef1-eddf79f78fe6}")
@Guid("6a5b604799b04188bef1eddf79f78fe6")
@WinRTInterface("6a5b604799b04188bef1eddf79f78fe6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMagneticStripeReaderReport.ByReference::class)
public interface IMagneticStripeReaderReport : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CardType(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_Track1(): MagneticStripeReaderTrackData?

  @InterfaceMethod(2)
  public fun get_Track2(): MagneticStripeReaderTrackData?

  @InterfaceMethod(3)
  public fun get_Track3(): MagneticStripeReaderTrackData?

  @InterfaceMethod(4)
  public fun get_Track4(): MagneticStripeReaderTrackData?

  @InterfaceMethod(5)
  public fun get_Properties(): IMapView<String?, String?>?

  @InterfaceMethod(6)
  public fun get_CardAuthenticationData(): IBuffer?

  @InterfaceMethod(7)
  public fun get_CardAuthenticationDataLength(): WinDef.UINT

  @InterfaceMethod(8)
  public fun get_AdditionalSecurityInformation(): IBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMagneticStripeReaderReport> {
    public override fun getValue() = ABI.makeIMagneticStripeReaderReport(pointer.getPointer(0))

    public fun setValue(value: IMagneticStripeReaderReport_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMagneticStripeReaderReport {
    public val __360977479_Ptr: Pointer?

    public val _360977479_VtblPtr: Pointer?
      get() = __360977479_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CardType(): WinDef.UINT {
      val fnPtr = _360977479_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__360977479_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Track1(): MagneticStripeReaderTrackData? {
      val fnPtr = _360977479_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MagneticStripeReaderTrackData>()
      val hr = fn.invokeHR(arrayOf(__360977479_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MagneticStripeReaderTrackData>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Track2(): MagneticStripeReaderTrackData? {
      val fnPtr = _360977479_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MagneticStripeReaderTrackData>()
      val hr = fn.invokeHR(arrayOf(__360977479_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MagneticStripeReaderTrackData>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Track3(): MagneticStripeReaderTrackData? {
      val fnPtr = _360977479_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MagneticStripeReaderTrackData>()
      val hr = fn.invokeHR(arrayOf(__360977479_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MagneticStripeReaderTrackData>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Track4(): MagneticStripeReaderTrackData? {
      val fnPtr = _360977479_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MagneticStripeReaderTrackData>()
      val hr = fn.invokeHR(arrayOf(__360977479_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MagneticStripeReaderTrackData>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Properties(): IMapView<String?, String?>? {
      val fnPtr = _360977479_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, String?>>()
      val hr = fn.invokeHR(arrayOf(__360977479_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_CardAuthenticationData(): IBuffer? {
      val fnPtr = _360977479_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__360977479_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_CardAuthenticationDataLength(): WinDef.UINT {
      val fnPtr = _360977479_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__360977479_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_AdditionalSecurityInformation(): IBuffer? {
      val fnPtr = _360977479_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__360977479_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }
  }

  public class IMagneticStripeReaderReport_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __360977479_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMagneticStripeReaderReport, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6a5b604799b04188bef1eddf79f78fe6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMagneticStripeReaderReport(ptr: Pointer?): WithDefault =
        IMagneticStripeReaderReport_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMagneticStripeReaderReport {
      val address = segment.toRawLongValue()
      return makeIMagneticStripeReaderReport(Pointer(address))
    }

    public override fun toNative(obj: IMagneticStripeReaderReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__360977479_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMagneticStripeReaderReport):
        Array<IMagneticStripeReaderReport?> = (elements as
        Array<IMagneticStripeReaderReport?>).castToImpl<IMagneticStripeReaderReport,IMagneticStripeReaderReport_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMagneticStripeReaderReport?> =
        arrayOfNulls<IMagneticStripeReaderReport_Impl>(size) as Array<IMagneticStripeReaderReport?>
  }
}
