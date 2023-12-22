package Windows.Media.Capture.Frames

import Windows.Storage.Streams.IBuffer
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

@ABIMarker(IBufferMediaFrame.ABI::class)
@Signature("{b5b153c7-9b84-4062-b79c-a365b2596854}")
@Guid("b5b153c79b844062b79ca365b2596854")
@WinRTInterface("b5b153c79b844062b79ca365b2596854")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBufferMediaFrame.ByReference::class)
public interface IBufferMediaFrame : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FrameReference(): MediaFrameReference?

  @InterfaceMethod(1)
  public fun get_Buffer(): IBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBufferMediaFrame> {
    public override fun getValue() = ABI.makeIBufferMediaFrame(pointer.getPointer(0))

    public fun setValue(value: IBufferMediaFrame_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBufferMediaFrame {
    public val __993697391_Ptr: Pointer?

    public val _993697391_VtblPtr: Pointer?
      get() = __993697391_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FrameReference(): MediaFrameReference? {
      val fnPtr = _993697391_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaFrameReference>()
      val hr = fn.invokeHR(arrayOf(__993697391_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaFrameReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Buffer(): IBuffer? {
      val fnPtr = _993697391_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__993697391_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }
  }

  public class IBufferMediaFrame_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __993697391_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBufferMediaFrame, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b5b153c79b844062b79ca365b2596854")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBufferMediaFrame(ptr: Pointer?): WithDefault = IBufferMediaFrame_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBufferMediaFrame {
      val address = segment.toRawLongValue()
      return makeIBufferMediaFrame(Pointer(address))
    }

    public override fun toNative(obj: IBufferMediaFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__993697391_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBufferMediaFrame): Array<IBufferMediaFrame?> = (elements
        as Array<IBufferMediaFrame?>).castToImpl<IBufferMediaFrame,IBufferMediaFrame_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBufferMediaFrame?> =
        arrayOfNulls<IBufferMediaFrame_Impl>(size) as Array<IBufferMediaFrame?>
  }
}
