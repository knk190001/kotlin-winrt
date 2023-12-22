package Windows.Media.Core

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

@ABIMarker(IVideoStreamDescriptor2.ABI::class)
@Signature("{8b306e10-453e-4088-832d-c36fa4f94af3}")
@Guid("8b306e10453e4088832dc36fa4f94af3")
@WinRTInterface("8b306e10453e4088832dc36fa4f94af3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVideoStreamDescriptor2.ByReference::class)
public interface IVideoStreamDescriptor2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Copy(): VideoStreamDescriptor?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVideoStreamDescriptor2> {
    public override fun getValue() = ABI.makeIVideoStreamDescriptor2(pointer.getPointer(0))

    public fun setValue(value: IVideoStreamDescriptor2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVideoStreamDescriptor2 {
    public val __813591773_Ptr: Pointer?

    public val _813591773_VtblPtr: Pointer?
      get() = __813591773_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Copy(): VideoStreamDescriptor? {
      val fnPtr = _813591773_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoStreamDescriptor>()
      val hr = fn.invokeHR(arrayOf(__813591773_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoStreamDescriptor>(result.getValue())
      return resultValue
    }
  }

  public class IVideoStreamDescriptor2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __813591773_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVideoStreamDescriptor2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8b306e10453e4088832dc36fa4f94af3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVideoStreamDescriptor2(ptr: Pointer?): WithDefault =
        IVideoStreamDescriptor2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVideoStreamDescriptor2 {
      val address = segment.toRawLongValue()
      return makeIVideoStreamDescriptor2(Pointer(address))
    }

    public override fun toNative(obj: IVideoStreamDescriptor2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__813591773_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVideoStreamDescriptor2): Array<IVideoStreamDescriptor2?>
        = (elements as
        Array<IVideoStreamDescriptor2?>).castToImpl<IVideoStreamDescriptor2,IVideoStreamDescriptor2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVideoStreamDescriptor2?> =
        arrayOfNulls<IVideoStreamDescriptor2_Impl>(size) as Array<IVideoStreamDescriptor2?>
  }
}
