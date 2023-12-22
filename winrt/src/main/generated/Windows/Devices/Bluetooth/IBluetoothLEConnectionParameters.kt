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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IBluetoothLEConnectionParameters.ABI::class)
@Signature("{33cb0771-8da9-508f-a366-1ca388c929ab}")
@Guid("33cb07718da9508fa3661ca388c929ab")
@WinRTInterface("33cb07718da9508fa3661ca388c929ab")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothLEConnectionParameters.ByReference::class)
public interface IBluetoothLEConnectionParameters : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LinkTimeout(): WinDef.USHORT

  @InterfaceMethod(1)
  public fun get_ConnectionLatency(): WinDef.USHORT

  @InterfaceMethod(2)
  public fun get_ConnectionInterval(): WinDef.USHORT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothLEConnectionParameters> {
    public override fun getValue() = ABI.makeIBluetoothLEConnectionParameters(pointer.getPointer(0))

    public fun setValue(value: IBluetoothLEConnectionParameters_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothLEConnectionParameters {
    public val __1380111608_Ptr: Pointer?

    public val _1380111608_VtblPtr: Pointer?
      get() = __1380111608_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LinkTimeout(): WinDef.USHORT {
      val fnPtr = _1380111608_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1380111608_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_ConnectionLatency(): WinDef.USHORT {
      val fnPtr = _1380111608_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1380111608_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_ConnectionInterval(): WinDef.USHORT {
      val fnPtr = _1380111608_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1380111608_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }
  }

  public class IBluetoothLEConnectionParameters_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1380111608_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothLEConnectionParameters, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("33cb07718da9508fa3661ca388c929ab")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothLEConnectionParameters(ptr: Pointer?): WithDefault =
        IBluetoothLEConnectionParameters_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBluetoothLEConnectionParameters {
      val address = segment.toRawLongValue()
      return makeIBluetoothLEConnectionParameters(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothLEConnectionParameters): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1380111608_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothLEConnectionParameters):
        Array<IBluetoothLEConnectionParameters?> = (elements as
        Array<IBluetoothLEConnectionParameters?>).castToImpl<IBluetoothLEConnectionParameters,IBluetoothLEConnectionParameters_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothLEConnectionParameters?> =
        arrayOfNulls<IBluetoothLEConnectionParameters_Impl>(size) as
        Array<IBluetoothLEConnectionParameters?>
  }
}
