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

@ABIMarker(IProviderSpiConnectionSettings.ABI::class)
@Signature("{f6034550-a542-4ec0-9601-a4dd68f8697b}")
@Guid("f6034550a5424ec09601a4dd68f8697b")
@WinRTInterface("f6034550a5424ec09601a4dd68f8697b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProviderSpiConnectionSettings.ByReference::class)
public interface IProviderSpiConnectionSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ChipSelectLine(): Int

  @InterfaceMethod(1)
  public fun put_ChipSelectLine(value: Int): Unit

  @InterfaceMethod(2)
  public fun get_Mode(): ProviderSpiMode?

  @InterfaceMethod(3)
  public fun put_Mode(value: ProviderSpiMode?): Unit

  @InterfaceMethod(4)
  public fun get_DataBitLength(): Int

  @InterfaceMethod(5)
  public fun put_DataBitLength(value: Int): Unit

  @InterfaceMethod(6)
  public fun get_ClockFrequency(): Int

  @InterfaceMethod(7)
  public fun put_ClockFrequency(value: Int): Unit

  @InterfaceMethod(8)
  public fun get_SharingMode(): ProviderSpiSharingMode?

  @InterfaceMethod(9)
  public fun put_SharingMode(value: ProviderSpiSharingMode?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProviderSpiConnectionSettings> {
    public override fun getValue() = ABI.makeIProviderSpiConnectionSettings(pointer.getPointer(0))

    public fun setValue(value: IProviderSpiConnectionSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProviderSpiConnectionSettings {
    public val __2129708318_Ptr: Pointer?

    public val _2129708318_VtblPtr: Pointer?
      get() = __2129708318_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ChipSelectLine(): Int {
      val fnPtr = _2129708318_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2129708318_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_ChipSelectLine(value: Int): Unit {
      val fnPtr = _2129708318_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2129708318_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Mode(): ProviderSpiMode? {
      val fnPtr = _2129708318_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProviderSpiMode>()
      val hr = fn.invokeHR(arrayOf(__2129708318_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProviderSpiMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Mode(value: ProviderSpiMode?): Unit {
      val fnPtr = _2129708318_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2129708318_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_DataBitLength(): Int {
      val fnPtr = _2129708318_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2129708318_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_DataBitLength(value: Int): Unit {
      val fnPtr = _2129708318_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2129708318_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_ClockFrequency(): Int {
      val fnPtr = _2129708318_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2129708318_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_ClockFrequency(value: Int): Unit {
      val fnPtr = _2129708318_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2129708318_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_SharingMode(): ProviderSpiSharingMode? {
      val fnPtr = _2129708318_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProviderSpiSharingMode>()
      val hr = fn.invokeHR(arrayOf(__2129708318_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProviderSpiSharingMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_SharingMode(value: ProviderSpiSharingMode?): Unit {
      val fnPtr = _2129708318_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2129708318_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IProviderSpiConnectionSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2129708318_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProviderSpiConnectionSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f6034550a5424ec09601a4dd68f8697b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProviderSpiConnectionSettings(ptr: Pointer?): WithDefault =
        IProviderSpiConnectionSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProviderSpiConnectionSettings {
      val address = segment.toRawLongValue()
      return makeIProviderSpiConnectionSettings(Pointer(address))
    }

    public override fun toNative(obj: IProviderSpiConnectionSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2129708318_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProviderSpiConnectionSettings):
        Array<IProviderSpiConnectionSettings?> = (elements as
        Array<IProviderSpiConnectionSettings?>).castToImpl<IProviderSpiConnectionSettings,IProviderSpiConnectionSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProviderSpiConnectionSettings?> =
        arrayOfNulls<IProviderSpiConnectionSettings_Impl>(size) as
        Array<IProviderSpiConnectionSettings?>
  }
}
