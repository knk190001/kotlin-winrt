package Microsoft.UI.Xaml.Controls.Primitives

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

@ABIMarker(IGridViewItemTemplateSettings.ABI::class)
@Signature("{7033e884-2117-56e7-afb8-b7f5b8b64c70}")
@Guid("7033e884211756e7afb8b7f5b8b64c70")
@WinRTInterface("7033e884211756e7afb8b7f5b8b64c70")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGridViewItemTemplateSettings.ByReference::class)
public interface IGridViewItemTemplateSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DragItemsCount(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGridViewItemTemplateSettings> {
    public override fun getValue() = ABI.makeIGridViewItemTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: IGridViewItemTemplateSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGridViewItemTemplateSettings {
    public val __696455060_Ptr: Pointer?

    public val _696455060_VtblPtr: Pointer?
      get() = __696455060_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DragItemsCount(): Int {
      val fnPtr = _696455060_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__696455060_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IGridViewItemTemplateSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __696455060_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGridViewItemTemplateSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7033e884211756e7afb8b7f5b8b64c70")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGridViewItemTemplateSettings(ptr: Pointer?): WithDefault =
        IGridViewItemTemplateSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGridViewItemTemplateSettings {
      val address = segment.toRawLongValue()
      return makeIGridViewItemTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: IGridViewItemTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__696455060_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGridViewItemTemplateSettings):
        Array<IGridViewItemTemplateSettings?> = (elements as
        Array<IGridViewItemTemplateSettings?>).castToImpl<IGridViewItemTemplateSettings,IGridViewItemTemplateSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGridViewItemTemplateSettings?> =
        arrayOfNulls<IGridViewItemTemplateSettings_Impl>(size) as
        Array<IGridViewItemTemplateSettings?>
  }
}
