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

@ABIMarker(IVideoCompositorDefinitionFactory.ABI::class)
@Signature("{4366fd10-68b8-4d52-89b6-02a968cca899}")
@Guid("4366fd1068b84d5289b602a968cca899")
@WinRTInterface("4366fd1068b84d5289b602a968cca899")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVideoCompositorDefinitionFactory.ByReference::class)
public interface IVideoCompositorDefinitionFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(activatableClassId: String?): VideoCompositorDefinition?

  @InterfaceMethod(1)
  public fun CreateWithProperties(activatableClassId: String?, props: IPropertySet?):
      VideoCompositorDefinition?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVideoCompositorDefinitionFactory> {
    public override fun getValue() =
        ABI.makeIVideoCompositorDefinitionFactory(pointer.getPointer(0))

    public fun setValue(value: IVideoCompositorDefinitionFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVideoCompositorDefinitionFactory {
    public val __602727849_Ptr: Pointer?

    public val _602727849_VtblPtr: Pointer?
      get() = __602727849_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(activatableClassId: String?): VideoCompositorDefinition? {
      val fnPtr = _602727849_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoCompositorDefinition>()
      val hr = fn.invokeHR(arrayOf(__602727849_Ptr, marshalToNative(activatableClassId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoCompositorDefinition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithProperties(activatableClassId: String?, props: IPropertySet?):
        VideoCompositorDefinition? {
      val fnPtr = _602727849_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoCompositorDefinition>()
      val hr = fn.invokeHR(arrayOf(__602727849_Ptr, marshalToNative(activatableClassId),
          marshalToNative(props), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoCompositorDefinition>(result.getValue())
      return resultValue
    }
  }

  public class IVideoCompositorDefinitionFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __602727849_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVideoCompositorDefinitionFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4366fd1068b84d5289b602a968cca899")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVideoCompositorDefinitionFactory(ptr: Pointer?): WithDefault =
        IVideoCompositorDefinitionFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVideoCompositorDefinitionFactory {
      val address = segment.toRawLongValue()
      return makeIVideoCompositorDefinitionFactory(Pointer(address))
    }

    public override fun toNative(obj: IVideoCompositorDefinitionFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__602727849_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVideoCompositorDefinitionFactory):
        Array<IVideoCompositorDefinitionFactory?> = (elements as
        Array<IVideoCompositorDefinitionFactory?>).castToImpl<IVideoCompositorDefinitionFactory,IVideoCompositorDefinitionFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVideoCompositorDefinitionFactory?> =
        arrayOfNulls<IVideoCompositorDefinitionFactory_Impl>(size) as
        Array<IVideoCompositorDefinitionFactory?>
  }
}
