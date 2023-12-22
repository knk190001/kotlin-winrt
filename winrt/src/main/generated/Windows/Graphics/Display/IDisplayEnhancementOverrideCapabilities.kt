package Windows.Graphics.Display

import Windows.Foundation.Collections.IVectorView
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDisplayEnhancementOverrideCapabilities.ABI::class)
@Signature("{457060de-ee5a-47b7-9918-1e51e812ccc8}")
@Guid("457060deee5a47b799181e51e812ccc8")
@WinRTInterface("457060deee5a47b799181e51e812ccc8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayEnhancementOverrideCapabilities.ByReference::class)
public interface IDisplayEnhancementOverrideCapabilities : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsBrightnessControlSupported(): Boolean

  @InterfaceMethod(1)
  public fun get_IsBrightnessNitsControlSupported(): Boolean

  @InterfaceMethod(2)
  public fun GetSupportedNitRanges(): IVectorView<NitRange?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayEnhancementOverrideCapabilities> {
    public override fun getValue() =
        ABI.makeIDisplayEnhancementOverrideCapabilities(pointer.getPointer(0))

    public fun setValue(value: IDisplayEnhancementOverrideCapabilities_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayEnhancementOverrideCapabilities {
    public val __143126923_Ptr: Pointer?

    public val _143126923_VtblPtr: Pointer?
      get() = __143126923_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsBrightnessControlSupported(): Boolean {
      val fnPtr = _143126923_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__143126923_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsBrightnessNitsControlSupported(): Boolean {
      val fnPtr = _143126923_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__143126923_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun GetSupportedNitRanges(): IVectorView<NitRange?>? {
      val fnPtr = _143126923_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<NitRange?>>()
      val hr = fn.invokeHR(arrayOf(__143126923_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<NitRange?>>(result.getValue())
      return resultValue
    }
  }

  public class IDisplayEnhancementOverrideCapabilities_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __143126923_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayEnhancementOverrideCapabilities, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("457060deee5a47b799181e51e812ccc8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayEnhancementOverrideCapabilities(ptr: Pointer?): WithDefault =
        IDisplayEnhancementOverrideCapabilities_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IDisplayEnhancementOverrideCapabilities {
      val address = segment.toRawLongValue()
      return makeIDisplayEnhancementOverrideCapabilities(Pointer(address))
    }

    public override fun toNative(obj: IDisplayEnhancementOverrideCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__143126923_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayEnhancementOverrideCapabilities):
        Array<IDisplayEnhancementOverrideCapabilities?> = (elements as
        Array<IDisplayEnhancementOverrideCapabilities?>).castToImpl<IDisplayEnhancementOverrideCapabilities,IDisplayEnhancementOverrideCapabilities_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayEnhancementOverrideCapabilities?> =
        arrayOfNulls<IDisplayEnhancementOverrideCapabilities_Impl>(size) as
        Array<IDisplayEnhancementOverrideCapabilities?>
  }
}
