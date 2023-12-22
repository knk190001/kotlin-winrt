package Microsoft.UI.Windowing

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

@ABIMarker(IOverlappedPresenterStatics2.ABI::class)
@Signature("{ed5c4f92-32f4-5d15-80d0-b2a5efa04d39}")
@Guid("ed5c4f9232f45d1580d0b2a5efa04d39")
@WinRTInterface("ed5c4f9232f45d1580d0b2a5efa04d39")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IOverlappedPresenterStatics2.ByReference::class)
public interface IOverlappedPresenterStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RequestedStartupState(): OverlappedPresenterState?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IOverlappedPresenterStatics2> {
    public override fun getValue() = ABI.makeIOverlappedPresenterStatics2(pointer.getPointer(0))

    public fun setValue(value: IOverlappedPresenterStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IOverlappedPresenterStatics2 {
    public val __676293796_Ptr: Pointer?

    public val _676293796_VtblPtr: Pointer?
      get() = __676293796_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RequestedStartupState(): OverlappedPresenterState? {
      val fnPtr = _676293796_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<OverlappedPresenterState>()
      val hr = fn.invokeHR(arrayOf(__676293796_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<OverlappedPresenterState>(result.getValue())
      return resultValue
    }
  }

  public class IOverlappedPresenterStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __676293796_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IOverlappedPresenterStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ed5c4f9232f45d1580d0b2a5efa04d39")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIOverlappedPresenterStatics2(ptr: Pointer?): WithDefault =
        IOverlappedPresenterStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IOverlappedPresenterStatics2 {
      val address = segment.toRawLongValue()
      return makeIOverlappedPresenterStatics2(Pointer(address))
    }

    public override fun toNative(obj: IOverlappedPresenterStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__676293796_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IOverlappedPresenterStatics2):
        Array<IOverlappedPresenterStatics2?> = (elements as
        Array<IOverlappedPresenterStatics2?>).castToImpl<IOverlappedPresenterStatics2,IOverlappedPresenterStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IOverlappedPresenterStatics2?> =
        arrayOfNulls<IOverlappedPresenterStatics2_Impl>(size) as
        Array<IOverlappedPresenterStatics2?>
  }
}
