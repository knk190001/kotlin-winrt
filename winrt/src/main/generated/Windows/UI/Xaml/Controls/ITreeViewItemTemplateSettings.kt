package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Thickness
import Windows.UI.Xaml.Visibility
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

@ABIMarker(ITreeViewItemTemplateSettings.ABI::class)
@Signature("{ec323744-de31-4936-bfc2-1cb37ba1dc08}")
@Guid("ec323744de314936bfc21cb37ba1dc08")
@WinRTInterface("ec323744de314936bfc21cb37ba1dc08")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITreeViewItemTemplateSettings.ByReference::class)
public interface ITreeViewItemTemplateSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExpandedGlyphVisibility(): Visibility?

  @InterfaceMethod(1)
  public fun get_CollapsedGlyphVisibility(): Visibility?

  @InterfaceMethod(2)
  public fun get_Indentation(): Thickness?

  @InterfaceMethod(3)
  public fun get_DragItemsCount(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITreeViewItemTemplateSettings> {
    public override fun getValue() = ABI.makeITreeViewItemTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: ITreeViewItemTemplateSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITreeViewItemTemplateSettings {
    public val __2108019185_Ptr: Pointer?

    public val _2108019185_VtblPtr: Pointer?
      get() = __2108019185_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExpandedGlyphVisibility(): Visibility? {
      val fnPtr = _2108019185_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Visibility>()
      val hr = fn.invokeHR(arrayOf(__2108019185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Visibility>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CollapsedGlyphVisibility(): Visibility? {
      val fnPtr = _2108019185_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Visibility>()
      val hr = fn.invokeHR(arrayOf(__2108019185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Visibility>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Indentation(): Thickness? {
      val fnPtr = _2108019185_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__2108019185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_DragItemsCount(): Int {
      val fnPtr = _2108019185_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2108019185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class ITreeViewItemTemplateSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2108019185_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITreeViewItemTemplateSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ec323744de314936bfc21cb37ba1dc08")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITreeViewItemTemplateSettings(ptr: Pointer?): WithDefault =
        ITreeViewItemTemplateSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITreeViewItemTemplateSettings {
      val address = segment.toRawLongValue()
      return makeITreeViewItemTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: ITreeViewItemTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2108019185_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITreeViewItemTemplateSettings):
        Array<ITreeViewItemTemplateSettings?> = (elements as
        Array<ITreeViewItemTemplateSettings?>).castToImpl<ITreeViewItemTemplateSettings,ITreeViewItemTemplateSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITreeViewItemTemplateSettings?> =
        arrayOfNulls<ITreeViewItemTemplateSettings_Impl>(size) as
        Array<ITreeViewItemTemplateSettings?>
  }
}
