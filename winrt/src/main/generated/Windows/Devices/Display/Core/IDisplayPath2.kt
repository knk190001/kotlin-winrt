package Windows.Devices.Display.Core

import Windows.Foundation.IReference
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

@ABIMarker(IDisplayPath2.ABI::class)
@Signature("{f32459c5-e994-570b-9ec8-ef42c35a8547}")
@Guid("f32459c5e994570b9ec8ef42c35a8547")
@WinRTInterface("f32459c5e994570b9ec8ef42c35a8547")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayPath2.ByReference::class)
public interface IDisplayPath2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PhysicalPresentationRate(): IReference<DisplayPresentationRate?>?

  @InterfaceMethod(1)
  public fun put_PhysicalPresentationRate(value: IReference<DisplayPresentationRate?>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDisplayPath2>
      {
    public override fun getValue() = ABI.makeIDisplayPath2(pointer.getPointer(0))

    public fun setValue(value: IDisplayPath2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayPath2 {
    public val __2042398323_Ptr: Pointer?

    public val _2042398323_VtblPtr: Pointer?
      get() = __2042398323_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PhysicalPresentationRate(): IReference<DisplayPresentationRate?>? {
      val fnPtr = _2042398323_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DisplayPresentationRate?>>()
      val hr = fn.invokeHR(arrayOf(__2042398323_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DisplayPresentationRate?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_PhysicalPresentationRate(value: IReference<DisplayPresentationRate?>?):
        Unit {
      val fnPtr = _2042398323_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2042398323_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDisplayPath2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2042398323_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayPath2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f32459c5e994570b9ec8ef42c35a8547")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayPath2(ptr: Pointer?): WithDefault = IDisplayPath2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayPath2 {
      val address = segment.toRawLongValue()
      return makeIDisplayPath2(Pointer(address))
    }

    public override fun toNative(obj: IDisplayPath2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2042398323_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayPath2): Array<IDisplayPath2?> = (elements as
        Array<IDisplayPath2?>).castToImpl<IDisplayPath2,IDisplayPath2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayPath2?> =
        arrayOfNulls<IDisplayPath2_Impl>(size) as Array<IDisplayPath2?>
  }
}
