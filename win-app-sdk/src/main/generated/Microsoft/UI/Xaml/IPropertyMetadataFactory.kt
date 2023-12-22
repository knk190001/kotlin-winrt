package Microsoft.UI.Xaml

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

@ABIMarker(IPropertyMetadataFactory.ABI::class)
@Signature("{9f420906-111a-5465-91ee-bed14b3e7fec}")
@Guid("9f420906111a546591eebed14b3e7fec")
@WinRTInterface("9f420906111a546591eebed14b3e7fec")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPropertyMetadataFactory.ByReference::class)
public interface IPropertyMetadataFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithDefaultValue(
    defaultValue: IUnknown?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): PropertyMetadata?

  @InterfaceMethod(1)
  public fun CreateInstanceWithDefaultValueAndCallback(
    defaultValue: IUnknown?,
    propertyChangedCallback: PropertyChangedCallback?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): PropertyMetadata?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPropertyMetadataFactory> {
    public override fun getValue() = ABI.makeIPropertyMetadataFactory(pointer.getPointer(0))

    public fun setValue(value: IPropertyMetadataFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPropertyMetadataFactory {
    public val __96397343_Ptr: Pointer?

    public val _96397343_VtblPtr: Pointer?
      get() = __96397343_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithDefaultValue(
      defaultValue: IUnknown?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): PropertyMetadata? {
      val fnPtr = _96397343_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PropertyMetadata>()
      val hr = fn.invokeHR(arrayOf(__96397343_Ptr, marshalToNative(defaultValue),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PropertyMetadata>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateInstanceWithDefaultValueAndCallback(
      defaultValue: IUnknown?,
      propertyChangedCallback: PropertyChangedCallback?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): PropertyMetadata? {
      val fnPtr = _96397343_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PropertyMetadata>()
      val hr = fn.invokeHR(arrayOf(__96397343_Ptr, marshalToNative(defaultValue),
          marshalToNative(propertyChangedCallback), marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PropertyMetadata>(result.getValue())
      return resultValue
    }
  }

  public class IPropertyMetadataFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __96397343_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPropertyMetadataFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9f420906111a546591eebed14b3e7fec")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPropertyMetadataFactory(ptr: Pointer?): WithDefault =
        IPropertyMetadataFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPropertyMetadataFactory {
      val address = segment.toRawLongValue()
      return makeIPropertyMetadataFactory(Pointer(address))
    }

    public override fun toNative(obj: IPropertyMetadataFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__96397343_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPropertyMetadataFactory):
        Array<IPropertyMetadataFactory?> = (elements as
        Array<IPropertyMetadataFactory?>).castToImpl<IPropertyMetadataFactory,IPropertyMetadataFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPropertyMetadataFactory?> =
        arrayOfNulls<IPropertyMetadataFactory_Impl>(size) as Array<IPropertyMetadataFactory?>
  }
}
