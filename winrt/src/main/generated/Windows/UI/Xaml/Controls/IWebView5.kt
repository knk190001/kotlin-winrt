package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyObject
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

@ABIMarker(IWebView5.ABI::class)
@Signature("{8c9884a6-2f3b-4a55-a463-8444c2095d00}")
@Guid("8c9884a62f3b4a55a4638444c2095d00")
@WinRTInterface("8c9884a62f3b4a55a4638444c2095d00")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebView5.ByReference::class)
public interface IWebView5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_XYFocusLeft(): DependencyObject?

  @InterfaceMethod(1)
  public fun put_XYFocusLeft(value: DependencyObject?): Unit

  @InterfaceMethod(2)
  public fun get_XYFocusRight(): DependencyObject?

  @InterfaceMethod(3)
  public fun put_XYFocusRight(value: DependencyObject?): Unit

  @InterfaceMethod(4)
  public fun get_XYFocusUp(): DependencyObject?

  @InterfaceMethod(5)
  public fun put_XYFocusUp(value: DependencyObject?): Unit

  @InterfaceMethod(6)
  public fun get_XYFocusDown(): DependencyObject?

  @InterfaceMethod(7)
  public fun put_XYFocusDown(value: DependencyObject?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IWebView5> {
    public override fun getValue() = ABI.makeIWebView5(pointer.getPointer(0))

    public fun setValue(value: IWebView5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebView5 {
    public val __1215835304_Ptr: Pointer?

    public val _1215835304_VtblPtr: Pointer?
      get() = __1215835304_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_XYFocusLeft(): DependencyObject? {
      val fnPtr = _1215835304_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__1215835304_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_XYFocusLeft(value: DependencyObject?): Unit {
      val fnPtr = _1215835304_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215835304_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_XYFocusRight(): DependencyObject? {
      val fnPtr = _1215835304_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__1215835304_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_XYFocusRight(value: DependencyObject?): Unit {
      val fnPtr = _1215835304_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215835304_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_XYFocusUp(): DependencyObject? {
      val fnPtr = _1215835304_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__1215835304_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_XYFocusUp(value: DependencyObject?): Unit {
      val fnPtr = _1215835304_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215835304_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_XYFocusDown(): DependencyObject? {
      val fnPtr = _1215835304_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__1215835304_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_XYFocusDown(value: DependencyObject?): Unit {
      val fnPtr = _1215835304_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215835304_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWebView5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1215835304_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebView5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8c9884a62f3b4a55a4638444c2095d00")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebView5(ptr: Pointer?): WithDefault = IWebView5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebView5 {
      val address = segment.toRawLongValue()
      return makeIWebView5(Pointer(address))
    }

    public override fun toNative(obj: IWebView5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1215835304_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebView5): Array<IWebView5?> = (elements as
        Array<IWebView5?>).castToImpl<IWebView5,IWebView5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebView5?> = arrayOfNulls<IWebView5_Impl>(size)
        as Array<IWebView5?>
  }
}
