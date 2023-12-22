package Windows.Devices.Bluetooth.GenericAttributeProfile

import Windows.Foundation.IReference
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
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGattReadClientCharacteristicConfigurationDescriptorResult2.ABI::class)
@Signature("{1bf1a59d-ba4d-4622-8651-f4ee150d0a5d}")
@Guid("1bf1a59dba4d46228651f4ee150d0a5d")
@WinRTInterface("1bf1a59dba4d46228651f4ee150d0a5d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    IGattReadClientCharacteristicConfigurationDescriptorResult2.ByReference::class)
public interface IGattReadClientCharacteristicConfigurationDescriptorResult2 : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ProtocolError(): IReference<Byte>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattReadClientCharacteristicConfigurationDescriptorResult2> {
    public override fun getValue() =
        ABI.makeIGattReadClientCharacteristicConfigurationDescriptorResult2(pointer.getPointer(0))

    public fun setValue(value: IGattReadClientCharacteristicConfigurationDescriptorResult2_Impl):
        Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattReadClientCharacteristicConfigurationDescriptorResult2 {
    public val __2062261639_Ptr: Pointer?

    public val _2062261639_VtblPtr: Pointer?
      get() = __2062261639_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ProtocolError(): IReference<Byte>? {
      val fnPtr = _2062261639_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Byte>>()
      val hr = fn.invokeHR(arrayOf(__2062261639_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Byte>>(result.getValue())
      return resultValue
    }
  }

  public class IGattReadClientCharacteristicConfigurationDescriptorResult2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2062261639_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattReadClientCharacteristicConfigurationDescriptorResult2,
      MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1bf1a59dba4d46228651f4ee150d0a5d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattReadClientCharacteristicConfigurationDescriptorResult2(ptr: Pointer?):
        WithDefault = IGattReadClientCharacteristicConfigurationDescriptorResult2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IGattReadClientCharacteristicConfigurationDescriptorResult2 {
      val address = segment.toRawLongValue()
      return makeIGattReadClientCharacteristicConfigurationDescriptorResult2(Pointer(address))
    }

    public override fun toNative(obj: IGattReadClientCharacteristicConfigurationDescriptorResult2):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__2062261639_Ptr))
  }

  public companion object {
    public fun makeArray(vararg
        elements: IGattReadClientCharacteristicConfigurationDescriptorResult2):
        Array<IGattReadClientCharacteristicConfigurationDescriptorResult2?> = (elements as
        Array<IGattReadClientCharacteristicConfigurationDescriptorResult2?>).castToImpl<IGattReadClientCharacteristicConfigurationDescriptorResult2,IGattReadClientCharacteristicConfigurationDescriptorResult2_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IGattReadClientCharacteristicConfigurationDescriptorResult2?> =
        arrayOfNulls<IGattReadClientCharacteristicConfigurationDescriptorResult2_Impl>(size) as
        Array<IGattReadClientCharacteristicConfigurationDescriptorResult2?>
  }
}
