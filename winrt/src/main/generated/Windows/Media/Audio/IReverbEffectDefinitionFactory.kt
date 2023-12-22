package Windows.Media.Audio

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

@ABIMarker(IReverbEffectDefinitionFactory.ABI::class)
@Signature("{a7d5cbfe-100b-4ff0-9da6-dc4e05a759f0}")
@Guid("a7d5cbfe100b4ff09da6dc4e05a759f0")
@WinRTInterface("a7d5cbfe100b4ff09da6dc4e05a759f0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IReverbEffectDefinitionFactory.ByReference::class)
public interface IReverbEffectDefinitionFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(audioGraph: AudioGraph?): ReverbEffectDefinition?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IReverbEffectDefinitionFactory> {
    public override fun getValue() = ABI.makeIReverbEffectDefinitionFactory(pointer.getPointer(0))

    public fun setValue(value: IReverbEffectDefinitionFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IReverbEffectDefinitionFactory {
    public val __1015443732_Ptr: Pointer?

    public val _1015443732_VtblPtr: Pointer?
      get() = __1015443732_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(audioGraph: AudioGraph?): ReverbEffectDefinition? {
      val fnPtr = _1015443732_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ReverbEffectDefinition>()
      val hr = fn.invokeHR(arrayOf(__1015443732_Ptr, marshalToNative(audioGraph), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ReverbEffectDefinition>(result.getValue())
      return resultValue
    }
  }

  public class IReverbEffectDefinitionFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1015443732_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IReverbEffectDefinitionFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a7d5cbfe100b4ff09da6dc4e05a759f0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIReverbEffectDefinitionFactory(ptr: Pointer?): WithDefault =
        IReverbEffectDefinitionFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IReverbEffectDefinitionFactory {
      val address = segment.toRawLongValue()
      return makeIReverbEffectDefinitionFactory(Pointer(address))
    }

    public override fun toNative(obj: IReverbEffectDefinitionFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1015443732_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IReverbEffectDefinitionFactory):
        Array<IReverbEffectDefinitionFactory?> = (elements as
        Array<IReverbEffectDefinitionFactory?>).castToImpl<IReverbEffectDefinitionFactory,IReverbEffectDefinitionFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IReverbEffectDefinitionFactory?> =
        arrayOfNulls<IReverbEffectDefinitionFactory_Impl>(size) as
        Array<IReverbEffectDefinitionFactory?>
  }
}
