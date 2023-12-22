package Windows.Media.Editing

import Windows.Foundation.Collections.IVector
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

@ABIMarker(IMediaComposition2.ABI::class)
@Signature("{a59e5372-2366-492c-bec8-e6dfba6d0281}")
@Guid("a59e53722366492cbec8e6dfba6d0281")
@WinRTInterface("a59e53722366492cbec8e6dfba6d0281")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaComposition2.ByReference::class)
public interface IMediaComposition2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OverlayLayers(): IVector<MediaOverlayLayer?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaComposition2> {
    public override fun getValue() = ABI.makeIMediaComposition2(pointer.getPointer(0))

    public fun setValue(value: IMediaComposition2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaComposition2 {
    public val __371851578_Ptr: Pointer?

    public val _371851578_VtblPtr: Pointer?
      get() = __371851578_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OverlayLayers(): IVector<MediaOverlayLayer?>? {
      val fnPtr = _371851578_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<MediaOverlayLayer?>>()
      val hr = fn.invokeHR(arrayOf(__371851578_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<MediaOverlayLayer?>>(result.getValue())
      return resultValue
    }
  }

  public class IMediaComposition2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __371851578_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaComposition2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a59e53722366492cbec8e6dfba6d0281")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaComposition2(ptr: Pointer?): WithDefault = IMediaComposition2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaComposition2 {
      val address = segment.toRawLongValue()
      return makeIMediaComposition2(Pointer(address))
    }

    public override fun toNative(obj: IMediaComposition2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__371851578_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaComposition2): Array<IMediaComposition2?> =
        (elements as
        Array<IMediaComposition2?>).castToImpl<IMediaComposition2,IMediaComposition2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaComposition2?> =
        arrayOfNulls<IMediaComposition2_Impl>(size) as Array<IMediaComposition2?>
  }
}
