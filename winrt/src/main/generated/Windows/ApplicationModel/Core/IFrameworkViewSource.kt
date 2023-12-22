package Windows.ApplicationModel.Core

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

@ABIMarker(IFrameworkViewSource.ABI::class)
@Signature("{cd770614-65c4-426c-9494-34fc43554862}")
@Guid("cd77061465c4426c949434fc43554862")
@WinRTInterface("cd77061465c4426c949434fc43554862")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameworkViewSource.ByReference::class)
public interface IFrameworkViewSource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateView(): IFrameworkView?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFrameworkViewSource> {
    public override fun getValue() = ABI.makeIFrameworkViewSource(pointer.getPointer(0))

    public fun setValue(value: IFrameworkViewSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameworkViewSource {
    public val __422737506_Ptr: Pointer?

    public val _422737506_VtblPtr: Pointer?
      get() = __422737506_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateView(): IFrameworkView? {
      val fnPtr = _422737506_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IFrameworkView>()
      val hr = fn.invokeHR(arrayOf(__422737506_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IFrameworkView>(result.getValue())
      return resultValue
    }
  }

  public class IFrameworkViewSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __422737506_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameworkViewSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cd77061465c4426c949434fc43554862")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameworkViewSource(ptr: Pointer?): WithDefault = IFrameworkViewSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameworkViewSource {
      val address = segment.toRawLongValue()
      return makeIFrameworkViewSource(Pointer(address))
    }

    public override fun toNative(obj: IFrameworkViewSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__422737506_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameworkViewSource): Array<IFrameworkViewSource?> =
        (elements as
        Array<IFrameworkViewSource?>).castToImpl<IFrameworkViewSource,IFrameworkViewSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameworkViewSource?> =
        arrayOfNulls<IFrameworkViewSource_Impl>(size) as Array<IFrameworkViewSource?>
  }
}
