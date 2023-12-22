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

@ABIMarker(IGpioPinProviderValueChangedEventArgs.ABI::class)
@Signature("{32a6d6f2-3d5b-44cd-8fbe-13a69f2edb24}")
@Guid("32a6d6f23d5b44cd8fbe13a69f2edb24")
@WinRTInterface("32a6d6f23d5b44cd8fbe13a69f2edb24")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGpioPinProviderValueChangedEventArgs.ByReference::class)
public interface IGpioPinProviderValueChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Edge(): ProviderGpioPinEdge?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGpioPinProviderValueChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIGpioPinProviderValueChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IGpioPinProviderValueChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGpioPinProviderValueChangedEventArgs {
    public val __744750414_Ptr: Pointer?

    public val _744750414_VtblPtr: Pointer?
      get() = __744750414_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Edge(): ProviderGpioPinEdge? {
      val fnPtr = _744750414_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProviderGpioPinEdge>()
      val hr = fn.invokeHR(arrayOf(__744750414_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProviderGpioPinEdge>(result.getValue())
      return resultValue
    }
  }

  public class IGpioPinProviderValueChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __744750414_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGpioPinProviderValueChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("32a6d6f23d5b44cd8fbe13a69f2edb24")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGpioPinProviderValueChangedEventArgs(ptr: Pointer?): WithDefault =
        IGpioPinProviderValueChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGpioPinProviderValueChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIGpioPinProviderValueChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IGpioPinProviderValueChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__744750414_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGpioPinProviderValueChangedEventArgs):
        Array<IGpioPinProviderValueChangedEventArgs?> = (elements as
        Array<IGpioPinProviderValueChangedEventArgs?>).castToImpl<IGpioPinProviderValueChangedEventArgs,IGpioPinProviderValueChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGpioPinProviderValueChangedEventArgs?> =
        arrayOfNulls<IGpioPinProviderValueChangedEventArgs_Impl>(size) as
        Array<IGpioPinProviderValueChangedEventArgs?>
  }
}
