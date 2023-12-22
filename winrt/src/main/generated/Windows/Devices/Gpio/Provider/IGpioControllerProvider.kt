package Windows.Devices.Gpio.Provider

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

@ABIMarker(IGpioControllerProvider.ABI::class)
@Signature("{ad11cec7-19ea-4b21-874f-b91aed4a25db}")
@Guid("ad11cec719ea4b21874fb91aed4a25db")
@WinRTInterface("ad11cec719ea4b21874fb91aed4a25db")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGpioControllerProvider.ByReference::class)
public interface IGpioControllerProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PinCount(): Int

  @InterfaceMethod(1)
  public fun OpenPinProvider(pin: Int, sharingMode: ProviderGpioSharingMode?): IGpioPinProvider?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGpioControllerProvider> {
    public override fun getValue() = ABI.makeIGpioControllerProvider(pointer.getPointer(0))

    public fun setValue(value: IGpioControllerProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGpioControllerProvider {
    public val __1839448209_Ptr: Pointer?

    public val _1839448209_VtblPtr: Pointer?
      get() = __1839448209_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PinCount(): Int {
      val fnPtr = _1839448209_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1839448209_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun OpenPinProvider(pin: Int, sharingMode: ProviderGpioSharingMode?):
        IGpioPinProvider? {
      val fnPtr = _1839448209_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IGpioPinProvider>()
      val hr = fn.invokeHR(arrayOf(__1839448209_Ptr, pin, marshalToNative(sharingMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IGpioPinProvider>(result.getValue())
      return resultValue
    }
  }

  public class IGpioControllerProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1839448209_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGpioControllerProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ad11cec719ea4b21874fb91aed4a25db")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGpioControllerProvider(ptr: Pointer?): WithDefault =
        IGpioControllerProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGpioControllerProvider {
      val address = segment.toRawLongValue()
      return makeIGpioControllerProvider(Pointer(address))
    }

    public override fun toNative(obj: IGpioControllerProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1839448209_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGpioControllerProvider): Array<IGpioControllerProvider?>
        = (elements as
        Array<IGpioControllerProvider?>).castToImpl<IGpioControllerProvider,IGpioControllerProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGpioControllerProvider?> =
        arrayOfNulls<IGpioControllerProvider_Impl>(size) as Array<IGpioControllerProvider?>
  }
}
