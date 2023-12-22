package Microsoft.UI.Composition

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

@ABIMarker(IRenderingDeviceReplacedEventArgs.ABI::class)
@Signature("{fe5b97c7-f656-56d6-a0cd-3e1227e4dd44}")
@Guid("fe5b97c7f65656d6a0cd3e1227e4dd44")
@WinRTInterface("fe5b97c7f65656d6a0cd3e1227e4dd44")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRenderingDeviceReplacedEventArgs.ByReference::class)
public interface IRenderingDeviceReplacedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_GraphicsDevice(): CompositionGraphicsDevice?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRenderingDeviceReplacedEventArgs> {
    public override fun getValue() =
        ABI.makeIRenderingDeviceReplacedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IRenderingDeviceReplacedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRenderingDeviceReplacedEventArgs {
    public val __174891906_Ptr: Pointer?

    public val _174891906_VtblPtr: Pointer?
      get() = __174891906_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_GraphicsDevice(): CompositionGraphicsDevice? {
      val fnPtr = _174891906_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionGraphicsDevice>()
      val hr = fn.invokeHR(arrayOf(__174891906_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionGraphicsDevice>(result.getValue())
      return resultValue
    }
  }

  public class IRenderingDeviceReplacedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __174891906_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRenderingDeviceReplacedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fe5b97c7f65656d6a0cd3e1227e4dd44")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRenderingDeviceReplacedEventArgs(ptr: Pointer?): WithDefault =
        IRenderingDeviceReplacedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRenderingDeviceReplacedEventArgs {
      val address = segment.toRawLongValue()
      return makeIRenderingDeviceReplacedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IRenderingDeviceReplacedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__174891906_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRenderingDeviceReplacedEventArgs):
        Array<IRenderingDeviceReplacedEventArgs?> = (elements as
        Array<IRenderingDeviceReplacedEventArgs?>).castToImpl<IRenderingDeviceReplacedEventArgs,IRenderingDeviceReplacedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRenderingDeviceReplacedEventArgs?> =
        arrayOfNulls<IRenderingDeviceReplacedEventArgs_Impl>(size) as
        Array<IRenderingDeviceReplacedEventArgs?>
  }
}
