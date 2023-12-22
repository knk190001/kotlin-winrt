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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILearningModelSessionOptions2.ABI::class)
@Signature("{6fcd1dc4-175f-5bd2-8de5-2f2006a25adf}")
@Guid("6fcd1dc4175f5bd28de52f2006a25adf")
@WinRTInterface("6fcd1dc4175f5bd28de52f2006a25adf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILearningModelSessionOptions2.ByReference::class)
public interface ILearningModelSessionOptions2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CloseModelOnSessionCreation(): Boolean

  @InterfaceMethod(1)
  public fun put_CloseModelOnSessionCreation(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILearningModelSessionOptions2> {
    public override fun getValue() = ABI.makeILearningModelSessionOptions2(pointer.getPointer(0))

    public fun setValue(value: ILearningModelSessionOptions2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILearningModelSessionOptions2 {
    public val __438447874_Ptr: Pointer?

    public val _438447874_VtblPtr: Pointer?
      get() = __438447874_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CloseModelOnSessionCreation(): Boolean {
      val fnPtr = _438447874_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__438447874_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_CloseModelOnSessionCreation(value: Boolean): Unit {
      val fnPtr = _438447874_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__438447874_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILearningModelSessionOptions2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __438447874_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILearningModelSessionOptions2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6fcd1dc4175f5bd28de52f2006a25adf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILearningModelSessionOptions2(ptr: Pointer?): WithDefault =
        ILearningModelSessionOptions2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILearningModelSessionOptions2 {
      val address = segment.toRawLongValue()
      return makeILearningModelSessionOptions2(Pointer(address))
    }

    public override fun toNative(obj: ILearningModelSessionOptions2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__438447874_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILearningModelSessionOptions2):
        Array<ILearningModelSessionOptions2?> = (elements as
        Array<ILearningModelSessionOptions2?>).castToImpl<ILearningModelSessionOptions2,ILearningModelSessionOptions2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILearningModelSessionOptions2?> =
        arrayOfNulls<ILearningModelSessionOptions2_Impl>(size) as
        Array<ILearningModelSessionOptions2?>
  }
}
