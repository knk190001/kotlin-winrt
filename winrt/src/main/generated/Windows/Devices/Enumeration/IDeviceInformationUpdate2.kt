package Windows.Devices.Enumeration

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

@ABIMarker(IDeviceInformationUpdate2.ABI::class)
@Signature("{5d9d148c-a873-485e-baa6-aa620788e3cc}")
@Guid("5d9d148ca873485ebaa6aa620788e3cc")
@WinRTInterface("5d9d148ca873485ebaa6aa620788e3cc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeviceInformationUpdate2.ByReference::class)
public interface IDeviceInformationUpdate2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Kind(): DeviceInformationKind?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeviceInformationUpdate2> {
    public override fun getValue() = ABI.makeIDeviceInformationUpdate2(pointer.getPointer(0))

    public fun setValue(value: IDeviceInformationUpdate2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeviceInformationUpdate2 {
    public val __250755089_Ptr: Pointer?

    public val _250755089_VtblPtr: Pointer?
      get() = __250755089_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Kind(): DeviceInformationKind? {
      val fnPtr = _250755089_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceInformationKind>()
      val hr = fn.invokeHR(arrayOf(__250755089_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceInformationKind>(result.getValue())
      return resultValue
    }
  }

  public class IDeviceInformationUpdate2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __250755089_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeviceInformationUpdate2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5d9d148ca873485ebaa6aa620788e3cc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeviceInformationUpdate2(ptr: Pointer?): WithDefault =
        IDeviceInformationUpdate2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeviceInformationUpdate2 {
      val address = segment.toRawLongValue()
      return makeIDeviceInformationUpdate2(Pointer(address))
    }

    public override fun toNative(obj: IDeviceInformationUpdate2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__250755089_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeviceInformationUpdate2):
        Array<IDeviceInformationUpdate2?> = (elements as
        Array<IDeviceInformationUpdate2?>).castToImpl<IDeviceInformationUpdate2,IDeviceInformationUpdate2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeviceInformationUpdate2?> =
        arrayOfNulls<IDeviceInformationUpdate2_Impl>(size) as Array<IDeviceInformationUpdate2?>
  }
}
