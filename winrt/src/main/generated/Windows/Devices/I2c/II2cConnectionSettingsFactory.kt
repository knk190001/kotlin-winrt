package Windows.Devices.I2c

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

@ABIMarker(II2cConnectionSettingsFactory.ABI::class)
@Signature("{81b586b3-9693-41b1-a243-ded4f6e66926}")
@Guid("81b586b3969341b1a243ded4f6e66926")
@WinRTInterface("81b586b3969341b1a243ded4f6e66926")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = II2cConnectionSettingsFactory.ByReference::class)
public interface II2cConnectionSettingsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(slaveAddress: Int): I2cConnectionSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<II2cConnectionSettingsFactory> {
    public override fun getValue() = ABI.makeII2cConnectionSettingsFactory(pointer.getPointer(0))

    public fun setValue(value: II2cConnectionSettingsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : II2cConnectionSettingsFactory {
    public val __887384602_Ptr: Pointer?

    public val _887384602_VtblPtr: Pointer?
      get() = __887384602_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(slaveAddress: Int): I2cConnectionSettings? {
      val fnPtr = _887384602_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<I2cConnectionSettings>()
      val hr = fn.invokeHR(arrayOf(__887384602_Ptr, slaveAddress, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<I2cConnectionSettings>(result.getValue())
      return resultValue
    }
  }

  public class II2cConnectionSettingsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __887384602_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<II2cConnectionSettingsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("81b586b3969341b1a243ded4f6e66926")

    public override val layout: ValueLayout = ADDRESS

    public fun makeII2cConnectionSettingsFactory(ptr: Pointer?): WithDefault =
        II2cConnectionSettingsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): II2cConnectionSettingsFactory {
      val address = segment.toRawLongValue()
      return makeII2cConnectionSettingsFactory(Pointer(address))
    }

    public override fun toNative(obj: II2cConnectionSettingsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__887384602_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: II2cConnectionSettingsFactory):
        Array<II2cConnectionSettingsFactory?> = (elements as
        Array<II2cConnectionSettingsFactory?>).castToImpl<II2cConnectionSettingsFactory,II2cConnectionSettingsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<II2cConnectionSettingsFactory?> =
        arrayOfNulls<II2cConnectionSettingsFactory_Impl>(size) as
        Array<II2cConnectionSettingsFactory?>
  }
}
