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

@ABIMarker(IVideoEncodingProperties5.ABI::class)
@Signature("{4959080f-272f-4ece-a4df-c0ccdb33d840}")
@Guid("4959080f272f4ecea4dfc0ccdb33d840")
@WinRTInterface("4959080f272f4ecea4dfc0ccdb33d840")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVideoEncodingProperties5.ByReference::class)
public interface IVideoEncodingProperties5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Copy(): VideoEncodingProperties?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVideoEncodingProperties5> {
    public override fun getValue() = ABI.makeIVideoEncodingProperties5(pointer.getPointer(0))

    public fun setValue(value: IVideoEncodingProperties5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVideoEncodingProperties5 {
    public val __705029989_Ptr: Pointer?

    public val _705029989_VtblPtr: Pointer?
      get() = __705029989_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Copy(): VideoEncodingProperties? {
      val fnPtr = _705029989_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__705029989_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoEncodingProperties>(result.getValue())
      return resultValue
    }
  }

  public class IVideoEncodingProperties5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __705029989_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVideoEncodingProperties5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4959080f272f4ecea4dfc0ccdb33d840")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVideoEncodingProperties5(ptr: Pointer?): WithDefault =
        IVideoEncodingProperties5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVideoEncodingProperties5 {
      val address = segment.toRawLongValue()
      return makeIVideoEncodingProperties5(Pointer(address))
    }

    public override fun toNative(obj: IVideoEncodingProperties5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__705029989_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVideoEncodingProperties5):
        Array<IVideoEncodingProperties5?> = (elements as
        Array<IVideoEncodingProperties5?>).castToImpl<IVideoEncodingProperties5,IVideoEncodingProperties5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVideoEncodingProperties5?> =
        arrayOfNulls<IVideoEncodingProperties5_Impl>(size) as Array<IVideoEncodingProperties5?>
  }
}
