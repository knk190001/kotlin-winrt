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

@ABIMarker(ITreeViewCollapsedEventArgs.ABI::class)
@Signature("{391db3b0-1e58-4539-9e93-387978f46cce}")
@Guid("391db3b01e5845399e93387978f46cce")
@WinRTInterface("391db3b01e5845399e93387978f46cce")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITreeViewCollapsedEventArgs.ByReference::class)
public interface ITreeViewCollapsedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Node(): TreeViewNode?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITreeViewCollapsedEventArgs> {
    public override fun getValue() = ABI.makeITreeViewCollapsedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ITreeViewCollapsedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITreeViewCollapsedEventArgs {
    public val __453998559_Ptr: Pointer?

    public val _453998559_VtblPtr: Pointer?
      get() = __453998559_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Node(): TreeViewNode? {
      val fnPtr = _453998559_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TreeViewNode>()
      val hr = fn.invokeHR(arrayOf(__453998559_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TreeViewNode>(result.getValue())
      return resultValue
    }
  }

  public class ITreeViewCollapsedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __453998559_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITreeViewCollapsedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("391db3b01e5845399e93387978f46cce")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITreeViewCollapsedEventArgs(ptr: Pointer?): WithDefault =
        ITreeViewCollapsedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITreeViewCollapsedEventArgs {
      val address = segment.toRawLongValue()
      return makeITreeViewCollapsedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ITreeViewCollapsedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__453998559_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITreeViewCollapsedEventArgs):
        Array<ITreeViewCollapsedEventArgs?> = (elements as
        Array<ITreeViewCollapsedEventArgs?>).castToImpl<ITreeViewCollapsedEventArgs,ITreeViewCollapsedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITreeViewCollapsedEventArgs?> =
        arrayOfNulls<ITreeViewCollapsedEventArgs_Impl>(size) as Array<ITreeViewCollapsedEventArgs?>
  }
}
