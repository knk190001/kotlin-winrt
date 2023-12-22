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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INetworkOperatorTetheringAccessPointConfiguration.ABI::class)
@Signature("{0bcc0284-412e-403d-acc6-b757e34774a4}")
@Guid("0bcc0284412e403dacc6b757e34774a4")
@WinRTInterface("0bcc0284412e403dacc6b757e34774a4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INetworkOperatorTetheringAccessPointConfiguration.ByReference::class)
public interface INetworkOperatorTetheringAccessPointConfiguration : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Ssid(): String?

  @InterfaceMethod(1)
  public fun put_Ssid(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Passphrase(): String?

  @InterfaceMethod(3)
  public fun put_Passphrase(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INetworkOperatorTetheringAccessPointConfiguration> {
    public override fun getValue() =
        ABI.makeINetworkOperatorTetheringAccessPointConfiguration(pointer.getPointer(0))

    public fun setValue(value: INetworkOperatorTetheringAccessPointConfiguration_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INetworkOperatorTetheringAccessPointConfiguration {
    public val __2117598815_Ptr: Pointer?

    public val _2117598815_VtblPtr: Pointer?
      get() = __2117598815_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Ssid(): String? {
      val fnPtr = _2117598815_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2117598815_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Ssid(value: String?): Unit {
      val fnPtr = _2117598815_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2117598815_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Passphrase(): String? {
      val fnPtr = _2117598815_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2117598815_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Passphrase(value: String?): Unit {
      val fnPtr = _2117598815_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2117598815_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class INetworkOperatorTetheringAccessPointConfiguration_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2117598815_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INetworkOperatorTetheringAccessPointConfiguration, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0bcc0284412e403dacc6b757e34774a4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINetworkOperatorTetheringAccessPointConfiguration(ptr: Pointer?): WithDefault =
        INetworkOperatorTetheringAccessPointConfiguration_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        INetworkOperatorTetheringAccessPointConfiguration {
      val address = segment.toRawLongValue()
      return makeINetworkOperatorTetheringAccessPointConfiguration(Pointer(address))
    }

    public override fun toNative(obj: INetworkOperatorTetheringAccessPointConfiguration):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__2117598815_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INetworkOperatorTetheringAccessPointConfiguration):
        Array<INetworkOperatorTetheringAccessPointConfiguration?> = (elements as
        Array<INetworkOperatorTetheringAccessPointConfiguration?>).castToImpl<INetworkOperatorTetheringAccessPointConfiguration,INetworkOperatorTetheringAccessPointConfiguration_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<INetworkOperatorTetheringAccessPointConfiguration?> =
        arrayOfNulls<INetworkOperatorTetheringAccessPointConfiguration_Impl>(size) as
        Array<INetworkOperatorTetheringAccessPointConfiguration?>
  }
}
