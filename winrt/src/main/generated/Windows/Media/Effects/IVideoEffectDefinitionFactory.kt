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

@ABIMarker(IVideoEffectDefinitionFactory.ABI::class)
@Signature("{81439b4e-6e33-428f-9d21-b5aafef7617c}")
@Guid("81439b4e6e33428f9d21b5aafef7617c")
@WinRTInterface("81439b4e6e33428f9d21b5aafef7617c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVideoEffectDefinitionFactory.ByReference::class)
public interface IVideoEffectDefinitionFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(activatableClassId: String?): VideoEffectDefinition?

  @InterfaceMethod(1)
  public fun CreateWithProperties(activatableClassId: String?, props: IPropertySet?):
      VideoEffectDefinition?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVideoEffectDefinitionFactory> {
    public override fun getValue() = ABI.makeIVideoEffectDefinitionFactory(pointer.getPointer(0))

    public fun setValue(value: IVideoEffectDefinitionFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVideoEffectDefinitionFactory {
    public val __944819015_Ptr: Pointer?

    public val _944819015_VtblPtr: Pointer?
      get() = __944819015_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(activatableClassId: String?): VideoEffectDefinition? {
      val fnPtr = _944819015_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoEffectDefinition>()
      val hr = fn.invokeHR(arrayOf(__944819015_Ptr, marshalToNative(activatableClassId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoEffectDefinition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithProperties(activatableClassId: String?, props: IPropertySet?):
        VideoEffectDefinition? {
      val fnPtr = _944819015_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoEffectDefinition>()
      val hr = fn.invokeHR(arrayOf(__944819015_Ptr, marshalToNative(activatableClassId),
          marshalToNative(props), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoEffectDefinition>(result.getValue())
      return resultValue
    }
  }

  public class IVideoEffectDefinitionFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __944819015_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVideoEffectDefinitionFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("81439b4e6e33428f9d21b5aafef7617c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVideoEffectDefinitionFactory(ptr: Pointer?): WithDefault =
        IVideoEffectDefinitionFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVideoEffectDefinitionFactory {
      val address = segment.toRawLongValue()
      return makeIVideoEffectDefinitionFactory(Pointer(address))
    }

    public override fun toNative(obj: IVideoEffectDefinitionFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__944819015_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVideoEffectDefinitionFactory):
        Array<IVideoEffectDefinitionFactory?> = (elements as
        Array<IVideoEffectDefinitionFactory?>).castToImpl<IVideoEffectDefinitionFactory,IVideoEffectDefinitionFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVideoEffectDefinitionFactory?> =
        arrayOfNulls<IVideoEffectDefinitionFactory_Impl>(size) as
        Array<IVideoEffectDefinitionFactory?>
  }
}
