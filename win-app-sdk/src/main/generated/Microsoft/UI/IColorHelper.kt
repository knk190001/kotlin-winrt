package Microsoft.UI

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

@ABIMarker(IColorHelper.ABI::class)
@Signature("{3adddccd-3949-585b-a566-ccb8350dd221}")
@Guid("3adddccd3949585ba566ccb8350dd221")
@WinRTInterface("3adddccd3949585ba566ccb8350dd221")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IColorHelper.ByReference::class)
public interface IColorHelper : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IColorHelper> {
    public override fun getValue() = ABI.makeIColorHelper(pointer.getPointer(0))

    public fun setValue(value: IColorHelper_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IColorHelper {
    public val __668058268_Ptr: Pointer?

    public val _668058268_VtblPtr: Pointer?
      get() = __668058268_Ptr?.getPointer(0)
  }

  public class IColorHelper_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __668058268_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IColorHelper, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3adddccd3949585ba566ccb8350dd221")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIColorHelper(ptr: Pointer?): WithDefault = IColorHelper_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IColorHelper {
      val address = segment.toRawLongValue()
      return makeIColorHelper(Pointer(address))
    }

    public override fun toNative(obj: IColorHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__668058268_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IColorHelper): Array<IColorHelper?> = (elements as
        Array<IColorHelper?>).castToImpl<IColorHelper,IColorHelper_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IColorHelper?> =
        arrayOfNulls<IColorHelper_Impl>(size) as Array<IColorHelper?>
  }
}
