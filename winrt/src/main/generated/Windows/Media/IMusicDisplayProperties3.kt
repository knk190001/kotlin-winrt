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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IMusicDisplayProperties3.ABI::class)
@Signature("{4db51ac1-0681-4e8c-9401-b8159d9eefc7}")
@Guid("4db51ac106814e8c9401b8159d9eefc7")
@WinRTInterface("4db51ac106814e8c9401b8159d9eefc7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMusicDisplayProperties3.ByReference::class)
public interface IMusicDisplayProperties3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AlbumTrackCount(): WinDef.UINT

  @InterfaceMethod(1)
  public fun put_AlbumTrackCount(value: WinDef.UINT): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMusicDisplayProperties3> {
    public override fun getValue() = ABI.makeIMusicDisplayProperties3(pointer.getPointer(0))

    public fun setValue(value: IMusicDisplayProperties3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMusicDisplayProperties3 {
    public val __1217417523_Ptr: Pointer?

    public val _1217417523_VtblPtr: Pointer?
      get() = __1217417523_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AlbumTrackCount(): WinDef.UINT {
      val fnPtr = _1217417523_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1217417523_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_AlbumTrackCount(value: WinDef.UINT): Unit {
      val fnPtr = _1217417523_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1217417523_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMusicDisplayProperties3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1217417523_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMusicDisplayProperties3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4db51ac106814e8c9401b8159d9eefc7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMusicDisplayProperties3(ptr: Pointer?): WithDefault =
        IMusicDisplayProperties3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMusicDisplayProperties3 {
      val address = segment.toRawLongValue()
      return makeIMusicDisplayProperties3(Pointer(address))
    }

    public override fun toNative(obj: IMusicDisplayProperties3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1217417523_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMusicDisplayProperties3):
        Array<IMusicDisplayProperties3?> = (elements as
        Array<IMusicDisplayProperties3?>).castToImpl<IMusicDisplayProperties3,IMusicDisplayProperties3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMusicDisplayProperties3?> =
        arrayOfNulls<IMusicDisplayProperties3_Impl>(size) as Array<IMusicDisplayProperties3?>
  }
}
