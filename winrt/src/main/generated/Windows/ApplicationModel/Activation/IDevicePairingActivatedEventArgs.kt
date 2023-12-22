package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Activation.IActivatedEventArgs.ABI.IID
import Windows.Devices.Enumeration.DeviceInformation
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IDevicePairingActivatedEventArgs.ABI::class)
@Signature("{eba0d1e4-ecc6-4148-94ed-f4b37ec05b3e}")
@Guid("eba0d1e4ecc6414894edf4b37ec05b3e")
@WinRTInterface("eba0d1e4ecc6414894edf4b37ec05b3e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDevicePairingActivatedEventArgs.ByReference::class)
public interface IDevicePairingActivatedEventArgs : NativeMapped, IWinRTInterface,
    IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_DeviceInformation(): DeviceInformation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDevicePairingActivatedEventArgs> {
    public override fun getValue() = ABI.makeIDevicePairingActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IDevicePairingActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDevicePairingActivatedEventArgs, IActivatedEventArgs.WithDefault {
    public val __1357215025_Ptr: Pointer?

    public val _1357215025_VtblPtr: Pointer?
      get() = __1357215025_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceInformation(): DeviceInformation? {
      val fnPtr = _1357215025_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceInformation>()
      val hr = fn.invokeHR(arrayOf(__1357215025_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceInformation>(result.getValue())
      return resultValue
    }
  }

  public class IDevicePairingActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IActivatedEventArgs {
    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1357215025_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1357215025_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDevicePairingActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eba0d1e4ecc6414894edf4b37ec05b3e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDevicePairingActivatedEventArgs(ptr: Pointer?): WithDefault =
        IDevicePairingActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDevicePairingActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIDevicePairingActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDevicePairingActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1357215025_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDevicePairingActivatedEventArgs):
        Array<IDevicePairingActivatedEventArgs?> = (elements as
        Array<IDevicePairingActivatedEventArgs?>).castToImpl<IDevicePairingActivatedEventArgs,IDevicePairingActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDevicePairingActivatedEventArgs?> =
        arrayOfNulls<IDevicePairingActivatedEventArgs_Impl>(size) as
        Array<IDevicePairingActivatedEventArgs?>
  }
}
