package Microsoft.UI.Xaml.Data

import Windows.UI.Xaml.Interop.TypeName
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IValueConverter.ABI::class)
@Signature("{afdd2bff-10f5-5173-b7c0-3590bd96cb35}")
@Guid("afdd2bff10f55173b7c03590bd96cb35")
@WinRTInterface("afdd2bff10f55173b7c03590bd96cb35")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IValueConverter.ByReference::class)
public interface IValueConverter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Convert(
    value: IUnknown?,
    targetType: TypeName?,
    parameter: IUnknown?,
    language: String?
  ): IUnknown?

  @InterfaceMethod(1)
  public fun ConvertBack(
    value: IUnknown?,
    targetType: TypeName?,
    parameter: IUnknown?,
    language: String?
  ): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IValueConverter> {
    public override fun getValue() = ABI.makeIValueConverter(pointer.getPointer(0))

    public fun setValue(value: IValueConverter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IValueConverter {
    public val __82778302_Ptr: Pointer?

    public val _82778302_VtblPtr: Pointer?
      get() = __82778302_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Convert(
      value: IUnknown?,
      targetType: TypeName?,
      parameter: IUnknown?,
      language: String?
    ): IUnknown? {
      val fnPtr = _82778302_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__82778302_Ptr, marshalToNative(value),
          marshalToNative(targetType), marshalToNative(parameter), marshalToNative(language),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ConvertBack(
      value: IUnknown?,
      targetType: TypeName?,
      parameter: IUnknown?,
      language: String?
    ): IUnknown? {
      val fnPtr = _82778302_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__82778302_Ptr, marshalToNative(value),
          marshalToNative(targetType), marshalToNative(parameter), marshalToNative(language),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class IValueConverter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __82778302_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IValueConverter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("afdd2bff10f55173b7c03590bd96cb35")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIValueConverter(ptr: Pointer?): WithDefault = IValueConverter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IValueConverter {
      val address = segment.toRawLongValue()
      return makeIValueConverter(Pointer(address))
    }

    public override fun toNative(obj: IValueConverter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__82778302_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IValueConverter): Array<IValueConverter?> = (elements as
        Array<IValueConverter?>).castToImpl<IValueConverter,IValueConverter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IValueConverter?> =
        arrayOfNulls<IValueConverter_Impl>(size) as Array<IValueConverter?>
  }
}
