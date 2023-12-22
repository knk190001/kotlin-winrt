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

@ABIMarker(IMenuBarItemStatics.ABI::class)
@Signature("{60a9e3fb-b405-50d0-bb78-d396a34da267}")
@Guid("60a9e3fbb40550d0bb78d396a34da267")
@WinRTInterface("60a9e3fbb40550d0bb78d396a34da267")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMenuBarItemStatics.ByReference::class)
public interface IMenuBarItemStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TitleProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_ItemsProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMenuBarItemStatics> {
    public override fun getValue() = ABI.makeIMenuBarItemStatics(pointer.getPointer(0))

    public fun setValue(value: IMenuBarItemStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMenuBarItemStatics {
    public val __1699389306_Ptr: Pointer?

    public val _1699389306_VtblPtr: Pointer?
      get() = __1699389306_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TitleProperty(): DependencyProperty? {
      val fnPtr = _1699389306_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1699389306_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ItemsProperty(): DependencyProperty? {
      val fnPtr = _1699389306_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1699389306_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IMenuBarItemStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1699389306_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMenuBarItemStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("60a9e3fbb40550d0bb78d396a34da267")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMenuBarItemStatics(ptr: Pointer?): WithDefault = IMenuBarItemStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMenuBarItemStatics {
      val address = segment.toRawLongValue()
      return makeIMenuBarItemStatics(Pointer(address))
    }

    public override fun toNative(obj: IMenuBarItemStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1699389306_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMenuBarItemStatics): Array<IMenuBarItemStatics?> =
        (elements as
        Array<IMenuBarItemStatics?>).castToImpl<IMenuBarItemStatics,IMenuBarItemStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMenuBarItemStatics?> =
        arrayOfNulls<IMenuBarItemStatics_Impl>(size) as Array<IMenuBarItemStatics?>
  }
}
