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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMobileBroadbandCellUmts.ABI::class)
@Signature("{77b4b5ae-49c8-4f15-b285-4c26a7f67215}")
@Guid("77b4b5ae49c84f15b2854c26a7f67215")
@WinRTInterface("77b4b5ae49c84f15b2854c26a7f67215")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandCellUmts.ByReference::class)
public interface IMobileBroadbandCellUmts : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CellId(): IReference<Int>?

  @InterfaceMethod(1)
  public fun get_ChannelNumber(): IReference<Int>?

  @InterfaceMethod(2)
  public fun get_LocationAreaCode(): IReference<Int>?

  @InterfaceMethod(3)
  public fun get_PathLossInDB(): IReference<Double>?

  @InterfaceMethod(4)
  public fun get_PrimaryScramblingCode(): IReference<Int>?

  @InterfaceMethod(5)
  public fun get_ProviderId(): String?

  @InterfaceMethod(6)
  public fun get_ReceivedSignalCodePowerInDBm(): IReference<Double>?

  @InterfaceMethod(7)
  public fun get_SignalToNoiseRatioInDB(): IReference<Double>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandCellUmts> {
    public override fun getValue() = ABI.makeIMobileBroadbandCellUmts(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandCellUmts_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandCellUmts {
    public val __1888276011_Ptr: Pointer?

    public val _1888276011_VtblPtr: Pointer?
      get() = __1888276011_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CellId(): IReference<Int>? {
      val fnPtr = _1888276011_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__1888276011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ChannelNumber(): IReference<Int>? {
      val fnPtr = _1888276011_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__1888276011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_LocationAreaCode(): IReference<Int>? {
      val fnPtr = _1888276011_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__1888276011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_PathLossInDB(): IReference<Double>? {
      val fnPtr = _1888276011_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__1888276011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_PrimaryScramblingCode(): IReference<Int>? {
      val fnPtr = _1888276011_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__1888276011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_ProviderId(): String? {
      val fnPtr = _1888276011_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1888276011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_ReceivedSignalCodePowerInDBm(): IReference<Double>? {
      val fnPtr = _1888276011_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__1888276011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_SignalToNoiseRatioInDB(): IReference<Double>? {
      val fnPtr = _1888276011_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__1888276011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandCellUmts_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1888276011_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandCellUmts, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("77b4b5ae49c84f15b2854c26a7f67215")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandCellUmts(ptr: Pointer?): WithDefault =
        IMobileBroadbandCellUmts_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandCellUmts {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandCellUmts(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandCellUmts): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1888276011_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandCellUmts):
        Array<IMobileBroadbandCellUmts?> = (elements as
        Array<IMobileBroadbandCellUmts?>).castToImpl<IMobileBroadbandCellUmts,IMobileBroadbandCellUmts_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandCellUmts?> =
        arrayOfNulls<IMobileBroadbandCellUmts_Impl>(size) as Array<IMobileBroadbandCellUmts?>
  }
}
