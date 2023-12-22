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

@ABIMarker(IHyperlinkStatics2.ABI::class)
@Signature("{5028d8b7-7adf-43ee-a4ae-9c925f755716}")
@Guid("5028d8b77adf43eea4ae9c925f755716")
@WinRTInterface("5028d8b77adf43eea4ae9c925f755716")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHyperlinkStatics2.ByReference::class)
public interface IHyperlinkStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UnderlineStyleProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHyperlinkStatics2> {
    public override fun getValue() = ABI.makeIHyperlinkStatics2(pointer.getPointer(0))

    public fun setValue(value: IHyperlinkStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHyperlinkStatics2 {
    public val __1118548373_Ptr: Pointer?

    public val _1118548373_VtblPtr: Pointer?
      get() = __1118548373_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UnderlineStyleProperty(): DependencyProperty? {
      val fnPtr = _1118548373_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1118548373_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IHyperlinkStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1118548373_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHyperlinkStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5028d8b77adf43eea4ae9c925f755716")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHyperlinkStatics2(ptr: Pointer?): WithDefault = IHyperlinkStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHyperlinkStatics2 {
      val address = segment.toRawLongValue()
      return makeIHyperlinkStatics2(Pointer(address))
    }

    public override fun toNative(obj: IHyperlinkStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1118548373_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHyperlinkStatics2): Array<IHyperlinkStatics2?> =
        (elements as
        Array<IHyperlinkStatics2?>).castToImpl<IHyperlinkStatics2,IHyperlinkStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHyperlinkStatics2?> =
        arrayOfNulls<IHyperlinkStatics2_Impl>(size) as Array<IHyperlinkStatics2?>
  }
}
