package Windows.UI.Xaml.Controls

import Windows.Foundation.Uri
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

@ABIMarker(IHyperlinkButton.ABI::class)
@Signature("{ccebaca3-3b5c-4f4c-9bfd-86887bc79772}")
@Guid("ccebaca33b5c4f4c9bfd86887bc79772")
@WinRTInterface("ccebaca33b5c4f4c9bfd86887bc79772")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHyperlinkButton.ByReference::class)
public interface IHyperlinkButton : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NavigateUri(): Uri?

  @InterfaceMethod(1)
  public fun put_NavigateUri(value: Uri?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHyperlinkButton> {
    public override fun getValue() = ABI.makeIHyperlinkButton(pointer.getPointer(0))

    public fun setValue(value: IHyperlinkButton_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHyperlinkButton {
    public val __1023742052_Ptr: Pointer?

    public val _1023742052_VtblPtr: Pointer?
      get() = __1023742052_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NavigateUri(): Uri? {
      val fnPtr = _1023742052_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1023742052_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_NavigateUri(value: Uri?): Unit {
      val fnPtr = _1023742052_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1023742052_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHyperlinkButton_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1023742052_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHyperlinkButton, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ccebaca33b5c4f4c9bfd86887bc79772")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHyperlinkButton(ptr: Pointer?): WithDefault = IHyperlinkButton_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHyperlinkButton {
      val address = segment.toRawLongValue()
      return makeIHyperlinkButton(Pointer(address))
    }

    public override fun toNative(obj: IHyperlinkButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1023742052_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHyperlinkButton): Array<IHyperlinkButton?> = (elements as
        Array<IHyperlinkButton?>).castToImpl<IHyperlinkButton,IHyperlinkButton_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHyperlinkButton?> =
        arrayOfNulls<IHyperlinkButton_Impl>(size) as Array<IHyperlinkButton?>
  }
}
