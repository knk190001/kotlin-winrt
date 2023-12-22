package Windows.UI.Composition

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILinearEasingFunction.ABI::class)
@Signature("{9400975a-c7a6-46b3-acf7-1a268a0a117d}")
@Guid("9400975ac7a646b3acf71a268a0a117d")
@WinRTInterface("9400975ac7a646b3acf71a268a0a117d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILinearEasingFunction.ByReference::class)
public interface ILinearEasingFunction : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILinearEasingFunction> {
    public override fun getValue() = ABI.makeILinearEasingFunction(pointer.getPointer(0))

    public fun setValue(value: ILinearEasingFunction_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILinearEasingFunction {
    public val __635008342_Ptr: Pointer?

    public val _635008342_VtblPtr: Pointer?
      get() = __635008342_Ptr?.getPointer(0)
  }

  public class ILinearEasingFunction_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __635008342_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILinearEasingFunction, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9400975ac7a646b3acf71a268a0a117d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILinearEasingFunction(ptr: Pointer?): WithDefault =
        ILinearEasingFunction_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILinearEasingFunction {
      val address = segment.toRawLongValue()
      return makeILinearEasingFunction(Pointer(address))
    }

    public override fun toNative(obj: ILinearEasingFunction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__635008342_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILinearEasingFunction): Array<ILinearEasingFunction?> =
        (elements as
        Array<ILinearEasingFunction?>).castToImpl<ILinearEasingFunction,ILinearEasingFunction_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILinearEasingFunction?> =
        arrayOfNulls<ILinearEasingFunction_Impl>(size) as Array<ILinearEasingFunction?>
  }
}
