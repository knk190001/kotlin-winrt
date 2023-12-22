package Microsoft.UI.Composition

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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPointLight2.ABI::class)
@Signature("{de466104-59d9-57d2-92b5-554d6d82edf2}")
@Guid("de46610459d957d292b5554d6d82edf2")
@WinRTInterface("de46610459d957d292b5554d6d82edf2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPointLight2.ByReference::class)
public interface IPointLight2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Intensity(): Float

  @InterfaceMethod(1)
  public fun put_Intensity(value: Float): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPointLight2> {
    public override fun getValue() = ABI.makeIPointLight2(pointer.getPointer(0))

    public fun setValue(value: IPointLight2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPointLight2 {
    public val __524526035_Ptr: Pointer?

    public val _524526035_VtblPtr: Pointer?
      get() = __524526035_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Intensity(): Float {
      val fnPtr = _524526035_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__524526035_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Intensity(value: Float): Unit {
      val fnPtr = _524526035_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__524526035_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPointLight2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __524526035_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPointLight2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("de46610459d957d292b5554d6d82edf2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPointLight2(ptr: Pointer?): WithDefault = IPointLight2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPointLight2 {
      val address = segment.toRawLongValue()
      return makeIPointLight2(Pointer(address))
    }

    public override fun toNative(obj: IPointLight2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__524526035_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPointLight2): Array<IPointLight2?> = (elements as
        Array<IPointLight2?>).castToImpl<IPointLight2,IPointLight2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPointLight2?> =
        arrayOfNulls<IPointLight2_Impl>(size) as Array<IPointLight2?>
  }
}
