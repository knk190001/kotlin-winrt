package Windows.Networking.NetworkOperators

import Windows.Foundation.IReference
import Windows.Foundation.TimeSpan
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

@ABIMarker(IMobileBroadbandCellCdma.ABI::class)
@Signature("{0601b3b4-411a-4f2e-8287-76f5650c60cd}")
@Guid("0601b3b4411a4f2e828776f5650c60cd")
@WinRTInterface("0601b3b4411a4f2e828776f5650c60cd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandCellCdma.ByReference::class)
public interface IMobileBroadbandCellCdma : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BaseStationId(): IReference<Int>?

  @InterfaceMethod(1)
  public fun get_BaseStationPNCode(): IReference<Int>?

  @InterfaceMethod(2)
  public fun get_BaseStationLatitude(): IReference<Double>?

  @InterfaceMethod(3)
  public fun get_BaseStationLongitude(): IReference<Double>?

  @InterfaceMethod(4)
  public fun get_BaseStationLastBroadcastGpsTime(): IReference<TimeSpan?>?

  @InterfaceMethod(5)
  public fun get_NetworkId(): IReference<Int>?

  @InterfaceMethod(6)
  public fun get_PilotSignalStrengthInDB(): IReference<Double>?

  @InterfaceMethod(7)
  public fun get_SystemId(): IReference<Int>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandCellCdma> {
    public override fun getValue() = ABI.makeIMobileBroadbandCellCdma(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandCellCdma_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandCellCdma {
    public val __1888821133_Ptr: Pointer?

    public val _1888821133_VtblPtr: Pointer?
      get() = __1888821133_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BaseStationId(): IReference<Int>? {
      val fnPtr = _1888821133_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__1888821133_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_BaseStationPNCode(): IReference<Int>? {
      val fnPtr = _1888821133_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__1888821133_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_BaseStationLatitude(): IReference<Double>? {
      val fnPtr = _1888821133_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__1888821133_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_BaseStationLongitude(): IReference<Double>? {
      val fnPtr = _1888821133_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__1888821133_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_BaseStationLastBroadcastGpsTime(): IReference<TimeSpan?>? {
      val fnPtr = _1888821133_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__1888821133_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_NetworkId(): IReference<Int>? {
      val fnPtr = _1888821133_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__1888821133_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_PilotSignalStrengthInDB(): IReference<Double>? {
      val fnPtr = _1888821133_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__1888821133_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_SystemId(): IReference<Int>? {
      val fnPtr = _1888821133_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__1888821133_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandCellCdma_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1888821133_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandCellCdma, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0601b3b4411a4f2e828776f5650c60cd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandCellCdma(ptr: Pointer?): WithDefault =
        IMobileBroadbandCellCdma_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandCellCdma {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandCellCdma(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandCellCdma): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1888821133_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandCellCdma):
        Array<IMobileBroadbandCellCdma?> = (elements as
        Array<IMobileBroadbandCellCdma?>).castToImpl<IMobileBroadbandCellCdma,IMobileBroadbandCellCdma_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandCellCdma?> =
        arrayOfNulls<IMobileBroadbandCellCdma_Impl>(size) as Array<IMobileBroadbandCellCdma?>
  }
}
