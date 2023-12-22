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

@ABIMarker(ILampArrayColorRampEffectFactory.ABI::class)
@Signature("{520bd133-0c74-4df5-bea7-4899e0266b0f}")
@Guid("520bd1330c744df5bea74899e0266b0f")
@WinRTInterface("520bd1330c744df5bea74899e0266b0f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILampArrayColorRampEffectFactory.ByReference::class)
public interface ILampArrayColorRampEffectFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(lampArray: LampArray?, lampIndexes: Array<Int>):
      LampArrayColorRampEffect?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILampArrayColorRampEffectFactory> {
    public override fun getValue() = ABI.makeILampArrayColorRampEffectFactory(pointer.getPointer(0))

    public fun setValue(value: ILampArrayColorRampEffectFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILampArrayColorRampEffectFactory {
    public val __1442954441_Ptr: Pointer?

    public val _1442954441_VtblPtr: Pointer?
      get() = __1442954441_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(lampArray: LampArray?, lampIndexes: Array<Int>):
        LampArrayColorRampEffect? {
      val fnPtr = _1442954441_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LampArrayColorRampEffect>()
      val hr = fn.invokeHR(arrayOf(__1442954441_Ptr, marshalToNative(lampArray),
          lampIndexes.size,marshalToNative(lampIndexes), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LampArrayColorRampEffect>(result.getValue())
      return resultValue
    }
  }

  public class ILampArrayColorRampEffectFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1442954441_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILampArrayColorRampEffectFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("520bd1330c744df5bea74899e0266b0f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILampArrayColorRampEffectFactory(ptr: Pointer?): WithDefault =
        ILampArrayColorRampEffectFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILampArrayColorRampEffectFactory {
      val address = segment.toRawLongValue()
      return makeILampArrayColorRampEffectFactory(Pointer(address))
    }

    public override fun toNative(obj: ILampArrayColorRampEffectFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1442954441_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILampArrayColorRampEffectFactory):
        Array<ILampArrayColorRampEffectFactory?> = (elements as
        Array<ILampArrayColorRampEffectFactory?>).castToImpl<ILampArrayColorRampEffectFactory,ILampArrayColorRampEffectFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILampArrayColorRampEffectFactory?> =
        arrayOfNulls<ILampArrayColorRampEffectFactory_Impl>(size) as
        Array<ILampArrayColorRampEffectFactory?>
  }
}
