package Windows.Networking.NetworkOperators

import Windows.Foundation.IReference
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
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMobileBroadbandCellNR.ABI::class)
@Signature("{a13f0deb-66fc-4b4b-83a9-a487a3a5a0a6}")
@Guid("a13f0deb66fc4b4b83a9a487a3a5a0a6")
@WinRTInterface("a13f0deb66fc4b4b83a9a487a3a5a0a6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandCellNR.ByReference::class)
public interface IMobileBroadbandCellNR : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CellId(): IReference<Long>?

  @InterfaceMethod(1)
  public fun get_ChannelNumber(): IReference<Int>?

  @InterfaceMethod(2)
  public fun get_PhysicalCellId(): IReference<Int>?

  @InterfaceMethod(3)
  public fun get_ProviderId(): String?

  @InterfaceMethod(4)
  public fun get_ReferenceSignalReceivedPowerInDBm(): IReference<Double>?

  @InterfaceMethod(5)
  public fun get_ReferenceSignalReceivedQualityInDBm(): IReference<Double>?

  @InterfaceMethod(6)
  public fun get_TimingAdvanceInNanoseconds(): IReference<Int>?

  @InterfaceMethod(7)
  public fun get_TrackingAreaCode(): IReference<Int>?

  @InterfaceMethod(8)
  public fun get_SignalToNoiseRatioInDB(): IReference<Double>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandCellNR> {
    public override fun getValue() = ABI.makeIMobileBroadbandCellNR(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandCellNR_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandCellNR {
    public val __1418723358_Ptr: Pointer?

    public val _1418723358_VtblPtr: Pointer?
      get() = __1418723358_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CellId(): IReference<Long>? {
      val fnPtr = _1418723358_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Long>>()
      val hr = fn.invokeHR(arrayOf(__1418723358_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Long>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ChannelNumber(): IReference<Int>? {
      val fnPtr = _1418723358_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__1418723358_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_PhysicalCellId(): IReference<Int>? {
      val fnPtr = _1418723358_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__1418723358_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ProviderId(): String? {
      val fnPtr = _1418723358_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1418723358_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ReferenceSignalReceivedPowerInDBm(): IReference<Double>? {
      val fnPtr = _1418723358_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__1418723358_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_ReferenceSignalReceivedQualityInDBm(): IReference<Double>? {
      val fnPtr = _1418723358_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__1418723358_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_TimingAdvanceInNanoseconds(): IReference<Int>? {
      val fnPtr = _1418723358_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__1418723358_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_TrackingAreaCode(): IReference<Int>? {
      val fnPtr = _1418723358_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__1418723358_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_SignalToNoiseRatioInDB(): IReference<Double>? {
      val fnPtr = _1418723358_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__1418723358_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandCellNR_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1418723358_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandCellNR, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a13f0deb66fc4b4b83a9a487a3a5a0a6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandCellNR(ptr: Pointer?): WithDefault =
        IMobileBroadbandCellNR_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandCellNR {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandCellNR(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandCellNR): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1418723358_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandCellNR): Array<IMobileBroadbandCellNR?> =
        (elements as
        Array<IMobileBroadbandCellNR?>).castToImpl<IMobileBroadbandCellNR,IMobileBroadbandCellNR_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandCellNR?> =
        arrayOfNulls<IMobileBroadbandCellNR_Impl>(size) as Array<IMobileBroadbandCellNR?>
  }
}
