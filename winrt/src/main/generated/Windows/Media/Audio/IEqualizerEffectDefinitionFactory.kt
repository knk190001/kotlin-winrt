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

@ABIMarker(IEqualizerEffectDefinitionFactory.ABI::class)
@Signature("{d2876fc4-d410-4eb5-9e69-c9aa1277eaf0}")
@Guid("d2876fc4d4104eb59e69c9aa1277eaf0")
@WinRTInterface("d2876fc4d4104eb59e69c9aa1277eaf0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEqualizerEffectDefinitionFactory.ByReference::class)
public interface IEqualizerEffectDefinitionFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(audioGraph: AudioGraph?): EqualizerEffectDefinition?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEqualizerEffectDefinitionFactory> {
    public override fun getValue() =
        ABI.makeIEqualizerEffectDefinitionFactory(pointer.getPointer(0))

    public fun setValue(value: IEqualizerEffectDefinitionFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEqualizerEffectDefinitionFactory {
    public val __1047937532_Ptr: Pointer?

    public val _1047937532_VtblPtr: Pointer?
      get() = __1047937532_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(audioGraph: AudioGraph?): EqualizerEffectDefinition? {
      val fnPtr = _1047937532_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EqualizerEffectDefinition>()
      val hr = fn.invokeHR(arrayOf(__1047937532_Ptr, marshalToNative(audioGraph), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EqualizerEffectDefinition>(result.getValue())
      return resultValue
    }
  }

  public class IEqualizerEffectDefinitionFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1047937532_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEqualizerEffectDefinitionFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d2876fc4d4104eb59e69c9aa1277eaf0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEqualizerEffectDefinitionFactory(ptr: Pointer?): WithDefault =
        IEqualizerEffectDefinitionFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEqualizerEffectDefinitionFactory {
      val address = segment.toRawLongValue()
      return makeIEqualizerEffectDefinitionFactory(Pointer(address))
    }

    public override fun toNative(obj: IEqualizerEffectDefinitionFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1047937532_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEqualizerEffectDefinitionFactory):
        Array<IEqualizerEffectDefinitionFactory?> = (elements as
        Array<IEqualizerEffectDefinitionFactory?>).castToImpl<IEqualizerEffectDefinitionFactory,IEqualizerEffectDefinitionFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEqualizerEffectDefinitionFactory?> =
        arrayOfNulls<IEqualizerEffectDefinitionFactory_Impl>(size) as
        Array<IEqualizerEffectDefinitionFactory?>
  }
}
