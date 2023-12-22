package Windows.UI.Xaml.Controls

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

@ABIMarker(IRelativePanel2.ABI::class)
@Signature("{c09bd88c-1e82-53b3-8c01-7d0432f5f7db}")
@Guid("c09bd88c1e8253b38c017d0432f5f7db")
@WinRTInterface("c09bd88c1e8253b38c017d0432f5f7db")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRelativePanel2.ByReference::class)
public interface IRelativePanel2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BackgroundSizing(): BackgroundSizing?

  @InterfaceMethod(1)
  public fun put_BackgroundSizing(value: BackgroundSizing?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRelativePanel2> {
    public override fun getValue() = ABI.makeIRelativePanel2(pointer.getPointer(0))

    public fun setValue(value: IRelativePanel2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRelativePanel2 {
    public val __750596170_Ptr: Pointer?

    public val _750596170_VtblPtr: Pointer?
      get() = __750596170_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BackgroundSizing(): BackgroundSizing? {
      val fnPtr = _750596170_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BackgroundSizing>()
      val hr = fn.invokeHR(arrayOf(__750596170_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BackgroundSizing>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_BackgroundSizing(value: BackgroundSizing?): Unit {
      val fnPtr = _750596170_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__750596170_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRelativePanel2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __750596170_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRelativePanel2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c09bd88c1e8253b38c017d0432f5f7db")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRelativePanel2(ptr: Pointer?): WithDefault = IRelativePanel2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRelativePanel2 {
      val address = segment.toRawLongValue()
      return makeIRelativePanel2(Pointer(address))
    }

    public override fun toNative(obj: IRelativePanel2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__750596170_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRelativePanel2): Array<IRelativePanel2?> = (elements as
        Array<IRelativePanel2?>).castToImpl<IRelativePanel2,IRelativePanel2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRelativePanel2?> =
        arrayOfNulls<IRelativePanel2_Impl>(size) as Array<IRelativePanel2?>
  }
}
