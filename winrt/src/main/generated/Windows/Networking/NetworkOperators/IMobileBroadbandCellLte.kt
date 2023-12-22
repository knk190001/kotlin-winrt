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

@ABIMarker(IMobileBroadbandCellLte.ABI::class)
@Signature("{9197c87b-2b78-456d-8b53-aaa25d0af741}")
@Guid("9197c87b2b78456d8b53aaa25d0af741")
@WinRTInterface("9197c87b2b78456d8b53aaa25d0af741")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandCellLte.ByReference::class)
public interface IMobileBroadbandCellLte : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CellId(): IReference<Int>?

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
  public fun get_TimingAdvanceInBitPeriods(): IReference<Int>?

  @InterfaceMethod(7)
  public fun get_TrackingAreaCode(): IReference<Int>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandCellLte> {
    public override fun getValue() = ABI.makeIMobileBroadbandCellLte(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandCellLte_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandCellLte {
    public val __1030751905_Ptr: Pointer?

    public val _1030751905_VtblPtr: Pointer?
      get() = __1030751905_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CellId(): IReference<Int>? {
      val fnPtr = _1030751905_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__1030751905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ChannelNumber(): IReference<Int>? {
      val fnPtr = _1030751905_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__1030751905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_PhysicalCellId(): IReference<Int>? {
      val fnPtr = _1030751905_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__1030751905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ProviderId(): String? {
      val fnPtr = _1030751905_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1030751905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ReferenceSignalReceivedPowerInDBm(): IReference<Double>? {
      val fnPtr = _1030751905_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__1030751905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_ReferenceSignalReceivedQualityInDBm(): IReference<Double>? {
      val fnPtr = _1030751905_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__1030751905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_TimingAdvanceInBitPeriods(): IReference<Int>? {
      val fnPtr = _1030751905_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__1030751905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_TrackingAreaCode(): IReference<Int>? {
      val fnPtr = _1030751905_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__1030751905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandCellLte_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1030751905_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandCellLte, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9197c87b2b78456d8b53aaa25d0af741")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandCellLte(ptr: Pointer?): WithDefault =
        IMobileBroadbandCellLte_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandCellLte {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandCellLte(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandCellLte): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1030751905_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandCellLte): Array<IMobileBroadbandCellLte?>
        = (elements as
        Array<IMobileBroadbandCellLte?>).castToImpl<IMobileBroadbandCellLte,IMobileBroadbandCellLte_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandCellLte?> =
        arrayOfNulls<IMobileBroadbandCellLte_Impl>(size) as Array<IMobileBroadbandCellLte?>
  }
}
