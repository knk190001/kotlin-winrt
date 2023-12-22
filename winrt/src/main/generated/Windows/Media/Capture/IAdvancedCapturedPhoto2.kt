package Windows.Media.Capture

import Windows.Foundation.IReference
import Windows.Foundation.Rect
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

@ABIMarker(IAdvancedCapturedPhoto2.ABI::class)
@Signature("{18cf6cd8-cffe-42d8-8104-017bb318f4a1}")
@Guid("18cf6cd8cffe42d88104017bb318f4a1")
@WinRTInterface("18cf6cd8cffe42d88104017bb318f4a1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdvancedCapturedPhoto2.ByReference::class)
public interface IAdvancedCapturedPhoto2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FrameBoundsRelativeToReferencePhoto(): IReference<Rect?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdvancedCapturedPhoto2> {
    public override fun getValue() = ABI.makeIAdvancedCapturedPhoto2(pointer.getPointer(0))

    public fun setValue(value: IAdvancedCapturedPhoto2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdvancedCapturedPhoto2 {
    public val __1753086552_Ptr: Pointer?

    public val _1753086552_VtblPtr: Pointer?
      get() = __1753086552_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FrameBoundsRelativeToReferencePhoto(): IReference<Rect?>? {
      val fnPtr = _1753086552_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Rect?>>()
      val hr = fn.invokeHR(arrayOf(__1753086552_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Rect?>>(result.getValue())
      return resultValue
    }
  }

  public class IAdvancedCapturedPhoto2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1753086552_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdvancedCapturedPhoto2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("18cf6cd8cffe42d88104017bb318f4a1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdvancedCapturedPhoto2(ptr: Pointer?): WithDefault =
        IAdvancedCapturedPhoto2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdvancedCapturedPhoto2 {
      val address = segment.toRawLongValue()
      return makeIAdvancedCapturedPhoto2(Pointer(address))
    }

    public override fun toNative(obj: IAdvancedCapturedPhoto2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1753086552_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdvancedCapturedPhoto2): Array<IAdvancedCapturedPhoto2?>
        = (elements as
        Array<IAdvancedCapturedPhoto2?>).castToImpl<IAdvancedCapturedPhoto2,IAdvancedCapturedPhoto2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdvancedCapturedPhoto2?> =
        arrayOfNulls<IAdvancedCapturedPhoto2_Impl>(size) as Array<IAdvancedCapturedPhoto2?>
  }
}
