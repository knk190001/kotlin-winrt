package Windows.Media.Devices.Core

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

@ABIMarker(IFrameController2.ABI::class)
@Signature("{00d3bc75-d87c-485b-8a09-5c358568b427}")
@Guid("00d3bc75d87c485b8a095c358568b427")
@WinRTInterface("00d3bc75d87c485b8a095c358568b427")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameController2.ByReference::class)
public interface IFrameController2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FlashControl(): FrameFlashControl?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFrameController2> {
    public override fun getValue() = ABI.makeIFrameController2(pointer.getPointer(0))

    public fun setValue(value: IFrameController2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameController2 {
    public val __1921918003_Ptr: Pointer?

    public val _1921918003_VtblPtr: Pointer?
      get() = __1921918003_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FlashControl(): FrameFlashControl? {
      val fnPtr = _1921918003_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FrameFlashControl>()
      val hr = fn.invokeHR(arrayOf(__1921918003_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FrameFlashControl>(result.getValue())
      return resultValue
    }
  }

  public class IFrameController2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1921918003_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameController2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("00d3bc75d87c485b8a095c358568b427")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameController2(ptr: Pointer?): WithDefault = IFrameController2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameController2 {
      val address = segment.toRawLongValue()
      return makeIFrameController2(Pointer(address))
    }

    public override fun toNative(obj: IFrameController2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1921918003_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameController2): Array<IFrameController2?> = (elements
        as Array<IFrameController2?>).castToImpl<IFrameController2,IFrameController2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameController2?> =
        arrayOfNulls<IFrameController2_Impl>(size) as Array<IFrameController2?>
  }
}
