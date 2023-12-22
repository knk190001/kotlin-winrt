package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IScrollAnchorProvider.ABI::class)
@Signature("{885df41f-f240-5b7b-a703-bfaf39c6a2cd}")
@Guid("885df41ff2405b7ba703bfaf39c6a2cd")
@WinRTInterface("885df41ff2405b7ba703bfaf39c6a2cd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollAnchorProvider.ByReference::class)
public interface IScrollAnchorProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CurrentAnchor(): UIElement?

  @InterfaceMethod(1)
  public fun RegisterAnchorCandidate(element: UIElement?): Unit

  @InterfaceMethod(2)
  public fun UnregisterAnchorCandidate(element: UIElement?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollAnchorProvider> {
    public override fun getValue() = ABI.makeIScrollAnchorProvider(pointer.getPointer(0))

    public fun setValue(value: IScrollAnchorProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollAnchorProvider {
    public val __673059898_Ptr: Pointer?

    public val _673059898_VtblPtr: Pointer?
      get() = __673059898_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CurrentAnchor(): UIElement? {
      val fnPtr = _673059898_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__673059898_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RegisterAnchorCandidate(element: UIElement?): Unit {
      val fnPtr = _673059898_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__673059898_Ptr, marshalToNative(element),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun UnregisterAnchorCandidate(element: UIElement?): Unit {
      val fnPtr = _673059898_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__673059898_Ptr, marshalToNative(element),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IScrollAnchorProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __673059898_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollAnchorProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("885df41ff2405b7ba703bfaf39c6a2cd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollAnchorProvider(ptr: Pointer?): WithDefault =
        IScrollAnchorProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollAnchorProvider {
      val address = segment.toRawLongValue()
      return makeIScrollAnchorProvider(Pointer(address))
    }

    public override fun toNative(obj: IScrollAnchorProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__673059898_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollAnchorProvider): Array<IScrollAnchorProvider?> =
        (elements as
        Array<IScrollAnchorProvider?>).castToImpl<IScrollAnchorProvider,IScrollAnchorProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollAnchorProvider?> =
        arrayOfNulls<IScrollAnchorProvider_Impl>(size) as Array<IScrollAnchorProvider?>
  }
}
