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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILearningModelSessionOptions3.ABI::class)
@Signature("{58e15cee-d8c2-56fc-92e8-76d751081086}")
@Guid("58e15ceed8c256fc92e876d751081086")
@WinRTInterface("58e15ceed8c256fc92e876d751081086")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILearningModelSessionOptions3.ByReference::class)
public interface ILearningModelSessionOptions3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OverrideNamedDimension(name: String?, dimension: WinDef.UINT): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILearningModelSessionOptions3> {
    public override fun getValue() = ABI.makeILearningModelSessionOptions3(pointer.getPointer(0))

    public fun setValue(value: ILearningModelSessionOptions3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILearningModelSessionOptions3 {
    public val __438447873_Ptr: Pointer?

    public val _438447873_VtblPtr: Pointer?
      get() = __438447873_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OverrideNamedDimension(name: String?, dimension: WinDef.UINT): Unit {
      val fnPtr = _438447873_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__438447873_Ptr, marshalToNative(name), dimension,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILearningModelSessionOptions3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __438447873_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILearningModelSessionOptions3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("58e15ceed8c256fc92e876d751081086")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILearningModelSessionOptions3(ptr: Pointer?): WithDefault =
        ILearningModelSessionOptions3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILearningModelSessionOptions3 {
      val address = segment.toRawLongValue()
      return makeILearningModelSessionOptions3(Pointer(address))
    }

    public override fun toNative(obj: ILearningModelSessionOptions3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__438447873_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILearningModelSessionOptions3):
        Array<ILearningModelSessionOptions3?> = (elements as
        Array<ILearningModelSessionOptions3?>).castToImpl<ILearningModelSessionOptions3,ILearningModelSessionOptions3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILearningModelSessionOptions3?> =
        arrayOfNulls<ILearningModelSessionOptions3_Impl>(size) as
        Array<ILearningModelSessionOptions3?>
  }
}
