package Windows.Media.Capture.Frames

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

@ABIMarker(IVideoMediaFrameFormat.ABI::class)
@Signature("{46027fc0-d71b-45c7-8f14-6d9a0ae604e4}")
@Guid("46027fc0d71b45c78f146d9a0ae604e4")
@WinRTInterface("46027fc0d71b45c78f146d9a0ae604e4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVideoMediaFrameFormat.ByReference::class)
public interface IVideoMediaFrameFormat : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MediaFrameFormat(): MediaFrameFormat?

  @InterfaceMethod(1)
  public fun get_DepthFormat(): DepthMediaFrameFormat?

  @InterfaceMethod(2)
  public fun get_Width(): WinDef.UINT

  @InterfaceMethod(3)
  public fun get_Height(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVideoMediaFrameFormat> {
    public override fun getValue() = ABI.makeIVideoMediaFrameFormat(pointer.getPointer(0))

    public fun setValue(value: IVideoMediaFrameFormat_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVideoMediaFrameFormat {
    public val __812044939_Ptr: Pointer?

    public val _812044939_VtblPtr: Pointer?
      get() = __812044939_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MediaFrameFormat(): MediaFrameFormat? {
      val fnPtr = _812044939_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaFrameFormat>()
      val hr = fn.invokeHR(arrayOf(__812044939_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaFrameFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DepthFormat(): DepthMediaFrameFormat? {
      val fnPtr = _812044939_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DepthMediaFrameFormat>()
      val hr = fn.invokeHR(arrayOf(__812044939_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DepthMediaFrameFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Width(): WinDef.UINT {
      val fnPtr = _812044939_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__812044939_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_Height(): WinDef.UINT {
      val fnPtr = _812044939_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__812044939_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IVideoMediaFrameFormat_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __812044939_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVideoMediaFrameFormat, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("46027fc0d71b45c78f146d9a0ae604e4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVideoMediaFrameFormat(ptr: Pointer?): WithDefault =
        IVideoMediaFrameFormat_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVideoMediaFrameFormat {
      val address = segment.toRawLongValue()
      return makeIVideoMediaFrameFormat(Pointer(address))
    }

    public override fun toNative(obj: IVideoMediaFrameFormat): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__812044939_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVideoMediaFrameFormat): Array<IVideoMediaFrameFormat?> =
        (elements as
        Array<IVideoMediaFrameFormat?>).castToImpl<IVideoMediaFrameFormat,IVideoMediaFrameFormat_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVideoMediaFrameFormat?> =
        arrayOfNulls<IVideoMediaFrameFormat_Impl>(size) as Array<IVideoMediaFrameFormat?>
  }
}
