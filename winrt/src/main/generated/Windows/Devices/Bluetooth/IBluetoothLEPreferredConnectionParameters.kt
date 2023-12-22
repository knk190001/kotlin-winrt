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

@ABIMarker(IBluetoothLEPreferredConnectionParameters.ABI::class)
@Signature("{f2f44344-7372-5f7b-9b34-29c944f5a715}")
@Guid("f2f4434473725f7b9b3429c944f5a715")
@WinRTInterface("f2f4434473725f7b9b3429c944f5a715")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothLEPreferredConnectionParameters.ByReference::class)
public interface IBluetoothLEPreferredConnectionParameters : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LinkTimeout(): WinDef.USHORT

  @InterfaceMethod(1)
  public fun get_ConnectionLatency(): WinDef.USHORT

  @InterfaceMethod(2)
  public fun get_MinConnectionInterval(): WinDef.USHORT

  @InterfaceMethod(3)
  public fun get_MaxConnectionInterval(): WinDef.USHORT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothLEPreferredConnectionParameters> {
    public override fun getValue() =
        ABI.makeIBluetoothLEPreferredConnectionParameters(pointer.getPointer(0))

    public fun setValue(value: IBluetoothLEPreferredConnectionParameters_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothLEPreferredConnectionParameters {
    public val __2072617465_Ptr: Pointer?

    public val _2072617465_VtblPtr: Pointer?
      get() = __2072617465_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LinkTimeout(): WinDef.USHORT {
      val fnPtr = _2072617465_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__2072617465_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_ConnectionLatency(): WinDef.USHORT {
      val fnPtr = _2072617465_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__2072617465_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_MinConnectionInterval(): WinDef.USHORT {
      val fnPtr = _2072617465_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__2072617465_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_MaxConnectionInterval(): WinDef.USHORT {
      val fnPtr = _2072617465_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__2072617465_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }
  }

  public class IBluetoothLEPreferredConnectionParameters_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2072617465_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothLEPreferredConnectionParameters, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f2f4434473725f7b9b3429c944f5a715")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothLEPreferredConnectionParameters(ptr: Pointer?): WithDefault =
        IBluetoothLEPreferredConnectionParameters_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IBluetoothLEPreferredConnectionParameters {
      val address = segment.toRawLongValue()
      return makeIBluetoothLEPreferredConnectionParameters(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothLEPreferredConnectionParameters): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2072617465_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothLEPreferredConnectionParameters):
        Array<IBluetoothLEPreferredConnectionParameters?> = (elements as
        Array<IBluetoothLEPreferredConnectionParameters?>).castToImpl<IBluetoothLEPreferredConnectionParameters,IBluetoothLEPreferredConnectionParameters_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothLEPreferredConnectionParameters?> =
        arrayOfNulls<IBluetoothLEPreferredConnectionParameters_Impl>(size) as
        Array<IBluetoothLEPreferredConnectionParameters?>
  }
}
