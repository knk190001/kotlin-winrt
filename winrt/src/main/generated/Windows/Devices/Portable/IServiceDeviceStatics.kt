package Windows.Devices.Portable

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

@ABIMarker(IServiceDeviceStatics.ABI::class)
@Signature("{a88214e1-59c7-4a20-aba6-9f6707937230}")
@Guid("a88214e159c74a20aba69f6707937230")
@WinRTInterface("a88214e159c74a20aba69f6707937230")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IServiceDeviceStatics.ByReference::class)
public interface IServiceDeviceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeviceSelector(serviceType: ServiceDeviceType?): String?

  @InterfaceMethod(1)
  public fun GetDeviceSelectorFromServiceId(serviceId: com.sun.jna.platform.win32.Guid.GUID?):
      String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IServiceDeviceStatics> {
    public override fun getValue() = ABI.makeIServiceDeviceStatics(pointer.getPointer(0))

    public fun setValue(value: IServiceDeviceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IServiceDeviceStatics {
    public val __1496577428_Ptr: Pointer?

    public val _1496577428_VtblPtr: Pointer?
      get() = __1496577428_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeviceSelector(serviceType: ServiceDeviceType?): String? {
      val fnPtr = _1496577428_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1496577428_Ptr, marshalToNative(serviceType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override
        fun GetDeviceSelectorFromServiceId(serviceId: com.sun.jna.platform.win32.Guid.GUID?):
        String? {
      val fnPtr = _1496577428_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1496577428_Ptr, marshalToNative(serviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IServiceDeviceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1496577428_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IServiceDeviceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a88214e159c74a20aba69f6707937230")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIServiceDeviceStatics(ptr: Pointer?): WithDefault =
        IServiceDeviceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IServiceDeviceStatics {
      val address = segment.toRawLongValue()
      return makeIServiceDeviceStatics(Pointer(address))
    }

    public override fun toNative(obj: IServiceDeviceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1496577428_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IServiceDeviceStatics): Array<IServiceDeviceStatics?> =
        (elements as
        Array<IServiceDeviceStatics?>).castToImpl<IServiceDeviceStatics,IServiceDeviceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IServiceDeviceStatics?> =
        arrayOfNulls<IServiceDeviceStatics_Impl>(size) as Array<IServiceDeviceStatics?>
  }
}
