package Windows.Devices.Enumeration

import Windows.Foundation.Deferral
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDevicePairingRequestedEventArgs.ABI::class)
@Signature("{f717fc56-de6b-487f-8376-0180aca69963}")
@Guid("f717fc56de6b487f83760180aca69963")
@WinRTInterface("f717fc56de6b487f83760180aca69963")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDevicePairingRequestedEventArgs.ByReference::class)
public interface IDevicePairingRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceInformation(): DeviceInformation?

  @InterfaceMethod(1)
  public fun get_PairingKind(): DevicePairingKinds?

  @InterfaceMethod(2)
  public fun get_Pin(): String?

  @InterfaceMethod(3)
  public fun Accept(): Unit

  @InterfaceMethod(4)
  public fun Accept(pin: String?): Unit

  @InterfaceMethod(5)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDevicePairingRequestedEventArgs> {
    public override fun getValue() = ABI.makeIDevicePairingRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IDevicePairingRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDevicePairingRequestedEventArgs {
    public val __1310483165_Ptr: Pointer?

    public val _1310483165_VtblPtr: Pointer?
      get() = __1310483165_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceInformation(): DeviceInformation? {
      val fnPtr = _1310483165_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceInformation>()
      val hr = fn.invokeHR(arrayOf(__1310483165_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceInformation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PairingKind(): DevicePairingKinds? {
      val fnPtr = _1310483165_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DevicePairingKinds>()
      val hr = fn.invokeHR(arrayOf(__1310483165_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DevicePairingKinds>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Pin(): String? {
      val fnPtr = _1310483165_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1310483165_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun Accept(): Unit {
      val fnPtr = _1310483165_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1310483165_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun Accept(pin: String?): Unit {
      val fnPtr = _1310483165_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1310483165_Ptr, marshalToNative(pin),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1310483165_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1310483165_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IDevicePairingRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1310483165_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDevicePairingRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f717fc56de6b487f83760180aca69963")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDevicePairingRequestedEventArgs(ptr: Pointer?): WithDefault =
        IDevicePairingRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDevicePairingRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIDevicePairingRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDevicePairingRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1310483165_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDevicePairingRequestedEventArgs):
        Array<IDevicePairingRequestedEventArgs?> = (elements as
        Array<IDevicePairingRequestedEventArgs?>).castToImpl<IDevicePairingRequestedEventArgs,IDevicePairingRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDevicePairingRequestedEventArgs?> =
        arrayOfNulls<IDevicePairingRequestedEventArgs_Impl>(size) as
        Array<IDevicePairingRequestedEventArgs?>
  }
}
