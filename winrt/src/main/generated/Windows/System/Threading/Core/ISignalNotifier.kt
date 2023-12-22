package Windows.System.Threading.Core

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

@ABIMarker(ISignalNotifier.ABI::class)
@Signature("{14285e06-63a7-4713-b6d9-62f64b56fb8b}")
@Guid("14285e0663a74713b6d962f64b56fb8b")
@WinRTInterface("14285e0663a74713b6d962f64b56fb8b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISignalNotifier.ByReference::class)
public interface ISignalNotifier : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Enable(): Unit

  @InterfaceMethod(1)
  public fun Terminate(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISignalNotifier> {
    public override fun getValue() = ABI.makeISignalNotifier(pointer.getPointer(0))

    public fun setValue(value: ISignalNotifier_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISignalNotifier {
    public val __1318114482_Ptr: Pointer?

    public val _1318114482_VtblPtr: Pointer?
      get() = __1318114482_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Enable(): Unit {
      val fnPtr = _1318114482_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1318114482_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun Terminate(): Unit {
      val fnPtr = _1318114482_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1318114482_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISignalNotifier_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1318114482_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISignalNotifier, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("14285e0663a74713b6d962f64b56fb8b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISignalNotifier(ptr: Pointer?): WithDefault = ISignalNotifier_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISignalNotifier {
      val address = segment.toRawLongValue()
      return makeISignalNotifier(Pointer(address))
    }

    public override fun toNative(obj: ISignalNotifier): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1318114482_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISignalNotifier): Array<ISignalNotifier?> = (elements as
        Array<ISignalNotifier?>).castToImpl<ISignalNotifier,ISignalNotifier_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISignalNotifier?> =
        arrayOfNulls<ISignalNotifier_Impl>(size) as Array<ISignalNotifier?>
  }
}
