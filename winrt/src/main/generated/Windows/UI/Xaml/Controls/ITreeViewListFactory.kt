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

@ABIMarker(ITreeViewListFactory.ABI::class)
@Signature("{288f6232-41d2-46f7-b1f5-691c625264b7}")
@Guid("288f623241d246f7b1f5691c625264b7")
@WinRTInterface("288f623241d246f7b1f5691c625264b7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITreeViewListFactory.ByReference::class)
public interface ITreeViewListFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): TreeViewList?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITreeViewListFactory> {
    public override fun getValue() = ABI.makeITreeViewListFactory(pointer.getPointer(0))

    public fun setValue(value: ITreeViewListFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITreeViewListFactory {
    public val __840759693_Ptr: Pointer?

    public val _840759693_VtblPtr: Pointer?
      get() = __840759693_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        TreeViewList? {
      val fnPtr = _840759693_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TreeViewList>()
      val hr = fn.invokeHR(arrayOf(__840759693_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TreeViewList>(result.getValue())
      return resultValue
    }
  }

  public class ITreeViewListFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __840759693_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITreeViewListFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("288f623241d246f7b1f5691c625264b7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITreeViewListFactory(ptr: Pointer?): WithDefault = ITreeViewListFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITreeViewListFactory {
      val address = segment.toRawLongValue()
      return makeITreeViewListFactory(Pointer(address))
    }

    public override fun toNative(obj: ITreeViewListFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__840759693_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITreeViewListFactory): Array<ITreeViewListFactory?> =
        (elements as
        Array<ITreeViewListFactory?>).castToImpl<ITreeViewListFactory,ITreeViewListFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITreeViewListFactory?> =
        arrayOfNulls<ITreeViewListFactory_Impl>(size) as Array<ITreeViewListFactory?>
  }
}
