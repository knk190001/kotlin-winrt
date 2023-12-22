package Windows.Devices.WiFiDirect

import Windows.Security.Credentials.PasswordCredential
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWiFiDirectLegacySettings.ABI::class)
@Signature("{a64fdbba-f2fd-4567-a91b-f5c2f5321057}")
@Guid("a64fdbbaf2fd4567a91bf5c2f5321057")
@WinRTInterface("a64fdbbaf2fd4567a91bf5c2f5321057")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWiFiDirectLegacySettings.ByReference::class)
public interface IWiFiDirectLegacySettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsEnabled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_Ssid(): String?

  @InterfaceMethod(3)
  public fun put_Ssid(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_Passphrase(): PasswordCredential?

  @InterfaceMethod(5)
  public fun put_Passphrase(value: PasswordCredential?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWiFiDirectLegacySettings> {
    public override fun getValue() = ABI.makeIWiFiDirectLegacySettings(pointer.getPointer(0))

    public fun setValue(value: IWiFiDirectLegacySettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWiFiDirectLegacySettings {
    public val __1307175417_Ptr: Pointer?

    public val _1307175417_VtblPtr: Pointer?
      get() = __1307175417_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsEnabled(): Boolean {
      val fnPtr = _1307175417_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1307175417_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsEnabled(value: Boolean): Unit {
      val fnPtr = _1307175417_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1307175417_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Ssid(): String? {
      val fnPtr = _1307175417_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1307175417_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Ssid(value: String?): Unit {
      val fnPtr = _1307175417_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1307175417_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Passphrase(): PasswordCredential? {
      val fnPtr = _1307175417_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PasswordCredential>()
      val hr = fn.invokeHR(arrayOf(__1307175417_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PasswordCredential>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Passphrase(value: PasswordCredential?): Unit {
      val fnPtr = _1307175417_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1307175417_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWiFiDirectLegacySettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1307175417_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWiFiDirectLegacySettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a64fdbbaf2fd4567a91bf5c2f5321057")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWiFiDirectLegacySettings(ptr: Pointer?): WithDefault =
        IWiFiDirectLegacySettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWiFiDirectLegacySettings {
      val address = segment.toRawLongValue()
      return makeIWiFiDirectLegacySettings(Pointer(address))
    }

    public override fun toNative(obj: IWiFiDirectLegacySettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1307175417_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWiFiDirectLegacySettings):
        Array<IWiFiDirectLegacySettings?> = (elements as
        Array<IWiFiDirectLegacySettings?>).castToImpl<IWiFiDirectLegacySettings,IWiFiDirectLegacySettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWiFiDirectLegacySettings?> =
        arrayOfNulls<IWiFiDirectLegacySettings_Impl>(size) as Array<IWiFiDirectLegacySettings?>
  }
}
