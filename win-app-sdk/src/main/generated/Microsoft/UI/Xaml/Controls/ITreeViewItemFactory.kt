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

@ABIMarker(ITreeViewItemFactory.ABI::class)
@Signature("{878fd918-e77e-5be8-8c8a-b79b27b08d9b}")
@Guid("878fd918e77e5be88c8ab79b27b08d9b")
@WinRTInterface("878fd918e77e5be88c8ab79b27b08d9b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITreeViewItemFactory.ByReference::class)
public interface ITreeViewItemFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): TreeViewItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITreeViewItemFactory> {
    public override fun getValue() = ABI.makeITreeViewItemFactory(pointer.getPointer(0))

    public fun setValue(value: ITreeViewItemFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITreeViewItemFactory {
    public val __1274965523_Ptr: Pointer?

    public val _1274965523_VtblPtr: Pointer?
      get() = __1274965523_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        TreeViewItem? {
      val fnPtr = _1274965523_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TreeViewItem>()
      val hr = fn.invokeHR(arrayOf(__1274965523_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TreeViewItem>(result.getValue())
      return resultValue
    }
  }

  public class ITreeViewItemFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1274965523_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITreeViewItemFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("878fd918e77e5be88c8ab79b27b08d9b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITreeViewItemFactory(ptr: Pointer?): WithDefault = ITreeViewItemFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITreeViewItemFactory {
      val address = segment.toRawLongValue()
      return makeITreeViewItemFactory(Pointer(address))
    }

    public override fun toNative(obj: ITreeViewItemFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1274965523_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITreeViewItemFactory): Array<ITreeViewItemFactory?> =
        (elements as
        Array<ITreeViewItemFactory?>).castToImpl<ITreeViewItemFactory,ITreeViewItemFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITreeViewItemFactory?> =
        arrayOfNulls<ITreeViewItemFactory_Impl>(size) as Array<ITreeViewItemFactory?>
  }
}
