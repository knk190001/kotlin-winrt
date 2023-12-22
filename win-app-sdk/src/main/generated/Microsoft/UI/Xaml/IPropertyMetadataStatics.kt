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

@ABIMarker(IPropertyMetadataStatics.ABI::class)
@Signature("{37b8add4-7a4a-5cf7-a174-235182cd082e}")
@Guid("37b8add47a4a5cf7a174235182cd082e")
@WinRTInterface("37b8add47a4a5cf7a174235182cd082e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPropertyMetadataStatics.ByReference::class)
public interface IPropertyMetadataStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(defaultValue: IUnknown?): PropertyMetadata?

  @InterfaceMethod(1)
  public fun Create(defaultValue: IUnknown?, propertyChangedCallback: PropertyChangedCallback?):
      PropertyMetadata?

  @InterfaceMethod(2)
  public fun Create(createDefaultValueCallback: CreateDefaultValueCallback?): PropertyMetadata?

  @InterfaceMethod(3)
  public fun Create(createDefaultValueCallback: CreateDefaultValueCallback?,
      propertyChangedCallback: PropertyChangedCallback?): PropertyMetadata?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPropertyMetadataStatics> {
    public override fun getValue() = ABI.makeIPropertyMetadataStatics(pointer.getPointer(0))

    public fun setValue(value: IPropertyMetadataStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPropertyMetadataStatics {
    public val __708856102_Ptr: Pointer?

    public val _708856102_VtblPtr: Pointer?
      get() = __708856102_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(defaultValue: IUnknown?): PropertyMetadata? {
      val fnPtr = _708856102_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PropertyMetadata>()
      val hr = fn.invokeHR(arrayOf(__708856102_Ptr, marshalToNative(defaultValue), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PropertyMetadata>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Create(defaultValue: IUnknown?,
        propertyChangedCallback: PropertyChangedCallback?): PropertyMetadata? {
      val fnPtr = _708856102_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PropertyMetadata>()
      val hr = fn.invokeHR(arrayOf(__708856102_Ptr, marshalToNative(defaultValue),
          marshalToNative(propertyChangedCallback), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PropertyMetadata>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun Create(createDefaultValueCallback: CreateDefaultValueCallback?):
        PropertyMetadata? {
      val fnPtr = _708856102_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PropertyMetadata>()
      val hr = fn.invokeHR(arrayOf(__708856102_Ptr, marshalToNative(createDefaultValueCallback),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PropertyMetadata>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun Create(createDefaultValueCallback: CreateDefaultValueCallback?,
        propertyChangedCallback: PropertyChangedCallback?): PropertyMetadata? {
      val fnPtr = _708856102_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PropertyMetadata>()
      val hr = fn.invokeHR(arrayOf(__708856102_Ptr, marshalToNative(createDefaultValueCallback),
          marshalToNative(propertyChangedCallback), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PropertyMetadata>(result.getValue())
      return resultValue
    }
  }

  public class IPropertyMetadataStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __708856102_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPropertyMetadataStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("37b8add47a4a5cf7a174235182cd082e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPropertyMetadataStatics(ptr: Pointer?): WithDefault =
        IPropertyMetadataStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPropertyMetadataStatics {
      val address = segment.toRawLongValue()
      return makeIPropertyMetadataStatics(Pointer(address))
    }

    public override fun toNative(obj: IPropertyMetadataStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__708856102_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPropertyMetadataStatics):
        Array<IPropertyMetadataStatics?> = (elements as
        Array<IPropertyMetadataStatics?>).castToImpl<IPropertyMetadataStatics,IPropertyMetadataStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPropertyMetadataStatics?> =
        arrayOfNulls<IPropertyMetadataStatics_Impl>(size) as Array<IPropertyMetadataStatics?>
  }
}
