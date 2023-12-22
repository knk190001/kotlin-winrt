package Windows.UI.Composition

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

@ABIMarker(ICompositionEffectSourceParameter.ABI::class)
@Signature("{858ab13a-3292-4e4e-b3bb-2b6c6544a6ee}")
@Guid("858ab13a32924e4eb3bb2b6c6544a6ee")
@WinRTInterface("858ab13a32924e4eb3bb2b6c6544a6ee")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionEffectSourceParameter.ByReference::class)
public interface ICompositionEffectSourceParameter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionEffectSourceParameter> {
    public override fun getValue() =
        ABI.makeICompositionEffectSourceParameter(pointer.getPointer(0))

    public fun setValue(value: ICompositionEffectSourceParameter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionEffectSourceParameter {
    public val __1826121761_Ptr: Pointer?

    public val _1826121761_VtblPtr: Pointer?
      get() = __1826121761_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _1826121761_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1826121761_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ICompositionEffectSourceParameter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1826121761_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionEffectSourceParameter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("858ab13a32924e4eb3bb2b6c6544a6ee")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionEffectSourceParameter(ptr: Pointer?): WithDefault =
        ICompositionEffectSourceParameter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionEffectSourceParameter {
      val address = segment.toRawLongValue()
      return makeICompositionEffectSourceParameter(Pointer(address))
    }

    public override fun toNative(obj: ICompositionEffectSourceParameter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1826121761_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionEffectSourceParameter):
        Array<ICompositionEffectSourceParameter?> = (elements as
        Array<ICompositionEffectSourceParameter?>).castToImpl<ICompositionEffectSourceParameter,ICompositionEffectSourceParameter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionEffectSourceParameter?> =
        arrayOfNulls<ICompositionEffectSourceParameter_Impl>(size) as
        Array<ICompositionEffectSourceParameter?>
  }
}
