package Windows.Devices.Spi

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

@ABIMarker(ISpiConnectionSettingsFactory.ABI::class)
@Signature("{ff99081e-10c4-44b7-9fea-a748b5a46f31}")
@Guid("ff99081e10c444b79feaa748b5a46f31")
@WinRTInterface("ff99081e10c444b79feaa748b5a46f31")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpiConnectionSettingsFactory.ByReference::class)
public interface ISpiConnectionSettingsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(chipSelectLine: Int): SpiConnectionSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpiConnectionSettingsFactory> {
    public override fun getValue() = ABI.makeISpiConnectionSettingsFactory(pointer.getPointer(0))

    public fun setValue(value: ISpiConnectionSettingsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpiConnectionSettingsFactory {
    public val __266880650_Ptr: Pointer?

    public val _266880650_VtblPtr: Pointer?
      get() = __266880650_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(chipSelectLine: Int): SpiConnectionSettings? {
      val fnPtr = _266880650_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpiConnectionSettings>()
      val hr = fn.invokeHR(arrayOf(__266880650_Ptr, chipSelectLine, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpiConnectionSettings>(result.getValue())
      return resultValue
    }
  }

  public class ISpiConnectionSettingsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __266880650_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpiConnectionSettingsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ff99081e10c444b79feaa748b5a46f31")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpiConnectionSettingsFactory(ptr: Pointer?): WithDefault =
        ISpiConnectionSettingsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpiConnectionSettingsFactory {
      val address = segment.toRawLongValue()
      return makeISpiConnectionSettingsFactory(Pointer(address))
    }

    public override fun toNative(obj: ISpiConnectionSettingsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__266880650_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpiConnectionSettingsFactory):
        Array<ISpiConnectionSettingsFactory?> = (elements as
        Array<ISpiConnectionSettingsFactory?>).castToImpl<ISpiConnectionSettingsFactory,ISpiConnectionSettingsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpiConnectionSettingsFactory?> =
        arrayOfNulls<ISpiConnectionSettingsFactory_Impl>(size) as
        Array<ISpiConnectionSettingsFactory?>
  }
}
