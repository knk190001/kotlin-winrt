package Windows.Media

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

@ABIMarker(IVideoDisplayProperties.ABI::class)
@Signature("{5609fdb1-5d2d-4872-8170-45dee5bc2f5c}")
@Guid("5609fdb15d2d4872817045dee5bc2f5c")
@WinRTInterface("5609fdb15d2d4872817045dee5bc2f5c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVideoDisplayProperties.ByReference::class)
public interface IVideoDisplayProperties : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Title(): String?

  @InterfaceMethod(1)
  public fun put_Title(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Subtitle(): String?

  @InterfaceMethod(3)
  public fun put_Subtitle(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVideoDisplayProperties> {
    public override fun getValue() = ABI.makeIVideoDisplayProperties(pointer.getPointer(0))

    public fun setValue(value: IVideoDisplayProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVideoDisplayProperties {
    public val __1126490262_Ptr: Pointer?

    public val _1126490262_VtblPtr: Pointer?
      get() = __1126490262_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Title(): String? {
      val fnPtr = _1126490262_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1126490262_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Title(value: String?): Unit {
      val fnPtr = _1126490262_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1126490262_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Subtitle(): String? {
      val fnPtr = _1126490262_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1126490262_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Subtitle(value: String?): Unit {
      val fnPtr = _1126490262_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1126490262_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVideoDisplayProperties_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1126490262_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVideoDisplayProperties, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5609fdb15d2d4872817045dee5bc2f5c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVideoDisplayProperties(ptr: Pointer?): WithDefault =
        IVideoDisplayProperties_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVideoDisplayProperties {
      val address = segment.toRawLongValue()
      return makeIVideoDisplayProperties(Pointer(address))
    }

    public override fun toNative(obj: IVideoDisplayProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1126490262_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVideoDisplayProperties): Array<IVideoDisplayProperties?>
        = (elements as
        Array<IVideoDisplayProperties?>).castToImpl<IVideoDisplayProperties,IVideoDisplayProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVideoDisplayProperties?> =
        arrayOfNulls<IVideoDisplayProperties_Impl>(size) as Array<IVideoDisplayProperties?>
  }
}
