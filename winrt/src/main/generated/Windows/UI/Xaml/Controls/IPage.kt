package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Navigation.NavigationCacheMode
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

@ABIMarker(IPage.ABI::class)
@Signature("{c4b27075-e641-453e-824d-012fc7cf95cf}")
@Guid("c4b27075e641453e824d012fc7cf95cf")
@WinRTInterface("c4b27075e641453e824d012fc7cf95cf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPage.ByReference::class)
public interface IPage : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Frame(): Frame?

  @InterfaceMethod(1)
  public fun get_NavigationCacheMode(): NavigationCacheMode?

  @InterfaceMethod(2)
  public fun put_NavigationCacheMode(value: NavigationCacheMode?): Unit

  @InterfaceMethod(3)
  public fun get_TopAppBar(): AppBar?

  @InterfaceMethod(4)
  public fun put_TopAppBar(value: AppBar?): Unit

  @InterfaceMethod(5)
  public fun get_BottomAppBar(): AppBar?

  @InterfaceMethod(6)
  public fun put_BottomAppBar(value: AppBar?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPage> {
    public override fun getValue() = ABI.makeIPage(pointer.getPointer(0))

    public fun setValue(value: IPage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPage {
    public val __1800449877_Ptr: Pointer?

    public val _1800449877_VtblPtr: Pointer?
      get() = __1800449877_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Frame(): Frame? {
      val fnPtr = _1800449877_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Frame>()
      val hr = fn.invokeHR(arrayOf(__1800449877_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Frame>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_NavigationCacheMode(): NavigationCacheMode? {
      val fnPtr = _1800449877_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NavigationCacheMode>()
      val hr = fn.invokeHR(arrayOf(__1800449877_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NavigationCacheMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_NavigationCacheMode(value: NavigationCacheMode?): Unit {
      val fnPtr = _1800449877_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1800449877_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_TopAppBar(): AppBar? {
      val fnPtr = _1800449877_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBar>()
      val hr = fn.invokeHR(arrayOf(__1800449877_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBar>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_TopAppBar(value: AppBar?): Unit {
      val fnPtr = _1800449877_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1800449877_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_BottomAppBar(): AppBar? {
      val fnPtr = _1800449877_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBar>()
      val hr = fn.invokeHR(arrayOf(__1800449877_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBar>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_BottomAppBar(value: AppBar?): Unit {
      val fnPtr = _1800449877_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1800449877_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1800449877_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c4b27075e641453e824d012fc7cf95cf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPage(ptr: Pointer?): WithDefault = IPage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPage {
      val address = segment.toRawLongValue()
      return makeIPage(Pointer(address))
    }

    public override fun toNative(obj: IPage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1800449877_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPage): Array<IPage?> = (elements as
        Array<IPage?>).castToImpl<IPage,IPage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPage?> = arrayOfNulls<IPage_Impl>(size) as
        Array<IPage?>
  }
}
