package Windows.Devices.Spi.Provider

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

@ABIMarker(IProviderSpiConnectionSettingsFactory.ABI::class)
@Signature("{66456b5a-0c79-43e3-9f3c-e59780ac18fa}")
@Guid("66456b5a0c7943e39f3ce59780ac18fa")
@WinRTInterface("66456b5a0c7943e39f3ce59780ac18fa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProviderSpiConnectionSettingsFactory.ByReference::class)
public interface IProviderSpiConnectionSettingsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(chipSelectLine: Int): ProviderSpiConnectionSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProviderSpiConnectionSettingsFactory> {
    public override fun getValue() =
        ABI.makeIProviderSpiConnectionSettingsFactory(pointer.getPointer(0))

    public fun setValue(value: IProviderSpiConnectionSettingsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProviderSpiConnectionSettingsFactory {
    public val __618075192_Ptr: Pointer?

    public val _618075192_VtblPtr: Pointer?
      get() = __618075192_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(chipSelectLine: Int): ProviderSpiConnectionSettings? {
      val fnPtr = _618075192_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProviderSpiConnectionSettings>()
      val hr = fn.invokeHR(arrayOf(__618075192_Ptr, chipSelectLine, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProviderSpiConnectionSettings>(result.getValue())
      return resultValue
    }
  }

  public class IProviderSpiConnectionSettingsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __618075192_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProviderSpiConnectionSettingsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("66456b5a0c7943e39f3ce59780ac18fa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProviderSpiConnectionSettingsFactory(ptr: Pointer?): WithDefault =
        IProviderSpiConnectionSettingsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProviderSpiConnectionSettingsFactory {
      val address = segment.toRawLongValue()
      return makeIProviderSpiConnectionSettingsFactory(Pointer(address))
    }

    public override fun toNative(obj: IProviderSpiConnectionSettingsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__618075192_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProviderSpiConnectionSettingsFactory):
        Array<IProviderSpiConnectionSettingsFactory?> = (elements as
        Array<IProviderSpiConnectionSettingsFactory?>).castToImpl<IProviderSpiConnectionSettingsFactory,IProviderSpiConnectionSettingsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProviderSpiConnectionSettingsFactory?> =
        arrayOfNulls<IProviderSpiConnectionSettingsFactory_Impl>(size) as
        Array<IProviderSpiConnectionSettingsFactory?>
  }
}
