package Microsoft.UI.Xaml

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

@ABIMarker(IPointHelper.ABI::class)
@Signature("{06fcc7a4-6099-5f2e-83a5-f3be0e2c90aa}")
@Guid("06fcc7a460995f2e83a5f3be0e2c90aa")
@WinRTInterface("06fcc7a460995f2e83a5f3be0e2c90aa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPointHelper.ByReference::class)
public interface IPointHelper : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPointHelper> {
    public override fun getValue() = ABI.makeIPointHelper(pointer.getPointer(0))

    public fun setValue(value: IPointHelper_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPointHelper {
    public val __1776153929_Ptr: Pointer?

    public val _1776153929_VtblPtr: Pointer?
      get() = __1776153929_Ptr?.getPointer(0)
  }

  public class IPointHelper_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1776153929_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPointHelper, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("06fcc7a460995f2e83a5f3be0e2c90aa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPointHelper(ptr: Pointer?): WithDefault = IPointHelper_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPointHelper {
      val address = segment.toRawLongValue()
      return makeIPointHelper(Pointer(address))
    }

    public override fun toNative(obj: IPointHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1776153929_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPointHelper): Array<IPointHelper?> = (elements as
        Array<IPointHelper?>).castToImpl<IPointHelper,IPointHelper_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPointHelper?> =
        arrayOfNulls<IPointHelper_Impl>(size) as Array<IPointHelper?>
  }
}
