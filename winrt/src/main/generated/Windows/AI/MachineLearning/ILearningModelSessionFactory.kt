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

@ABIMarker(ILearningModelSessionFactory.ABI::class)
@Signature("{0f6b881d-1c9b-47b6-bfe0-f1cf62a67579}")
@Guid("0f6b881d1c9b47b6bfe0f1cf62a67579")
@WinRTInterface("0f6b881d1c9b47b6bfe0f1cf62a67579")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILearningModelSessionFactory.ByReference::class)
public interface ILearningModelSessionFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromModel(model: LearningModel?): LearningModelSession?

  @InterfaceMethod(1)
  public fun CreateFromModelOnDevice(model: LearningModel?, deviceToRunOn: LearningModelDevice?):
      LearningModelSession?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILearningModelSessionFactory> {
    public override fun getValue() = ABI.makeILearningModelSessionFactory(pointer.getPointer(0))

    public fun setValue(value: ILearningModelSessionFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILearningModelSessionFactory {
    public val __1667469344_Ptr: Pointer?

    public val _1667469344_VtblPtr: Pointer?
      get() = __1667469344_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromModel(model: LearningModel?): LearningModelSession? {
      val fnPtr = _1667469344_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LearningModelSession>()
      val hr = fn.invokeHR(arrayOf(__1667469344_Ptr, marshalToNative(model), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LearningModelSession>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromModelOnDevice(model: LearningModel?,
        deviceToRunOn: LearningModelDevice?): LearningModelSession? {
      val fnPtr = _1667469344_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LearningModelSession>()
      val hr = fn.invokeHR(arrayOf(__1667469344_Ptr, marshalToNative(model),
          marshalToNative(deviceToRunOn), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LearningModelSession>(result.getValue())
      return resultValue
    }
  }

  public class ILearningModelSessionFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1667469344_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILearningModelSessionFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0f6b881d1c9b47b6bfe0f1cf62a67579")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILearningModelSessionFactory(ptr: Pointer?): WithDefault =
        ILearningModelSessionFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILearningModelSessionFactory {
      val address = segment.toRawLongValue()
      return makeILearningModelSessionFactory(Pointer(address))
    }

    public override fun toNative(obj: ILearningModelSessionFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1667469344_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILearningModelSessionFactory):
        Array<ILearningModelSessionFactory?> = (elements as
        Array<ILearningModelSessionFactory?>).castToImpl<ILearningModelSessionFactory,ILearningModelSessionFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILearningModelSessionFactory?> =
        arrayOfNulls<ILearningModelSessionFactory_Impl>(size) as
        Array<ILearningModelSessionFactory?>
  }
}
