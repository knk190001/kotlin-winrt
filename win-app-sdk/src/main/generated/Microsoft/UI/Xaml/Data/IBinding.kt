package Microsoft.UI.Xaml.Data

import Microsoft.UI.Xaml.PropertyPath
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

@ABIMarker(IBinding.ABI::class)
@Signature("{501ea0e8-edd4-59de-8845-76af2eabbe00}")
@Guid("501ea0e8edd459de884576af2eabbe00")
@WinRTInterface("501ea0e8edd459de884576af2eabbe00")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBinding.ByReference::class)
public interface IBinding : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Path(): PropertyPath?

  @InterfaceMethod(1)
  public fun put_Path(value: PropertyPath?): Unit

  @InterfaceMethod(2)
  public fun get_Mode(): BindingMode?

  @InterfaceMethod(3)
  public fun put_Mode(value: BindingMode?): Unit

  @InterfaceMethod(4)
  public fun get_Source(): IUnknown?

  @InterfaceMethod(5)
  public fun put_Source(value: IUnknown?): Unit

  @InterfaceMethod(6)
  public fun get_RelativeSource(): RelativeSource?

  @InterfaceMethod(7)
  public fun put_RelativeSource(value: RelativeSource?): Unit

  @InterfaceMethod(8)
  public fun get_ElementName(): String?

  @InterfaceMethod(9)
  public fun put_ElementName(value: String?): Unit

  @InterfaceMethod(10)
  public fun get_Converter(): IValueConverter?

  @InterfaceMethod(11)
  public fun put_Converter(value: IValueConverter?): Unit

  @InterfaceMethod(12)
  public fun get_ConverterParameter(): IUnknown?

  @InterfaceMethod(13)
  public fun put_ConverterParameter(value: IUnknown?): Unit

  @InterfaceMethod(14)
  public fun get_ConverterLanguage(): String?

  @InterfaceMethod(15)
  public fun put_ConverterLanguage(value: String?): Unit

  @InterfaceMethod(16)
  public fun get_FallbackValue(): IUnknown?

  @InterfaceMethod(17)
  public fun put_FallbackValue(value: IUnknown?): Unit

  @InterfaceMethod(18)
  public fun get_TargetNullValue(): IUnknown?

  @InterfaceMethod(19)
  public fun put_TargetNullValue(value: IUnknown?): Unit

  @InterfaceMethod(20)
  public fun get_UpdateSourceTrigger(): UpdateSourceTrigger?

  @InterfaceMethod(21)
  public fun put_UpdateSourceTrigger(value: UpdateSourceTrigger?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IBinding> {
    public override fun getValue() = ABI.makeIBinding(pointer.getPointer(0))

    public fun setValue(value: IBinding_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBinding {
    public val __740782638_Ptr: Pointer?

    public val _740782638_VtblPtr: Pointer?
      get() = __740782638_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Path(): PropertyPath? {
      val fnPtr = _740782638_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PropertyPath>()
      val hr = fn.invokeHR(arrayOf(__740782638_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PropertyPath>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Path(value: PropertyPath?): Unit {
      val fnPtr = _740782638_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__740782638_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Mode(): BindingMode? {
      val fnPtr = _740782638_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BindingMode>()
      val hr = fn.invokeHR(arrayOf(__740782638_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BindingMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Mode(value: BindingMode?): Unit {
      val fnPtr = _740782638_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__740782638_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Source(): IUnknown? {
      val fnPtr = _740782638_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__740782638_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Source(value: IUnknown?): Unit {
      val fnPtr = _740782638_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__740782638_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_RelativeSource(): RelativeSource? {
      val fnPtr = _740782638_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RelativeSource>()
      val hr = fn.invokeHR(arrayOf(__740782638_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RelativeSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_RelativeSource(value: RelativeSource?): Unit {
      val fnPtr = _740782638_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__740782638_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_ElementName(): String? {
      val fnPtr = _740782638_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__740782638_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_ElementName(value: String?): Unit {
      val fnPtr = _740782638_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__740782638_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_Converter(): IValueConverter? {
      val fnPtr = _740782638_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IValueConverter>()
      val hr = fn.invokeHR(arrayOf(__740782638_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IValueConverter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_Converter(value: IValueConverter?): Unit {
      val fnPtr = _740782638_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__740782638_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_ConverterParameter(): IUnknown? {
      val fnPtr = _740782638_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__740782638_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_ConverterParameter(value: IUnknown?): Unit {
      val fnPtr = _740782638_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__740782638_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_ConverterLanguage(): String? {
      val fnPtr = _740782638_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__740782638_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_ConverterLanguage(value: String?): Unit {
      val fnPtr = _740782638_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__740782638_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_FallbackValue(): IUnknown? {
      val fnPtr = _740782638_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__740782638_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_FallbackValue(value: IUnknown?): Unit {
      val fnPtr = _740782638_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__740782638_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_TargetNullValue(): IUnknown? {
      val fnPtr = _740782638_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__740782638_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_TargetNullValue(value: IUnknown?): Unit {
      val fnPtr = _740782638_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__740782638_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_UpdateSourceTrigger(): UpdateSourceTrigger? {
      val fnPtr = _740782638_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UpdateSourceTrigger>()
      val hr = fn.invokeHR(arrayOf(__740782638_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UpdateSourceTrigger>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_UpdateSourceTrigger(value: UpdateSourceTrigger?): Unit {
      val fnPtr = _740782638_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__740782638_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBinding_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __740782638_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBinding, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("501ea0e8edd459de884576af2eabbe00")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBinding(ptr: Pointer?): WithDefault = IBinding_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBinding {
      val address = segment.toRawLongValue()
      return makeIBinding(Pointer(address))
    }

    public override fun toNative(obj: IBinding): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__740782638_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBinding): Array<IBinding?> = (elements as
        Array<IBinding?>).castToImpl<IBinding,IBinding_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBinding?> = arrayOfNulls<IBinding_Impl>(size) as
        Array<IBinding?>
  }
}
