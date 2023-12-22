package Microsoft.UI.Xaml.Media

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

@ABIMarker(IMatrixHelper.ABI::class)
@Signature("{9571fd76-cc5c-534d-ac85-cb4ac870c912}")
@Guid("9571fd76cc5c534dac85cb4ac870c912")
@WinRTInterface("9571fd76cc5c534dac85cb4ac870c912")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMatrixHelper.ByReference::class)
public interface IMatrixHelper : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMatrixHelper>
      {
    public override fun getValue() = ABI.makeIMatrixHelper(pointer.getPointer(0))

    public fun setValue(value: IMatrixHelper_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMatrixHelper {
    public val __1773417856_Ptr: Pointer?

    public val _1773417856_VtblPtr: Pointer?
      get() = __1773417856_Ptr?.getPointer(0)
  }

  public class IMatrixHelper_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1773417856_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMatrixHelper, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9571fd76cc5c534dac85cb4ac870c912")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMatrixHelper(ptr: Pointer?): WithDefault = IMatrixHelper_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMatrixHelper {
      val address = segment.toRawLongValue()
      return makeIMatrixHelper(Pointer(address))
    }

    public override fun toNative(obj: IMatrixHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1773417856_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMatrixHelper): Array<IMatrixHelper?> = (elements as
        Array<IMatrixHelper?>).castToImpl<IMatrixHelper,IMatrixHelper_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMatrixHelper?> =
        arrayOfNulls<IMatrixHelper_Impl>(size) as Array<IMatrixHelper?>
  }
}
