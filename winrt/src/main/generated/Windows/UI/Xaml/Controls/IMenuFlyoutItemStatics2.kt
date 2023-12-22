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

@ABIMarker(IMenuFlyoutItemStatics2.ABI::class)
@Signature("{aca4f564-1790-4601-916e-5ae1f01f4bd6}")
@Guid("aca4f56417904601916e5ae1f01f4bd6")
@WinRTInterface("aca4f56417904601916e5ae1f01f4bd6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMenuFlyoutItemStatics2.ByReference::class)
public interface IMenuFlyoutItemStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IconProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMenuFlyoutItemStatics2> {
    public override fun getValue() = ABI.makeIMenuFlyoutItemStatics2(pointer.getPointer(0))

    public fun setValue(value: IMenuFlyoutItemStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMenuFlyoutItemStatics2 {
    public val __60610122_Ptr: Pointer?

    public val _60610122_VtblPtr: Pointer?
      get() = __60610122_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IconProperty(): DependencyProperty? {
      val fnPtr = _60610122_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__60610122_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IMenuFlyoutItemStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __60610122_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMenuFlyoutItemStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aca4f56417904601916e5ae1f01f4bd6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMenuFlyoutItemStatics2(ptr: Pointer?): WithDefault =
        IMenuFlyoutItemStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMenuFlyoutItemStatics2 {
      val address = segment.toRawLongValue()
      return makeIMenuFlyoutItemStatics2(Pointer(address))
    }

    public override fun toNative(obj: IMenuFlyoutItemStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__60610122_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMenuFlyoutItemStatics2): Array<IMenuFlyoutItemStatics2?>
        = (elements as
        Array<IMenuFlyoutItemStatics2?>).castToImpl<IMenuFlyoutItemStatics2,IMenuFlyoutItemStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMenuFlyoutItemStatics2?> =
        arrayOfNulls<IMenuFlyoutItemStatics2_Impl>(size) as Array<IMenuFlyoutItemStatics2?>
  }
}
