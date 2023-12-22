package Windows.Media.MediaProperties

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

@ABIMarker(IMediaEncodingProperties.ABI::class)
@Signature("{b4002af6-acd4-4e5a-a24b-5d7498a8b8c4}")
@Guid("b4002af6acd44e5aa24b5d7498a8b8c4")
@WinRTInterface("b4002af6acd44e5aa24b5d7498a8b8c4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaEncodingProperties.ByReference::class)
public interface IMediaEncodingProperties : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Properties(): MediaPropertySet?

  @InterfaceMethod(1)
  public fun get_Type(): String?

  @InterfaceMethod(2)
  public fun put_Subtype(value: String?): Unit

  @InterfaceMethod(3)
  public fun get_Subtype(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaEncodingProperties> {
    public override fun getValue() = ABI.makeIMediaEncodingProperties(pointer.getPointer(0))

    public fun setValue(value: IMediaEncodingProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaEncodingProperties {
    public val __1294923267_Ptr: Pointer?

    public val _1294923267_VtblPtr: Pointer?
      get() = __1294923267_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Properties(): MediaPropertySet? {
      val fnPtr = _1294923267_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPropertySet>()
      val hr = fn.invokeHR(arrayOf(__1294923267_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPropertySet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Type(): String? {
      val fnPtr = _1294923267_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1294923267_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Subtype(value: String?): Unit {
      val fnPtr = _1294923267_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1294923267_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Subtype(): String? {
      val fnPtr = _1294923267_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1294923267_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IMediaEncodingProperties_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1294923267_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaEncodingProperties, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b4002af6acd44e5aa24b5d7498a8b8c4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaEncodingProperties(ptr: Pointer?): WithDefault =
        IMediaEncodingProperties_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaEncodingProperties {
      val address = segment.toRawLongValue()
      return makeIMediaEncodingProperties(Pointer(address))
    }

    public override fun toNative(obj: IMediaEncodingProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1294923267_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaEncodingProperties):
        Array<IMediaEncodingProperties?> = (elements as
        Array<IMediaEncodingProperties?>).castToImpl<IMediaEncodingProperties,IMediaEncodingProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaEncodingProperties?> =
        arrayOfNulls<IMediaEncodingProperties_Impl>(size) as Array<IMediaEncodingProperties?>
  }
}
