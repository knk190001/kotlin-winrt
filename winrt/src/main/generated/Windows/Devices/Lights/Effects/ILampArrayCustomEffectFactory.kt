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

@ABIMarker(ILampArrayCustomEffectFactory.ABI::class)
@Signature("{68b4774d-63e5-4af0-a58b-3e535b94e8c9}")
@Guid("68b4774d63e54af0a58b3e535b94e8c9")
@WinRTInterface("68b4774d63e54af0a58b3e535b94e8c9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILampArrayCustomEffectFactory.ByReference::class)
public interface ILampArrayCustomEffectFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(lampArray: LampArray?, lampIndexes: Array<Int>): LampArrayCustomEffect?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILampArrayCustomEffectFactory> {
    public override fun getValue() = ABI.makeILampArrayCustomEffectFactory(pointer.getPointer(0))

    public fun setValue(value: ILampArrayCustomEffectFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILampArrayCustomEffectFactory {
    public val __2112387523_Ptr: Pointer?

    public val _2112387523_VtblPtr: Pointer?
      get() = __2112387523_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(lampArray: LampArray?, lampIndexes: Array<Int>):
        LampArrayCustomEffect? {
      val fnPtr = _2112387523_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LampArrayCustomEffect>()
      val hr = fn.invokeHR(arrayOf(__2112387523_Ptr, marshalToNative(lampArray),
          lampIndexes.size,marshalToNative(lampIndexes), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LampArrayCustomEffect>(result.getValue())
      return resultValue
    }
  }

  public class ILampArrayCustomEffectFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2112387523_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILampArrayCustomEffectFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("68b4774d63e54af0a58b3e535b94e8c9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILampArrayCustomEffectFactory(ptr: Pointer?): WithDefault =
        ILampArrayCustomEffectFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILampArrayCustomEffectFactory {
      val address = segment.toRawLongValue()
      return makeILampArrayCustomEffectFactory(Pointer(address))
    }

    public override fun toNative(obj: ILampArrayCustomEffectFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2112387523_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILampArrayCustomEffectFactory):
        Array<ILampArrayCustomEffectFactory?> = (elements as
        Array<ILampArrayCustomEffectFactory?>).castToImpl<ILampArrayCustomEffectFactory,ILampArrayCustomEffectFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILampArrayCustomEffectFactory?> =
        arrayOfNulls<ILampArrayCustomEffectFactory_Impl>(size) as
        Array<ILampArrayCustomEffectFactory?>
  }
}
