package Microsoft.UI.Composition.Effects

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

@ABIMarker(ISceneLightingEffect2.ABI::class)
@Signature("{6b6496b2-468d-50d1-bbe9-593b8263ad80}")
@Guid("6b6496b2468d50d1bbe9593b8263ad80")
@WinRTInterface("6b6496b2468d50d1bbe9593b8263ad80")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISceneLightingEffect2.ByReference::class)
public interface ISceneLightingEffect2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ReflectanceModel(): SceneLightingEffectReflectanceModel?

  @InterfaceMethod(1)
  public fun put_ReflectanceModel(value: SceneLightingEffectReflectanceModel?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISceneLightingEffect2> {
    public override fun getValue() = ABI.makeISceneLightingEffect2(pointer.getPointer(0))

    public fun setValue(value: ISceneLightingEffect2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISceneLightingEffect2 {
    public val __1565765874_Ptr: Pointer?

    public val _1565765874_VtblPtr: Pointer?
      get() = __1565765874_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ReflectanceModel(): SceneLightingEffectReflectanceModel? {
      val fnPtr = _1565765874_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SceneLightingEffectReflectanceModel>()
      val hr = fn.invokeHR(arrayOf(__1565765874_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SceneLightingEffectReflectanceModel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ReflectanceModel(value: SceneLightingEffectReflectanceModel?): Unit {
      val fnPtr = _1565765874_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1565765874_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISceneLightingEffect2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1565765874_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISceneLightingEffect2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6b6496b2468d50d1bbe9593b8263ad80")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISceneLightingEffect2(ptr: Pointer?): WithDefault =
        ISceneLightingEffect2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISceneLightingEffect2 {
      val address = segment.toRawLongValue()
      return makeISceneLightingEffect2(Pointer(address))
    }

    public override fun toNative(obj: ISceneLightingEffect2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1565765874_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISceneLightingEffect2): Array<ISceneLightingEffect2?> =
        (elements as
        Array<ISceneLightingEffect2?>).castToImpl<ISceneLightingEffect2,ISceneLightingEffect2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISceneLightingEffect2?> =
        arrayOfNulls<ISceneLightingEffect2_Impl>(size) as Array<ISceneLightingEffect2?>
  }
}
