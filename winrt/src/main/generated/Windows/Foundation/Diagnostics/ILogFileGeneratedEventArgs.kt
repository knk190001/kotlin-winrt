package Windows.Foundation.Diagnostics

import Windows.Storage.StorageFile
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

@ABIMarker(ILogFileGeneratedEventArgs.ABI::class)
@Signature("{269e976f-0d38-4c1a-b53f-b395d881df84}")
@Guid("269e976f0d384c1ab53fb395d881df84")
@WinRTInterface("269e976f0d384c1ab53fb395d881df84")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILogFileGeneratedEventArgs.ByReference::class)
public interface ILogFileGeneratedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_File(): StorageFile?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILogFileGeneratedEventArgs> {
    public override fun getValue() = ABI.makeILogFileGeneratedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ILogFileGeneratedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILogFileGeneratedEventArgs {
    public val __1194967461_Ptr: Pointer?

    public val _1194967461_VtblPtr: Pointer?
      get() = __1194967461_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_File(): StorageFile? {
      val fnPtr = _1194967461_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFile>()
      val hr = fn.invokeHR(arrayOf(__1194967461_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFile>(result.getValue())
      return resultValue
    }
  }

  public class ILogFileGeneratedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1194967461_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILogFileGeneratedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("269e976f0d384c1ab53fb395d881df84")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILogFileGeneratedEventArgs(ptr: Pointer?): WithDefault =
        ILogFileGeneratedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILogFileGeneratedEventArgs {
      val address = segment.toRawLongValue()
      return makeILogFileGeneratedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ILogFileGeneratedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1194967461_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILogFileGeneratedEventArgs):
        Array<ILogFileGeneratedEventArgs?> = (elements as
        Array<ILogFileGeneratedEventArgs?>).castToImpl<ILogFileGeneratedEventArgs,ILogFileGeneratedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILogFileGeneratedEventArgs?> =
        arrayOfNulls<ILogFileGeneratedEventArgs_Impl>(size) as Array<ILogFileGeneratedEventArgs?>
  }
}
