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

@ABIMarker(INavigationViewStatics2.ABI::class)
@Signature("{8cc50d74-1a42-4852-ab5a-6dc82f28a4ba}")
@Guid("8cc50d741a424852ab5a6dc82f28a4ba")
@WinRTInterface("8cc50d741a424852ab5a6dc82f28a4ba")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewStatics2.ByReference::class)
public interface INavigationViewStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsBackButtonVisibleProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_IsBackEnabledProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_PaneTitleProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewStatics2> {
    public override fun getValue() = ABI.makeINavigationViewStatics2(pointer.getPointer(0))

    public fun setValue(value: INavigationViewStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewStatics2 {
    public val __750002722_Ptr: Pointer?

    public val _750002722_VtblPtr: Pointer?
      get() = __750002722_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsBackButtonVisibleProperty(): DependencyProperty? {
      val fnPtr = _750002722_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__750002722_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsBackEnabledProperty(): DependencyProperty? {
      val fnPtr = _750002722_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__750002722_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_PaneTitleProperty(): DependencyProperty? {
      val fnPtr = _750002722_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__750002722_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class INavigationViewStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __750002722_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8cc50d741a424852ab5a6dc82f28a4ba")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewStatics2(ptr: Pointer?): WithDefault =
        INavigationViewStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationViewStatics2 {
      val address = segment.toRawLongValue()
      return makeINavigationViewStatics2(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__750002722_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewStatics2): Array<INavigationViewStatics2?>
        = (elements as
        Array<INavigationViewStatics2?>).castToImpl<INavigationViewStatics2,INavigationViewStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewStatics2?> =
        arrayOfNulls<INavigationViewStatics2_Impl>(size) as Array<INavigationViewStatics2?>
  }
}
