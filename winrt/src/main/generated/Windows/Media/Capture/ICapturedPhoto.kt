package Windows.Media.Capture

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

@ABIMarker(ICapturedPhoto.ABI::class)
@Signature("{b0ce7e5a-cfcc-4d6c-8ad1-0869208aca16}")
@Guid("b0ce7e5acfcc4d6c8ad10869208aca16")
@WinRTInterface("b0ce7e5acfcc4d6c8ad10869208aca16")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICapturedPhoto.ByReference::class)
public interface ICapturedPhoto : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Frame(): CapturedFrame?

  @InterfaceMethod(1)
  public fun get_Thumbnail(): CapturedFrame?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICapturedPhoto>
      {
    public override fun getValue() = ABI.makeICapturedPhoto(pointer.getPointer(0))

    public fun setValue(value: ICapturedPhoto_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICapturedPhoto {
    public val __901037540_Ptr: Pointer?

    public val _901037540_VtblPtr: Pointer?
      get() = __901037540_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Frame(): CapturedFrame? {
      val fnPtr = _901037540_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CapturedFrame>()
      val hr = fn.invokeHR(arrayOf(__901037540_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CapturedFrame>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Thumbnail(): CapturedFrame? {
      val fnPtr = _901037540_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CapturedFrame>()
      val hr = fn.invokeHR(arrayOf(__901037540_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CapturedFrame>(result.getValue())
      return resultValue
    }
  }

  public class ICapturedPhoto_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __901037540_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICapturedPhoto, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b0ce7e5acfcc4d6c8ad10869208aca16")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICapturedPhoto(ptr: Pointer?): WithDefault = ICapturedPhoto_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICapturedPhoto {
      val address = segment.toRawLongValue()
      return makeICapturedPhoto(Pointer(address))
    }

    public override fun toNative(obj: ICapturedPhoto): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__901037540_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICapturedPhoto): Array<ICapturedPhoto?> = (elements as
        Array<ICapturedPhoto?>).castToImpl<ICapturedPhoto,ICapturedPhoto_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICapturedPhoto?> =
        arrayOfNulls<ICapturedPhoto_Impl>(size) as Array<ICapturedPhoto?>
  }
}
