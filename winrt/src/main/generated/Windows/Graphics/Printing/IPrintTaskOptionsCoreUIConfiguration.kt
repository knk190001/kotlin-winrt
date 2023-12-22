package Windows.Graphics.Printing

import Windows.Foundation.Collections.IVector
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPrintTaskOptionsCoreUIConfiguration.ABI::class)
@Signature("{62e69e23-9a1e-4336-b74f-3cc7f4cff709}")
@Guid("62e69e239a1e4336b74f3cc7f4cff709")
@WinRTInterface("62e69e239a1e4336b74f3cc7f4cff709")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintTaskOptionsCoreUIConfiguration.ByReference::class)
public interface IPrintTaskOptionsCoreUIConfiguration : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DisplayedOptions(): IVector<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintTaskOptionsCoreUIConfiguration> {
    public override fun getValue() =
        ABI.makeIPrintTaskOptionsCoreUIConfiguration(pointer.getPointer(0))

    public fun setValue(value: IPrintTaskOptionsCoreUIConfiguration_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintTaskOptionsCoreUIConfiguration {
    public val __139203835_Ptr: Pointer?

    public val _139203835_VtblPtr: Pointer?
      get() = __139203835_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DisplayedOptions(): IVector<String?>? {
      val fnPtr = _139203835_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__139203835_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }
  }

  public class IPrintTaskOptionsCoreUIConfiguration_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __139203835_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintTaskOptionsCoreUIConfiguration, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("62e69e239a1e4336b74f3cc7f4cff709")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintTaskOptionsCoreUIConfiguration(ptr: Pointer?): WithDefault =
        IPrintTaskOptionsCoreUIConfiguration_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintTaskOptionsCoreUIConfiguration {
      val address = segment.toRawLongValue()
      return makeIPrintTaskOptionsCoreUIConfiguration(Pointer(address))
    }

    public override fun toNative(obj: IPrintTaskOptionsCoreUIConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__139203835_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintTaskOptionsCoreUIConfiguration):
        Array<IPrintTaskOptionsCoreUIConfiguration?> = (elements as
        Array<IPrintTaskOptionsCoreUIConfiguration?>).castToImpl<IPrintTaskOptionsCoreUIConfiguration,IPrintTaskOptionsCoreUIConfiguration_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintTaskOptionsCoreUIConfiguration?> =
        arrayOfNulls<IPrintTaskOptionsCoreUIConfiguration_Impl>(size) as
        Array<IPrintTaskOptionsCoreUIConfiguration?>
  }
}
