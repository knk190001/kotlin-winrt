package Windows.UI.Xaml.Controls

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

@ABIMarker(ITreeViewNodeFactory.ABI::class)
@Signature("{6ec62d90-aa19-414a-8a45-0a5589a836f7}")
@Guid("6ec62d90aa19414a8a450a5589a836f7")
@WinRTInterface("6ec62d90aa19414a8a450a5589a836f7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITreeViewNodeFactory.ByReference::class)
public interface ITreeViewNodeFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): TreeViewNode?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITreeViewNodeFactory> {
    public override fun getValue() = ABI.makeITreeViewNodeFactory(pointer.getPointer(0))

    public fun setValue(value: ITreeViewNodeFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITreeViewNodeFactory {
    public val __1332405161_Ptr: Pointer?

    public val _1332405161_VtblPtr: Pointer?
      get() = __1332405161_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        TreeViewNode? {
      val fnPtr = _1332405161_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TreeViewNode>()
      val hr = fn.invokeHR(arrayOf(__1332405161_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TreeViewNode>(result.getValue())
      return resultValue
    }
  }

  public class ITreeViewNodeFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1332405161_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITreeViewNodeFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6ec62d90aa19414a8a450a5589a836f7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITreeViewNodeFactory(ptr: Pointer?): WithDefault = ITreeViewNodeFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITreeViewNodeFactory {
      val address = segment.toRawLongValue()
      return makeITreeViewNodeFactory(Pointer(address))
    }

    public override fun toNative(obj: ITreeViewNodeFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1332405161_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITreeViewNodeFactory): Array<ITreeViewNodeFactory?> =
        (elements as
        Array<ITreeViewNodeFactory?>).castToImpl<ITreeViewNodeFactory,ITreeViewNodeFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITreeViewNodeFactory?> =
        arrayOfNulls<ITreeViewNodeFactory_Impl>(size) as Array<ITreeViewNodeFactory?>
  }
}
