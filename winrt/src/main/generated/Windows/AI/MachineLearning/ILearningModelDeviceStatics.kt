package Windows.AI.MachineLearning

import Windows.Graphics.DirectX.Direct3D11.IDirect3DDevice
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

@ABIMarker(ILearningModelDeviceStatics.ABI::class)
@Signature("{49f32107-a8bf-42bb-92c7-10b12dc5d21f}")
@Guid("49f32107a8bf42bb92c710b12dc5d21f")
@WinRTInterface("49f32107a8bf42bb92c710b12dc5d21f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILearningModelDeviceStatics.ByReference::class)
public interface ILearningModelDeviceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromDirect3D11Device(device: IDirect3DDevice?): LearningModelDevice?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILearningModelDeviceStatics> {
    public override fun getValue() = ABI.makeILearningModelDeviceStatics(pointer.getPointer(0))

    public fun setValue(value: ILearningModelDeviceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILearningModelDeviceStatics {
    public val __1034062979_Ptr: Pointer?

    public val _1034062979_VtblPtr: Pointer?
      get() = __1034062979_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromDirect3D11Device(device: IDirect3DDevice?): LearningModelDevice? {
      val fnPtr = _1034062979_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LearningModelDevice>()
      val hr = fn.invokeHR(arrayOf(__1034062979_Ptr, marshalToNative(device), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LearningModelDevice>(result.getValue())
      return resultValue
    }
  }

  public class ILearningModelDeviceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1034062979_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILearningModelDeviceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("49f32107a8bf42bb92c710b12dc5d21f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILearningModelDeviceStatics(ptr: Pointer?): WithDefault =
        ILearningModelDeviceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILearningModelDeviceStatics {
      val address = segment.toRawLongValue()
      return makeILearningModelDeviceStatics(Pointer(address))
    }

    public override fun toNative(obj: ILearningModelDeviceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1034062979_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILearningModelDeviceStatics):
        Array<ILearningModelDeviceStatics?> = (elements as
        Array<ILearningModelDeviceStatics?>).castToImpl<ILearningModelDeviceStatics,ILearningModelDeviceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILearningModelDeviceStatics?> =
        arrayOfNulls<ILearningModelDeviceStatics_Impl>(size) as Array<ILearningModelDeviceStatics?>
  }
}
