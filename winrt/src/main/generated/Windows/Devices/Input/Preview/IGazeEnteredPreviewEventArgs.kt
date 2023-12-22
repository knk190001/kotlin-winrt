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

@ABIMarker(IGazeEnteredPreviewEventArgs.ABI::class)
@Signature("{2567bf43-1225-489f-9dd1-daa7c50fbf4b}")
@Guid("2567bf431225489f9dd1daa7c50fbf4b")
@WinRTInterface("2567bf431225489f9dd1daa7c50fbf4b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGazeEnteredPreviewEventArgs.ByReference::class)
public interface IGazeEnteredPreviewEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Handled(): Boolean

  @InterfaceMethod(1)
  public fun put_Handled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_CurrentPoint(): GazePointPreview?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGazeEnteredPreviewEventArgs> {
    public override fun getValue() = ABI.makeIGazeEnteredPreviewEventArgs(pointer.getPointer(0))

    public fun setValue(value: IGazeEnteredPreviewEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGazeEnteredPreviewEventArgs {
    public val __1121171808_Ptr: Pointer?

    public val _1121171808_VtblPtr: Pointer?
      get() = __1121171808_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Handled(): Boolean {
      val fnPtr = _1121171808_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1121171808_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _1121171808_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1121171808_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CurrentPoint(): GazePointPreview? {
      val fnPtr = _1121171808_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GazePointPreview>()
      val hr = fn.invokeHR(arrayOf(__1121171808_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GazePointPreview>(result.getValue())
      return resultValue
    }
  }

  public class IGazeEnteredPreviewEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1121171808_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGazeEnteredPreviewEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2567bf431225489f9dd1daa7c50fbf4b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGazeEnteredPreviewEventArgs(ptr: Pointer?): WithDefault =
        IGazeEnteredPreviewEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGazeEnteredPreviewEventArgs {
      val address = segment.toRawLongValue()
      return makeIGazeEnteredPreviewEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IGazeEnteredPreviewEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1121171808_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGazeEnteredPreviewEventArgs):
        Array<IGazeEnteredPreviewEventArgs?> = (elements as
        Array<IGazeEnteredPreviewEventArgs?>).castToImpl<IGazeEnteredPreviewEventArgs,IGazeEnteredPreviewEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGazeEnteredPreviewEventArgs?> =
        arrayOfNulls<IGazeEnteredPreviewEventArgs_Impl>(size) as
        Array<IGazeEnteredPreviewEventArgs?>
  }
}
