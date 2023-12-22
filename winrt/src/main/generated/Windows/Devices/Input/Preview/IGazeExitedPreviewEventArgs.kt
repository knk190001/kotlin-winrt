package Windows.Devices.Input.Preview

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

@ABIMarker(IGazeExitedPreviewEventArgs.ABI::class)
@Signature("{5d0af07e-7d83-40ef-9f0a-fbc1bbdcc5ac}")
@Guid("5d0af07e7d8340ef9f0afbc1bbdcc5ac")
@WinRTInterface("5d0af07e7d8340ef9f0afbc1bbdcc5ac")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGazeExitedPreviewEventArgs.ByReference::class)
public interface IGazeExitedPreviewEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Handled(): Boolean

  @InterfaceMethod(1)
  public fun put_Handled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_CurrentPoint(): GazePointPreview?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGazeExitedPreviewEventArgs> {
    public override fun getValue() = ABI.makeIGazeExitedPreviewEventArgs(pointer.getPointer(0))

    public fun setValue(value: IGazeExitedPreviewEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGazeExitedPreviewEventArgs {
    public val __1274615438_Ptr: Pointer?

    public val _1274615438_VtblPtr: Pointer?
      get() = __1274615438_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Handled(): Boolean {
      val fnPtr = _1274615438_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1274615438_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _1274615438_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1274615438_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CurrentPoint(): GazePointPreview? {
      val fnPtr = _1274615438_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GazePointPreview>()
      val hr = fn.invokeHR(arrayOf(__1274615438_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GazePointPreview>(result.getValue())
      return resultValue
    }
  }

  public class IGazeExitedPreviewEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1274615438_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGazeExitedPreviewEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5d0af07e7d8340ef9f0afbc1bbdcc5ac")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGazeExitedPreviewEventArgs(ptr: Pointer?): WithDefault =
        IGazeExitedPreviewEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGazeExitedPreviewEventArgs {
      val address = segment.toRawLongValue()
      return makeIGazeExitedPreviewEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IGazeExitedPreviewEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1274615438_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGazeExitedPreviewEventArgs):
        Array<IGazeExitedPreviewEventArgs?> = (elements as
        Array<IGazeExitedPreviewEventArgs?>).castToImpl<IGazeExitedPreviewEventArgs,IGazeExitedPreviewEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGazeExitedPreviewEventArgs?> =
        arrayOfNulls<IGazeExitedPreviewEventArgs_Impl>(size) as Array<IGazeExitedPreviewEventArgs?>
  }
}
