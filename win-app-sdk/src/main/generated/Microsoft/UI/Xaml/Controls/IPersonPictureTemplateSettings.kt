package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Media.ImageBrush
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPersonPictureTemplateSettings.ABI::class)
@Signature("{e16df12f-c3c0-5f26-a381-08f2df052f29}")
@Guid("e16df12fc3c05f26a38108f2df052f29")
@WinRTInterface("e16df12fc3c05f26a38108f2df052f29")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPersonPictureTemplateSettings.ByReference::class)
public interface IPersonPictureTemplateSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ActualInitials(): String?

  @InterfaceMethod(1)
  public fun get_ActualImageBrush(): ImageBrush?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPersonPictureTemplateSettings> {
    public override fun getValue() = ABI.makeIPersonPictureTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: IPersonPictureTemplateSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPersonPictureTemplateSettings {
    public val __1923072095_Ptr: Pointer?

    public val _1923072095_VtblPtr: Pointer?
      get() = __1923072095_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ActualInitials(): String? {
      val fnPtr = _1923072095_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1923072095_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ActualImageBrush(): ImageBrush? {
      val fnPtr = _1923072095_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageBrush>()
      val hr = fn.invokeHR(arrayOf(__1923072095_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageBrush>(result.getValue())
      return resultValue
    }
  }

  public class IPersonPictureTemplateSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1923072095_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPersonPictureTemplateSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e16df12fc3c05f26a38108f2df052f29")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPersonPictureTemplateSettings(ptr: Pointer?): WithDefault =
        IPersonPictureTemplateSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPersonPictureTemplateSettings {
      val address = segment.toRawLongValue()
      return makeIPersonPictureTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: IPersonPictureTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1923072095_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPersonPictureTemplateSettings):
        Array<IPersonPictureTemplateSettings?> = (elements as
        Array<IPersonPictureTemplateSettings?>).castToImpl<IPersonPictureTemplateSettings,IPersonPictureTemplateSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPersonPictureTemplateSettings?> =
        arrayOfNulls<IPersonPictureTemplateSettings_Impl>(size) as
        Array<IPersonPictureTemplateSettings?>
  }
}
