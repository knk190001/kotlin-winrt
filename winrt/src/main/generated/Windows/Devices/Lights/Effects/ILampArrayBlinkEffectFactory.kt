package Windows.Devices.Lights.Effects

import Windows.Devices.Lights.LampArray
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

@ABIMarker(ILampArrayBlinkEffectFactory.ABI::class)
@Signature("{879f1d97-9f50-49b2-a56f-013aa08d55e0}")
@Guid("879f1d979f5049b2a56f013aa08d55e0")
@WinRTInterface("879f1d979f5049b2a56f013aa08d55e0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILampArrayBlinkEffectFactory.ByReference::class)
public interface ILampArrayBlinkEffectFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(lampArray: LampArray?, lampIndexes: Array<Int>): LampArrayBlinkEffect?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILampArrayBlinkEffectFactory> {
    public override fun getValue() = ABI.makeILampArrayBlinkEffectFactory(pointer.getPointer(0))

    public fun setValue(value: ILampArrayBlinkEffectFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILampArrayBlinkEffectFactory {
    public val __1617705314_Ptr: Pointer?

    public val _1617705314_VtblPtr: Pointer?
      get() = __1617705314_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(lampArray: LampArray?, lampIndexes: Array<Int>):
        LampArrayBlinkEffect? {
      val fnPtr = _1617705314_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LampArrayBlinkEffect>()
      val hr = fn.invokeHR(arrayOf(__1617705314_Ptr, marshalToNative(lampArray),
          lampIndexes.size,marshalToNative(lampIndexes), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LampArrayBlinkEffect>(result.getValue())
      return resultValue
    }
  }

  public class ILampArrayBlinkEffectFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1617705314_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILampArrayBlinkEffectFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("879f1d979f5049b2a56f013aa08d55e0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILampArrayBlinkEffectFactory(ptr: Pointer?): WithDefault =
        ILampArrayBlinkEffectFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILampArrayBlinkEffectFactory {
      val address = segment.toRawLongValue()
      return makeILampArrayBlinkEffectFactory(Pointer(address))
    }

    public override fun toNative(obj: ILampArrayBlinkEffectFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1617705314_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILampArrayBlinkEffectFactory):
        Array<ILampArrayBlinkEffectFactory?> = (elements as
        Array<ILampArrayBlinkEffectFactory?>).castToImpl<ILampArrayBlinkEffectFactory,ILampArrayBlinkEffectFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILampArrayBlinkEffectFactory?> =
        arrayOfNulls<ILampArrayBlinkEffectFactory_Impl>(size) as
        Array<ILampArrayBlinkEffectFactory?>
  }
}
