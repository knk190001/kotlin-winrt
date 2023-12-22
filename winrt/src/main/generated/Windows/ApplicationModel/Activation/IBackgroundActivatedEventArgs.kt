package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Background.IBackgroundTaskInstance
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

@ABIMarker(IBackgroundActivatedEventArgs.ABI::class)
@Signature("{ab14bee0-e760-440e-a91c-44796de3a92d}")
@Guid("ab14bee0e760440ea91c44796de3a92d")
@WinRTInterface("ab14bee0e760440ea91c44796de3a92d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundActivatedEventArgs.ByReference::class)
public interface IBackgroundActivatedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TaskInstance(): IBackgroundTaskInstance?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundActivatedEventArgs> {
    public override fun getValue() = ABI.makeIBackgroundActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IBackgroundActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundActivatedEventArgs {
    public val __350072093_Ptr: Pointer?

    public val _350072093_VtblPtr: Pointer?
      get() = __350072093_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TaskInstance(): IBackgroundTaskInstance? {
      val fnPtr = _350072093_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBackgroundTaskInstance>()
      val hr = fn.invokeHR(arrayOf(__350072093_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBackgroundTaskInstance>(result.getValue())
      return resultValue
    }
  }

  public class IBackgroundActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __350072093_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ab14bee0e760440ea91c44796de3a92d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundActivatedEventArgs(ptr: Pointer?): WithDefault =
        IBackgroundActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIBackgroundActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__350072093_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundActivatedEventArgs):
        Array<IBackgroundActivatedEventArgs?> = (elements as
        Array<IBackgroundActivatedEventArgs?>).castToImpl<IBackgroundActivatedEventArgs,IBackgroundActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundActivatedEventArgs?> =
        arrayOfNulls<IBackgroundActivatedEventArgs_Impl>(size) as
        Array<IBackgroundActivatedEventArgs?>
  }
}
