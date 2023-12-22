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

@ABIMarker(IGpioPinProviderValueChangedEventArgsFactory.ABI::class)
@Signature("{3ecb0b59-568c-4392-b24a-8a59a902b1f1}")
@Guid("3ecb0b59568c4392b24a8a59a902b1f1")
@WinRTInterface("3ecb0b59568c4392b24a8a59a902b1f1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGpioPinProviderValueChangedEventArgsFactory.ByReference::class)
public interface IGpioPinProviderValueChangedEventArgsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(edge: ProviderGpioPinEdge?): GpioPinProviderValueChangedEventArgs?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGpioPinProviderValueChangedEventArgsFactory> {
    public override fun getValue() =
        ABI.makeIGpioPinProviderValueChangedEventArgsFactory(pointer.getPointer(0))

    public fun setValue(value: IGpioPinProviderValueChangedEventArgsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGpioPinProviderValueChangedEventArgsFactory {
    public val __1139980792_Ptr: Pointer?

    public val _1139980792_VtblPtr: Pointer?
      get() = __1139980792_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(edge: ProviderGpioPinEdge?): GpioPinProviderValueChangedEventArgs? {
      val fnPtr = _1139980792_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GpioPinProviderValueChangedEventArgs>()
      val hr = fn.invokeHR(arrayOf(__1139980792_Ptr, marshalToNative(edge), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GpioPinProviderValueChangedEventArgs>(result.getValue())
      return resultValue
    }
  }

  public class IGpioPinProviderValueChangedEventArgsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1139980792_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGpioPinProviderValueChangedEventArgsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3ecb0b59568c4392b24a8a59a902b1f1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGpioPinProviderValueChangedEventArgsFactory(ptr: Pointer?): WithDefault =
        IGpioPinProviderValueChangedEventArgsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IGpioPinProviderValueChangedEventArgsFactory {
      val address = segment.toRawLongValue()
      return makeIGpioPinProviderValueChangedEventArgsFactory(Pointer(address))
    }

    public override fun toNative(obj: IGpioPinProviderValueChangedEventArgsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1139980792_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGpioPinProviderValueChangedEventArgsFactory):
        Array<IGpioPinProviderValueChangedEventArgsFactory?> = (elements as
        Array<IGpioPinProviderValueChangedEventArgsFactory?>).castToImpl<IGpioPinProviderValueChangedEventArgsFactory,IGpioPinProviderValueChangedEventArgsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGpioPinProviderValueChangedEventArgsFactory?> =
        arrayOfNulls<IGpioPinProviderValueChangedEventArgsFactory_Impl>(size) as
        Array<IGpioPinProviderValueChangedEventArgsFactory?>
  }
}
