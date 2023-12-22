package Windows.Devices.Display.Core

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

@ABIMarker(IDisplayModeInfo2.ABI::class)
@Signature("{c86fa386-0ddb-5473-bfb0-4b7807b5f909}")
@Guid("c86fa3860ddb5473bfb04b7807b5f909")
@WinRTInterface("c86fa3860ddb5473bfb04b7807b5f909")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayModeInfo2.ByReference::class)
public interface IDisplayModeInfo2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PhysicalPresentationRate(): DisplayPresentationRate?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayModeInfo2> {
    public override fun getValue() = ABI.makeIDisplayModeInfo2(pointer.getPointer(0))

    public fun setValue(value: IDisplayModeInfo2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayModeInfo2 {
    public val __48595391_Ptr: Pointer?

    public val _48595391_VtblPtr: Pointer?
      get() = __48595391_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PhysicalPresentationRate(): DisplayPresentationRate? {
      val fnPtr = _48595391_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayPresentationRate>()
      val hr = fn.invokeHR(arrayOf(__48595391_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayPresentationRate>(result.getValue())
      return resultValue
    }
  }

  public class IDisplayModeInfo2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __48595391_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayModeInfo2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c86fa3860ddb5473bfb04b7807b5f909")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayModeInfo2(ptr: Pointer?): WithDefault = IDisplayModeInfo2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayModeInfo2 {
      val address = segment.toRawLongValue()
      return makeIDisplayModeInfo2(Pointer(address))
    }

    public override fun toNative(obj: IDisplayModeInfo2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__48595391_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayModeInfo2): Array<IDisplayModeInfo2?> = (elements
        as Array<IDisplayModeInfo2?>).castToImpl<IDisplayModeInfo2,IDisplayModeInfo2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayModeInfo2?> =
        arrayOfNulls<IDisplayModeInfo2_Impl>(size) as Array<IDisplayModeInfo2?>
  }
}
