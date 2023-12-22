package Microsoft.UI.Xaml.Documents

import Microsoft.UI.Xaml.UIElement
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

@ABIMarker(IInlineUIContainer.ABI::class)
@Signature("{d529bef6-c05a-5bad-85e8-640127cf86f5}")
@Guid("d529bef6c05a5bad85e8640127cf86f5")
@WinRTInterface("d529bef6c05a5bad85e8640127cf86f5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInlineUIContainer.ByReference::class)
public interface IInlineUIContainer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Child(): UIElement?

  @InterfaceMethod(1)
  public fun put_Child(value: UIElement?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInlineUIContainer> {
    public override fun getValue() = ABI.makeIInlineUIContainer(pointer.getPointer(0))

    public fun setValue(value: IInlineUIContainer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInlineUIContainer {
    public val __1808357335_Ptr: Pointer?

    public val _1808357335_VtblPtr: Pointer?
      get() = __1808357335_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Child(): UIElement? {
      val fnPtr = _1808357335_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__1808357335_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Child(value: UIElement?): Unit {
      val fnPtr = _1808357335_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1808357335_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInlineUIContainer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1808357335_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInlineUIContainer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d529bef6c05a5bad85e8640127cf86f5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInlineUIContainer(ptr: Pointer?): WithDefault = IInlineUIContainer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInlineUIContainer {
      val address = segment.toRawLongValue()
      return makeIInlineUIContainer(Pointer(address))
    }

    public override fun toNative(obj: IInlineUIContainer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1808357335_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInlineUIContainer): Array<IInlineUIContainer?> =
        (elements as
        Array<IInlineUIContainer?>).castToImpl<IInlineUIContainer,IInlineUIContainer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInlineUIContainer?> =
        arrayOfNulls<IInlineUIContainer_Impl>(size) as Array<IInlineUIContainer?>
  }
}
