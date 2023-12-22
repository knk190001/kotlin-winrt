package Windows.Graphics.Holographic

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IHolographicSpace3.ABI::class)
@Signature("{df1733d1-f224-587e-8d71-1e8fc8f07b1f}")
@Guid("df1733d1f224587e8d711e8fc8f07b1f")
@WinRTInterface("df1733d1f224587e8d711e8fc8f07b1f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicSpace3.ByReference::class)
public interface IHolographicSpace3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFrameScanoutMonitor(maxQueuedReports: WinDef.UINT):
      HolographicFrameScanoutMonitor?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicSpace3> {
    public override fun getValue() = ABI.makeIHolographicSpace3(pointer.getPointer(0))

    public fun setValue(value: IHolographicSpace3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicSpace3 {
    public val __12649400_Ptr: Pointer?

    public val _12649400_VtblPtr: Pointer?
      get() = __12649400_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFrameScanoutMonitor(maxQueuedReports: WinDef.UINT):
        HolographicFrameScanoutMonitor? {
      val fnPtr = _12649400_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HolographicFrameScanoutMonitor>()
      val hr = fn.invokeHR(arrayOf(__12649400_Ptr, maxQueuedReports, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HolographicFrameScanoutMonitor>(result.getValue())
      return resultValue
    }
  }

  public class IHolographicSpace3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __12649400_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicSpace3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("df1733d1f224587e8d711e8fc8f07b1f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicSpace3(ptr: Pointer?): WithDefault = IHolographicSpace3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicSpace3 {
      val address = segment.toRawLongValue()
      return makeIHolographicSpace3(Pointer(address))
    }

    public override fun toNative(obj: IHolographicSpace3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__12649400_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicSpace3): Array<IHolographicSpace3?> =
        (elements as
        Array<IHolographicSpace3?>).castToImpl<IHolographicSpace3,IHolographicSpace3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicSpace3?> =
        arrayOfNulls<IHolographicSpace3_Impl>(size) as Array<IHolographicSpace3?>
  }
}
