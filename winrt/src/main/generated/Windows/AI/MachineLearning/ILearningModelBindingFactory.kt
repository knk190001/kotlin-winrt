package Windows.AI.MachineLearning

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

@ABIMarker(ILearningModelBindingFactory.ABI::class)
@Signature("{c95f7a7a-e788-475e-8917-23aa381faf0b}")
@Guid("c95f7a7ae788475e891723aa381faf0b")
@WinRTInterface("c95f7a7ae788475e891723aa381faf0b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILearningModelBindingFactory.ByReference::class)
public interface ILearningModelBindingFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromSession(session: LearningModelSession?): LearningModelBinding?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILearningModelBindingFactory> {
    public override fun getValue() = ABI.makeILearningModelBindingFactory(pointer.getPointer(0))

    public fun setValue(value: ILearningModelBindingFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILearningModelBindingFactory {
    public val __764810927_Ptr: Pointer?

    public val _764810927_VtblPtr: Pointer?
      get() = __764810927_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromSession(session: LearningModelSession?): LearningModelBinding? {
      val fnPtr = _764810927_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LearningModelBinding>()
      val hr = fn.invokeHR(arrayOf(__764810927_Ptr, marshalToNative(session), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LearningModelBinding>(result.getValue())
      return resultValue
    }
  }

  public class ILearningModelBindingFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __764810927_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILearningModelBindingFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c95f7a7ae788475e891723aa381faf0b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILearningModelBindingFactory(ptr: Pointer?): WithDefault =
        ILearningModelBindingFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILearningModelBindingFactory {
      val address = segment.toRawLongValue()
      return makeILearningModelBindingFactory(Pointer(address))
    }

    public override fun toNative(obj: ILearningModelBindingFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__764810927_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILearningModelBindingFactory):
        Array<ILearningModelBindingFactory?> = (elements as
        Array<ILearningModelBindingFactory?>).castToImpl<ILearningModelBindingFactory,ILearningModelBindingFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILearningModelBindingFactory?> =
        arrayOfNulls<ILearningModelBindingFactory_Impl>(size) as
        Array<ILearningModelBindingFactory?>
  }
}
