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

@ABIMarker(IMobileBroadbandCellTdscdma.ABI::class)
@Signature("{0eda1655-db0e-4182-8cda-cc419a7bde08}")
@Guid("0eda1655db0e41828cdacc419a7bde08")
@WinRTInterface("0eda1655db0e41828cdacc419a7bde08")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandCellTdscdma.ByReference::class)
public interface IMobileBroadbandCellTdscdma : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CellId(): IReference<Int>?

  @InterfaceMethod(1)
  public fun get_CellParameterId(): IReference<Int>?

  @InterfaceMethod(2)
  public fun get_ChannelNumber(): IReference<Int>?

  @InterfaceMethod(3)
  public fun get_LocationAreaCode(): IReference<Int>?

  @InterfaceMethod(4)
  public fun get_PathLossInDB(): IReference<Double>?

  @InterfaceMethod(5)
  public fun get_ProviderId(): String?

  @InterfaceMethod(6)
  public fun get_ReceivedSignalCodePowerInDBm(): IReference<Double>?

  @InterfaceMethod(7)
  public fun get_TimingAdvanceInBitPeriods(): IReference<Int>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandCellTdscdma> {
    public override fun getValue() = ABI.makeIMobileBroadbandCellTdscdma(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandCellTdscdma_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandCellTdscdma {
    public val __704532666_Ptr: Pointer?

    public val _704532666_VtblPtr: Pointer?
      get() = __704532666_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CellId(): IReference<Int>? {
      val fnPtr = _704532666_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__704532666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CellParameterId(): IReference<Int>? {
      val fnPtr = _704532666_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__704532666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ChannelNumber(): IReference<Int>? {
      val fnPtr = _704532666_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__704532666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_LocationAreaCode(): IReference<Int>? {
      val fnPtr = _704532666_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__704532666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_PathLossInDB(): IReference<Double>? {
      val fnPtr = _704532666_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__704532666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_ProviderId(): String? {
      val fnPtr = _704532666_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__704532666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_ReceivedSignalCodePowerInDBm(): IReference<Double>? {
      val fnPtr = _704532666_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__704532666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_TimingAdvanceInBitPeriods(): IReference<Int>? {
      val fnPtr = _704532666_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__704532666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandCellTdscdma_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __704532666_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandCellTdscdma, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0eda1655db0e41828cdacc419a7bde08")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandCellTdscdma(ptr: Pointer?): WithDefault =
        IMobileBroadbandCellTdscdma_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandCellTdscdma {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandCellTdscdma(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandCellTdscdma): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__704532666_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandCellTdscdma):
        Array<IMobileBroadbandCellTdscdma?> = (elements as
        Array<IMobileBroadbandCellTdscdma?>).castToImpl<IMobileBroadbandCellTdscdma,IMobileBroadbandCellTdscdma_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandCellTdscdma?> =
        arrayOfNulls<IMobileBroadbandCellTdscdma_Impl>(size) as Array<IMobileBroadbandCellTdscdma?>
  }
}
