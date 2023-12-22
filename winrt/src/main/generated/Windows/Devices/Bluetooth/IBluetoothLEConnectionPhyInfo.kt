package Windows.Devices.Bluetooth

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBluetoothLEConnectionPhyInfo.ABI::class)
@Signature("{9a100bdd-602e-5c27-a1ae-b230015a6394}")
@Guid("9a100bdd602e5c27a1aeb230015a6394")
@WinRTInterface("9a100bdd602e5c27a1aeb230015a6394")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothLEConnectionPhyInfo.ByReference::class)
public interface IBluetoothLEConnectionPhyInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsUncoded1MPhy(): Boolean

  @InterfaceMethod(1)
  public fun get_IsUncoded2MPhy(): Boolean

  @InterfaceMethod(2)
  public fun get_IsCodedPhy(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothLEConnectionPhyInfo> {
    public override fun getValue() = ABI.makeIBluetoothLEConnectionPhyInfo(pointer.getPointer(0))

    public fun setValue(value: IBluetoothLEConnectionPhyInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothLEConnectionPhyInfo {
    public val __2075941249_Ptr: Pointer?

    public val _2075941249_VtblPtr: Pointer?
      get() = __2075941249_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsUncoded1MPhy(): Boolean {
      val fnPtr = _2075941249_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2075941249_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsUncoded2MPhy(): Boolean {
      val fnPtr = _2075941249_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2075941249_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_IsCodedPhy(): Boolean {
      val fnPtr = _2075941249_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2075941249_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IBluetoothLEConnectionPhyInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2075941249_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothLEConnectionPhyInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9a100bdd602e5c27a1aeb230015a6394")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothLEConnectionPhyInfo(ptr: Pointer?): WithDefault =
        IBluetoothLEConnectionPhyInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBluetoothLEConnectionPhyInfo {
      val address = segment.toRawLongValue()
      return makeIBluetoothLEConnectionPhyInfo(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothLEConnectionPhyInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2075941249_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothLEConnectionPhyInfo):
        Array<IBluetoothLEConnectionPhyInfo?> = (elements as
        Array<IBluetoothLEConnectionPhyInfo?>).castToImpl<IBluetoothLEConnectionPhyInfo,IBluetoothLEConnectionPhyInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothLEConnectionPhyInfo?> =
        arrayOfNulls<IBluetoothLEConnectionPhyInfo_Impl>(size) as
        Array<IBluetoothLEConnectionPhyInfo?>
  }
}
