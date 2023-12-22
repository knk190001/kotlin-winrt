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

@ABIMarker(IVideoEffectDefinition.ABI::class)
@Signature("{39f38cf0-8d0f-4f3e-84fc-2d46a5297943}")
@Guid("39f38cf08d0f4f3e84fc2d46a5297943")
@WinRTInterface("39f38cf08d0f4f3e84fc2d46a5297943")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVideoEffectDefinition.ByReference::class)
public interface IVideoEffectDefinition : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ActivatableClassId(): String?

  @InterfaceMethod(1)
  public fun get_Properties(): IPropertySet?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVideoEffectDefinition> {
    public override fun getValue() = ABI.makeIVideoEffectDefinition(pointer.getPointer(0))

    public fun setValue(value: IVideoEffectDefinition_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVideoEffectDefinition {
    public val __1115276221_Ptr: Pointer?

    public val _1115276221_VtblPtr: Pointer?
      get() = __1115276221_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ActivatableClassId(): String? {
      val fnPtr = _1115276221_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1115276221_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Properties(): IPropertySet? {
      val fnPtr = _1115276221_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IPropertySet>()
      val hr = fn.invokeHR(arrayOf(__1115276221_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IPropertySet>(result.getValue())
      return resultValue
    }
  }

  public class IVideoEffectDefinition_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1115276221_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVideoEffectDefinition, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("39f38cf08d0f4f3e84fc2d46a5297943")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVideoEffectDefinition(ptr: Pointer?): WithDefault =
        IVideoEffectDefinition_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVideoEffectDefinition {
      val address = segment.toRawLongValue()
      return makeIVideoEffectDefinition(Pointer(address))
    }

    public override fun toNative(obj: IVideoEffectDefinition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1115276221_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVideoEffectDefinition): Array<IVideoEffectDefinition?> =
        (elements as
        Array<IVideoEffectDefinition?>).castToImpl<IVideoEffectDefinition,IVideoEffectDefinition_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVideoEffectDefinition?> =
        arrayOfNulls<IVideoEffectDefinition_Impl>(size) as Array<IVideoEffectDefinition?>
  }
}
