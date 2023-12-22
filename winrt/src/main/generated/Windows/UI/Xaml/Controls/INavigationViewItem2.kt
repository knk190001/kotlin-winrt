package Windows.UI.Xaml.Controls

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INavigationViewItem2.ABI::class)
@Signature("{ee488ef9-ea9c-5e04-b26c-83bf9655342f}")
@Guid("ee488ef9ea9c5e04b26c83bf9655342f")
@WinRTInterface("ee488ef9ea9c5e04b26c83bf9655342f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewItem2.ByReference::class)
public interface INavigationViewItem2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectsOnInvoked(): Boolean

  @InterfaceMethod(1)
  public fun put_SelectsOnInvoked(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewItem2> {
    public override fun getValue() = ABI.makeINavigationViewItem2(pointer.getPointer(0))

    public fun setValue(value: INavigationViewItem2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewItem2 {
    public val __349920906_Ptr: Pointer?

    public val _349920906_VtblPtr: Pointer?
      get() = __349920906_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectsOnInvoked(): Boolean {
      val fnPtr = _349920906_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__349920906_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_SelectsOnInvoked(value: Boolean): Unit {
      val fnPtr = _349920906_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__349920906_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class INavigationViewItem2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __349920906_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewItem2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ee488ef9ea9c5e04b26c83bf9655342f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewItem2(ptr: Pointer?): WithDefault = INavigationViewItem2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationViewItem2 {
      val address = segment.toRawLongValue()
      return makeINavigationViewItem2(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewItem2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__349920906_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewItem2): Array<INavigationViewItem2?> =
        (elements as
        Array<INavigationViewItem2?>).castToImpl<INavigationViewItem2,INavigationViewItem2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewItem2?> =
        arrayOfNulls<INavigationViewItem2_Impl>(size) as Array<INavigationViewItem2?>
  }
}
