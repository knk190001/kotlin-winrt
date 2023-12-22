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

@ABIMarker(IMobileBroadbandCellGsm.ABI::class)
@Signature("{cc917f06-7ee0-47b8-9e1f-c3b48df9df5b}")
@Guid("cc917f067ee047b89e1fc3b48df9df5b")
@WinRTInterface("cc917f067ee047b89e1fc3b48df9df5b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandCellGsm.ByReference::class)
public interface IMobileBroadbandCellGsm : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BaseStationId(): IReference<Int>?

  @InterfaceMethod(1)
  public fun get_CellId(): IReference<Int>?

  @InterfaceMethod(2)
  public fun get_ChannelNumber(): IReference<Int>?

  @InterfaceMethod(3)
  public fun get_LocationAreaCode(): IReference<Int>?

  @InterfaceMethod(4)
  public fun get_ProviderId(): String?

  @InterfaceMethod(5)
  public fun get_ReceivedSignalStrengthInDBm(): IReference<Double>?

  @InterfaceMethod(6)
  public fun get_TimingAdvanceInBitPeriods(): IReference<Int>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandCellGsm> {
    public override fun getValue() = ABI.makeIMobileBroadbandCellGsm(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandCellGsm_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandCellGsm {
    public val __1030756733_Ptr: Pointer?

    public val _1030756733_VtblPtr: Pointer?
      get() = __1030756733_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BaseStationId(): IReference<Int>? {
      val fnPtr = _1030756733_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__1030756733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CellId(): IReference<Int>? {
      val fnPtr = _1030756733_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__1030756733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ChannelNumber(): IReference<Int>? {
      val fnPtr = _1030756733_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__1030756733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_LocationAreaCode(): IReference<Int>? {
      val fnPtr = _1030756733_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__1030756733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ProviderId(): String? {
      val fnPtr = _1030756733_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1030756733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_ReceivedSignalStrengthInDBm(): IReference<Double>? {
      val fnPtr = _1030756733_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__1030756733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_TimingAdvanceInBitPeriods(): IReference<Int>? {
      val fnPtr = _1030756733_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__1030756733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandCellGsm_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1030756733_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandCellGsm, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cc917f067ee047b89e1fc3b48df9df5b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandCellGsm(ptr: Pointer?): WithDefault =
        IMobileBroadbandCellGsm_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandCellGsm {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandCellGsm(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandCellGsm): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1030756733_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandCellGsm): Array<IMobileBroadbandCellGsm?>
        = (elements as
        Array<IMobileBroadbandCellGsm?>).castToImpl<IMobileBroadbandCellGsm,IMobileBroadbandCellGsm_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandCellGsm?> =
        arrayOfNulls<IMobileBroadbandCellGsm_Impl>(size) as Array<IMobileBroadbandCellGsm?>
  }
}
