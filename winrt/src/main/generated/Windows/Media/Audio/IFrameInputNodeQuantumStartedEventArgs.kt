package Windows.Media.Audio

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

@ABIMarker(IFrameInputNodeQuantumStartedEventArgs.ABI::class)
@Signature("{3d9bd498-a306-4f06-bd9f-e9efc8226304}")
@Guid("3d9bd498a3064f06bd9fe9efc8226304")
@WinRTInterface("3d9bd498a3064f06bd9fe9efc8226304")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameInputNodeQuantumStartedEventArgs.ByReference::class)
public interface IFrameInputNodeQuantumStartedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RequiredSamples(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFrameInputNodeQuantumStartedEventArgs> {
    public override fun getValue() =
        ABI.makeIFrameInputNodeQuantumStartedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IFrameInputNodeQuantumStartedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameInputNodeQuantumStartedEventArgs {
    public val __1863394870_Ptr: Pointer?

    public val _1863394870_VtblPtr: Pointer?
      get() = __1863394870_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RequiredSamples(): Int {
      val fnPtr = _1863394870_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1863394870_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IFrameInputNodeQuantumStartedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1863394870_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameInputNodeQuantumStartedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3d9bd498a3064f06bd9fe9efc8226304")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameInputNodeQuantumStartedEventArgs(ptr: Pointer?): WithDefault =
        IFrameInputNodeQuantumStartedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameInputNodeQuantumStartedEventArgs {
      val address = segment.toRawLongValue()
      return makeIFrameInputNodeQuantumStartedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IFrameInputNodeQuantumStartedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1863394870_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameInputNodeQuantumStartedEventArgs):
        Array<IFrameInputNodeQuantumStartedEventArgs?> = (elements as
        Array<IFrameInputNodeQuantumStartedEventArgs?>).castToImpl<IFrameInputNodeQuantumStartedEventArgs,IFrameInputNodeQuantumStartedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameInputNodeQuantumStartedEventArgs?> =
        arrayOfNulls<IFrameInputNodeQuantumStartedEventArgs_Impl>(size) as
        Array<IFrameInputNodeQuantumStartedEventArgs?>
  }
}
