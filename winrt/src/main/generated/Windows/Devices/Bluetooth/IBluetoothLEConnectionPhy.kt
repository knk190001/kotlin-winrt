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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBluetoothLEConnectionPhy.ABI::class)
@Signature("{781e5e48-621e-5a7e-8be6-1b9561ff63c9}")
@Guid("781e5e48621e5a7e8be61b9561ff63c9")
@WinRTInterface("781e5e48621e5a7e8be61b9561ff63c9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothLEConnectionPhy.ByReference::class)
public interface IBluetoothLEConnectionPhy : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TransmitInfo(): BluetoothLEConnectionPhyInfo?

  @InterfaceMethod(1)
  public fun get_ReceiveInfo(): BluetoothLEConnectionPhyInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothLEConnectionPhy> {
    public override fun getValue() = ABI.makeIBluetoothLEConnectionPhy(pointer.getPointer(0))

    public fun setValue(value: IBluetoothLEConnectionPhy_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothLEConnectionPhy {
    public val __587452979_Ptr: Pointer?

    public val _587452979_VtblPtr: Pointer?
      get() = __587452979_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TransmitInfo(): BluetoothLEConnectionPhyInfo? {
      val fnPtr = _587452979_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothLEConnectionPhyInfo>()
      val hr = fn.invokeHR(arrayOf(__587452979_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothLEConnectionPhyInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ReceiveInfo(): BluetoothLEConnectionPhyInfo? {
      val fnPtr = _587452979_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothLEConnectionPhyInfo>()
      val hr = fn.invokeHR(arrayOf(__587452979_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothLEConnectionPhyInfo>(result.getValue())
      return resultValue
    }
  }

  public class IBluetoothLEConnectionPhy_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __587452979_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothLEConnectionPhy, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("781e5e48621e5a7e8be61b9561ff63c9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothLEConnectionPhy(ptr: Pointer?): WithDefault =
        IBluetoothLEConnectionPhy_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBluetoothLEConnectionPhy {
      val address = segment.toRawLongValue()
      return makeIBluetoothLEConnectionPhy(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothLEConnectionPhy): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__587452979_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothLEConnectionPhy):
        Array<IBluetoothLEConnectionPhy?> = (elements as
        Array<IBluetoothLEConnectionPhy?>).castToImpl<IBluetoothLEConnectionPhy,IBluetoothLEConnectionPhy_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothLEConnectionPhy?> =
        arrayOfNulls<IBluetoothLEConnectionPhy_Impl>(size) as Array<IBluetoothLEConnectionPhy?>
  }
}
