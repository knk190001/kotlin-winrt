package Windows.UI.Xaml.Controls

import Windows.Foundation.Point
import Windows.UI.Xaml.UIElement
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

@ABIMarker(IMenuFlyout2.ABI::class)
@Signature("{507c7bad-d9d1-4c05-9d4b-cda8de9ab242}")
@Guid("507c7badd9d14c059d4bcda8de9ab242")
@WinRTInterface("507c7badd9d14c059d4bcda8de9ab242")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMenuFlyout2.ByReference::class)
public interface IMenuFlyout2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ShowAt(targetElement: UIElement?, point: Point?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMenuFlyout2> {
    public override fun getValue() = ABI.makeIMenuFlyout2(pointer.getPointer(0))

    public fun setValue(value: IMenuFlyout2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMenuFlyout2 {
    public val __778443164_Ptr: Pointer?

    public val _778443164_VtblPtr: Pointer?
      get() = __778443164_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ShowAt(targetElement: UIElement?, point: Point?): Unit {
      val fnPtr = _778443164_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__778443164_Ptr, marshalToNative(targetElement),
          marshalToNative(point),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMenuFlyout2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __778443164_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMenuFlyout2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("507c7badd9d14c059d4bcda8de9ab242")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMenuFlyout2(ptr: Pointer?): WithDefault = IMenuFlyout2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMenuFlyout2 {
      val address = segment.toRawLongValue()
      return makeIMenuFlyout2(Pointer(address))
    }

    public override fun toNative(obj: IMenuFlyout2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__778443164_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMenuFlyout2): Array<IMenuFlyout2?> = (elements as
        Array<IMenuFlyout2?>).castToImpl<IMenuFlyout2,IMenuFlyout2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMenuFlyout2?> =
        arrayOfNulls<IMenuFlyout2_Impl>(size) as Array<IMenuFlyout2?>
  }
}
