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

@ABIMarker(IPeriodicForceEffectFactory.ABI::class)
@Signature("{6f62eb1a-9851-477b-b318-35ecaa15070f}")
@Guid("6f62eb1a9851477bb31835ecaa15070f")
@WinRTInterface("6f62eb1a9851477bb31835ecaa15070f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPeriodicForceEffectFactory.ByReference::class)
public interface IPeriodicForceEffectFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(effectKind: PeriodicForceEffectKind?): PeriodicForceEffect?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPeriodicForceEffectFactory> {
    public override fun getValue() = ABI.makeIPeriodicForceEffectFactory(pointer.getPointer(0))

    public fun setValue(value: IPeriodicForceEffectFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPeriodicForceEffectFactory {
    public val __1442069318_Ptr: Pointer?

    public val _1442069318_VtblPtr: Pointer?
      get() = __1442069318_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(effectKind: PeriodicForceEffectKind?): PeriodicForceEffect? {
      val fnPtr = _1442069318_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PeriodicForceEffect>()
      val hr = fn.invokeHR(arrayOf(__1442069318_Ptr, marshalToNative(effectKind), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PeriodicForceEffect>(result.getValue())
      return resultValue
    }
  }

  public class IPeriodicForceEffectFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1442069318_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPeriodicForceEffectFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6f62eb1a9851477bb31835ecaa15070f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPeriodicForceEffectFactory(ptr: Pointer?): WithDefault =
        IPeriodicForceEffectFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPeriodicForceEffectFactory {
      val address = segment.toRawLongValue()
      return makeIPeriodicForceEffectFactory(Pointer(address))
    }

    public override fun toNative(obj: IPeriodicForceEffectFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1442069318_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPeriodicForceEffectFactory):
        Array<IPeriodicForceEffectFactory?> = (elements as
        Array<IPeriodicForceEffectFactory?>).castToImpl<IPeriodicForceEffectFactory,IPeriodicForceEffectFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPeriodicForceEffectFactory?> =
        arrayOfNulls<IPeriodicForceEffectFactory_Impl>(size) as Array<IPeriodicForceEffectFactory?>
  }
}
