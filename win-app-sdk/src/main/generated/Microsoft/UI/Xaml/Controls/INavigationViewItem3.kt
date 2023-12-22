package Microsoft.UI.Xaml.Controls

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

@ABIMarker(INavigationViewItem3.ABI::class)
@Signature("{c6aa3120-d888-5c32-8bb7-490ec91b1aec}")
@Guid("c6aa3120d8885c328bb7490ec91b1aec")
@WinRTInterface("c6aa3120d8885c328bb7490ec91b1aec")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewItem3.ByReference::class)
public interface INavigationViewItem3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InfoBadge(): InfoBadge?

  @InterfaceMethod(1)
  public fun put_InfoBadge(value: InfoBadge?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewItem3> {
    public override fun getValue() = ABI.makeINavigationViewItem3(pointer.getPointer(0))

    public fun setValue(value: INavigationViewItem3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewItem3 {
    public val __919830784_Ptr: Pointer?

    public val _919830784_VtblPtr: Pointer?
      get() = __919830784_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InfoBadge(): InfoBadge? {
      val fnPtr = _919830784_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InfoBadge>()
      val hr = fn.invokeHR(arrayOf(__919830784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InfoBadge>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_InfoBadge(value: InfoBadge?): Unit {
      val fnPtr = _919830784_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__919830784_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class INavigationViewItem3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __919830784_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewItem3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c6aa3120d8885c328bb7490ec91b1aec")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewItem3(ptr: Pointer?): WithDefault = INavigationViewItem3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationViewItem3 {
      val address = segment.toRawLongValue()
      return makeINavigationViewItem3(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewItem3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__919830784_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewItem3): Array<INavigationViewItem3?> =
        (elements as
        Array<INavigationViewItem3?>).castToImpl<INavigationViewItem3,INavigationViewItem3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewItem3?> =
        arrayOfNulls<INavigationViewItem3_Impl>(size) as Array<INavigationViewItem3?>
  }
}
