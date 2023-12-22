package Windows.UI.Xaml.Controls

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

@ABIMarker(ITreeViewExpandingEventArgs.ABI::class)
@Signature("{c5e1fa63-4154-49d2-a21f-c34176605e3a}")
@Guid("c5e1fa63415449d2a21fc34176605e3a")
@WinRTInterface("c5e1fa63415449d2a21fc34176605e3a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITreeViewExpandingEventArgs.ByReference::class)
public interface ITreeViewExpandingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Node(): TreeViewNode?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITreeViewExpandingEventArgs> {
    public override fun getValue() = ABI.makeITreeViewExpandingEventArgs(pointer.getPointer(0))

    public fun setValue(value: ITreeViewExpandingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITreeViewExpandingEventArgs {
    public val __974849614_Ptr: Pointer?

    public val _974849614_VtblPtr: Pointer?
      get() = __974849614_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Node(): TreeViewNode? {
      val fnPtr = _974849614_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TreeViewNode>()
      val hr = fn.invokeHR(arrayOf(__974849614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TreeViewNode>(result.getValue())
      return resultValue
    }
  }

  public class ITreeViewExpandingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __974849614_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITreeViewExpandingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c5e1fa63415449d2a21fc34176605e3a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITreeViewExpandingEventArgs(ptr: Pointer?): WithDefault =
        ITreeViewExpandingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITreeViewExpandingEventArgs {
      val address = segment.toRawLongValue()
      return makeITreeViewExpandingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ITreeViewExpandingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__974849614_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITreeViewExpandingEventArgs):
        Array<ITreeViewExpandingEventArgs?> = (elements as
        Array<ITreeViewExpandingEventArgs?>).castToImpl<ITreeViewExpandingEventArgs,ITreeViewExpandingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITreeViewExpandingEventArgs?> =
        arrayOfNulls<ITreeViewExpandingEventArgs_Impl>(size) as Array<ITreeViewExpandingEventArgs?>
  }
}
