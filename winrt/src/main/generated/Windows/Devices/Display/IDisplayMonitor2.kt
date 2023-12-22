package Windows.Devices.Display

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

@ABIMarker(IDisplayMonitor2.ABI::class)
@Signature("{023018e6-cb23-5830-96df-a7bf6e602577}")
@Guid("023018e6cb23583096dfa7bf6e602577")
@WinRTInterface("023018e6cb23583096dfa7bf6e602577")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayMonitor2.ByReference::class)
public interface IDisplayMonitor2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsDolbyVisionSupportedInHdrMode(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayMonitor2> {
    public override fun getValue() = ABI.makeIDisplayMonitor2(pointer.getPointer(0))

    public fun setValue(value: IDisplayMonitor2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayMonitor2 {
    public val __1178657879_Ptr: Pointer?

    public val _1178657879_VtblPtr: Pointer?
      get() = __1178657879_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsDolbyVisionSupportedInHdrMode(): Boolean {
      val fnPtr = _1178657879_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1178657879_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IDisplayMonitor2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1178657879_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayMonitor2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("023018e6cb23583096dfa7bf6e602577")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayMonitor2(ptr: Pointer?): WithDefault = IDisplayMonitor2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayMonitor2 {
      val address = segment.toRawLongValue()
      return makeIDisplayMonitor2(Pointer(address))
    }

    public override fun toNative(obj: IDisplayMonitor2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1178657879_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayMonitor2): Array<IDisplayMonitor2?> = (elements as
        Array<IDisplayMonitor2?>).castToImpl<IDisplayMonitor2,IDisplayMonitor2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayMonitor2?> =
        arrayOfNulls<IDisplayMonitor2_Impl>(size) as Array<IDisplayMonitor2?>
  }
}
