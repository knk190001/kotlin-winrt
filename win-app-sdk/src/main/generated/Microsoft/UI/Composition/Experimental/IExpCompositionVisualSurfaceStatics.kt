package Microsoft.UI.Composition.Experimental

import Microsoft.UI.Composition.CompositionVisualSurface
import Microsoft.UI.Composition.Compositor
import Windows.Graphics.SizeInt32
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IExpCompositionVisualSurfaceStatics.ABI::class)
@Signature("{46193461-9018-5674-a09c-4ae6a29daa35}")
@Guid("4619346190185674a09c4ae6a29daa35")
@WinRTInterface("4619346190185674a09c4ae6a29daa35")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExpCompositionVisualSurfaceStatics.ByReference::class)
public interface IExpCompositionVisualSurfaceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateVisualSurface(
    compositor: Compositor?,
    realizationSize: SizeInt32?,
    frozen: Boolean
  ): CompositionVisualSurface?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IExpCompositionVisualSurfaceStatics> {
    public override fun getValue() =
        ABI.makeIExpCompositionVisualSurfaceStatics(pointer.getPointer(0))

    public fun setValue(value: IExpCompositionVisualSurfaceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExpCompositionVisualSurfaceStatics {
    public val __1212229928_Ptr: Pointer?

    public val _1212229928_VtblPtr: Pointer?
      get() = __1212229928_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateVisualSurface(
      compositor: Compositor?,
      realizationSize: SizeInt32?,
      frozen: Boolean
    ): CompositionVisualSurface? {
      val fnPtr = _1212229928_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionVisualSurface>()
      val hr = fn.invokeHR(arrayOf(__1212229928_Ptr, marshalToNative(compositor),
          marshalToNative(realizationSize), frozen, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionVisualSurface>(result.getValue())
      return resultValue
    }
  }

  public class IExpCompositionVisualSurfaceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1212229928_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExpCompositionVisualSurfaceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4619346190185674a09c4ae6a29daa35")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExpCompositionVisualSurfaceStatics(ptr: Pointer?): WithDefault =
        IExpCompositionVisualSurfaceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IExpCompositionVisualSurfaceStatics {
      val address = segment.toRawLongValue()
      return makeIExpCompositionVisualSurfaceStatics(Pointer(address))
    }

    public override fun toNative(obj: IExpCompositionVisualSurfaceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1212229928_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExpCompositionVisualSurfaceStatics):
        Array<IExpCompositionVisualSurfaceStatics?> = (elements as
        Array<IExpCompositionVisualSurfaceStatics?>).castToImpl<IExpCompositionVisualSurfaceStatics,IExpCompositionVisualSurfaceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExpCompositionVisualSurfaceStatics?> =
        arrayOfNulls<IExpCompositionVisualSurfaceStatics_Impl>(size) as
        Array<IExpCompositionVisualSurfaceStatics?>
  }
}
