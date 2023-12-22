package Windows.Gaming.Input.ForceFeedback

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

@ABIMarker(IConditionForceEffectFactory.ABI::class)
@Signature("{91a99264-1810-4eb6-a773-bfd3b8cddbab}")
@Guid("91a9926418104eb6a773bfd3b8cddbab")
@WinRTInterface("91a9926418104eb6a773bfd3b8cddbab")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IConditionForceEffectFactory.ByReference::class)
public interface IConditionForceEffectFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(effectKind: ConditionForceEffectKind?): ConditionForceEffect?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IConditionForceEffectFactory> {
    public override fun getValue() = ABI.makeIConditionForceEffectFactory(pointer.getPointer(0))

    public fun setValue(value: IConditionForceEffectFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IConditionForceEffectFactory {
    public val __1216522760_Ptr: Pointer?

    public val _1216522760_VtblPtr: Pointer?
      get() = __1216522760_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(effectKind: ConditionForceEffectKind?):
        ConditionForceEffect? {
      val fnPtr = _1216522760_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ConditionForceEffect>()
      val hr = fn.invokeHR(arrayOf(__1216522760_Ptr, marshalToNative(effectKind), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ConditionForceEffect>(result.getValue())
      return resultValue
    }
  }

  public class IConditionForceEffectFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1216522760_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IConditionForceEffectFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("91a9926418104eb6a773bfd3b8cddbab")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIConditionForceEffectFactory(ptr: Pointer?): WithDefault =
        IConditionForceEffectFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IConditionForceEffectFactory {
      val address = segment.toRawLongValue()
      return makeIConditionForceEffectFactory(Pointer(address))
    }

    public override fun toNative(obj: IConditionForceEffectFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1216522760_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IConditionForceEffectFactory):
        Array<IConditionForceEffectFactory?> = (elements as
        Array<IConditionForceEffectFactory?>).castToImpl<IConditionForceEffectFactory,IConditionForceEffectFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IConditionForceEffectFactory?> =
        arrayOfNulls<IConditionForceEffectFactory_Impl>(size) as
        Array<IConditionForceEffectFactory?>
  }
}
