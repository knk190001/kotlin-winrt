package Windows.ApplicationModel.Calls

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

@ABIMarker(IPhoneLineWatcherEventArgs.ABI::class)
@Signature("{d07c753e-9e12-4a37-82b7-ad535dad6a67}")
@Guid("d07c753e9e124a3782b7ad535dad6a67")
@WinRTInterface("d07c753e9e124a3782b7ad535dad6a67")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneLineWatcherEventArgs.ByReference::class)
public interface IPhoneLineWatcherEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LineId(): com.sun.jna.platform.win32.Guid.GUID?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneLineWatcherEventArgs> {
    public override fun getValue() = ABI.makeIPhoneLineWatcherEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPhoneLineWatcherEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneLineWatcherEventArgs {
    public val __1829617183_Ptr: Pointer?

    public val _1829617183_VtblPtr: Pointer?
      get() = __1829617183_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LineId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1829617183_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1829617183_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }
  }

  public class IPhoneLineWatcherEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1829617183_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneLineWatcherEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d07c753e9e124a3782b7ad535dad6a67")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneLineWatcherEventArgs(ptr: Pointer?): WithDefault =
        IPhoneLineWatcherEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneLineWatcherEventArgs {
      val address = segment.toRawLongValue()
      return makeIPhoneLineWatcherEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPhoneLineWatcherEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1829617183_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneLineWatcherEventArgs):
        Array<IPhoneLineWatcherEventArgs?> = (elements as
        Array<IPhoneLineWatcherEventArgs?>).castToImpl<IPhoneLineWatcherEventArgs,IPhoneLineWatcherEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneLineWatcherEventArgs?> =
        arrayOfNulls<IPhoneLineWatcherEventArgs_Impl>(size) as Array<IPhoneLineWatcherEventArgs?>
  }
}
