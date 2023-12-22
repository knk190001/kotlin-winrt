package Windows.UI.Xaml

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

@ABIMarker(ICornerRadiusHelper.ABI::class)
@Signature("{fd7be182-1cdb-4288-b8c8-85ee79297bfc}")
@Guid("fd7be1821cdb4288b8c885ee79297bfc")
@WinRTInterface("fd7be1821cdb4288b8c885ee79297bfc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICornerRadiusHelper.ByReference::class)
public interface ICornerRadiusHelper : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICornerRadiusHelper> {
    public override fun getValue() = ABI.makeICornerRadiusHelper(pointer.getPointer(0))

    public fun setValue(value: ICornerRadiusHelper_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICornerRadiusHelper {
    public val __2105100377_Ptr: Pointer?

    public val _2105100377_VtblPtr: Pointer?
      get() = __2105100377_Ptr?.getPointer(0)
  }

  public class ICornerRadiusHelper_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2105100377_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICornerRadiusHelper, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fd7be1821cdb4288b8c885ee79297bfc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICornerRadiusHelper(ptr: Pointer?): WithDefault = ICornerRadiusHelper_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICornerRadiusHelper {
      val address = segment.toRawLongValue()
      return makeICornerRadiusHelper(Pointer(address))
    }

    public override fun toNative(obj: ICornerRadiusHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2105100377_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICornerRadiusHelper): Array<ICornerRadiusHelper?> =
        (elements as
        Array<ICornerRadiusHelper?>).castToImpl<ICornerRadiusHelper,ICornerRadiusHelper_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICornerRadiusHelper?> =
        arrayOfNulls<ICornerRadiusHelper_Impl>(size) as Array<ICornerRadiusHelper?>
  }
}
