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

@ABIMarker(IThicknessHelper.ABI::class)
@Signature("{a86bae4b-1e8f-4eeb-9013-0b2838a97b34}")
@Guid("a86bae4b1e8f4eeb90130b2838a97b34")
@WinRTInterface("a86bae4b1e8f4eeb90130b2838a97b34")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IThicknessHelper.ByReference::class)
public interface IThicknessHelper : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IThicknessHelper> {
    public override fun getValue() = ABI.makeIThicknessHelper(pointer.getPointer(0))

    public fun setValue(value: IThicknessHelper_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IThicknessHelper {
    public val __462886832_Ptr: Pointer?

    public val _462886832_VtblPtr: Pointer?
      get() = __462886832_Ptr?.getPointer(0)
  }

  public class IThicknessHelper_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __462886832_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IThicknessHelper, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a86bae4b1e8f4eeb90130b2838a97b34")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIThicknessHelper(ptr: Pointer?): WithDefault = IThicknessHelper_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IThicknessHelper {
      val address = segment.toRawLongValue()
      return makeIThicknessHelper(Pointer(address))
    }

    public override fun toNative(obj: IThicknessHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__462886832_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IThicknessHelper): Array<IThicknessHelper?> = (elements as
        Array<IThicknessHelper?>).castToImpl<IThicknessHelper,IThicknessHelper_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IThicknessHelper?> =
        arrayOfNulls<IThicknessHelper_Impl>(size) as Array<IThicknessHelper?>
  }
}
