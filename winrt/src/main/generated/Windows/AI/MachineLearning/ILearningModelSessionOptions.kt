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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ILearningModelSessionOptions.ABI::class)
@Signature("{b8f63fa1-134d-5133-8cff-3a5c3c263beb}")
@Guid("b8f63fa1134d51338cff3a5c3c263beb")
@WinRTInterface("b8f63fa1134d51338cff3a5c3c263beb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILearningModelSessionOptions.ByReference::class)
public interface ILearningModelSessionOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BatchSizeOverride(): WinDef.UINT

  @InterfaceMethod(1)
  public fun put_BatchSizeOverride(value: WinDef.UINT): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILearningModelSessionOptions> {
    public override fun getValue() = ABI.makeILearningModelSessionOptions(pointer.getPointer(0))

    public fun setValue(value: ILearningModelSessionOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILearningModelSessionOptions {
    public val __1509877172_Ptr: Pointer?

    public val _1509877172_VtblPtr: Pointer?
      get() = __1509877172_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BatchSizeOverride(): WinDef.UINT {
      val fnPtr = _1509877172_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1509877172_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_BatchSizeOverride(value: WinDef.UINT): Unit {
      val fnPtr = _1509877172_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1509877172_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILearningModelSessionOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1509877172_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILearningModelSessionOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b8f63fa1134d51338cff3a5c3c263beb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILearningModelSessionOptions(ptr: Pointer?): WithDefault =
        ILearningModelSessionOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILearningModelSessionOptions {
      val address = segment.toRawLongValue()
      return makeILearningModelSessionOptions(Pointer(address))
    }

    public override fun toNative(obj: ILearningModelSessionOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1509877172_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILearningModelSessionOptions):
        Array<ILearningModelSessionOptions?> = (elements as
        Array<ILearningModelSessionOptions?>).castToImpl<ILearningModelSessionOptions,ILearningModelSessionOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILearningModelSessionOptions?> =
        arrayOfNulls<ILearningModelSessionOptions_Impl>(size) as
        Array<ILearningModelSessionOptions?>
  }
}
