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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INavigationViewItemBase2.ABI::class)
@Signature("{d94ee683-d437-5523-9c5c-11d4804e471e}")
@Guid("d94ee683d43755239c5c11d4804e471e")
@WinRTInterface("d94ee683d43755239c5c11d4804e471e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewItemBase2.ByReference::class)
public interface INavigationViewItemBase2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsSelected(): Boolean

  @InterfaceMethod(1)
  public fun put_IsSelected(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewItemBase2> {
    public override fun getValue() = ABI.makeINavigationViewItemBase2(pointer.getPointer(0))

    public fun setValue(value: INavigationViewItemBase2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewItemBase2 {
    public val __1372992430_Ptr: Pointer?

    public val _1372992430_VtblPtr: Pointer?
      get() = __1372992430_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsSelected(): Boolean {
      val fnPtr = _1372992430_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1372992430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsSelected(value: Boolean): Unit {
      val fnPtr = _1372992430_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1372992430_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class INavigationViewItemBase2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1372992430_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewItemBase2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d94ee683d43755239c5c11d4804e471e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewItemBase2(ptr: Pointer?): WithDefault =
        INavigationViewItemBase2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationViewItemBase2 {
      val address = segment.toRawLongValue()
      return makeINavigationViewItemBase2(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewItemBase2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1372992430_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewItemBase2):
        Array<INavigationViewItemBase2?> = (elements as
        Array<INavigationViewItemBase2?>).castToImpl<INavigationViewItemBase2,INavigationViewItemBase2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewItemBase2?> =
        arrayOfNulls<INavigationViewItemBase2_Impl>(size) as Array<INavigationViewItemBase2?>
  }
}
