package Windows.UI.WebUI.Core

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWebUICommandBarElement.ABI::class)
@Signature("{c9069ec2-284a-4633-8aad-637a27e282c3}")
@Guid("c9069ec2284a46338aad637a27e282c3")
@WinRTInterface("c9069ec2284a46338aad637a27e282c3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebUICommandBarElement.ByReference::class)
public interface IWebUICommandBarElement : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebUICommandBarElement> {
    public override fun getValue() = ABI.makeIWebUICommandBarElement(pointer.getPointer(0))

    public fun setValue(value: IWebUICommandBarElement_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebUICommandBarElement {
    public val __357838273_Ptr: Pointer?

    public val _357838273_VtblPtr: Pointer?
      get() = __357838273_Ptr?.getPointer(0)
  }

  public class IWebUICommandBarElement_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __357838273_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebUICommandBarElement, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c9069ec2284a46338aad637a27e282c3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebUICommandBarElement(ptr: Pointer?): WithDefault =
        IWebUICommandBarElement_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebUICommandBarElement {
      val address = segment.toRawLongValue()
      return makeIWebUICommandBarElement(Pointer(address))
    }

    public override fun toNative(obj: IWebUICommandBarElement): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__357838273_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebUICommandBarElement): Array<IWebUICommandBarElement?>
        = (elements as
        Array<IWebUICommandBarElement?>).castToImpl<IWebUICommandBarElement,IWebUICommandBarElement_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebUICommandBarElement?> =
        arrayOfNulls<IWebUICommandBarElement_Impl>(size) as Array<IWebUICommandBarElement?>
  }
}
