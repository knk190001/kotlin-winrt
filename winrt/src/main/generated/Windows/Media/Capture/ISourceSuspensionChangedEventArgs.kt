package Windows.Media.Capture

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

@ABIMarker(ISourceSuspensionChangedEventArgs.ABI::class)
@Signature("{2ece7b5e-d49b-4394-bc32-f97d6cedec1c}")
@Guid("2ece7b5ed49b4394bc32f97d6cedec1c")
@WinRTInterface("2ece7b5ed49b4394bc32f97d6cedec1c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISourceSuspensionChangedEventArgs.ByReference::class)
public interface ISourceSuspensionChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsAudioSuspended(): Boolean

  @InterfaceMethod(1)
  public fun get_IsVideoSuspended(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISourceSuspensionChangedEventArgs> {
    public override fun getValue() =
        ABI.makeISourceSuspensionChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISourceSuspensionChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISourceSuspensionChangedEventArgs {
    public val __1750608019_Ptr: Pointer?

    public val _1750608019_VtblPtr: Pointer?
      get() = __1750608019_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsAudioSuspended(): Boolean {
      val fnPtr = _1750608019_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1750608019_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsVideoSuspended(): Boolean {
      val fnPtr = _1750608019_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1750608019_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ISourceSuspensionChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1750608019_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISourceSuspensionChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2ece7b5ed49b4394bc32f97d6cedec1c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISourceSuspensionChangedEventArgs(ptr: Pointer?): WithDefault =
        ISourceSuspensionChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISourceSuspensionChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeISourceSuspensionChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISourceSuspensionChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1750608019_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISourceSuspensionChangedEventArgs):
        Array<ISourceSuspensionChangedEventArgs?> = (elements as
        Array<ISourceSuspensionChangedEventArgs?>).castToImpl<ISourceSuspensionChangedEventArgs,ISourceSuspensionChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISourceSuspensionChangedEventArgs?> =
        arrayOfNulls<ISourceSuspensionChangedEventArgs_Impl>(size) as
        Array<ISourceSuspensionChangedEventArgs?>
  }
}
