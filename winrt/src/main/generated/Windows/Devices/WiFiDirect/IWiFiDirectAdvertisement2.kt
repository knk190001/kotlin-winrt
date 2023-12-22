package Windows.Devices.WiFiDirect

import Windows.Foundation.Collections.IVector
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

@ABIMarker(IWiFiDirectAdvertisement2.ABI::class)
@Signature("{b759aa46-d816-491b-917a-b40d7dc403a2}")
@Guid("b759aa46d816491b917ab40d7dc403a2")
@WinRTInterface("b759aa46d816491b917ab40d7dc403a2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWiFiDirectAdvertisement2.ByReference::class)
public interface IWiFiDirectAdvertisement2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SupportedConfigurationMethods(): IVector<WiFiDirectConfigurationMethod?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWiFiDirectAdvertisement2> {
    public override fun getValue() = ABI.makeIWiFiDirectAdvertisement2(pointer.getPointer(0))

    public fun setValue(value: IWiFiDirectAdvertisement2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWiFiDirectAdvertisement2 {
    public val __1798955590_Ptr: Pointer?

    public val _1798955590_VtblPtr: Pointer?
      get() = __1798955590_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SupportedConfigurationMethods():
        IVector<WiFiDirectConfigurationMethod?>? {
      val fnPtr = _1798955590_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<WiFiDirectConfigurationMethod?>>()
      val hr = fn.invokeHR(arrayOf(__1798955590_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVector<WiFiDirectConfigurationMethod?>>(result.getValue())
      return resultValue
    }
  }

  public class IWiFiDirectAdvertisement2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1798955590_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWiFiDirectAdvertisement2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b759aa46d816491b917ab40d7dc403a2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWiFiDirectAdvertisement2(ptr: Pointer?): WithDefault =
        IWiFiDirectAdvertisement2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWiFiDirectAdvertisement2 {
      val address = segment.toRawLongValue()
      return makeIWiFiDirectAdvertisement2(Pointer(address))
    }

    public override fun toNative(obj: IWiFiDirectAdvertisement2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1798955590_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWiFiDirectAdvertisement2):
        Array<IWiFiDirectAdvertisement2?> = (elements as
        Array<IWiFiDirectAdvertisement2?>).castToImpl<IWiFiDirectAdvertisement2,IWiFiDirectAdvertisement2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWiFiDirectAdvertisement2?> =
        arrayOfNulls<IWiFiDirectAdvertisement2_Impl>(size) as Array<IWiFiDirectAdvertisement2?>
  }
}
