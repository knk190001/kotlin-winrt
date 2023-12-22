package Windows.Devices.Input.Preview

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGazeMovedPreviewEventArgs.ABI::class)
@Signature("{e79e7eeb-b389-11e7-b201-c8d3ffb75721}")
@Guid("e79e7eebb38911e7b201c8d3ffb75721")
@WinRTInterface("e79e7eebb38911e7b201c8d3ffb75721")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGazeMovedPreviewEventArgs.ByReference::class)
public interface IGazeMovedPreviewEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Handled(): Boolean

  @InterfaceMethod(1)
  public fun put_Handled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_CurrentPoint(): GazePointPreview?

  @InterfaceMethod(3)
  public fun GetIntermediatePoints(): IVector<GazePointPreview?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGazeMovedPreviewEventArgs> {
    public override fun getValue() = ABI.makeIGazeMovedPreviewEventArgs(pointer.getPointer(0))

    public fun setValue(value: IGazeMovedPreviewEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGazeMovedPreviewEventArgs {
    public val __1717362268_Ptr: Pointer?

    public val _1717362268_VtblPtr: Pointer?
      get() = __1717362268_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Handled(): Boolean {
      val fnPtr = _1717362268_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1717362268_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _1717362268_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1717362268_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CurrentPoint(): GazePointPreview? {
      val fnPtr = _1717362268_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GazePointPreview>()
      val hr = fn.invokeHR(arrayOf(__1717362268_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GazePointPreview>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetIntermediatePoints(): IVector<GazePointPreview?>? {
      val fnPtr = _1717362268_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<GazePointPreview?>>()
      val hr = fn.invokeHR(arrayOf(__1717362268_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<GazePointPreview?>>(result.getValue())
      return resultValue
    }
  }

  public class IGazeMovedPreviewEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1717362268_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGazeMovedPreviewEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e79e7eebb38911e7b201c8d3ffb75721")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGazeMovedPreviewEventArgs(ptr: Pointer?): WithDefault =
        IGazeMovedPreviewEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGazeMovedPreviewEventArgs {
      val address = segment.toRawLongValue()
      return makeIGazeMovedPreviewEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IGazeMovedPreviewEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1717362268_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGazeMovedPreviewEventArgs):
        Array<IGazeMovedPreviewEventArgs?> = (elements as
        Array<IGazeMovedPreviewEventArgs?>).castToImpl<IGazeMovedPreviewEventArgs,IGazeMovedPreviewEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGazeMovedPreviewEventArgs?> =
        arrayOfNulls<IGazeMovedPreviewEventArgs_Impl>(size) as Array<IGazeMovedPreviewEventArgs?>
  }
}
