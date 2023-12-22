package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.UIElement
import Windows.Foundation.Collections.IVector
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

@ABIMarker(IScrollingAnchorRequestedEventArgs.ABI::class)
@Signature("{6a46cb4b-ab26-55b2-aa76-9b337a4f8e8e}")
@Guid("6a46cb4bab2655b2aa769b337a4f8e8e")
@WinRTInterface("6a46cb4bab2655b2aa769b337a4f8e8e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollingAnchorRequestedEventArgs.ByReference::class)
public interface IScrollingAnchorRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AnchorCandidates(): IVector<UIElement?>?

  @InterfaceMethod(1)
  public fun get_AnchorElement(): UIElement?

  @InterfaceMethod(2)
  public fun put_AnchorElement(value: UIElement?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollingAnchorRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIScrollingAnchorRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IScrollingAnchorRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollingAnchorRequestedEventArgs {
    public val __1182349452_Ptr: Pointer?

    public val _1182349452_VtblPtr: Pointer?
      get() = __1182349452_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AnchorCandidates(): IVector<UIElement?>? {
      val fnPtr = _1182349452_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<UIElement?>>()
      val hr = fn.invokeHR(arrayOf(__1182349452_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<UIElement?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AnchorElement(): UIElement? {
      val fnPtr = _1182349452_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__1182349452_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_AnchorElement(value: UIElement?): Unit {
      val fnPtr = _1182349452_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1182349452_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IScrollingAnchorRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1182349452_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollingAnchorRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6a46cb4bab2655b2aa769b337a4f8e8e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollingAnchorRequestedEventArgs(ptr: Pointer?): WithDefault =
        IScrollingAnchorRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollingAnchorRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIScrollingAnchorRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IScrollingAnchorRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1182349452_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollingAnchorRequestedEventArgs):
        Array<IScrollingAnchorRequestedEventArgs?> = (elements as
        Array<IScrollingAnchorRequestedEventArgs?>).castToImpl<IScrollingAnchorRequestedEventArgs,IScrollingAnchorRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollingAnchorRequestedEventArgs?> =
        arrayOfNulls<IScrollingAnchorRequestedEventArgs_Impl>(size) as
        Array<IScrollingAnchorRequestedEventArgs?>
  }
}
