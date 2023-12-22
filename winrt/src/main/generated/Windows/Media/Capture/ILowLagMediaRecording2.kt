package Windows.Media.Capture

import Windows.Foundation.IAsyncAction
import Windows.Media.Devices.MediaCapturePauseBehavior
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

@ABIMarker(ILowLagMediaRecording2.ABI::class)
@Signature("{6369c758-5644-41e2-97af-8ef56a25e225}")
@Guid("6369c758564441e297af8ef56a25e225")
@WinRTInterface("6369c758564441e297af8ef56a25e225")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILowLagMediaRecording2.ByReference::class)
public interface ILowLagMediaRecording2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun PauseAsync(behavior: MediaCapturePauseBehavior?): IAsyncAction?

  @InterfaceMethod(1)
  public fun ResumeAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILowLagMediaRecording2> {
    public override fun getValue() = ABI.makeILowLagMediaRecording2(pointer.getPointer(0))

    public fun setValue(value: ILowLagMediaRecording2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILowLagMediaRecording2 {
    public val __731831025_Ptr: Pointer?

    public val _731831025_VtblPtr: Pointer?
      get() = __731831025_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun PauseAsync(behavior: MediaCapturePauseBehavior?): IAsyncAction? {
      val fnPtr = _731831025_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__731831025_Ptr, marshalToNative(behavior), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ResumeAsync(): IAsyncAction? {
      val fnPtr = _731831025_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__731831025_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class ILowLagMediaRecording2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __731831025_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILowLagMediaRecording2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6369c758564441e297af8ef56a25e225")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILowLagMediaRecording2(ptr: Pointer?): WithDefault =
        ILowLagMediaRecording2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILowLagMediaRecording2 {
      val address = segment.toRawLongValue()
      return makeILowLagMediaRecording2(Pointer(address))
    }

    public override fun toNative(obj: ILowLagMediaRecording2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__731831025_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILowLagMediaRecording2): Array<ILowLagMediaRecording2?> =
        (elements as
        Array<ILowLagMediaRecording2?>).castToImpl<ILowLagMediaRecording2,ILowLagMediaRecording2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILowLagMediaRecording2?> =
        arrayOfNulls<ILowLagMediaRecording2_Impl>(size) as Array<ILowLagMediaRecording2?>
  }
}
