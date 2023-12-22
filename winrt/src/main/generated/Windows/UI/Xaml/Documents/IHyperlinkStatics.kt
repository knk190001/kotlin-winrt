package Windows.UI.Xaml.Documents

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

@ABIMarker(IHyperlinkStatics.ABI::class)
@Signature("{3a44d3d4-fd41-41db-8c72-3b790acd9fd3}")
@Guid("3a44d3d4fd4141db8c723b790acd9fd3")
@WinRTInterface("3a44d3d4fd4141db8c723b790acd9fd3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHyperlinkStatics.ByReference::class)
public interface IHyperlinkStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NavigateUriProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHyperlinkStatics> {
    public override fun getValue() = ABI.makeIHyperlinkStatics(pointer.getPointer(0))

    public fun setValue(value: IHyperlinkStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHyperlinkStatics {
    public val __1975744857_Ptr: Pointer?

    public val _1975744857_VtblPtr: Pointer?
      get() = __1975744857_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NavigateUriProperty(): DependencyProperty? {
      val fnPtr = _1975744857_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1975744857_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IHyperlinkStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1975744857_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHyperlinkStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3a44d3d4fd4141db8c723b790acd9fd3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHyperlinkStatics(ptr: Pointer?): WithDefault = IHyperlinkStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHyperlinkStatics {
      val address = segment.toRawLongValue()
      return makeIHyperlinkStatics(Pointer(address))
    }

    public override fun toNative(obj: IHyperlinkStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1975744857_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHyperlinkStatics): Array<IHyperlinkStatics?> = (elements
        as Array<IHyperlinkStatics?>).castToImpl<IHyperlinkStatics,IHyperlinkStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHyperlinkStatics?> =
        arrayOfNulls<IHyperlinkStatics_Impl>(size) as Array<IHyperlinkStatics?>
  }
}
