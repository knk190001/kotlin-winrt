package Windows.UI.Composition

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

@ABIMarker(ICompositionEffectSourceParameterFactory.ABI::class)
@Signature("{b3d9f276-aba3-4724-acf3-d0397464db1c}")
@Guid("b3d9f276aba34724acf3d0397464db1c")
@WinRTInterface("b3d9f276aba34724acf3d0397464db1c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionEffectSourceParameterFactory.ByReference::class)
public interface ICompositionEffectSourceParameterFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(name: String?): CompositionEffectSourceParameter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionEffectSourceParameterFactory> {
    public override fun getValue() =
        ABI.makeICompositionEffectSourceParameterFactory(pointer.getPointer(0))

    public fun setValue(value: ICompositionEffectSourceParameterFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionEffectSourceParameterFactory {
    public val __259184215_Ptr: Pointer?

    public val _259184215_VtblPtr: Pointer?
      get() = __259184215_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(name: String?): CompositionEffectSourceParameter? {
      val fnPtr = _259184215_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionEffectSourceParameter>()
      val hr = fn.invokeHR(arrayOf(__259184215_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionEffectSourceParameter>(result.getValue())
      return resultValue
    }
  }

  public class ICompositionEffectSourceParameterFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __259184215_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionEffectSourceParameterFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b3d9f276aba34724acf3d0397464db1c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionEffectSourceParameterFactory(ptr: Pointer?): WithDefault =
        ICompositionEffectSourceParameterFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICompositionEffectSourceParameterFactory {
      val address = segment.toRawLongValue()
      return makeICompositionEffectSourceParameterFactory(Pointer(address))
    }

    public override fun toNative(obj: ICompositionEffectSourceParameterFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__259184215_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionEffectSourceParameterFactory):
        Array<ICompositionEffectSourceParameterFactory?> = (elements as
        Array<ICompositionEffectSourceParameterFactory?>).castToImpl<ICompositionEffectSourceParameterFactory,ICompositionEffectSourceParameterFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionEffectSourceParameterFactory?> =
        arrayOfNulls<ICompositionEffectSourceParameterFactory_Impl>(size) as
        Array<ICompositionEffectSourceParameterFactory?>
  }
}
