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

@ABIMarker(ITreeViewItemStatics.ABI::class)
@Signature("{436795be-7396-46dc-a264-21c56581c5e5}")
@Guid("436795be739646dca26421c56581c5e5")
@WinRTInterface("436795be739646dca26421c56581c5e5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITreeViewItemStatics.ByReference::class)
public interface ITreeViewItemStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_GlyphOpacityProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_GlyphBrushProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_ExpandedGlyphProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_CollapsedGlyphProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_GlyphSizeProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_IsExpandedProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_TreeViewItemTemplateSettingsProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITreeViewItemStatics> {
    public override fun getValue() = ABI.makeITreeViewItemStatics(pointer.getPointer(0))

    public fun setValue(value: ITreeViewItemStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITreeViewItemStatics {
    public val __810467277_Ptr: Pointer?

    public val _810467277_VtblPtr: Pointer?
      get() = __810467277_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_GlyphOpacityProperty(): DependencyProperty? {
      val fnPtr = _810467277_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__810467277_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_GlyphBrushProperty(): DependencyProperty? {
      val fnPtr = _810467277_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__810467277_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ExpandedGlyphProperty(): DependencyProperty? {
      val fnPtr = _810467277_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__810467277_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_CollapsedGlyphProperty(): DependencyProperty? {
      val fnPtr = _810467277_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__810467277_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_GlyphSizeProperty(): DependencyProperty? {
      val fnPtr = _810467277_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__810467277_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_IsExpandedProperty(): DependencyProperty? {
      val fnPtr = _810467277_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__810467277_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_TreeViewItemTemplateSettingsProperty(): DependencyProperty? {
      val fnPtr = _810467277_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__810467277_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ITreeViewItemStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __810467277_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITreeViewItemStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("436795be739646dca26421c56581c5e5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITreeViewItemStatics(ptr: Pointer?): WithDefault = ITreeViewItemStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITreeViewItemStatics {
      val address = segment.toRawLongValue()
      return makeITreeViewItemStatics(Pointer(address))
    }

    public override fun toNative(obj: ITreeViewItemStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__810467277_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITreeViewItemStatics): Array<ITreeViewItemStatics?> =
        (elements as
        Array<ITreeViewItemStatics?>).castToImpl<ITreeViewItemStatics,ITreeViewItemStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITreeViewItemStatics?> =
        arrayOfNulls<ITreeViewItemStatics_Impl>(size) as Array<ITreeViewItemStatics?>
  }
}
