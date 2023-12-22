package Windows.Media.Audio

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

@ABIMarker(IEchoEffectDefinitionFactory.ABI::class)
@Signature("{0d4e2257-aaf2-4e86-a54c-fb79db8f6c12}")
@Guid("0d4e2257aaf24e86a54cfb79db8f6c12")
@WinRTInterface("0d4e2257aaf24e86a54cfb79db8f6c12")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEchoEffectDefinitionFactory.ByReference::class)
public interface IEchoEffectDefinitionFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(audioGraph: AudioGraph?): EchoEffectDefinition?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEchoEffectDefinitionFactory> {
    public override fun getValue() = ABI.makeIEchoEffectDefinitionFactory(pointer.getPointer(0))

    public fun setValue(value: IEchoEffectDefinitionFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEchoEffectDefinitionFactory {
    public val __1729323207_Ptr: Pointer?

    public val _1729323207_VtblPtr: Pointer?
      get() = __1729323207_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(audioGraph: AudioGraph?): EchoEffectDefinition? {
      val fnPtr = _1729323207_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EchoEffectDefinition>()
      val hr = fn.invokeHR(arrayOf(__1729323207_Ptr, marshalToNative(audioGraph), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EchoEffectDefinition>(result.getValue())
      return resultValue
    }
  }

  public class IEchoEffectDefinitionFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1729323207_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEchoEffectDefinitionFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0d4e2257aaf24e86a54cfb79db8f6c12")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEchoEffectDefinitionFactory(ptr: Pointer?): WithDefault =
        IEchoEffectDefinitionFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEchoEffectDefinitionFactory {
      val address = segment.toRawLongValue()
      return makeIEchoEffectDefinitionFactory(Pointer(address))
    }

    public override fun toNative(obj: IEchoEffectDefinitionFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1729323207_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEchoEffectDefinitionFactory):
        Array<IEchoEffectDefinitionFactory?> = (elements as
        Array<IEchoEffectDefinitionFactory?>).castToImpl<IEchoEffectDefinitionFactory,IEchoEffectDefinitionFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEchoEffectDefinitionFactory?> =
        arrayOfNulls<IEchoEffectDefinitionFactory_Impl>(size) as
        Array<IEchoEffectDefinitionFactory?>
  }
}
