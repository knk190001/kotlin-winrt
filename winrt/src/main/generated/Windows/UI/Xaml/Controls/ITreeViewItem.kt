package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Media.Brush
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
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITreeViewItem.ABI::class)
@Signature("{4e05d3e6-6167-44e7-9c74-291ddd6df6eb}")
@Guid("4e05d3e6616744e79c74291ddd6df6eb")
@WinRTInterface("4e05d3e6616744e79c74291ddd6df6eb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITreeViewItem.ByReference::class)
public interface ITreeViewItem : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_GlyphOpacity(): Double

  @InterfaceMethod(1)
  public fun put_GlyphOpacity(value: Double): Unit

  @InterfaceMethod(2)
  public fun get_GlyphBrush(): Brush?

  @InterfaceMethod(3)
  public fun put_GlyphBrush(value: Brush?): Unit

  @InterfaceMethod(4)
  public fun get_ExpandedGlyph(): String?

  @InterfaceMethod(5)
  public fun put_ExpandedGlyph(value: String?): Unit

  @InterfaceMethod(6)
  public fun get_CollapsedGlyph(): String?

  @InterfaceMethod(7)
  public fun put_CollapsedGlyph(value: String?): Unit

  @InterfaceMethod(8)
  public fun get_GlyphSize(): Double

  @InterfaceMethod(9)
  public fun put_GlyphSize(value: Double): Unit

  @InterfaceMethod(10)
  public fun get_IsExpanded(): Boolean

  @InterfaceMethod(11)
  public fun put_IsExpanded(value: Boolean): Unit

  @InterfaceMethod(12)
  public fun get_TreeViewItemTemplateSettings(): TreeViewItemTemplateSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITreeViewItem>
      {
    public override fun getValue() = ABI.makeITreeViewItem(pointer.getPointer(0))

    public fun setValue(value: ITreeViewItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITreeViewItem {
    public val __1184217906_Ptr: Pointer?

    public val _1184217906_VtblPtr: Pointer?
      get() = __1184217906_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_GlyphOpacity(): Double {
      val fnPtr = _1184217906_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1184217906_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_GlyphOpacity(value: Double): Unit {
      val fnPtr = _1184217906_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1184217906_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_GlyphBrush(): Brush? {
      val fnPtr = _1184217906_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1184217906_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_GlyphBrush(value: Brush?): Unit {
      val fnPtr = _1184217906_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1184217906_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ExpandedGlyph(): String? {
      val fnPtr = _1184217906_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1184217906_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ExpandedGlyph(value: String?): Unit {
      val fnPtr = _1184217906_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1184217906_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_CollapsedGlyph(): String? {
      val fnPtr = _1184217906_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1184217906_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_CollapsedGlyph(value: String?): Unit {
      val fnPtr = _1184217906_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1184217906_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_GlyphSize(): Double {
      val fnPtr = _1184217906_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1184217906_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_GlyphSize(value: Double): Unit {
      val fnPtr = _1184217906_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1184217906_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_IsExpanded(): Boolean {
      val fnPtr = _1184217906_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1184217906_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_IsExpanded(value: Boolean): Unit {
      val fnPtr = _1184217906_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1184217906_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_TreeViewItemTemplateSettings(): TreeViewItemTemplateSettings? {
      val fnPtr = _1184217906_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TreeViewItemTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__1184217906_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TreeViewItemTemplateSettings>(result.getValue())
      return resultValue
    }
  }

  public class ITreeViewItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1184217906_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITreeViewItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4e05d3e6616744e79c74291ddd6df6eb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITreeViewItem(ptr: Pointer?): WithDefault = ITreeViewItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITreeViewItem {
      val address = segment.toRawLongValue()
      return makeITreeViewItem(Pointer(address))
    }

    public override fun toNative(obj: ITreeViewItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1184217906_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITreeViewItem): Array<ITreeViewItem?> = (elements as
        Array<ITreeViewItem?>).castToImpl<ITreeViewItem,ITreeViewItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITreeViewItem?> =
        arrayOfNulls<ITreeViewItem_Impl>(size) as Array<ITreeViewItem?>
  }
}
