package Windows.Graphics.Display

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDisplayInformation3.ABI::class)
@Signature("{db15011d-0f09-4466-8ff3-11de9a3c929a}")
@Guid("db15011d0f0944668ff311de9a3c929a")
@WinRTInterface("db15011d0f0944668ff311de9a3c929a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayInformation3.ByReference::class)
public interface IDisplayInformation3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DiagonalSizeInInches(): IReference<Double>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayInformation3> {
    public override fun getValue() = ABI.makeIDisplayInformation3(pointer.getPointer(0))

    public fun setValue(value: IDisplayInformation3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayInformation3 {
    public val __1563419926_Ptr: Pointer?

    public val _1563419926_VtblPtr: Pointer?
      get() = __1563419926_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DiagonalSizeInInches(): IReference<Double>? {
      val fnPtr = _1563419926_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__1563419926_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }
  }

  public class IDisplayInformation3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1563419926_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayInformation3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("db15011d0f0944668ff311de9a3c929a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayInformation3(ptr: Pointer?): WithDefault = IDisplayInformation3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayInformation3 {
      val address = segment.toRawLongValue()
      return makeIDisplayInformation3(Pointer(address))
    }

    public override fun toNative(obj: IDisplayInformation3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1563419926_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayInformation3): Array<IDisplayInformation3?> =
        (elements as
        Array<IDisplayInformation3?>).castToImpl<IDisplayInformation3,IDisplayInformation3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayInformation3?> =
        arrayOfNulls<IDisplayInformation3_Impl>(size) as Array<IDisplayInformation3?>
  }
}
