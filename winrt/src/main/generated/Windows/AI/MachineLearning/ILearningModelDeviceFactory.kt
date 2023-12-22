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

@ABIMarker(ILearningModelDeviceFactory.ABI::class)
@Signature("{9cffd74d-b1e5-4f20-80ad-0a56690db06b}")
@Guid("9cffd74db1e54f2080ad0a56690db06b")
@WinRTInterface("9cffd74db1e54f2080ad0a56690db06b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILearningModelDeviceFactory.ByReference::class)
public interface ILearningModelDeviceFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(deviceKind: LearningModelDeviceKind?): LearningModelDevice?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILearningModelDeviceFactory> {
    public override fun getValue() = ABI.makeILearningModelDeviceFactory(pointer.getPointer(0))

    public fun setValue(value: ILearningModelDeviceFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILearningModelDeviceFactory {
    public val __1839316424_Ptr: Pointer?

    public val _1839316424_VtblPtr: Pointer?
      get() = __1839316424_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(deviceKind: LearningModelDeviceKind?): LearningModelDevice? {
      val fnPtr = _1839316424_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LearningModelDevice>()
      val hr = fn.invokeHR(arrayOf(__1839316424_Ptr, marshalToNative(deviceKind), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LearningModelDevice>(result.getValue())
      return resultValue
    }
  }

  public class ILearningModelDeviceFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1839316424_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILearningModelDeviceFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9cffd74db1e54f2080ad0a56690db06b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILearningModelDeviceFactory(ptr: Pointer?): WithDefault =
        ILearningModelDeviceFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILearningModelDeviceFactory {
      val address = segment.toRawLongValue()
      return makeILearningModelDeviceFactory(Pointer(address))
    }

    public override fun toNative(obj: ILearningModelDeviceFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1839316424_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILearningModelDeviceFactory):
        Array<ILearningModelDeviceFactory?> = (elements as
        Array<ILearningModelDeviceFactory?>).castToImpl<ILearningModelDeviceFactory,ILearningModelDeviceFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILearningModelDeviceFactory?> =
        arrayOfNulls<ILearningModelDeviceFactory_Impl>(size) as Array<ILearningModelDeviceFactory?>
  }
}
