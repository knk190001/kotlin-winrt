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

@ABIMarker(IAudioEffectDefinition.ABI::class)
@Signature("{e4d7f974-7d80-4f73-9089-e31c9db9c294}")
@Guid("e4d7f9747d804f739089e31c9db9c294")
@WinRTInterface("e4d7f9747d804f739089e31c9db9c294")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioEffectDefinition.ByReference::class)
public interface IAudioEffectDefinition : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ActivatableClassId(): String?

  @InterfaceMethod(1)
  public fun get_Properties(): IPropertySet?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioEffectDefinition> {
    public override fun getValue() = ABI.makeIAudioEffectDefinition(pointer.getPointer(0))

    public fun setValue(value: IAudioEffectDefinition_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioEffectDefinition {
    public val __1562923618_Ptr: Pointer?

    public val _1562923618_VtblPtr: Pointer?
      get() = __1562923618_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ActivatableClassId(): String? {
      val fnPtr = _1562923618_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1562923618_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Properties(): IPropertySet? {
      val fnPtr = _1562923618_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IPropertySet>()
      val hr = fn.invokeHR(arrayOf(__1562923618_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IPropertySet>(result.getValue())
      return resultValue
    }
  }

  public class IAudioEffectDefinition_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1562923618_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioEffectDefinition, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e4d7f9747d804f739089e31c9db9c294")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioEffectDefinition(ptr: Pointer?): WithDefault =
        IAudioEffectDefinition_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioEffectDefinition {
      val address = segment.toRawLongValue()
      return makeIAudioEffectDefinition(Pointer(address))
    }

    public override fun toNative(obj: IAudioEffectDefinition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1562923618_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioEffectDefinition): Array<IAudioEffectDefinition?> =
        (elements as
        Array<IAudioEffectDefinition?>).castToImpl<IAudioEffectDefinition,IAudioEffectDefinition_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioEffectDefinition?> =
        arrayOfNulls<IAudioEffectDefinition_Impl>(size) as Array<IAudioEffectDefinition?>
  }
}
