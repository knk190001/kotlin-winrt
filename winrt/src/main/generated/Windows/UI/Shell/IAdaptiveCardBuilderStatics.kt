package Windows.UI.Shell

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

@ABIMarker(IAdaptiveCardBuilderStatics.ABI::class)
@Signature("{766d8f08-d3fe-4347-a0bc-b9ea9a6dc28e}")
@Guid("766d8f08d3fe4347a0bcb9ea9a6dc28e")
@WinRTInterface("766d8f08d3fe4347a0bcb9ea9a6dc28e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdaptiveCardBuilderStatics.ByReference::class)
public interface IAdaptiveCardBuilderStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateAdaptiveCardFromJson(value: String?): IAdaptiveCard?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdaptiveCardBuilderStatics> {
    public override fun getValue() = ABI.makeIAdaptiveCardBuilderStatics(pointer.getPointer(0))

    public fun setValue(value: IAdaptiveCardBuilderStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdaptiveCardBuilderStatics {
    public val __164826856_Ptr: Pointer?

    public val _164826856_VtblPtr: Pointer?
      get() = __164826856_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateAdaptiveCardFromJson(value: String?): IAdaptiveCard? {
      val fnPtr = _164826856_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAdaptiveCard>()
      val hr = fn.invokeHR(arrayOf(__164826856_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAdaptiveCard>(result.getValue())
      return resultValue
    }
  }

  public class IAdaptiveCardBuilderStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __164826856_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdaptiveCardBuilderStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("766d8f08d3fe4347a0bcb9ea9a6dc28e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdaptiveCardBuilderStatics(ptr: Pointer?): WithDefault =
        IAdaptiveCardBuilderStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdaptiveCardBuilderStatics {
      val address = segment.toRawLongValue()
      return makeIAdaptiveCardBuilderStatics(Pointer(address))
    }

    public override fun toNative(obj: IAdaptiveCardBuilderStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__164826856_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdaptiveCardBuilderStatics):
        Array<IAdaptiveCardBuilderStatics?> = (elements as
        Array<IAdaptiveCardBuilderStatics?>).castToImpl<IAdaptiveCardBuilderStatics,IAdaptiveCardBuilderStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdaptiveCardBuilderStatics?> =
        arrayOfNulls<IAdaptiveCardBuilderStatics_Impl>(size) as Array<IAdaptiveCardBuilderStatics?>
  }
}
