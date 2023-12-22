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

@ABIMarker(ILampArraySolidEffectFactory.ABI::class)
@Signature("{f862a32c-5576-4341-961b-aee1f13cf9dd}")
@Guid("f862a32c55764341961baee1f13cf9dd")
@WinRTInterface("f862a32c55764341961baee1f13cf9dd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILampArraySolidEffectFactory.ByReference::class)
public interface ILampArraySolidEffectFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(lampArray: LampArray?, lampIndexes: Array<Int>): LampArraySolidEffect?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILampArraySolidEffectFactory> {
    public override fun getValue() = ABI.makeILampArraySolidEffectFactory(pointer.getPointer(0))

    public fun setValue(value: ILampArraySolidEffectFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILampArraySolidEffectFactory {
    public val __376822387_Ptr: Pointer?

    public val _376822387_VtblPtr: Pointer?
      get() = __376822387_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(lampArray: LampArray?, lampIndexes: Array<Int>):
        LampArraySolidEffect? {
      val fnPtr = _376822387_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LampArraySolidEffect>()
      val hr = fn.invokeHR(arrayOf(__376822387_Ptr, marshalToNative(lampArray),
          lampIndexes.size,marshalToNative(lampIndexes), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LampArraySolidEffect>(result.getValue())
      return resultValue
    }
  }

  public class ILampArraySolidEffectFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __376822387_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILampArraySolidEffectFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f862a32c55764341961baee1f13cf9dd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILampArraySolidEffectFactory(ptr: Pointer?): WithDefault =
        ILampArraySolidEffectFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILampArraySolidEffectFactory {
      val address = segment.toRawLongValue()
      return makeILampArraySolidEffectFactory(Pointer(address))
    }

    public override fun toNative(obj: ILampArraySolidEffectFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__376822387_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILampArraySolidEffectFactory):
        Array<ILampArraySolidEffectFactory?> = (elements as
        Array<ILampArraySolidEffectFactory?>).castToImpl<ILampArraySolidEffectFactory,ILampArraySolidEffectFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILampArraySolidEffectFactory?> =
        arrayOfNulls<ILampArraySolidEffectFactory_Impl>(size) as
        Array<ILampArraySolidEffectFactory?>
  }
}
