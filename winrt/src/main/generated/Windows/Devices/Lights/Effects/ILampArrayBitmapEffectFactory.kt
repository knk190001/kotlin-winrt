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

@ABIMarker(ILampArrayBitmapEffectFactory.ABI::class)
@Signature("{13608090-e336-4c8f-9053-a92407ca7b1d}")
@Guid("13608090e3364c8f9053a92407ca7b1d")
@WinRTInterface("13608090e3364c8f9053a92407ca7b1d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILampArrayBitmapEffectFactory.ByReference::class)
public interface ILampArrayBitmapEffectFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(lampArray: LampArray?, lampIndexes: Array<Int>): LampArrayBitmapEffect?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILampArrayBitmapEffectFactory> {
    public override fun getValue() = ABI.makeILampArrayBitmapEffectFactory(pointer.getPointer(0))

    public fun setValue(value: ILampArrayBitmapEffectFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILampArrayBitmapEffectFactory {
    public val __1521342661_Ptr: Pointer?

    public val _1521342661_VtblPtr: Pointer?
      get() = __1521342661_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(lampArray: LampArray?, lampIndexes: Array<Int>):
        LampArrayBitmapEffect? {
      val fnPtr = _1521342661_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LampArrayBitmapEffect>()
      val hr = fn.invokeHR(arrayOf(__1521342661_Ptr, marshalToNative(lampArray),
          lampIndexes.size,marshalToNative(lampIndexes), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LampArrayBitmapEffect>(result.getValue())
      return resultValue
    }
  }

  public class ILampArrayBitmapEffectFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1521342661_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILampArrayBitmapEffectFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("13608090e3364c8f9053a92407ca7b1d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILampArrayBitmapEffectFactory(ptr: Pointer?): WithDefault =
        ILampArrayBitmapEffectFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILampArrayBitmapEffectFactory {
      val address = segment.toRawLongValue()
      return makeILampArrayBitmapEffectFactory(Pointer(address))
    }

    public override fun toNative(obj: ILampArrayBitmapEffectFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1521342661_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILampArrayBitmapEffectFactory):
        Array<ILampArrayBitmapEffectFactory?> = (elements as
        Array<ILampArrayBitmapEffectFactory?>).castToImpl<ILampArrayBitmapEffectFactory,ILampArrayBitmapEffectFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILampArrayBitmapEffectFactory?> =
        arrayOfNulls<ILampArrayBitmapEffectFactory_Impl>(size) as
        Array<ILampArrayBitmapEffectFactory?>
  }
}
