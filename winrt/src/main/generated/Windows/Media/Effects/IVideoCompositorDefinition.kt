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

@ABIMarker(IVideoCompositorDefinition.ABI::class)
@Signature("{7946b8d0-2010-4ae3-9ab2-2cef42edd4d2}")
@Guid("7946b8d020104ae39ab22cef42edd4d2")
@WinRTInterface("7946b8d020104ae39ab22cef42edd4d2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVideoCompositorDefinition.ByReference::class)
public interface IVideoCompositorDefinition : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ActivatableClassId(): String?

  @InterfaceMethod(1)
  public fun get_Properties(): IPropertySet?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVideoCompositorDefinition> {
    public override fun getValue() = ABI.makeIVideoCompositorDefinition(pointer.getPointer(0))

    public fun setValue(value: IVideoCompositorDefinition_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVideoCompositorDefinition {
    public val __1653063475_Ptr: Pointer?

    public val _1653063475_VtblPtr: Pointer?
      get() = __1653063475_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ActivatableClassId(): String? {
      val fnPtr = _1653063475_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1653063475_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Properties(): IPropertySet? {
      val fnPtr = _1653063475_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IPropertySet>()
      val hr = fn.invokeHR(arrayOf(__1653063475_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IPropertySet>(result.getValue())
      return resultValue
    }
  }

  public class IVideoCompositorDefinition_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1653063475_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVideoCompositorDefinition, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7946b8d020104ae39ab22cef42edd4d2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVideoCompositorDefinition(ptr: Pointer?): WithDefault =
        IVideoCompositorDefinition_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVideoCompositorDefinition {
      val address = segment.toRawLongValue()
      return makeIVideoCompositorDefinition(Pointer(address))
    }

    public override fun toNative(obj: IVideoCompositorDefinition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1653063475_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVideoCompositorDefinition):
        Array<IVideoCompositorDefinition?> = (elements as
        Array<IVideoCompositorDefinition?>).castToImpl<IVideoCompositorDefinition,IVideoCompositorDefinition_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVideoCompositorDefinition?> =
        arrayOfNulls<IVideoCompositorDefinition_Impl>(size) as Array<IVideoCompositorDefinition?>
  }
}
