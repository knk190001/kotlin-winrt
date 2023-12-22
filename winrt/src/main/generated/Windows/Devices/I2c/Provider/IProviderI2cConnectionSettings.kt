package Windows.Devices.I2c.Provider

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

@ABIMarker(IProviderI2cConnectionSettings.ABI::class)
@Signature("{e9db4e34-e510-44b7-809d-f2f85b555339}")
@Guid("e9db4e34e51044b7809df2f85b555339")
@WinRTInterface("e9db4e34e51044b7809df2f85b555339")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProviderI2cConnectionSettings.ByReference::class)
public interface IProviderI2cConnectionSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SlaveAddress(): Int

  @InterfaceMethod(1)
  public fun put_SlaveAddress(value: Int): Unit

  @InterfaceMethod(2)
  public fun get_BusSpeed(): ProviderI2cBusSpeed?

  @InterfaceMethod(3)
  public fun put_BusSpeed(value: ProviderI2cBusSpeed?): Unit

  @InterfaceMethod(4)
  public fun get_SharingMode(): ProviderI2cSharingMode?

  @InterfaceMethod(5)
  public fun put_SharingMode(value: ProviderI2cSharingMode?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProviderI2cConnectionSettings> {
    public override fun getValue() = ABI.makeIProviderI2cConnectionSettings(pointer.getPointer(0))

    public fun setValue(value: IProviderI2cConnectionSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProviderI2cConnectionSettings {
    public val __1267512414_Ptr: Pointer?

    public val _1267512414_VtblPtr: Pointer?
      get() = __1267512414_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SlaveAddress(): Int {
      val fnPtr = _1267512414_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1267512414_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_SlaveAddress(value: Int): Unit {
      val fnPtr = _1267512414_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1267512414_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_BusSpeed(): ProviderI2cBusSpeed? {
      val fnPtr = _1267512414_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProviderI2cBusSpeed>()
      val hr = fn.invokeHR(arrayOf(__1267512414_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProviderI2cBusSpeed>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_BusSpeed(value: ProviderI2cBusSpeed?): Unit {
      val fnPtr = _1267512414_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1267512414_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_SharingMode(): ProviderI2cSharingMode? {
      val fnPtr = _1267512414_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProviderI2cSharingMode>()
      val hr = fn.invokeHR(arrayOf(__1267512414_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProviderI2cSharingMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_SharingMode(value: ProviderI2cSharingMode?): Unit {
      val fnPtr = _1267512414_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1267512414_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IProviderI2cConnectionSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1267512414_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProviderI2cConnectionSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e9db4e34e51044b7809df2f85b555339")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProviderI2cConnectionSettings(ptr: Pointer?): WithDefault =
        IProviderI2cConnectionSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProviderI2cConnectionSettings {
      val address = segment.toRawLongValue()
      return makeIProviderI2cConnectionSettings(Pointer(address))
    }

    public override fun toNative(obj: IProviderI2cConnectionSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1267512414_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProviderI2cConnectionSettings):
        Array<IProviderI2cConnectionSettings?> = (elements as
        Array<IProviderI2cConnectionSettings?>).castToImpl<IProviderI2cConnectionSettings,IProviderI2cConnectionSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProviderI2cConnectionSettings?> =
        arrayOfNulls<IProviderI2cConnectionSettings_Impl>(size) as
        Array<IProviderI2cConnectionSettings?>
  }
}
