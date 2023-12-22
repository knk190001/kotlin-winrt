package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.UIElement
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

@ABIMarker(IContentControl2.ABI::class)
@Signature("{652c208c-8ccf-4399-bd3e-5a015aa1bc03}")
@Guid("652c208c8ccf4399bd3e5a015aa1bc03")
@WinRTInterface("652c208c8ccf4399bd3e5a015aa1bc03")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentControl2.ByReference::class)
public interface IContentControl2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContentTemplateRoot(): UIElement?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentControl2> {
    public override fun getValue() = ABI.makeIContentControl2(pointer.getPointer(0))

    public fun setValue(value: IContentControl2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentControl2 {
    public val __689815154_Ptr: Pointer?

    public val _689815154_VtblPtr: Pointer?
      get() = __689815154_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContentTemplateRoot(): UIElement? {
      val fnPtr = _689815154_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__689815154_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }
  }

  public class IContentControl2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __689815154_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentControl2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("652c208c8ccf4399bd3e5a015aa1bc03")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentControl2(ptr: Pointer?): WithDefault = IContentControl2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentControl2 {
      val address = segment.toRawLongValue()
      return makeIContentControl2(Pointer(address))
    }

    public override fun toNative(obj: IContentControl2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__689815154_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentControl2): Array<IContentControl2?> = (elements as
        Array<IContentControl2?>).castToImpl<IContentControl2,IContentControl2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentControl2?> =
        arrayOfNulls<IContentControl2_Impl>(size) as Array<IContentControl2?>
  }
}
