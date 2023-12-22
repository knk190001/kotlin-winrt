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

@ABIMarker(IHyperlinkStatics5.ABI::class)
@Signature("{59308cea-1e49-4921-bd88-a2878d07e30e}")
@Guid("59308cea1e494921bd88a2878d07e30e")
@WinRTInterface("59308cea1e494921bd88a2878d07e30e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHyperlinkStatics5.ByReference::class)
public interface IHyperlinkStatics5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsTabStopProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_TabIndexProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHyperlinkStatics5> {
    public override fun getValue() = ABI.makeIHyperlinkStatics5(pointer.getPointer(0))

    public fun setValue(value: IHyperlinkStatics5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHyperlinkStatics5 {
    public val __1118548370_Ptr: Pointer?

    public val _1118548370_VtblPtr: Pointer?
      get() = __1118548370_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsTabStopProperty(): DependencyProperty? {
      val fnPtr = _1118548370_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1118548370_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TabIndexProperty(): DependencyProperty? {
      val fnPtr = _1118548370_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1118548370_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IHyperlinkStatics5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1118548370_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHyperlinkStatics5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("59308cea1e494921bd88a2878d07e30e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHyperlinkStatics5(ptr: Pointer?): WithDefault = IHyperlinkStatics5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHyperlinkStatics5 {
      val address = segment.toRawLongValue()
      return makeIHyperlinkStatics5(Pointer(address))
    }

    public override fun toNative(obj: IHyperlinkStatics5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1118548370_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHyperlinkStatics5): Array<IHyperlinkStatics5?> =
        (elements as
        Array<IHyperlinkStatics5?>).castToImpl<IHyperlinkStatics5,IHyperlinkStatics5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHyperlinkStatics5?> =
        arrayOfNulls<IHyperlinkStatics5_Impl>(size) as Array<IHyperlinkStatics5?>
  }
}
