package Windows.UI.Xaml.Controls

import Windows.Foundation.Uri
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

@ABIMarker(INotifyEventArgs2.ABI::class)
@Signature("{0d140f56-1dce-4fcd-85bc-5a5572273b9c}")
@Guid("0d140f561dce4fcd85bc5a5572273b9c")
@WinRTInterface("0d140f561dce4fcd85bc5a5572273b9c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INotifyEventArgs2.ByReference::class)
public interface INotifyEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CallingUri(): Uri?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INotifyEventArgs2> {
    public override fun getValue() = ABI.makeINotifyEventArgs2(pointer.getPointer(0))

    public fun setValue(value: INotifyEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INotifyEventArgs2 {
    public val __1013004096_Ptr: Pointer?

    public val _1013004096_VtblPtr: Pointer?
      get() = __1013004096_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CallingUri(): Uri? {
      val fnPtr = _1013004096_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1013004096_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }
  }

  public class INotifyEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1013004096_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INotifyEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0d140f561dce4fcd85bc5a5572273b9c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINotifyEventArgs2(ptr: Pointer?): WithDefault = INotifyEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INotifyEventArgs2 {
      val address = segment.toRawLongValue()
      return makeINotifyEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: INotifyEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1013004096_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INotifyEventArgs2): Array<INotifyEventArgs2?> = (elements
        as Array<INotifyEventArgs2?>).castToImpl<INotifyEventArgs2,INotifyEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INotifyEventArgs2?> =
        arrayOfNulls<INotifyEventArgs2_Impl>(size) as Array<INotifyEventArgs2?>
  }
}
