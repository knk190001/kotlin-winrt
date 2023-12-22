package Windows.Devices.WiFiDirect

import Windows.Devices.Enumeration.DeviceInformation
import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
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

@ABIMarker(IWiFiDirectConnectionRequest.ABI::class)
@Signature("{8eb99605-914f-49c3-a614-d18dc5b19b43}")
@Guid("8eb99605914f49c3a614d18dc5b19b43")
@WinRTInterface("8eb99605914f49c3a614d18dc5b19b43")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWiFiDirectConnectionRequest.ByReference::class)
public interface IWiFiDirectConnectionRequest : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun get_DeviceInformation(): DeviceInformation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWiFiDirectConnectionRequest> {
    public override fun getValue() = ABI.makeIWiFiDirectConnectionRequest(pointer.getPointer(0))

    public fun setValue(value: IWiFiDirectConnectionRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWiFiDirectConnectionRequest, IClosable.WithDefault {
    public val __518421564_Ptr: Pointer?

    public val _518421564_VtblPtr: Pointer?
      get() = __518421564_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceInformation(): DeviceInformation? {
      val fnPtr = _518421564_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceInformation>()
      val hr = fn.invokeHR(arrayOf(__518421564_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceInformation>(result.getValue())
      return resultValue
    }
  }

  public class IWiFiDirectConnectionRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_518421564_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __518421564_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWiFiDirectConnectionRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8eb99605914f49c3a614d18dc5b19b43")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWiFiDirectConnectionRequest(ptr: Pointer?): WithDefault =
        IWiFiDirectConnectionRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWiFiDirectConnectionRequest {
      val address = segment.toRawLongValue()
      return makeIWiFiDirectConnectionRequest(Pointer(address))
    }

    public override fun toNative(obj: IWiFiDirectConnectionRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__518421564_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWiFiDirectConnectionRequest):
        Array<IWiFiDirectConnectionRequest?> = (elements as
        Array<IWiFiDirectConnectionRequest?>).castToImpl<IWiFiDirectConnectionRequest,IWiFiDirectConnectionRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWiFiDirectConnectionRequest?> =
        arrayOfNulls<IWiFiDirectConnectionRequest_Impl>(size) as
        Array<IWiFiDirectConnectionRequest?>
  }
}
