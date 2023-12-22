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

@ABIMarker(ITabViewItemStatics.ABI::class)
@Signature("{4cfc7eab-2eff-5457-8251-c19d374ab34d}")
@Guid("4cfc7eab2eff54578251c19d374ab34d")
@WinRTInterface("4cfc7eab2eff54578251c19d374ab34d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITabViewItemStatics.ByReference::class)
public interface ITabViewItemStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HeaderProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_HeaderTemplateProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_IconSourceProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_IsClosableProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_TabViewTemplateSettingsProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITabViewItemStatics> {
    public override fun getValue() = ABI.makeITabViewItemStatics(pointer.getPointer(0))

    public fun setValue(value: ITabViewItemStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITabViewItemStatics {
    public val __319068927_Ptr: Pointer?

    public val _319068927_VtblPtr: Pointer?
      get() = __319068927_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HeaderProperty(): DependencyProperty? {
      val fnPtr = _319068927_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__319068927_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_HeaderTemplateProperty(): DependencyProperty? {
      val fnPtr = _319068927_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__319068927_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IconSourceProperty(): DependencyProperty? {
      val fnPtr = _319068927_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__319068927_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_IsClosableProperty(): DependencyProperty? {
      val fnPtr = _319068927_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__319068927_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_TabViewTemplateSettingsProperty(): DependencyProperty? {
      val fnPtr = _319068927_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__319068927_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ITabViewItemStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __319068927_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITabViewItemStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4cfc7eab2eff54578251c19d374ab34d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITabViewItemStatics(ptr: Pointer?): WithDefault = ITabViewItemStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITabViewItemStatics {
      val address = segment.toRawLongValue()
      return makeITabViewItemStatics(Pointer(address))
    }

    public override fun toNative(obj: ITabViewItemStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__319068927_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITabViewItemStatics): Array<ITabViewItemStatics?> =
        (elements as
        Array<ITabViewItemStatics?>).castToImpl<ITabViewItemStatics,ITabViewItemStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITabViewItemStatics?> =
        arrayOfNulls<ITabViewItemStatics_Impl>(size) as Array<ITabViewItemStatics?>
  }
}
