package Microsoft.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(ITreeViewCollapsedEventArgs2.ABI::class)
@Signature("{77804a23-9feb-5c57-9c95-4dd984267217}")
@Guid("77804a239feb5c579c954dd984267217")
@WinRTInterface("77804a239feb5c579c954dd984267217")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITreeViewCollapsedEventArgs2.ByReference::class)
public interface ITreeViewCollapsedEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Item(): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITreeViewCollapsedEventArgs2> {
    public override fun getValue() = ABI.makeITreeViewCollapsedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: ITreeViewCollapsedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITreeViewCollapsedEventArgs2 {
    public val __1800888232_Ptr: Pointer?

    public val _1800888232_VtblPtr: Pointer?
      get() = __1800888232_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Item(): IUnknown? {
      val fnPtr = _1800888232_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1800888232_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class ITreeViewCollapsedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1800888232_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITreeViewCollapsedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("77804a239feb5c579c954dd984267217")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITreeViewCollapsedEventArgs2(ptr: Pointer?): WithDefault =
        ITreeViewCollapsedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITreeViewCollapsedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeITreeViewCollapsedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: ITreeViewCollapsedEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1800888232_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITreeViewCollapsedEventArgs2):
        Array<ITreeViewCollapsedEventArgs2?> = (elements as
        Array<ITreeViewCollapsedEventArgs2?>).castToImpl<ITreeViewCollapsedEventArgs2,ITreeViewCollapsedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITreeViewCollapsedEventArgs2?> =
        arrayOfNulls<ITreeViewCollapsedEventArgs2_Impl>(size) as
        Array<ITreeViewCollapsedEventArgs2?>
  }
}
