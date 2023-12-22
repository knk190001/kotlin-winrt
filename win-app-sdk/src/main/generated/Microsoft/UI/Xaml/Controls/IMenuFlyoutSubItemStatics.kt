package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DependencyProperty
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

@ABIMarker(IMenuFlyoutSubItemStatics.ABI::class)
@Signature("{f59a8ddf-804b-5f56-bc42-f27f987db291}")
@Guid("f59a8ddf804b5f56bc42f27f987db291")
@WinRTInterface("f59a8ddf804b5f56bc42f27f987db291")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMenuFlyoutSubItemStatics.ByReference::class)
public interface IMenuFlyoutSubItemStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TextProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_IconProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMenuFlyoutSubItemStatics> {
    public override fun getValue() = ABI.makeIMenuFlyoutSubItemStatics(pointer.getPointer(0))

    public fun setValue(value: IMenuFlyoutSubItemStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMenuFlyoutSubItemStatics {
    public val __801619341_Ptr: Pointer?

    public val _801619341_VtblPtr: Pointer?
      get() = __801619341_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TextProperty(): DependencyProperty? {
      val fnPtr = _801619341_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__801619341_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IconProperty(): DependencyProperty? {
      val fnPtr = _801619341_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__801619341_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IMenuFlyoutSubItemStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __801619341_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMenuFlyoutSubItemStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f59a8ddf804b5f56bc42f27f987db291")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMenuFlyoutSubItemStatics(ptr: Pointer?): WithDefault =
        IMenuFlyoutSubItemStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMenuFlyoutSubItemStatics {
      val address = segment.toRawLongValue()
      return makeIMenuFlyoutSubItemStatics(Pointer(address))
    }

    public override fun toNative(obj: IMenuFlyoutSubItemStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__801619341_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMenuFlyoutSubItemStatics):
        Array<IMenuFlyoutSubItemStatics?> = (elements as
        Array<IMenuFlyoutSubItemStatics?>).castToImpl<IMenuFlyoutSubItemStatics,IMenuFlyoutSubItemStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMenuFlyoutSubItemStatics?> =
        arrayOfNulls<IMenuFlyoutSubItemStatics_Impl>(size) as Array<IMenuFlyoutSubItemStatics?>
  }
}
