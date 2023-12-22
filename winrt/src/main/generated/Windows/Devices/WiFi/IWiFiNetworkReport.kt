package Windows.Devices.WiFi

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.DateTime
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

@ABIMarker(IWiFiNetworkReport.ABI::class)
@Signature("{9524ded2-5911-445e-8194-be4f1a704895}")
@Guid("9524ded25911445e8194be4f1a704895")
@WinRTInterface("9524ded25911445e8194be4f1a704895")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWiFiNetworkReport.ByReference::class)
public interface IWiFiNetworkReport : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Timestamp(): DateTime?

  @InterfaceMethod(1)
  public fun get_AvailableNetworks(): IVectorView<WiFiAvailableNetwork?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWiFiNetworkReport> {
    public override fun getValue() = ABI.makeIWiFiNetworkReport(pointer.getPointer(0))

    public fun setValue(value: IWiFiNetworkReport_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWiFiNetworkReport {
    public val __1360324565_Ptr: Pointer?

    public val _1360324565_VtblPtr: Pointer?
      get() = __1360324565_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Timestamp(): DateTime? {
      val fnPtr = _1360324565_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1360324565_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AvailableNetworks(): IVectorView<WiFiAvailableNetwork?>? {
      val fnPtr = _1360324565_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<WiFiAvailableNetwork?>>()
      val hr = fn.invokeHR(arrayOf(__1360324565_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<WiFiAvailableNetwork?>>(result.getValue())
      return resultValue
    }
  }

  public class IWiFiNetworkReport_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1360324565_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWiFiNetworkReport, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9524ded25911445e8194be4f1a704895")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWiFiNetworkReport(ptr: Pointer?): WithDefault = IWiFiNetworkReport_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWiFiNetworkReport {
      val address = segment.toRawLongValue()
      return makeIWiFiNetworkReport(Pointer(address))
    }

    public override fun toNative(obj: IWiFiNetworkReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1360324565_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWiFiNetworkReport): Array<IWiFiNetworkReport?> =
        (elements as
        Array<IWiFiNetworkReport?>).castToImpl<IWiFiNetworkReport,IWiFiNetworkReport_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWiFiNetworkReport?> =
        arrayOfNulls<IWiFiNetworkReport_Impl>(size) as Array<IWiFiNetworkReport?>
  }
}
