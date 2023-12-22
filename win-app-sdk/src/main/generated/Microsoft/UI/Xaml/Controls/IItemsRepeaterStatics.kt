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

@ABIMarker(IItemsRepeaterStatics.ABI::class)
@Signature("{ed8c4cb7-2edc-5416-afbf-87a9aa2af26e}")
@Guid("ed8c4cb72edc5416afbf87a9aa2af26e")
@WinRTInterface("ed8c4cb72edc5416afbf87a9aa2af26e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemsRepeaterStatics.ByReference::class)
public interface IItemsRepeaterStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ItemsSourceProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_ItemTemplateProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_LayoutProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_HorizontalCacheLengthProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_VerticalCacheLengthProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_BackgroundProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemsRepeaterStatics> {
    public override fun getValue() = ABI.makeIItemsRepeaterStatics(pointer.getPointer(0))

    public fun setValue(value: IItemsRepeaterStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemsRepeaterStatics {
    public val __2026818436_Ptr: Pointer?

    public val _2026818436_VtblPtr: Pointer?
      get() = __2026818436_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ItemsSourceProperty(): DependencyProperty? {
      val fnPtr = _2026818436_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2026818436_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ItemTemplateProperty(): DependencyProperty? {
      val fnPtr = _2026818436_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2026818436_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_LayoutProperty(): DependencyProperty? {
      val fnPtr = _2026818436_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2026818436_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_HorizontalCacheLengthProperty(): DependencyProperty? {
      val fnPtr = _2026818436_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2026818436_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_VerticalCacheLengthProperty(): DependencyProperty? {
      val fnPtr = _2026818436_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2026818436_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_BackgroundProperty(): DependencyProperty? {
      val fnPtr = _2026818436_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2026818436_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IItemsRepeaterStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2026818436_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemsRepeaterStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ed8c4cb72edc5416afbf87a9aa2af26e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemsRepeaterStatics(ptr: Pointer?): WithDefault =
        IItemsRepeaterStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemsRepeaterStatics {
      val address = segment.toRawLongValue()
      return makeIItemsRepeaterStatics(Pointer(address))
    }

    public override fun toNative(obj: IItemsRepeaterStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2026818436_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemsRepeaterStatics): Array<IItemsRepeaterStatics?> =
        (elements as
        Array<IItemsRepeaterStatics?>).castToImpl<IItemsRepeaterStatics,IItemsRepeaterStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemsRepeaterStatics?> =
        arrayOfNulls<IItemsRepeaterStatics_Impl>(size) as Array<IItemsRepeaterStatics?>
  }
}
