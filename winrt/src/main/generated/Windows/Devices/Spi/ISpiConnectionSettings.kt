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

@ABIMarker(ISpiConnectionSettings.ABI::class)
@Signature("{5283a37f-f935-4b9f-a7a7-3a7890afa5ce}")
@Guid("5283a37ff9354b9fa7a73a7890afa5ce")
@WinRTInterface("5283a37ff9354b9fa7a73a7890afa5ce")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpiConnectionSettings.ByReference::class)
public interface ISpiConnectionSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ChipSelectLine(): Int

  @InterfaceMethod(1)
  public fun put_ChipSelectLine(value: Int): Unit

  @InterfaceMethod(2)
  public fun get_Mode(): SpiMode?

  @InterfaceMethod(3)
  public fun put_Mode(value: SpiMode?): Unit

  @InterfaceMethod(4)
  public fun get_DataBitLength(): Int

  @InterfaceMethod(5)
  public fun put_DataBitLength(value: Int): Unit

  @InterfaceMethod(6)
  public fun get_ClockFrequency(): Int

  @InterfaceMethod(7)
  public fun put_ClockFrequency(value: Int): Unit

  @InterfaceMethod(8)
  public fun get_SharingMode(): SpiSharingMode?

  @InterfaceMethod(9)
  public fun put_SharingMode(value: SpiSharingMode?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpiConnectionSettings> {
    public override fun getValue() = ABI.makeISpiConnectionSettings(pointer.getPointer(0))

    public fun setValue(value: ISpiConnectionSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpiConnectionSettings {
    public val __1323586804_Ptr: Pointer?

    public val _1323586804_VtblPtr: Pointer?
      get() = __1323586804_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ChipSelectLine(): Int {
      val fnPtr = _1323586804_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1323586804_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_ChipSelectLine(value: Int): Unit {
      val fnPtr = _1323586804_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1323586804_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Mode(): SpiMode? {
      val fnPtr = _1323586804_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpiMode>()
      val hr = fn.invokeHR(arrayOf(__1323586804_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpiMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Mode(value: SpiMode?): Unit {
      val fnPtr = _1323586804_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1323586804_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_DataBitLength(): Int {
      val fnPtr = _1323586804_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1323586804_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_DataBitLength(value: Int): Unit {
      val fnPtr = _1323586804_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1323586804_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_ClockFrequency(): Int {
      val fnPtr = _1323586804_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1323586804_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_ClockFrequency(value: Int): Unit {
      val fnPtr = _1323586804_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1323586804_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_SharingMode(): SpiSharingMode? {
      val fnPtr = _1323586804_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpiSharingMode>()
      val hr = fn.invokeHR(arrayOf(__1323586804_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpiSharingMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_SharingMode(value: SpiSharingMode?): Unit {
      val fnPtr = _1323586804_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1323586804_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISpiConnectionSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1323586804_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpiConnectionSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5283a37ff9354b9fa7a73a7890afa5ce")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpiConnectionSettings(ptr: Pointer?): WithDefault =
        ISpiConnectionSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpiConnectionSettings {
      val address = segment.toRawLongValue()
      return makeISpiConnectionSettings(Pointer(address))
    }

    public override fun toNative(obj: ISpiConnectionSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1323586804_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpiConnectionSettings): Array<ISpiConnectionSettings?> =
        (elements as
        Array<ISpiConnectionSettings?>).castToImpl<ISpiConnectionSettings,ISpiConnectionSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpiConnectionSettings?> =
        arrayOfNulls<ISpiConnectionSettings_Impl>(size) as Array<ISpiConnectionSettings?>
  }
}
