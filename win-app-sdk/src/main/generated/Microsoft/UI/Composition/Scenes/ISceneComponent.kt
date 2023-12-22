package Microsoft.UI.Composition.Scenes

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

@ABIMarker(ISceneComponent.ABI::class)
@Signature("{f73361cb-8027-50e2-98ee-b2e3ea050a54}")
@Guid("f73361cb802750e298eeb2e3ea050a54")
@WinRTInterface("f73361cb802750e298eeb2e3ea050a54")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISceneComponent.ByReference::class)
public interface ISceneComponent : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ComponentType(): SceneComponentType?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISceneComponent> {
    public override fun getValue() = ABI.makeISceneComponent(pointer.getPointer(0))

    public fun setValue(value: ISceneComponent_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISceneComponent {
    public val __1459681035_Ptr: Pointer?

    public val _1459681035_VtblPtr: Pointer?
      get() = __1459681035_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ComponentType(): SceneComponentType? {
      val fnPtr = _1459681035_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SceneComponentType>()
      val hr = fn.invokeHR(arrayOf(__1459681035_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SceneComponentType>(result.getValue())
      return resultValue
    }
  }

  public class ISceneComponent_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1459681035_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISceneComponent, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f73361cb802750e298eeb2e3ea050a54")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISceneComponent(ptr: Pointer?): WithDefault = ISceneComponent_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISceneComponent {
      val address = segment.toRawLongValue()
      return makeISceneComponent(Pointer(address))
    }

    public override fun toNative(obj: ISceneComponent): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1459681035_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISceneComponent): Array<ISceneComponent?> = (elements as
        Array<ISceneComponent?>).castToImpl<ISceneComponent,ISceneComponent_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISceneComponent?> =
        arrayOfNulls<ISceneComponent_Impl>(size) as Array<ISceneComponent?>
  }
}
