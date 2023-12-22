package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IHyperlinkButtonStatics.ABI::class)
@Signature("{fbaeb5c7-cdb7-4263-b7d6-3c0d2904ed98}")
@Guid("fbaeb5c7cdb74263b7d63c0d2904ed98")
@WinRTInterface("fbaeb5c7cdb74263b7d63c0d2904ed98")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHyperlinkButtonStatics.ByReference::class)
public interface IHyperlinkButtonStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NavigateUriProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHyperlinkButtonStatics> {
    public override fun getValue() = ABI.makeIHyperlinkButtonStatics(pointer.getPointer(0))

    public fun setValue(value: IHyperlinkButtonStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHyperlinkButtonStatics {
    public val __1208361097_Ptr: Pointer?

    public val _1208361097_VtblPtr: Pointer?
      get() = __1208361097_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NavigateUriProperty(): DependencyProperty? {
      val fnPtr = _1208361097_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1208361097_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IHyperlinkButtonStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1208361097_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHyperlinkButtonStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fbaeb5c7cdb74263b7d63c0d2904ed98")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHyperlinkButtonStatics(ptr: Pointer?): WithDefault =
        IHyperlinkButtonStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHyperlinkButtonStatics {
      val address = segment.toRawLongValue()
      return makeIHyperlinkButtonStatics(Pointer(address))
    }

    public override fun toNative(obj: IHyperlinkButtonStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1208361097_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHyperlinkButtonStatics): Array<IHyperlinkButtonStatics?>
        = (elements as
        Array<IHyperlinkButtonStatics?>).castToImpl<IHyperlinkButtonStatics,IHyperlinkButtonStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHyperlinkButtonStatics?> =
        arrayOfNulls<IHyperlinkButtonStatics_Impl>(size) as Array<IHyperlinkButtonStatics?>
  }
}
