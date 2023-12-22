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

@ABIMarker(IWebViewStatics3.ABI::class)
@Signature("{129bef8a-4509-4374-b0d1-a7104d0c3a2f}")
@Guid("129bef8a45094374b0d1a7104d0c3a2f")
@WinRTInterface("129bef8a45094374b0d1a7104d0c3a2f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewStatics3.ByReference::class)
public interface IWebViewStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContainsFullScreenElementProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewStatics3> {
    public override fun getValue() = ABI.makeIWebViewStatics3(pointer.getPointer(0))

    public fun setValue(value: IWebViewStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewStatics3 {
    public val __818695339_Ptr: Pointer?

    public val _818695339_VtblPtr: Pointer?
      get() = __818695339_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContainsFullScreenElementProperty(): DependencyProperty? {
      val fnPtr = _818695339_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__818695339_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IWebViewStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __818695339_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("129bef8a45094374b0d1a7104d0c3a2f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewStatics3(ptr: Pointer?): WithDefault = IWebViewStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebViewStatics3 {
      val address = segment.toRawLongValue()
      return makeIWebViewStatics3(Pointer(address))
    }

    public override fun toNative(obj: IWebViewStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__818695339_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewStatics3): Array<IWebViewStatics3?> = (elements as
        Array<IWebViewStatics3?>).castToImpl<IWebViewStatics3,IWebViewStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebViewStatics3?> =
        arrayOfNulls<IWebViewStatics3_Impl>(size) as Array<IWebViewStatics3?>
  }
}
