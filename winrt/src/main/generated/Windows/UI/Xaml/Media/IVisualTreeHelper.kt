package Windows.UI.Xaml.Media

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

@ABIMarker(IVisualTreeHelper.ABI::class)
@Signature("{24b935e3-52c7-4141-8bac-a73d06130569}")
@Guid("24b935e352c741418baca73d06130569")
@WinRTInterface("24b935e352c741418baca73d06130569")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVisualTreeHelper.ByReference::class)
public interface IVisualTreeHelper : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVisualTreeHelper> {
    public override fun getValue() = ABI.makeIVisualTreeHelper(pointer.getPointer(0))

    public fun setValue(value: IVisualTreeHelper_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVisualTreeHelper {
    public val __304042424_Ptr: Pointer?

    public val _304042424_VtblPtr: Pointer?
      get() = __304042424_Ptr?.getPointer(0)
  }

  public class IVisualTreeHelper_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __304042424_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVisualTreeHelper, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("24b935e352c741418baca73d06130569")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVisualTreeHelper(ptr: Pointer?): WithDefault = IVisualTreeHelper_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVisualTreeHelper {
      val address = segment.toRawLongValue()
      return makeIVisualTreeHelper(Pointer(address))
    }

    public override fun toNative(obj: IVisualTreeHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__304042424_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVisualTreeHelper): Array<IVisualTreeHelper?> = (elements
        as Array<IVisualTreeHelper?>).castToImpl<IVisualTreeHelper,IVisualTreeHelper_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVisualTreeHelper?> =
        arrayOfNulls<IVisualTreeHelper_Impl>(size) as Array<IVisualTreeHelper?>
  }
}
