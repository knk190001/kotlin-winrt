package Windows.Storage.Streams

import Windows.Foundation.Collections.IPropertySet
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

@ABIMarker(IPropertySetSerializer.ABI::class)
@Signature("{6e8ebf1c-ef3d-4376-b20e-5be638aeac77}")
@Guid("6e8ebf1cef3d4376b20e5be638aeac77")
@WinRTInterface("6e8ebf1cef3d4376b20e5be638aeac77")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPropertySetSerializer.ByReference::class)
public interface IPropertySetSerializer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Serialize(propertySet: IPropertySet?): IBuffer?

  @InterfaceMethod(1)
  public fun Deserialize(propertySet: IPropertySet?, buffer: IBuffer?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPropertySetSerializer> {
    public override fun getValue() = ABI.makeIPropertySetSerializer(pointer.getPointer(0))

    public fun setValue(value: IPropertySetSerializer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPropertySetSerializer {
    public val __585393173_Ptr: Pointer?

    public val _585393173_VtblPtr: Pointer?
      get() = __585393173_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Serialize(propertySet: IPropertySet?): IBuffer? {
      val fnPtr = _585393173_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__585393173_Ptr, marshalToNative(propertySet), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Deserialize(propertySet: IPropertySet?, buffer: IBuffer?): Unit {
      val fnPtr = _585393173_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__585393173_Ptr, marshalToNative(propertySet),
          marshalToNative(buffer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPropertySetSerializer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __585393173_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPropertySetSerializer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6e8ebf1cef3d4376b20e5be638aeac77")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPropertySetSerializer(ptr: Pointer?): WithDefault =
        IPropertySetSerializer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPropertySetSerializer {
      val address = segment.toRawLongValue()
      return makeIPropertySetSerializer(Pointer(address))
    }

    public override fun toNative(obj: IPropertySetSerializer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__585393173_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPropertySetSerializer): Array<IPropertySetSerializer?> =
        (elements as
        Array<IPropertySetSerializer?>).castToImpl<IPropertySetSerializer,IPropertySetSerializer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPropertySetSerializer?> =
        arrayOfNulls<IPropertySetSerializer_Impl>(size) as Array<IPropertySetSerializer?>
  }
}
