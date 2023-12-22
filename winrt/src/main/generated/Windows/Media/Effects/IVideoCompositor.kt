package Windows.Media.Effects

import Windows.Graphics.DirectX.Direct3D11.IDirect3DDevice
import Windows.Media.IMediaExtension
import Windows.Media.IMediaExtension.ABI.IID
import Windows.Media.MediaProperties.VideoEncodingProperties
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVideoCompositor.ABI::class)
@Signature("{8510b43e-420c-420f-96c7-7c98bba1fc55}")
@Guid("8510b43e420c420f96c77c98bba1fc55")
@WinRTInterface("8510b43e420c420f96c77c98bba1fc55")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVideoCompositor.ByReference::class)
public interface IVideoCompositor : NativeMapped, IWinRTInterface, IMediaExtension {
  @InterfaceMethod(0)
  public fun get_TimeIndependent(): Boolean

  @InterfaceMethod(1)
  public fun SetEncodingProperties(backgroundProperties: VideoEncodingProperties?,
      device: IDirect3DDevice?): Unit

  @InterfaceMethod(2)
  public fun CompositeFrame(context: CompositeVideoFrameContext?): Unit

  @InterfaceMethod(3)
  public fun Close(reason: MediaEffectClosedReason?): Unit

  @InterfaceMethod(4)
  public fun DiscardQueuedFrames(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVideoCompositor> {
    public override fun getValue() = ABI.makeIVideoCompositor(pointer.getPointer(0))

    public fun setValue(value: IVideoCompositor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVideoCompositor, IMediaExtension.WithDefault {
    public val __506012224_Ptr: Pointer?

    public val _506012224_VtblPtr: Pointer?
      get() = __506012224_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TimeIndependent(): Boolean {
      val fnPtr = _506012224_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__506012224_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun SetEncodingProperties(backgroundProperties: VideoEncodingProperties?,
        device: IDirect3DDevice?): Unit {
      val fnPtr = _506012224_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__506012224_Ptr, marshalToNative(backgroundProperties),
          marshalToNative(device),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun CompositeFrame(context: CompositeVideoFrameContext?): Unit {
      val fnPtr = _506012224_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__506012224_Ptr, marshalToNative(context),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun Close(reason: MediaEffectClosedReason?): Unit {
      val fnPtr = _506012224_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__506012224_Ptr, marshalToNative(reason),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun DiscardQueuedFrames(): Unit {
      val fnPtr = _506012224_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__506012224_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVideoCompositor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaExtension {
    public override val __9720779_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_506012224_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __506012224_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVideoCompositor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8510b43e420c420f96c77c98bba1fc55")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVideoCompositor(ptr: Pointer?): WithDefault = IVideoCompositor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVideoCompositor {
      val address = segment.toRawLongValue()
      return makeIVideoCompositor(Pointer(address))
    }

    public override fun toNative(obj: IVideoCompositor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__506012224_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVideoCompositor): Array<IVideoCompositor?> = (elements as
        Array<IVideoCompositor?>).castToImpl<IVideoCompositor,IVideoCompositor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVideoCompositor?> =
        arrayOfNulls<IVideoCompositor_Impl>(size) as Array<IVideoCompositor?>
  }
}
