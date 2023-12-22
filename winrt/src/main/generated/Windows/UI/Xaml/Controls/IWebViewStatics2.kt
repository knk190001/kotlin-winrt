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

@ABIMarker(IWebViewStatics2.ABI::class)
@Signature("{322f8780-e812-466b-9e50-8e9fec24018a}")
@Guid("322f8780e812466b9e508e9fec24018a")
@WinRTInterface("322f8780e812466b9e508e9fec24018a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewStatics2.ByReference::class)
public interface IWebViewStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CanGoBackProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_CanGoForwardProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_DocumentTitleProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_DefaultBackgroundColorProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewStatics2> {
    public override fun getValue() = ABI.makeIWebViewStatics2(pointer.getPointer(0))

    public fun setValue(value: IWebViewStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewStatics2 {
    public val __818695338_Ptr: Pointer?

    public val _818695338_VtblPtr: Pointer?
      get() = __818695338_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CanGoBackProperty(): DependencyProperty? {
      val fnPtr = _818695338_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__818695338_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CanGoForwardProperty(): DependencyProperty? {
      val fnPtr = _818695338_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__818695338_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DocumentTitleProperty(): DependencyProperty? {
      val fnPtr = _818695338_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__818695338_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_DefaultBackgroundColorProperty(): DependencyProperty? {
      val fnPtr = _818695338_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__818695338_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IWebViewStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __818695338_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("322f8780e812466b9e508e9fec24018a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewStatics2(ptr: Pointer?): WithDefault = IWebViewStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebViewStatics2 {
      val address = segment.toRawLongValue()
      return makeIWebViewStatics2(Pointer(address))
    }

    public override fun toNative(obj: IWebViewStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__818695338_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewStatics2): Array<IWebViewStatics2?> = (elements as
        Array<IWebViewStatics2?>).castToImpl<IWebViewStatics2,IWebViewStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebViewStatics2?> =
        arrayOfNulls<IWebViewStatics2_Impl>(size) as Array<IWebViewStatics2?>
  }
}
