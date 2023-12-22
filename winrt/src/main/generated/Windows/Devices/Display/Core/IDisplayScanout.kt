package Windows.Devices.Display.Core

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDisplayScanout.ABI::class)
@Signature("{e3051828-1ba5-50e7-8a39-bb1fd2f4f8b9}")
@Guid("e30518281ba550e78a39bb1fd2f4f8b9")
@WinRTInterface("e30518281ba550e78a39bb1fd2f4f8b9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayScanout.ByReference::class)
public interface IDisplayScanout : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayScanout> {
    public override fun getValue() = ABI.makeIDisplayScanout(pointer.getPointer(0))

    public fun setValue(value: IDisplayScanout_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayScanout {
    public val __1537237871_Ptr: Pointer?

    public val _1537237871_VtblPtr: Pointer?
      get() = __1537237871_Ptr?.getPointer(0)
  }

  public class IDisplayScanout_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1537237871_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayScanout, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e30518281ba550e78a39bb1fd2f4f8b9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayScanout(ptr: Pointer?): WithDefault = IDisplayScanout_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayScanout {
      val address = segment.toRawLongValue()
      return makeIDisplayScanout(Pointer(address))
    }

    public override fun toNative(obj: IDisplayScanout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1537237871_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayScanout): Array<IDisplayScanout?> = (elements as
        Array<IDisplayScanout?>).castToImpl<IDisplayScanout,IDisplayScanout_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayScanout?> =
        arrayOfNulls<IDisplayScanout_Impl>(size) as Array<IDisplayScanout?>
  }
}
