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

@ABIMarker(ICustomPropertyProvider.ABI::class)
@Signature("{7c925755-3e48-42b4-8677-76372267033f}")
@Guid("7c9257553e4842b4867776372267033f")
@WinRTInterface("7c9257553e4842b4867776372267033f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICustomPropertyProvider.ByReference::class)
public interface ICustomPropertyProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetCustomProperty(name: String?): ICustomProperty?

  @InterfaceMethod(1)
  public fun GetIndexedProperty(name: String?, type: TypeName?): ICustomProperty?

  @InterfaceMethod(2)
  public fun GetStringRepresentation(): String?

  @InterfaceMethod(3)
  public fun get_Type(): TypeName?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICustomPropertyProvider> {
    public override fun getValue() = ABI.makeICustomPropertyProvider(pointer.getPointer(0))

    public fun setValue(value: ICustomPropertyProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICustomPropertyProvider {
    public val __417951114_Ptr: Pointer?

    public val _417951114_VtblPtr: Pointer?
      get() = __417951114_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCustomProperty(name: String?): ICustomProperty? {
      val fnPtr = _417951114_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ICustomProperty>()
      val hr = fn.invokeHR(arrayOf(__417951114_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ICustomProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetIndexedProperty(name: String?, type: TypeName?): ICustomProperty? {
      val fnPtr = _417951114_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ICustomProperty>()
      val hr = fn.invokeHR(arrayOf(__417951114_Ptr, marshalToNative(name), marshalToNative(type),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ICustomProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetStringRepresentation(): String? {
      val fnPtr = _417951114_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__417951114_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Type(): TypeName? {
      val fnPtr = _417951114_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TypeName>()
      val hr = fn.invokeHR(arrayOf(__417951114_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TypeName>(result.getValue())
      return resultValue
    }
  }

  public class ICustomPropertyProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __417951114_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICustomPropertyProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7c9257553e4842b4867776372267033f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICustomPropertyProvider(ptr: Pointer?): WithDefault =
        ICustomPropertyProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICustomPropertyProvider {
      val address = segment.toRawLongValue()
      return makeICustomPropertyProvider(Pointer(address))
    }

    public override fun toNative(obj: ICustomPropertyProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__417951114_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICustomPropertyProvider): Array<ICustomPropertyProvider?>
        = (elements as
        Array<ICustomPropertyProvider?>).castToImpl<ICustomPropertyProvider,ICustomPropertyProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICustomPropertyProvider?> =
        arrayOfNulls<ICustomPropertyProvider_Impl>(size) as Array<ICustomPropertyProvider?>
  }
}
