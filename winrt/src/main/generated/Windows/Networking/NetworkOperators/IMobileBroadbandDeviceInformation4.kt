package Windows.Networking.NetworkOperators

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

@ABIMarker(IMobileBroadbandDeviceInformation4.ABI::class)
@Signature("{263f3152-7b9d-582c-b17c-f80a60b50031}")
@Guid("263f31527b9d582cb17cf80a60b50031")
@WinRTInterface("263f31527b9d582cb17cf80a60b50031")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandDeviceInformation4.ByReference::class)
public interface IMobileBroadbandDeviceInformation4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SlotManager(): MobileBroadbandSlotManager?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandDeviceInformation4> {
    public override fun getValue() =
        ABI.makeIMobileBroadbandDeviceInformation4(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandDeviceInformation4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandDeviceInformation4 {
    public val __284562746_Ptr: Pointer?

    public val _284562746_VtblPtr: Pointer?
      get() = __284562746_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SlotManager(): MobileBroadbandSlotManager? {
      val fnPtr = _284562746_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MobileBroadbandSlotManager>()
      val hr = fn.invokeHR(arrayOf(__284562746_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MobileBroadbandSlotManager>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandDeviceInformation4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __284562746_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandDeviceInformation4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("263f31527b9d582cb17cf80a60b50031")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandDeviceInformation4(ptr: Pointer?): WithDefault =
        IMobileBroadbandDeviceInformation4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandDeviceInformation4 {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandDeviceInformation4(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandDeviceInformation4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__284562746_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandDeviceInformation4):
        Array<IMobileBroadbandDeviceInformation4?> = (elements as
        Array<IMobileBroadbandDeviceInformation4?>).castToImpl<IMobileBroadbandDeviceInformation4,IMobileBroadbandDeviceInformation4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandDeviceInformation4?> =
        arrayOfNulls<IMobileBroadbandDeviceInformation4_Impl>(size) as
        Array<IMobileBroadbandDeviceInformation4?>
  }
}
