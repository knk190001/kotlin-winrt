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

@ABIMarker(IMenuFlyoutItemStatics3.ABI::class)
@Signature("{d83fd7c3-0aeb-4ef3-8270-8b9b95f2b298}")
@Guid("d83fd7c30aeb4ef382708b9b95f2b298")
@WinRTInterface("d83fd7c30aeb4ef382708b9b95f2b298")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMenuFlyoutItemStatics3.ByReference::class)
public interface IMenuFlyoutItemStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_KeyboardAcceleratorTextOverrideProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMenuFlyoutItemStatics3> {
    public override fun getValue() = ABI.makeIMenuFlyoutItemStatics3(pointer.getPointer(0))

    public fun setValue(value: IMenuFlyoutItemStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMenuFlyoutItemStatics3 {
    public val __60610121_Ptr: Pointer?

    public val _60610121_VtblPtr: Pointer?
      get() = __60610121_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_KeyboardAcceleratorTextOverrideProperty(): DependencyProperty? {
      val fnPtr = _60610121_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__60610121_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IMenuFlyoutItemStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __60610121_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMenuFlyoutItemStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d83fd7c30aeb4ef382708b9b95f2b298")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMenuFlyoutItemStatics3(ptr: Pointer?): WithDefault =
        IMenuFlyoutItemStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMenuFlyoutItemStatics3 {
      val address = segment.toRawLongValue()
      return makeIMenuFlyoutItemStatics3(Pointer(address))
    }

    public override fun toNative(obj: IMenuFlyoutItemStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__60610121_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMenuFlyoutItemStatics3): Array<IMenuFlyoutItemStatics3?>
        = (elements as
        Array<IMenuFlyoutItemStatics3?>).castToImpl<IMenuFlyoutItemStatics3,IMenuFlyoutItemStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMenuFlyoutItemStatics3?> =
        arrayOfNulls<IMenuFlyoutItemStatics3_Impl>(size) as Array<IMenuFlyoutItemStatics3?>
  }
}
