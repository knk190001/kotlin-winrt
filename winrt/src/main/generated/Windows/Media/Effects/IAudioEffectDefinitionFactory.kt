package Windows.Media.Effects

import Windows.Foundation.Collections.IPropertySet
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

@ABIMarker(IAudioEffectDefinitionFactory.ABI::class)
@Signature("{8e1da646-e705-45ed-8a2b-fc4e4f405a97}")
@Guid("8e1da646e70545ed8a2bfc4e4f405a97")
@WinRTInterface("8e1da646e70545ed8a2bfc4e4f405a97")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioEffectDefinitionFactory.ByReference::class)
public interface IAudioEffectDefinitionFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(activatableClassId: String?): AudioEffectDefinition?

  @InterfaceMethod(1)
  public fun CreateWithProperties(activatableClassId: String?, props: IPropertySet?):
      AudioEffectDefinition?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioEffectDefinitionFactory> {
    public override fun getValue() = ABI.makeIAudioEffectDefinitionFactory(pointer.getPointer(0))

    public fun setValue(value: IAudioEffectDefinitionFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioEffectDefinitionFactory {
    public val __934882700_Ptr: Pointer?

    public val _934882700_VtblPtr: Pointer?
      get() = __934882700_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(activatableClassId: String?): AudioEffectDefinition? {
      val fnPtr = _934882700_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioEffectDefinition>()
      val hr = fn.invokeHR(arrayOf(__934882700_Ptr, marshalToNative(activatableClassId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioEffectDefinition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithProperties(activatableClassId: String?, props: IPropertySet?):
        AudioEffectDefinition? {
      val fnPtr = _934882700_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioEffectDefinition>()
      val hr = fn.invokeHR(arrayOf(__934882700_Ptr, marshalToNative(activatableClassId),
          marshalToNative(props), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioEffectDefinition>(result.getValue())
      return resultValue
    }
  }

  public class IAudioEffectDefinitionFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __934882700_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioEffectDefinitionFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8e1da646e70545ed8a2bfc4e4f405a97")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioEffectDefinitionFactory(ptr: Pointer?): WithDefault =
        IAudioEffectDefinitionFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioEffectDefinitionFactory {
      val address = segment.toRawLongValue()
      return makeIAudioEffectDefinitionFactory(Pointer(address))
    }

    public override fun toNative(obj: IAudioEffectDefinitionFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__934882700_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioEffectDefinitionFactory):
        Array<IAudioEffectDefinitionFactory?> = (elements as
        Array<IAudioEffectDefinitionFactory?>).castToImpl<IAudioEffectDefinitionFactory,IAudioEffectDefinitionFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioEffectDefinitionFactory?> =
        arrayOfNulls<IAudioEffectDefinitionFactory_Impl>(size) as
        Array<IAudioEffectDefinitionFactory?>
  }
}
