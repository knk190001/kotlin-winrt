package Windows.Devices.WiFi

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IWiFiWpsConfigurationResult.ABI::class)
@Signature("{67b49871-17ee-42d1-b14f-5a11f1226fb5}")
@Guid("67b4987117ee42d1b14f5a11f1226fb5")
@WinRTInterface("67b4987117ee42d1b14f5a11f1226fb5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWiFiWpsConfigurationResult.ByReference::class)
public interface IWiFiWpsConfigurationResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): WiFiWpsConfigurationStatus?

  @InterfaceMethod(1)
  public fun get_SupportedWpsKinds(): IVectorView<WiFiWpsKind?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWiFiWpsConfigurationResult> {
    public override fun getValue() = ABI.makeIWiFiWpsConfigurationResult(pointer.getPointer(0))

    public fun setValue(value: IWiFiWpsConfigurationResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWiFiWpsConfigurationResult {
    public val __228840410_Ptr: Pointer?

    public val _228840410_VtblPtr: Pointer?
      get() = __228840410_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): WiFiWpsConfigurationStatus? {
      val fnPtr = _228840410_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WiFiWpsConfigurationStatus>()
      val hr = fn.invokeHR(arrayOf(__228840410_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WiFiWpsConfigurationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SupportedWpsKinds(): IVectorView<WiFiWpsKind?>? {
      val fnPtr = _228840410_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<WiFiWpsKind?>>()
      val hr = fn.invokeHR(arrayOf(__228840410_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<WiFiWpsKind?>>(result.getValue())
      return resultValue
    }
  }

  public class IWiFiWpsConfigurationResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __228840410_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWiFiWpsConfigurationResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("67b4987117ee42d1b14f5a11f1226fb5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWiFiWpsConfigurationResult(ptr: Pointer?): WithDefault =
        IWiFiWpsConfigurationResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWiFiWpsConfigurationResult {
      val address = segment.toRawLongValue()
      return makeIWiFiWpsConfigurationResult(Pointer(address))
    }

    public override fun toNative(obj: IWiFiWpsConfigurationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__228840410_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWiFiWpsConfigurationResult):
        Array<IWiFiWpsConfigurationResult?> = (elements as
        Array<IWiFiWpsConfigurationResult?>).castToImpl<IWiFiWpsConfigurationResult,IWiFiWpsConfigurationResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWiFiWpsConfigurationResult?> =
        arrayOfNulls<IWiFiWpsConfigurationResult_Impl>(size) as Array<IWiFiWpsConfigurationResult?>
  }
}
