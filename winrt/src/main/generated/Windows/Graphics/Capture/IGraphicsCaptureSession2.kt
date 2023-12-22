package Windows.Graphics.Capture

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

@ABIMarker(IGraphicsCaptureSession2.ABI::class)
@Signature("{2c39ae40-7d2e-5044-804e-8b6799d4cf9e}")
@Guid("2c39ae407d2e5044804e8b6799d4cf9e")
@WinRTInterface("2c39ae407d2e5044804e8b6799d4cf9e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGraphicsCaptureSession2.ByReference::class)
public interface IGraphicsCaptureSession2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsCursorCaptureEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsCursorCaptureEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGraphicsCaptureSession2> {
    public override fun getValue() = ABI.makeIGraphicsCaptureSession2(pointer.getPointer(0))

    public fun setValue(value: IGraphicsCaptureSession2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGraphicsCaptureSession2 {
    public val __1526700484_Ptr: Pointer?

    public val _1526700484_VtblPtr: Pointer?
      get() = __1526700484_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsCursorCaptureEnabled(): Boolean {
      val fnPtr = _1526700484_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1526700484_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsCursorCaptureEnabled(value: Boolean): Unit {
      val fnPtr = _1526700484_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1526700484_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGraphicsCaptureSession2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1526700484_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGraphicsCaptureSession2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2c39ae407d2e5044804e8b6799d4cf9e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGraphicsCaptureSession2(ptr: Pointer?): WithDefault =
        IGraphicsCaptureSession2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGraphicsCaptureSession2 {
      val address = segment.toRawLongValue()
      return makeIGraphicsCaptureSession2(Pointer(address))
    }

    public override fun toNative(obj: IGraphicsCaptureSession2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1526700484_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGraphicsCaptureSession2):
        Array<IGraphicsCaptureSession2?> = (elements as
        Array<IGraphicsCaptureSession2?>).castToImpl<IGraphicsCaptureSession2,IGraphicsCaptureSession2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGraphicsCaptureSession2?> =
        arrayOfNulls<IGraphicsCaptureSession2_Impl>(size) as Array<IGraphicsCaptureSession2?>
  }
}
