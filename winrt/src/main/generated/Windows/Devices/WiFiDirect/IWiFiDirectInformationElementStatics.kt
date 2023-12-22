package Windows.Devices.WiFiDirect

import Windows.Devices.Enumeration.DeviceInformation
import Windows.Foundation.Collections.IVector
import Windows.Storage.Streams.IBuffer
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

@ABIMarker(IWiFiDirectInformationElementStatics.ABI::class)
@Signature("{dbd02f16-11a5-4e60-8caa-34772148378a}")
@Guid("dbd02f1611a54e608caa34772148378a")
@WinRTInterface("dbd02f1611a54e608caa34772148378a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWiFiDirectInformationElementStatics.ByReference::class)
public interface IWiFiDirectInformationElementStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromBuffer(buffer: IBuffer?): IVector<WiFiDirectInformationElement?>?

  @InterfaceMethod(1)
  public fun CreateFromDeviceInformation(deviceInformation: DeviceInformation?):
      IVector<WiFiDirectInformationElement?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWiFiDirectInformationElementStatics> {
    public override fun getValue() =
        ABI.makeIWiFiDirectInformationElementStatics(pointer.getPointer(0))

    public fun setValue(value: IWiFiDirectInformationElementStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWiFiDirectInformationElementStatics {
    public val __1174252440_Ptr: Pointer?

    public val _1174252440_VtblPtr: Pointer?
      get() = __1174252440_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromBuffer(buffer: IBuffer?):
        IVector<WiFiDirectInformationElement?>? {
      val fnPtr = _1174252440_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<WiFiDirectInformationElement?>>()
      val hr = fn.invokeHR(arrayOf(__1174252440_Ptr, marshalToNative(buffer), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<WiFiDirectInformationElement?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromDeviceInformation(deviceInformation: DeviceInformation?):
        IVector<WiFiDirectInformationElement?>? {
      val fnPtr = _1174252440_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<WiFiDirectInformationElement?>>()
      val hr = fn.invokeHR(arrayOf(__1174252440_Ptr, marshalToNative(deviceInformation), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<WiFiDirectInformationElement?>>(result.getValue())
      return resultValue
    }
  }

  public class IWiFiDirectInformationElementStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1174252440_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWiFiDirectInformationElementStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dbd02f1611a54e608caa34772148378a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWiFiDirectInformationElementStatics(ptr: Pointer?): WithDefault =
        IWiFiDirectInformationElementStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWiFiDirectInformationElementStatics {
      val address = segment.toRawLongValue()
      return makeIWiFiDirectInformationElementStatics(Pointer(address))
    }

    public override fun toNative(obj: IWiFiDirectInformationElementStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1174252440_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWiFiDirectInformationElementStatics):
        Array<IWiFiDirectInformationElementStatics?> = (elements as
        Array<IWiFiDirectInformationElementStatics?>).castToImpl<IWiFiDirectInformationElementStatics,IWiFiDirectInformationElementStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWiFiDirectInformationElementStatics?> =
        arrayOfNulls<IWiFiDirectInformationElementStatics_Impl>(size) as
        Array<IWiFiDirectInformationElementStatics?>
  }
}
