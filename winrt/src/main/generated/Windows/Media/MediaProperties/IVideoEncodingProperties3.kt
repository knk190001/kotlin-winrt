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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVideoEncodingProperties3.ABI::class)
@Signature("{386bcdc4-873a-479f-b3eb-56c1fcbec6d7}")
@Guid("386bcdc4873a479fb3eb56c1fcbec6d7")
@WinRTInterface("386bcdc4873a479fb3eb56c1fcbec6d7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVideoEncodingProperties3.ByReference::class)
public interface IVideoEncodingProperties3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StereoscopicVideoPackingMode(): StereoscopicVideoPackingMode?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVideoEncodingProperties3> {
    public override fun getValue() = ABI.makeIVideoEncodingProperties3(pointer.getPointer(0))

    public fun setValue(value: IVideoEncodingProperties3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVideoEncodingProperties3 {
    public val __705029991_Ptr: Pointer?

    public val _705029991_VtblPtr: Pointer?
      get() = __705029991_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StereoscopicVideoPackingMode(): StereoscopicVideoPackingMode? {
      val fnPtr = _705029991_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StereoscopicVideoPackingMode>()
      val hr = fn.invokeHR(arrayOf(__705029991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StereoscopicVideoPackingMode>(result.getValue())
      return resultValue
    }
  }

  public class IVideoEncodingProperties3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __705029991_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVideoEncodingProperties3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("386bcdc4873a479fb3eb56c1fcbec6d7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVideoEncodingProperties3(ptr: Pointer?): WithDefault =
        IVideoEncodingProperties3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVideoEncodingProperties3 {
      val address = segment.toRawLongValue()
      return makeIVideoEncodingProperties3(Pointer(address))
    }

    public override fun toNative(obj: IVideoEncodingProperties3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__705029991_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVideoEncodingProperties3):
        Array<IVideoEncodingProperties3?> = (elements as
        Array<IVideoEncodingProperties3?>).castToImpl<IVideoEncodingProperties3,IVideoEncodingProperties3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVideoEncodingProperties3?> =
        arrayOfNulls<IVideoEncodingProperties3_Impl>(size) as Array<IVideoEncodingProperties3?>
  }
}
