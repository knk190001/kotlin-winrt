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

@ABIMarker(ITreeViewFactory.ABI::class)
@Signature("{cc5267c3-6c69-49ce-b445-753acee7948b}")
@Guid("cc5267c36c6949ceb445753acee7948b")
@WinRTInterface("cc5267c36c6949ceb445753acee7948b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITreeViewFactory.ByReference::class)
public interface ITreeViewFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): TreeView?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITreeViewFactory> {
    public override fun getValue() = ABI.makeITreeViewFactory(pointer.getPointer(0))

    public fun setValue(value: ITreeViewFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITreeViewFactory {
    public val __1261242507_Ptr: Pointer?

    public val _1261242507_VtblPtr: Pointer?
      get() = __1261242507_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        TreeView? {
      val fnPtr = _1261242507_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TreeView>()
      val hr = fn.invokeHR(arrayOf(__1261242507_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TreeView>(result.getValue())
      return resultValue
    }
  }

  public class ITreeViewFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1261242507_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITreeViewFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cc5267c36c6949ceb445753acee7948b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITreeViewFactory(ptr: Pointer?): WithDefault = ITreeViewFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITreeViewFactory {
      val address = segment.toRawLongValue()
      return makeITreeViewFactory(Pointer(address))
    }

    public override fun toNative(obj: ITreeViewFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1261242507_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITreeViewFactory): Array<ITreeViewFactory?> = (elements as
        Array<ITreeViewFactory?>).castToImpl<ITreeViewFactory,ITreeViewFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITreeViewFactory?> =
        arrayOfNulls<ITreeViewFactory_Impl>(size) as Array<ITreeViewFactory?>
  }
}
