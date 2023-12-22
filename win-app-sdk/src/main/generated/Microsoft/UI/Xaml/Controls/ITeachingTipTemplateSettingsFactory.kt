package Microsoft.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(ITeachingTipTemplateSettingsFactory.ABI::class)
@Signature("{63210545-e195-56cd-bccd-169255e134e3}")
@Guid("63210545e19556cdbccd169255e134e3")
@WinRTInterface("63210545e19556cdbccd169255e134e3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITeachingTipTemplateSettingsFactory.ByReference::class)
public interface ITeachingTipTemplateSettingsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      TeachingTipTemplateSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITeachingTipTemplateSettingsFactory> {
    public override fun getValue() =
        ABI.makeITeachingTipTemplateSettingsFactory(pointer.getPointer(0))

    public fun setValue(value: ITeachingTipTemplateSettingsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITeachingTipTemplateSettingsFactory {
    public val __484290982_Ptr: Pointer?

    public val _484290982_VtblPtr: Pointer?
      get() = __484290982_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        TeachingTipTemplateSettings? {
      val fnPtr = _484290982_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TeachingTipTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__484290982_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TeachingTipTemplateSettings>(result.getValue())
      return resultValue
    }
  }

  public class ITeachingTipTemplateSettingsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __484290982_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITeachingTipTemplateSettingsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("63210545e19556cdbccd169255e134e3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITeachingTipTemplateSettingsFactory(ptr: Pointer?): WithDefault =
        ITeachingTipTemplateSettingsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITeachingTipTemplateSettingsFactory {
      val address = segment.toRawLongValue()
      return makeITeachingTipTemplateSettingsFactory(Pointer(address))
    }

    public override fun toNative(obj: ITeachingTipTemplateSettingsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__484290982_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITeachingTipTemplateSettingsFactory):
        Array<ITeachingTipTemplateSettingsFactory?> = (elements as
        Array<ITeachingTipTemplateSettingsFactory?>).castToImpl<ITeachingTipTemplateSettingsFactory,ITeachingTipTemplateSettingsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITeachingTipTemplateSettingsFactory?> =
        arrayOfNulls<ITeachingTipTemplateSettingsFactory_Impl>(size) as
        Array<ITeachingTipTemplateSettingsFactory?>
  }
}
