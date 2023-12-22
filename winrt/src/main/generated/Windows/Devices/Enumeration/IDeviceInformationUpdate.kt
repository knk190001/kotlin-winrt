package Windows.Devices.Enumeration

import Windows.Foundation.Collections.IMapView
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IDeviceInformationUpdate.ABI::class)
@Signature("{8f315305-d972-44b7-a37e-9e822c78213b}")
@Guid("8f315305d97244b7a37e9e822c78213b")
@WinRTInterface("8f315305d97244b7a37e9e822c78213b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeviceInformationUpdate.ByReference::class)
public interface IDeviceInformationUpdate : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun get_Properties(): IMapView<String?, IUnknown?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeviceInformationUpdate> {
    public override fun getValue() = ABI.makeIDeviceInformationUpdate(pointer.getPointer(0))

    public fun setValue(value: IDeviceInformationUpdate_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeviceInformationUpdate {
    public val __839372865_Ptr: Pointer?

    public val _839372865_VtblPtr: Pointer?
      get() = __839372865_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _839372865_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__839372865_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Properties(): IMapView<String?, IUnknown?>? {
      val fnPtr = _839372865_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__839372865_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, IUnknown?>>(result.getValue())
      return resultValue
    }
  }

  public class IDeviceInformationUpdate_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __839372865_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeviceInformationUpdate, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8f315305d97244b7a37e9e822c78213b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeviceInformationUpdate(ptr: Pointer?): WithDefault =
        IDeviceInformationUpdate_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeviceInformationUpdate {
      val address = segment.toRawLongValue()
      return makeIDeviceInformationUpdate(Pointer(address))
    }

    public override fun toNative(obj: IDeviceInformationUpdate): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__839372865_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeviceInformationUpdate):
        Array<IDeviceInformationUpdate?> = (elements as
        Array<IDeviceInformationUpdate?>).castToImpl<IDeviceInformationUpdate,IDeviceInformationUpdate_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeviceInformationUpdate?> =
        arrayOfNulls<IDeviceInformationUpdate_Impl>(size) as Array<IDeviceInformationUpdate?>
  }
}
