package Windows.Storage.Pickers.Provider

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFileRemovedEventArgs.ABI::class)
@Signature("{13043da7-7fca-4c2b-9eca-6890f9f00185}")
@Guid("13043da77fca4c2b9eca6890f9f00185")
@WinRTInterface("13043da77fca4c2b9eca6890f9f00185")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFileRemovedEventArgs.ByReference::class)
public interface IFileRemovedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFileRemovedEventArgs> {
    public override fun getValue() = ABI.makeIFileRemovedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IFileRemovedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFileRemovedEventArgs {
    public val __1798609892_Ptr: Pointer?

    public val _1798609892_VtblPtr: Pointer?
      get() = __1798609892_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _1798609892_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1798609892_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IFileRemovedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1798609892_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFileRemovedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("13043da77fca4c2b9eca6890f9f00185")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFileRemovedEventArgs(ptr: Pointer?): WithDefault =
        IFileRemovedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFileRemovedEventArgs {
      val address = segment.toRawLongValue()
      return makeIFileRemovedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IFileRemovedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1798609892_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFileRemovedEventArgs): Array<IFileRemovedEventArgs?> =
        (elements as
        Array<IFileRemovedEventArgs?>).castToImpl<IFileRemovedEventArgs,IFileRemovedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFileRemovedEventArgs?> =
        arrayOfNulls<IFileRemovedEventArgs_Impl>(size) as Array<IFileRemovedEventArgs?>
  }
}
